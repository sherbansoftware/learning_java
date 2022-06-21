package Functional_Programming.Streams.Parallel_Stream;

// https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html


/*                                                       Parallel  Streams

    Parallelism is for speed.
    So program should be designed in a way so that it can take advantage of multicore processing means more resources
        at work

                                     There are two ways of processing that streams:

                * parallel processing    - multiple lines on the road

                * and sequential         - one line on the road

    By default, the streams that we create are all the sequential. A


                                             Are two ways of creating parallel streams:

                * we can use parallelStream() method on Collection interface:

                          default Stream<E> parallelStream()

                * or we can use parallel method on a stream.

                           parallel()


    If we are aggregating some data so the resultant data set should be the same as it would be with sequential processing.

        So while applying parallel operation on some data,

                  the data should be:

                      - stateless:

                            state of one element does not affect another element

                      - non-interfering:

                            data source should not get affected during the operation

                      - associative:

                            one operation result is not affected by the order of data under processing

    If these three conditions are satisfied, then the result will be same as the sequential processing with better
        performance and speed.

                                                         NOTE

            *





 */

public class Parallel_Stream {
}
