package Reflection.Class;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/18832708#overview

// https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html


/*                                 Reflection Entry Point  - Class<?>


    ○ Class<?> with the capital letter

                  * is the entry point for us to reflect on our applications code

    ○ An object of type Class<?> contains all the information about:

                   * A given object's runtime type

                   * A class in our applications

    ○ That information includes:

                   * What methods and fields it contains

                   * What classes it extends

                   * What interfaces it implements

           and much, much more


                                     How do we get an object of Type Class<?>


    ○ There are three main method:

            1. Object.GetClass();

                    String stringObject = "some String";

            2. "class" suffix to a type name

                     Class intType = int.class;  works for primitive types too


           3. Class.forName(...)  must use fully qualified name

                     Class<?> fn = Class.forName(Class$Inner class)  use $ sign for inner class
                     No Class.forName() for primitive type


                                          Class<?>   -Java Wildcards


                         * this is very useful when the compiler cannot know the exact generic type at compile time like
                              in the case where we use the forName() method to get a class object of a type provided to us
                              as a string

                                  Class<?> carClass = Class.forName("vehicles.Car");


                         * Using Class<?> we can describe a Class object of any parameter type

                         * Class<?> is a super type to Class<T> of any type T

                         * // Restrict to only type that extend Collection
                           public List<String> findAllMethods(Class<? extends Collection> clazz)


 */

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class Class_ {

    static class People {
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class<HashMap> ci = HashMap.class;
       Class<?>[] c =  ci.getClasses() ;
           System.out.println("Names:" + Arrays.toString(c));


        String st = "yfgu";


        // all point same object People

        Class<?> cl = new People().getClass();
        Class<? extends People> cl1 = People.class;
        Class<?> fn = Class.forName("Reflection.Class.Class_$People");

//        System.out.println(cl == fn );  // true
//        System.out.println(fn);

        int d = 5;
        Class intType = int.class;

//        System.out.println(intType.getClass());
//        System.out.println(intType);

        Class<?> os = String.class;


        Method[] methods = os.getMethods();

        for (var method : methods) {
            //  System.out.println(method.getName() + " return " + method.getReturnType());
        }
    }
}
