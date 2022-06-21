package Functional_Programming.Streams.Operations.Intermediate_Operations.Sorted.Example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class With_Comparator {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(56, 88, -47, 16, 66, 98);


        // sorted in ascending order  ---------------------------------------------------------------------------------
        list.stream().sorted(Comparator.comparingInt(Integer::intValue));
        // list.forEach(x -> System.out.println(x));

        // sorted in descending order ---------------------------------------------------------------------------------
        List descendingOrder = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());

        //  descendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        descendingOrder = list.stream().sorted((e1, e2) -> - e1.compareTo(e2)).collect(Collectors.toList());

        descendingOrder.forEach(x -> System.out.print(x+ " "));

    }


}
