package Generics.Wldcards.Upper_Bounded_Wildcards.Example;


import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    // generic method using type parameter T
//    public static <T> void displayData(List<T> list) {
//        list.forEach(e -> System.out.println(e));
//    }

    // we can use wildcard instead generic method
    public static void displayData(List<?> list) {
        list.forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(66);
        list.add(9);
        list.add(31);

        displayData(list);
    }
}
