package yb.yadnyesh.udemy.basicsstrong.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodInfo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Entity entity = new Entity(10, "id");
        Class<? extends Entity> entityClass = entity.getClass();

        Method[] declaredMethods = entityClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);

        System.out.println(entity.getVal());
        Method setVal = entityClass.getMethod("setVal", int.class);
        setVal.invoke(entity, 20);
        System.out.println(entity.getVal());

    }
}
