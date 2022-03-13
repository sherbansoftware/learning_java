package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Remove_Element_From_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Delete_Multiple_Identic_Elements_Loop {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5};
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new.add(arr[i]);

            }
        }

        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" +arr_new);

    }
}
