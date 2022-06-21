package Array;


// https://www.baeldung.com/java-util-arrays
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
// hhttps://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

/*                                                    Array

    An array is a container object that holds a fixed number of values of a single type, homogenous elements which has
        contiguous memory location.The length of an array is established when the array is created.
        After creation, its length is fixed.

                                       An Array of Characters Is Not a String

    In the Java programming language, unlike C, an array of char is not a String, and neither a String nor an array of char
        is terminated by '\u0000' (the NUL character).

    A String object is immutable, that is, its contents never change, while an array of char has mutable elements.

    The method toCharArray in class String returns an array of characters containing the same character sequence as a
        String. The class StringBuffer implements useful methods on mutable arrays of characters.

                                                       Advantages

            * Code Optimization:
                  It makes the code optimized, we can retrieve or sort the data efficiently.
            * Random access:
                  We can get any data located at an index position.

                                                       Disadvantages

            * Size Limit:

                  We can store only the fixed size of elements in the array.It doesn't grow its size at runtime.To solve
                    this problem, collection framework is used in Java which grows automatically.

                                             Time complexity


            Retrieve with index                                         O(1)   - Constant time
            Retrieve without index                                      O(n)   - Linear time
            Add an element to a full Array                              O(n)
            Add an element to the end of an Array(has space)            O(1)
            Insert or update an element at a specific index             O(1)
            Delete an element by setting it to null                     O(1)
            Delete an element by shifting elements                      O(n)

    if the code requires a loop,

             * linear time complexity.

    If the code does not require a loop,

             * constant time complexity.

                                                         NOTE

            * all the data structures are based on array only.
            * The size of an array cannot be changed after the array is created.
            * you can use the built-in length property to determine the size of any array.
            * In Java, array is an object of a dynamically generated class.
            * Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces.
            * When an array is created, its elements are assigned the default value of

                  - 0 for the numeric primitive data types,
                  - ‘\u0000’ for char types,
                  - and false for Boolean types.

            * Caution

                  -Using the shorthand notation, you have to declare, create, and initialize the array all in one statement.
                       Splitting it would cause a syntax error. For example, the following

                       is wrong:

                           double[] myList;
                           myList = {1.9, 2.9, 3.4, 3.5};

             * So it is always recommended to use array if we know the size in advance and there is no underlying data
                   structure, that is because it itself is a data structure.

 */


import java.util.Arrays;

public class Array_ {
    public Arrays arr;

    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = 22;

        System.out.println(intArray.hashCode());
         Arrays.sort(intArray);
        System.out.println(intArray.hashCode());  // same hashcode


// find index for element 7  from intArray

        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
            }
        }
      //  System.out.println("Index for element 7: is " + index);
    }

}

