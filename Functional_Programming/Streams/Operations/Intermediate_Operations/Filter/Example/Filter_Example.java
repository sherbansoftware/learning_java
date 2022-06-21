package Functional_Programming.Streams.Operations.Intermediate_Operations.Filter.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(null);
        list.add(30);
        list.add(null);
        list.add(40);
        list.add(50);


        //filtered
     //   List<Integer> filtered = list.stream().filter(x -> (x > 20 && x < 50)).collect(Collectors.toList());

     // filter null elements
        List<Integer> filtered = list.stream().filter(x -> x == null).collect(Collectors.toList());

        //filtered.forEach(System.out::println);

        // filter null elements and counts
        Long nn = list.stream().filter(x -> (x == null)).count();

        System.out.println(nn);

    }
}
