package yb.yadnyesh.udemy.basicsstrong.annoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hibernate<T> {

    Connection connection;

    public static<T> Hibernate<T> getConnection() throws SQLException {
        return new Hibernate<T>();
    }

    private Hibernate() throws SQLException {
        this.connection = DriverManager.getConnection("");
    }

    public void write(T t) {
        Class<? extends Object> clss = t.getClass();
    }
}
