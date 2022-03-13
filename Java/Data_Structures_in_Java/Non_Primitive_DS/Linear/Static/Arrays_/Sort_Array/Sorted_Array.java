package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Sort_Array;

import java.util.Arrays;
import java.util.Collections;

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

        //Sort the array in ascending order using two for loops---------------------------------------------------------

//        for (int i = 0; i <intArray.length; i++) {
//            for (int j = i+1; j <intArray.length; j++) {
//                if(intArray[i] > intArray[j]) {      //swap elements if not in order
//                    temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//                }
//            }
//        }

        //Sort the array in ascending order using sort method---------------------------------------------------------

        //  Arrays.sort(intArray);

        //Sort the array in descending order using sort method---------------------------------------------------------

        // cast int[] to Integer[]

        Integer[] IntArray = Arrays.stream (intArray).boxed ().toArray (Integer[]::new);

        Arrays.sort (IntArray, Collections.reverseOrder ());

        intArray = new int[IntArray.length];
        for (int i = 0; i < IntArray.length; i++) {
            intArray[i] = IntArray[i];
        }

        //print sorted array
        System.out.println ("\nArray sorted : ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print (intArray[i] + " ");
        }
    }
}

