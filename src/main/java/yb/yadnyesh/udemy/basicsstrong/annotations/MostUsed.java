package yb.yadnyesh.udemy.basicsstrong.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MostUsed {

    String value() default "Java";
}
