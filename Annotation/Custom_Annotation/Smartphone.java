package Annotation.Custom_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Marker annotation
//Single value annotation
//Multiple value
//Meta annotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Smartphone {

	String[] value() default { "Red", "Blue" };

	String os() default "Symbian";

	enum Level {
		BAD, INDIFFERENT, GOOD
	}

	Level[] values() default Level.BAD;

	@interface Author {
		String value() default "Author";
	}

	int version() default 4;

	String engineer() default "[unassigned]";

	
}