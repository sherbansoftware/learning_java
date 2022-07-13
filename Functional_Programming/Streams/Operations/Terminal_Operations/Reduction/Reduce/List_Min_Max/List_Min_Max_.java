package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.List_Min_Max;

import java.util.Comparator;
import java.util.List;

public class List_Min_Max_ {
    public static void main(String[] args) {

        // min & max element from list

        List<Double> list = List.of(5.1, 64.5, 2.3, -2.0);

        double maxD = list.stream().mapToDouble(d -> d).max().orElse(0);

        double min = list.stream().min((e1, e2) -> e1.compareTo(e2)).orElse(null);

        double max = list.stream().max((x, y) -> Double.compare(x, y)).orElse(null);

        double min1 = list.stream().min(Comparator.comparingDouble(Double::doubleValue)).orElse(null);


        System.out.println("Min " + min + " and Max is " + max);

    }
}
