package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static;
/*
                                                            Arrays:

          An array is a collection of similar type of data items and each data item is called an element of the array.
          The data type of the element may be any valid data type like char, int, float or double.
          The elements of array share the same variable name but each one carries a different index number known as
          subscript.

          Characteristics of Array:

              An array is a collection of elements of a similar data type.
              Array has a fixed size.
              In an array, the elements are stored in a contiguous manner
              Array elements are independent of each other.
              Array takes more time while performing any operation like insertion, deletion, etc.
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

                  Delete An Element From An Array

                      Using another Array
                      Using Java 8 streams
                      Using ArrayList_
                      Using System.arraycopy()


*/