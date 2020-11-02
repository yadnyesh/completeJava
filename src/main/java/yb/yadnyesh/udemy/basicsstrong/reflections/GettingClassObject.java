package yb.yadnyesh.udemy.basicsstrong.reflections;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GettingClassObject {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> stringClassA = Class.forName("java.lang.String");
        Class<?> stringClassB = Class.forName("java.lang.String");
        System.out.println(stringClassA == stringClassB);
    }
}
