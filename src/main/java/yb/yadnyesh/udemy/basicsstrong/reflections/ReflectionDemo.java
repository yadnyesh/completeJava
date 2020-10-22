package yb.yadnyesh.udemy.basicsstrong.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class PrivateClass {
    private PrivateClass() {
        System.out.println("Myclass object created");
    }
}


public class ReflectionDemo {
    public static void main(String[] args) throws
            ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException,
            InstantiationException {
        Class<?> myClass = Class.forName("yb.yadnyesh.udemy.basicsstrong.reflections.PrivateClass");
        Constructor<?> declaredConstructor = myClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        PrivateClass newInstance = (PrivateClass) declaredConstructor.newInstance();
    }
}
