package Generics.Type_Erasure.Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {

    public static void main(String[] args) {
      //  System.out.println(method1(5));

        //Assign generic object to non-generic reference
        // no compile time error because compiler checks only for reference.
        ArrayList l1 = new ArrayList<String>();

        l1.add(12);
        l1.add(true);
        l1.add("Hello");

        System.out.println(l1);

    }
    public static String method1(Integer x) {

        List<String> a = new LinkedList<>();
        List b =a;
        b.add(x);

        return a.iterator().next();  // throw ClassCastExceptions: Integer cannot be cast to class java.lang.String
    }

    // cannot be overloaded because at compile  both methods have same erasure

//    public static void method2(ArrayList<String> arrStr) {
//    }

    public static void method2(ArrayList<Integer> arrStr) {

    }

 }
