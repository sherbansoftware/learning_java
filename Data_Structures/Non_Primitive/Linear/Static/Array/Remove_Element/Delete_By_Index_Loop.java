package Data_Structures.Non_Primitive.Linear.Static.Array.Remove_Element;

import java.util.Arrays;

public class Delete_By_Index_Loop {
    public static void main(String[] args) {

       // 1. Removing an element from Array using for loop

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr_new = new int[arr.length - 1];
        int j = 3;
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != j) {
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println ("Before deletion :" + Arrays.toString (arr));
        System.out.println ("After deletion :" + Arrays.toString (arr_new));

    }
}