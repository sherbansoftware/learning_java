package Annotation.Custom_Annotation;

import java.lang.annotation.Annotation;

public class AnnotationDemo {
	public static void main(String[] args) {

		NokiaSeries obj = new NokiaSeries("ATest.B", 5);
		Class<? extends NokiaSeries> c = obj.getClass();
		Annotation an = c.getAnnotation(Smartphone.class);
		Smartphone smartphone = (Smartphone) an;
		System.out.print(smartphone);
	}
}
