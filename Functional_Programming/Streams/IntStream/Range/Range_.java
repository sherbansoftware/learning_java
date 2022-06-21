package Functional_Programming.Streams.IntStream.Range;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html


/*                                               Module java.base
                                                Package java.util.stream

    ○ Interface IntStream
       All Superinterfaces:
       AutoCloseable, BaseStream<Integer,IntStream>


    ○ static IntStream	        range(int startInclusive, int endExclusive)

                  * Returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive)
                        by an incremental step of 1.

    ○ static IntStream	      rangeClosed(int startInclusive, int endInclusive)

                  * Returns a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive)
                        by an incremental step of 1.

 */


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range_ {

    public static void main(String[] args) {


        System.out.println(getNumbersUsingIntStreamRange(56,59));


    }

    public static List<Integer> getNumbersUsingIntStreamRange(int start, int end) {
        return IntStream.range(start, end)
                .boxed()
                .collect(Collectors.toList());
    }

}
