package Functional_Programming.Streams.Operations.Intermediate_Operations.Concat;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html#concat(java.util.stream.IntStream,java.util.stream.IntStream)


/*                                      static IntStream concat(IntStream a, IntStream b)


    ○ Creates a lazily concatenated stream whose elements are

                  * all the elements of the first stream

                  * followed by all the elements of the second stream.

          The resulting stream is ORDERED

                   * if both of the input streams are ordered,

                   * and PARALLEL if either of the input streams is parallel.

    ○ When the resulting stream is closed, the close handlers for both input streams are invoked.

    ○ This method operates on the two input streams and binds each stream to its source.

       As a result

                   * subsequent modifications to an input stream source

                   * may not be reflected in the concatenated stream result.

    ○ API Note:

       To preserve optimization opportunities this method

                   * binds each stream to its source

                   * and accepts only two streams as parameters.

    ○ For example, the exact size of the concatenated stream source can be computed if

                   * the exact size of each input stream source is known.

           To concatenate more streams

                    * without binding, or without nested calls to this method,

                    * try creating a stream of streams and flat-mapping with the identity function, for example:


                              IntStream concat = Stream.of(s1, s2, s3, s4).flatMapToInt(s -> s);


                                                 Implementation Note:


    ○ Use caution when constructing streams from repeated concatenation.
      Accessing an element of a deeply concatenated stream can result in deep call chains, or even StackOverflowError.

    ○ Parameters:

                   * a - the first stream

                   * b - the second stream

     ○ Returns:

                    * the concatenation of the two input streams




 */


public class Concat {


}
