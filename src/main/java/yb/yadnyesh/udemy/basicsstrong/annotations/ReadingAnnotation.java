package yb.yadnyesh.udemy.basicsstrong.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReadingAnnotation {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = Class.forName("yb.yadnyesh.udemy.basicsstrong.annotations.Utility");
        Constructor<?> constructor = clazz.getConstructor();
        Utility utility = (Utility) constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for(Method method: methods) {
            if(method.isAnnotationPresent(MostUsed.class)) {
                method.invoke(utility, "Scala");
            }
        }
    }
}
