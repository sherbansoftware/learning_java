package Data_Structures.Non_Primitive.Linear.Static.Array;

// https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

/*
                                                            Array_:

          An array is a collection of similar type of data items and each data item is called an element of the array.
          The data type of the element may be any valid data type like char, int, float or double.
          The elements of array share the same variable name but each one carries a different index number known as
          subscript.

          Characteristics of Array_:

              An array is a collection of elements of a similar data type.
              Array_ has a fixed size.
              In an array, the elements are stored in a contiguous manner
              Array_ elements are independent of each other.
              Array_ takes more time while performing any operation like insertion, deletion, etc.
              Accessing any element in an array is faster as the element in an array can be directly accessed through the index.
              In the case of an array, memory is allocated at compile-time.
              Memory_Address utilization is inefficient in the array. For example, if the size of the array is 6, and array
              consists of 3 elements only then the rest of the space will be unused.

          The array can be: -------------------------------------------------------------------------------------------

              one dimensional,
              two dimensional
              multidimensional.

           1. Cost of accessing an element ----------------------------------------------------------------------------

                In case of an array, irrespective of the size of an array, an array takes a constant time for accessing
                an element. In an array, the elements are stored in a contiguous manner, so if we know the base address
                of the element, then we can easily get the address of any element in an array. We need to perform a
                simple calculation to obtain the address of any element in an array. So, accessing the element in an
                array is O(1) in terms of time complexity.

            2. Cost of inserting an element----------------------------------------------------------------------------

                 Inserting the element at the beginning:

                     To insert the new element at the beginning, we first need to shift the element towards the right to
                     create a space in the first position. So, the time complexity will be proportional to the size of the
                     list. If n is the size of the array, the time complexity would be O(n).


                 Inserting an element at the mid:

                     Suppose we want to insert the element at the ith position of the array; we need to shift the n/2
                     elements towards the right. Therefore, the time complexity is proportional to the number of the
                     elements. The time complexity would be O(n) for the average case.

                 Inserting an element at the end

                     If the array is not full, then we can directly add the new element through the index. In this case,
                     the time complexity would be constant, i.e., O(1). If the array is full, we first need to copy the
                     array into another array and add a new element. In this case, the time complexity would be O(n).

                  Deletion is also expensive with arrays until unless some special techniques are used.
                     For example, to delete 1010 in id[], everything after 1010 has to be moved.

                  Delete An Element From An Array_

                      Using another Array_
                      Using Java 8 streams
                      Using ArrayList
                      Using System.arraycopy()


                                                Time complexity of Array

           ARRAY OPERATION	               REAL TIME COMPLEXITY	                   ASSUMED TIME COMPLEXITY

         Access i-th element	                O(?N)	                                     O(1)

          Traverse all elements	              O(N + ?N)	                                      O(N)

         Override element at i-th index	        O(?N)	                                      O(1)

            Insert element E	               O(N + ?N)	                                  O(N)

            Delete element E	                O(N + ?N)	                                   O(N)

                                               Space Complexity of Array

    The Space Complexity of the above array operations is O(1).This is because we do not need extra space beyond a fixed
        number of variables.

                                                     NOTE

            * By not being dynamic (static) means that once you've created an array instance, you cannot change it's size.
                  We can't increase it size and we can't decrease it size.
            * Array is zero based index.
            * Arrays are stored as one contiguous block in memory.
            * And it's one reason why arrays can't be resized, because, if they could be resized, then there'd be no guarantee
                 after that  extra space would be in that same contiguous block of memory.
            * is every element in the array occupies the same amount of space in memory.(Homogenous elements)
            * Array of objects stores a reference to those objects and object references are always the same size,
                  regardless of the type of object they're referring to.

            * if an array starts at memory address x and the size of each element in the array is y, then we can calculate
                  the memory address of the ith element, so array i, by using the following expression:

                          x + i * y                 where:

                   x           - array memory address
                   i           - is index of an element
                   y           - is the size of element related to its type(byte(1 byte), int(4 byte), long(8 byte)etc)

            * if we know the index of an element in the array, then the time or the number of steps we have to do to retrieve
                  the element will be the same, no matter where it is in the array, because all we have to do to get the memory
                  address of that element is

                          x + i * y,

                   and for this reason is array zero based BECAUSE

                       element at position 0 have the same address with th the start address  of the array.

*/

import java.util.Arrays;

public class  Array_ {
    Arrays ar;
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 5;
        intArray[1] = 2;
        intArray[2] = 33;
        intArray[3] = -1000;



        System.out.println(intArray.getClass());  // class [I



    }


}
