package Array.Conversions.Array_To_List;

import java.util.ArrayList;
import java.util.List;

public class Array_To_List {
    public static void main(String[] args) {

        String[] names = {"John", "Marcel", "Phillip"};

        // almost immutable list
        // List<String> list = List.of(names);


        // Arrays.asList() the size cannot be modified
//        list = Arrays.asList(names);

        List<String> list = new ArrayList<>();

        for (var name : names) {

            list.add(name);
        }

        list.forEach(System.out::println);

    }
}
