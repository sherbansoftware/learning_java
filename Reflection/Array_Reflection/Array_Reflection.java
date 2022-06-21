package Reflection.Array_Reflection;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21413482#questions/14140168

/*                                   Array Using Reflection


    ○ Array Creation Using Reflection

                   * Array.newInstance(Class<?> componentType, int length);

                  * Array.newInstance(decided in runtime, int length);



    ○ Setting Array values using Reflection

                  * Array.set(Object arrayObject, int index, Object value)

     ○ For compile time safety:

                   * Array.setBoolean((Object arrayObject, int index, boolean value)
                   * Array.setInt((Object arrayObject, int index, int value)
                   * Array.setDouble((Object arrayObject, int index, double value)
                   * ...


    ○ This is particularly useful in cases where the type of the array we want to create

                   * is determined dynamically at runtime

            such as in our configuration file parsing example in that specific use case we did not know the type of
            the array until we read the property name from the file and found the array type based on the
            field type information of the class that was provided to us


    ○ Parsing arrays from Configuration file  deserialization








 */


public class Array_Reflection {
}
