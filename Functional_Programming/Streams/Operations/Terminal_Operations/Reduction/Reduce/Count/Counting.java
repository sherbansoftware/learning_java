package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.Count;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#count()

/*                                                    Counting method

    ○ long count()

                   * Returns the count of elements in this stream.

           This is a special case of a reduction and is equivalent to:

                   * return mapToLong(e -> 1L).sum();

    ○ This is a terminal operation.

 */

import java.util.List;

public class Counting {
    public static void main(String[] args) {
        List<Integer> li = List.of(2, 66, 47, 3, 999, 55, 91231, 456);

        long elNumber = li.stream().filter(e -> e > 66).peek(e-> System.out.println(e)).count();
        System.out.println("Number of matching crireria elements:" + elNumber);


    }

}
