package Data_Structures.Non_Primitive.Linear.Static.Array.Sort_Array;

import java.util.Arrays;
import java.util.Collections;

/*
                                            Sort An Array_

      Using For Loops:

                     You can use for loops to traverse the array and compare adjacent elements while traversing and
                         putting them in order.

      Using The Sort method:

                    The Arrays class of  java.util package provides the sort method that takes an array as an
                        argument and sorts the array. This is a direct sorting method and you can sort an array with
                        just one method call.

 */


public class Sorted_Array {
    public static void main(String[] args) {
        //define original array
        int[] intArray = new int[]{52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        int temp = 0;

        //print original array
        //   System.out.println("Original array: ");
        for (int i = 0; i < intArray.length; i++) {
            //  System.out.print(intArray[i] + " ");
        }

                                    //Sort the array in ascending order using two for loops

//        for (int i = 0; i <intArray.length; i++) {
//            for (int j = i+1; j <intArray.length; j++) {
//                if(intArray[i] > intArray[j]) {      //swap elements if not in order
//                    temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//                }
//            }
//        }

                                           //Sort the array in ascending order using sort method

        //  Arrays.sort(intArray);

                                          //Sort the array in descending order using sort method

        // cast int[] to Integer[]

        Integer[] IntArray = Arrays.stream (intArray).boxed ().toArray (Integer[]::new);

        Arrays.sort (IntArray, Collections.reverseOrder ());

        intArray = new int[IntArray.length];
        for (int i = 0; i < IntArray.length; i++) {
            intArray[i] = IntArray[i];
        }

        //print sorted array
        System.out.println ("\nArray_ sorted : ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print (intArray[i] + " ");
        }
    }
}

