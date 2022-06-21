package Array.Reflection_Array.Array_Creation.Challenge;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21814996#questions

/*
Solution - Smart Array Concatenation
In this exercise we are going to implement a method that performs "smart concatenation" of elements.

Input:

The type T representing the the type of elements the method should return.

A variable number of arguments.

The arguments can be of:

Some type T

An array of type T

A combination of arrays of type T and elements of type T.



Output : A flattened array containing all the input elements of type T.



Example 1:

Integer [] result = concat(Integer.class, 1,2,3,4,5);

Result will be an array 5 integers containing the following elements: [1,2,3,4,5]



Example 2:

int [] result = contact(int.class, 1, 2, 3, new int[] {4, 5, 6}, 7);

Result will be an array of 7 integers, containing the elements: [1, 2, 3, 4, ,5, 6, 7];



Example 3:

String [] result = contact(String.class, new String[]{"a", "b"}, "c", new String[] {"d", "e"});

Result will be an array of 5 Strings, containing the elements : ["a", "b", "c", "d", "e"]



Note: You can always assume that the given type as the first argument is assignable from any element given as an input to the method.

 */

import java.util.*;
import java.lang.reflect.*;

public class ArrayFlattening {

    public <T> T concat(Class<?> type, Object... arguments) {
        if (arguments.length == 0) {
            return null;
        }

        List<Object> elements = new ArrayList<>();
        for (Object argument : arguments) {
            if (argument.getClass().isArray()) {
                int length = Array.getLength(argument);

                for (int i = 0 ; i < length ; i++) {
                    elements.add(Array.get(argument, i));
                }
            } else {
                elements.add(argument);
            }
        }

        Object flattenedArray = Array.newInstance(type, elements.size());

        for (int i = 0; i <elements.size() ; i++) {
            Array.set(flattenedArray, i, elements.get(i));
        }

        return (T)flattenedArray;
    }
}
