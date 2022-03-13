package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Sum_Average_Array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Sum_Average_Array {
    public static void main(String[] args) {

        //define original array
        int[] intArray = new int[]{52, 45, 47, 64, 12, 87, 78, 98, 23, 7};


        // calculate  sum  with loop -----------------------------------------------------------------------------------

              int sum = 0;
              for (int e : intArray) {
                 sum += e;
              }

              System.out.println ("Sum of array = " + sum);


        // calculate sum using stream-----------------------------------------------------------------------------------

             int sumS =Arrays.stream (intArray).sum ();

             System.out.println ("Stream sum = " + sumS );


        // sum in range ------------------------------------------------------------------------------------------------

        int rangeSum = IntStream.range (2,5).sum ();

        System.out.println("RangeSum = " + rangeSum);

        // calculate average using for----------------------------------------------------------------------------------

             int sumL =  0;
             for (int e : intArray) {
               sumL += e;
               }

             // cast to double
               double avgL = (double) sumL/intArray.length;

             System.out.println ("Average using loop = " + avgL );


        // calculate average using stream-------------------------------------------------------------------------------

             OptionalDouble avg =  Arrays.stream (intArray).average();

             // check if double is present in OptionalDouble
             if(avg.isPresent ()) {
                 double avdDouble = avg.getAsDouble ();
                 System.out.println ("Stream average = " + avdDouble );
             } else{
                 System.out.println ("Stream average = " + avg );

             }


    }
}

