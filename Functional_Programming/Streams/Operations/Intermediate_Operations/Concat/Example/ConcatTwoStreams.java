package Functional_Programming.Streams.Operations.Intermediate_Operations.Concat.Example;

import javax.annotation.Untainted;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatTwoStreams {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(11, 54, 751, 963);
        List<Integer> li1 = Arrays.asList(441, 4455, 41751, 211963);

        Stream<Integer> concat =Stream.concat(li.stream(),li1.stream());
        System.out.println(concat.collect(Collectors.toList()));


    }


}
