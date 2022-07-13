package Collection_Framework.Collection_Interfaces.List.toArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toArray {
    public static void main(String args[]) {
        //Creating a List
        List<String> list = new ArrayList<>();

        //Adding elements in the List
        list.add("Mango");
        list.add("Lemon");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Banana");
        list.add("Pear");
        list.add("Pear");

        // toArray  --------------------------------------------------------------------------------------------------
        Object[] objArr = list.toArray();

        // <T> T[]	toArray(T[] a)  ---------------------------------------------------------------------------------
        String[] in = list.toArray(new String[0]);

        System.out.println(Arrays.toString(in));

        // default <T> T[]	toArray(IntFunction<T[]> generator) -----------------------------------------------------
        // R	apply(int value)
        String[] inArray = list.stream().toArray(String[]::new);

        System.out.println(Arrays.toString(inArray));
    }
}
