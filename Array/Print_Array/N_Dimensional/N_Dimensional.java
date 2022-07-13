package Array.Print_Array.N_Dimensional;

import java.util.Arrays;

public class N_Dimensional {
    public static void main(String[] args) {

        // Printing a 2D Array              -- Arrays.deepToString(intAr)

        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6},{66,98,47}};

        String ar[][][] = {{{"1","2"},{"3","4","5"}},{{"6","7","8"}},{{"9","10"},{"11"},{"12","13","14","15"}}};//new String[1][3][2][2];

        Integer intAr[][][][][][] = {{{{{{1},{2},{3}},{{4},{5},{6}}},{{{7}},{{8}}}}}};


        System.out.println("Print 2D array using reference: " + matrix3);    //[[I@1d5a0305

        System.out.println("Print 2D array using Arrays.toString() method:  " + Arrays.toString(matrix3));  //[[I@6db3f829,	[I@42698403]

        System.out.println("Print 2D array using Arrays.deepToString() method:  " +

                Arrays.deepToString(intAr));  //[[1,	2,	3],	[4,	5,	6]]
    }

}
