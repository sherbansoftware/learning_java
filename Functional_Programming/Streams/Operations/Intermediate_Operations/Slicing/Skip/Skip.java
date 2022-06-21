package Functional_Programming.Streams.Operations.Intermediate_Operations.Slicing.Skip;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html




/*                                               Stream<T>	skip(long n)


    ○ Returns a stream consisting of the remaining elements of this stream after

                  * discarding the first n elements of the stream.


                                                    NOTE


             * While skip() is generally a cheap operation on sequential stream pipelines, it can be quite expensive

                           - on ordered parallel pipelines,

                     especially for large values of n, since skip(n) is constrained to skip not just any n elements,
                     but the first n elements in the encounter order.

              *  Using an unordered stream source (such as generate(Supplier)) or removing the ordering constraint
                     with BaseStream.unordered() may result in significant speedups of skip() in parallel pipelines,
                     if the semantics of your situation permit.

              * If consistency with encounter order is required, and you are experiencing poor performance or memory
                    utilization with skip() in parallel pipelines,

                    switching to sequential execution with BaseStream.sequential() may improve performance.



 */


import java.util.List;

public class Skip {

    public static void main(String[] args) {
        List.of(44, 688, 7741,22,5554,798, 55, 74, 3).stream().skip(3).forEach(System.out::println);
    }
}
