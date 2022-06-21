package Functional_Programming.Streams.Operations.Intermediate_Operations.Peek;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#peek(java.util.function.Consumer)

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html#peek(java.util.function.IntConsumer)

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Peek_ {

    public static void main(String[] args) {


        List<Integer> li = List.of(11, 22, 6, 34, 1);

        // Stream   -- peek()   method  ------------------------------------------------------------------------------
        // Stream<T> peek(Consumer<? super T> action)
        List<Integer> peeks = li.stream().peek(p -> System.out.println(p)).collect(Collectors.toList());
        System.out.println(peeks);

        // IntStream   -- peek method
        // IntStream	peek(IntConsumer action)

        int sum = IntStream.of(1, 2, 3, 4)
                .filter(e -> e > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(e -> e * e)
                .peek(e -> System.out.println("Mapped value: " + e))
                .sum();

        System.out.println(sum);
    }

}
