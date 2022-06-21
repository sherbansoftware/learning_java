package Array.Array_Min;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array_Min {

    static int[] ints = {45, 1, 996, 64, 24, 3};

    public static void main(String[] args) {
//        System.out.println(minArray (ints));

        int min = Arrays.stream(ints)
                .min()
                .getAsInt();

        System.out.println(min);

    }

    public static int minArray(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= min) {
                min = arr[i];

            }
        }

        return min;
    }




}
