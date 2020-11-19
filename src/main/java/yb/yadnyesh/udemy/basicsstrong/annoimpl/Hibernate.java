package yb.yadnyesh.udemy.basicsstrong.annoimpl;

import yb.yadnyesh.udemy.basicsstrong.annoimpl.annotation.Column;
import yb.yadnyesh.udemy.basicsstrong.annoimpl.annotation.PrimaryKey;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hibernate<T> {

    Connection connection;
    private AtomicLong atomicLong = new AtomicLong(0);

    public static<T> Hibernate<T> getConnection() throws SQLException {
        return new Hibernate<T>();
    }

    private Hibernate() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    public void write(T t) throws IllegalAccessException, SQLException {

        Class<? extends Object> clss = t.getClass();
        Field[] declaredFields = clss.getDeclaredFields();
        Field pkey = null;
        ArrayList<Field> columNames = new ArrayList<>();
        StringJoiner joiner = new StringJoiner(", ");

        for(Field field : declaredFields) {
            if(field.isAnnotationPresent(PrimaryKey.class)) {
                pkey = field;
                //System.out.println("The Primary key is : " + field.getName() + "  value is: " + field.get(t));
                System.out.println(" and the columns are: ");
            } else if (field.isAnnotationPresent(Column.class)) {
                joiner.add(field.getName());
                columNames.add(field);
                //System.out.println(field.getName() + "  value is: " + field.get(t));
            }
        }

        int length = joiner.length() + 1;

        String qMarks = IntStream.range(0, length)
                .mapToObj(e -> "?")
                .collect(Collectors.joining(","));

        qMarks = "?, ?, ?, ?, ?";

        String sql = "insert into " + clss.getSimpleName() + " ( " + pkey.getName() + ", " + joiner.toString() + ") " + "values (" + qMarks + ")";
        System.out.println(sql);
        PreparedStatement statement = connection.prepareStatement(sql);
        if(pkey.getType() == long.class) {
            statement.setLong(1, atomicLong.getAndIncrement());
        }
        int index = 2;
        for(Field field: columNames) {
            field.setAccessible(true);
            if(field.getType() == int.class) {
                statement.setInt(index++, (int) field.get(t));

            } else if (field.getType() == String.class) {
                statement.setString(index++, (String) field.get(t));
            }
        }

        statement.executeUpdate();
    }

    public T read(Class<T> t, long l) throws SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Field declaredFields[] = t.getDeclaredFields();

        Field pkey = null;

        for (Field field: declaredFields) {
            if(field.isAnnotationPresent(PrimaryKey.class)) {
                pkey = field;
                break;
            }
        }

        String sql = "Select * from " + t.getSimpleName() + " where " + pkey.getName() + " = " + l;
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        T t1 = t.getConstructor().newInstance();
        long transactionId = resultSet.getInt(pkey.getName());
        pkey.setAccessible(true);
        pkey.set(t1, transactionId);

        for (Field field: declaredFields) {
            if(field.isAnnotationPresent(Column.class)) {
                field.setAccessible(true);
                if(field.getType() == int.class) {
                    field.set(t1, resultSet.getInt(field.getName()));
                } else if (field.getType() == String.class) {
                    field.set(t1, resultSet.getString(field.getName()));
                }
            }
        }
        return t1;
    }
}
