package Functional_Programming.Streams.Operations.Intermediate_Operations.Slicing.Limit;

import java.util.List;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#limit(long)


/*                             Stream<T>	limit(long maxSize)


    ○ Returns a stream consisting of the elements of this stream,

                  * truncated to be no longer than maxSize in length.


*/
public class Limit {
    public static void main(String[] args) {
        List.of(44, 688, 7741, 55, 74, 3).stream().limit(3).forEach(System.out::println);
    }

}
