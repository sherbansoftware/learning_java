package Array.Conversions.List_To_Array;

import java.util.List;

public class List_To_Array {
    public static void main(String[] args) {
        List<String> list = List.of("Bill", "Mary", "John", "Anna");

        // Array of objects
        Object[] obj = list.toArray();

        // using stream() method of Collection interface
        Object[] objects = list.stream().toArray();

        // return aan array of Strings
        // String[] strings = list.toArray(new String[list.size()]);

        //using stream() method
         String[] strings = list.stream().toArray(size -> new String[size]);


         // Using method reference
        String[] stringsmr = list.stream().toArray(String[]::new);

        for (var s : strings) {
            System.out.println(s);
        }


    }


}
