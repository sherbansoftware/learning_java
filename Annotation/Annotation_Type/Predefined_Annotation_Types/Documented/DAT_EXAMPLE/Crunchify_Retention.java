package Annotation.Annotation_Type.Predefined_Annotation_Types.Documented.DAT_EXAMPLE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Crunchify_Retention {
    String returnSomething();
}