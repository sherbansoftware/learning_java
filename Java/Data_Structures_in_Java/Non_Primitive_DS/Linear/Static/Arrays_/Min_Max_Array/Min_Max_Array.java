package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Min_Max_Array;

import java.util.Arrays;

public class Min_Max_Array {
    public static void main(String[] args) {

        //define original array
        int[] intArray = new int[]{2, 45, 32, 64, 12, 87, 78, 98, 23, 7};

//            System.out.println ("Max value " + getMax (intArray));
//            System.out.println ("Min value " + getMin (intArray));

        // stream method min--------------------------------------------------------------------------------------------

            int minS = Arrays.stream (intArray).min ().orElse (0);
            System.out.println ("Min stream " + minS);

        // stream  min range--------------------------------------------------------------------------------------------

        int minR = Arrays.stream (intArray, 0, 5).min ().orElse (0);
        System.out.println ("Min stream range = " + minR);


        // stream method min--------------------------------------------------------------------------------------------

           int maxS = Arrays.stream (intArray).max ().orElse (0);
           System.out.println ("Max stream " + maxS);

        // stream  max range--------------------------------------------------------------------------------------------

        int maxR = Arrays.stream (intArray, 0, 5).max ().orElse (0);
        System.out.println ("Max stream range = " +maxR);

        // Sorts the specified array into ascending numerical order ----------------------------------------------------
        //Sorted max value

           Arrays.sort (intArray);
           int maxA = intArray[intArray.length - 1];
           System.out.println ("Sorted max value " + maxA);

    }

     // calculate min using for loop------------------------------------------------------------------------------------
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

     // calculate max using for loop------------------------------------------------------------------------------------
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }




}
