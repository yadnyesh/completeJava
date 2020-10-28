package yb.yadnyesh.udemy.basicsstrong.reflections;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodInfo {
    public static void main(String[] args) {
        Entity entity = new Entity(10, "id");
        Class<? extends Entity> entityClass = entity.getClass();

        Method[] declaredMethods = entityClass.getMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
    }
}
