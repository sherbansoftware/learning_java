package Functional_Programming.Streams.Operations.Intermediate_Operations.Sorted.Example;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#sorted()


/*                                         Stream<T>  sorted()

    ○ Returns a stream consisting of the elements of this stream,

                   * sorted according to natural order.

           If the elements of this stream are not Comparable,

                    * a java.lang.ClassCastException may be thrown when the terminal operation is executed.

    ○ For ordered streams,

                    * the sort is stable.


    ○ For unordered streams,

                    * no stability guarantees are made.

    ○ This is a stateful intermediate operation.

    ○ Returns: the new stream





 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Natural_Order {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2, 66, 474, 91, 0, 66);

        List<Integer> sorted = li.stream().sorted().collect(Collectors.toList());

        System.out.println(sorted);

    }

}
