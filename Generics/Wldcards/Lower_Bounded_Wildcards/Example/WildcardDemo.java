package Generics.Wldcards.Lower_Bounded_Wildcards.Example;


import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    // we can use lower bounded wildcard instead generic method
    public static void displayData(List<? super Integer> list) {
        list.forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {

        //  List<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<>();

        list.add(66);
        list.add(9);
        list.add(31);

        displayData(list);
    }
}
