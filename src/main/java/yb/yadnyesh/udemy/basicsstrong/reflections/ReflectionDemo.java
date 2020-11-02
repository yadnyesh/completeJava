package yb.yadnyesh.udemy.basicsstrong.reflections;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
class PrivateClass {
    PrivateClass() {
        log.info("Myclass object created");
    }

    private void myMethod() {
        log.info("No Args method");
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
