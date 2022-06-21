package Annotation.Annotations.Normal_Annotations.Normal_Annotations_Example;

import java.lang.annotation.Annotation;

public class NA_APP {

    public static void main(String[] args) {


        NAE_Ex nae = new NAE_Ex();
        Annotation an = NAE_Ex.class.getAnnotation(RequestForEnhancement.class);

        System.out.println(an);

    }
}