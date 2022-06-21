package Reflection.Array_Reflection.Array_Creation;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21413482#overview

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Array.html



/*                                    Array_Creation using reflection


    ○ We learned about the java.lang.reflect.Array helper class for reading arrays using Reflection

    ○ We can use java.lang.reflect.Array class

                  * to create arrays of any Type and Dimension


    ○ Array Creation

                  * Array.newInstance(Class<?> componentType, int length);

                  * Array.newInstance(decided in runtime, int length);


                                    Setting Array values using Reflection


     ○ Array.set(Object arrayObject, int index, Object value)

     ○ For compile time safety:

                   * Array.setBoolean((Object arrayObject, int index, boolean value)
                   * Array.setInt((Object arrayObject, int index, int value)
                   * Array.setDouble((Object arrayObject, int index, double value)
                   * ...



 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Creation {

    public static void main(String[] args) {

        // cast to a string array
        String[] str = (String[]) Array.newInstance(String.class, 2);

        // set Array values using reflection
        Array.set(str, 0, "John");
        Array.set(str, 1, "Anna");

        System.out.println(Arrays.toString(str));

    }

}
