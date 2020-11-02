package yb.yadnyesh.udemy.basicsstrong.reflections;

import java.lang.reflect.Field;
import java.util.Arrays;

public class FieldInfo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Entity entity = new Entity(10, "id");
        Class<? extends Entity> entityClass = entity.getClass();
        Arrays.stream(entityClass.getDeclaredMethods()).forEach(System.out::println);

        //Get public fields
        Arrays.stream(entityClass.getFields()).forEach(e -> System.out.println(e.getName()));

        //Get all declared fields
        Arrays.stream(entityClass.getDeclaredFields()).forEach(e -> System.out.println(e.getName()));

        Field typeField = entityClass.getField("type");
        typeField.set(entity, "Roll No. ");
        Field valField = entityClass.getDeclaredField("val");
        valField.setAccessible(true);
        valField.set(entity, 47);
        System.out.println(entity.getType() + " --- " + entity.getVal());

    }
}
