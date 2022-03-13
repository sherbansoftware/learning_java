package Annotation.Annotations.Normal_Annotations.Normal_Annotations_Example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestForEnhancement {

    int id();

    String synopsis() default "Provide time-travel functionality";

    String engineer() default "Default Engineer";

    String date() default "";

}
