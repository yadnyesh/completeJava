package yb.yadnyesh.udemy.basicsstrong.reflections;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ConstructorInfo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> entityClass = Class.forName("yb.yadnyesh.udemy.basicsstrong.reflections.Entity");
        Constructor<?>[] declaredConstructors = entityClass.getDeclaredConstructors();
        Arrays.stream(declaredConstructors).forEach(System.out::println);
    }
}
