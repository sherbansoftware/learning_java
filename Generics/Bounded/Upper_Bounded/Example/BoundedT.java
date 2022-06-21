package Generics.Bounded.Upper_Bounded.Example;

import java.util.Arrays;
import java.util.List;

public class BoundedT {
    public static void main(String[] args) {


        List<Integer> Ilist = Arrays.asList(55, 2, 32, 6,6, 9);
         List<String> Slist = Arrays.asList("John", "Anne", "David");

        new DataSorter<Integer>(Ilist).getSorted(Ilist);
        //new DataSorter<String>(Slist).getSorted(Ilist);  // required Number's class subtype

    }
}
