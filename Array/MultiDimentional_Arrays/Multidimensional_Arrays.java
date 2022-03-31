package Array.MultiDimentional_Arrays;

public class Multidimensional_Arrays {
    public static void main(String[] args) {

        //single dimensional array
        int[] values = {3, 5, 56};
        System.out.println(values[2]);

        //multidimensional array declare method 1
        int[][] grid = {
                {3, 5, 4, 66},
                {2, 5},
                {6, 9, 44}
        };

        System.out.println(grid[1][1]);

        int[][] f = new int[3][4];
        f[0][0] = 1;
        f[0][1] = 5;
        f[1][0] = 15;
        f[1][1] = 66;
        System.out.println(f.length);

        System.out.println("=====================================================================================");


        // iterate through multidimensional array first way

        for (int row = 0; row < f.length; row++) {
            for (int col = 0; col < f[row].length; col++) {
                System.out.print(f[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("=====================================================================================");


        // iterate through multidimensional array second way
        for (int[] e : f) {
            for (int h : e) {
                System.out.print(h + " ");

            }
        }
    }
}
