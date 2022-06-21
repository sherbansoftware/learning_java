package Functional_Programming.Streams.Operations.Intermediate_Operations.Slicing.Distinct.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(null);
        list.add(20);
        list.add(30);
        list.add(null);
        list.add(30);
        list.add(50);
        list.add(30);

        //no duplicate elements
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);

    }
}

