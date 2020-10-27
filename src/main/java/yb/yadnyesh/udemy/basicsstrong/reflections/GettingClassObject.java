package yb.yadnyesh.udemy.basicsstrong.reflections;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class GettingClassObject {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> stringClassA = Class.forName("java.lang.String");
        Class<?> stringClassB = Class.forName("java.lang.String");
        System.out.println(stringClassA == stringClassB);

        PrivateClass privateClass = new PrivateClass();
        Class<? extends PrivateClass> newPrivateClass = privateClass.getClass();

        Class<?> superclass = newPrivateClass.getSuperclass();

        Class<?>[] interfaces = newPrivateClass.getInterfaces();

        Method[] declaredMethods = newPrivateClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);

        System.out.println(newPrivateClass.getName());
    }
}
