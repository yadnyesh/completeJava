package yb.yadnyesh.udemy.basicsstrong.reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifierInfo {
    public static void main(String[] args) throws NoSuchMethodException {
        Entity myEntity = new Entity(10, "val");
        Class<? extends Entity> entityClass = myEntity.getClass();
        int modifierInt = entityClass.getModifiers();
        int i = modifierInt & Modifier.PUBLIC;
        System.out.println(i);

        Method getVal = entityClass.getMethod("getVal");
        int methodModifiers = getVal.getModifiers();
        int i1 = methodModifiers & Modifier.PUBLIC;
        System.out.println(i1);
        System.out.println(Modifier.isPublic(methodModifiers));
    }
}
