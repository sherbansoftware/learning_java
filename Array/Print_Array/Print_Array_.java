package Array.Print_Array;

import java.util.Arrays;

public class Print_Array_ {
    public static void main(String[] args) {


        //Let’s	look at	different methods in java to print the content of an array.

        // Printing	a 1D Array ----------------------------------------------------------------------------------------

        int marks5[] = {25, 30, 50, 10, 5};
        System.out.println("Print 1D array using reference : "+ marks5);    //[I@6db3f829
        System.out.println("Print 1D array using Arrays.toString() method:  " +

                Arrays.toString(marks5)); //[25,	30,	50,	10,	5]


        // Printing a 2D Array -----------------------------------------------------------------------------------------

        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Print 2D array using reference: " + matrix3);    //[[I@1d5a0305

        System.out.println("Print 2D array using Arrays.toString() method:  " + Arrays.toString(matrix3));  //[[I@6db3f829,	[I@42698403]

        System.out.println("Print 2D array using Arrays.deepToString() method:  " +

                Arrays.deepToString(matrix3));  //[[1,	2,	3],	[4,	5,	6]]

        // matrix3[0] is a 1D Array

        System.out.println(matrix3[0]);//[I@86c347
        System.out.println(Arrays.toString(matrix3[0]));//[1,	2,	3]
    }

}
