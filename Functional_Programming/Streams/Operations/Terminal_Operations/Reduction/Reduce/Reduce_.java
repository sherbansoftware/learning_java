package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce;

// https://www.baeldung.com/java-stream-reduce

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html


/*                                        reduce() methods(3 methods)

    ○ reduce() methods

                  * are IMMUTABLE reduction , reduce stream into a single value: min, max, sum, average

    1. Optional<T>	reduce(BinaryOperator<T> accumulator)

                   * Performs a reduction on the elements of this stream,

                                 - using an associative accumulation function,

                                 - and returns an Optional describing the reduced value, if any.

    2. T	reduce(T identity, BinaryOperator<T> accumulator)

                   * Performs a reduction on the elements of this stream,

                                 - using the provided identity value

                                 - and an associative accumulation function,

                                 - and returns the reduced value.

       The reduce operation in this example takes two arguments:


            * identity:

                  The identity element is both the initial value of the reduction and the default result if there are no
                  elements in the stream. In this example, the identity element is 0; this is the initial value of the
                  sum of ages and the default value if no members exist in the collection roster.

            * accumulator:

                  The accumulator function takes two parameters: a partial result of the reduction (in this example, the
                  sum of all processed integers so far) and the next element of the stream (in this example, an integer).
                  It returns a new partial result. In this example, the accumulator function is a lambda expression that
                  adds two Integer values and returns an Integer value:

                               (a, b) -> a + b

    3. <U> U	reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

            * Performs a reduction on the elements of this stream,

                          - using the provided identity,

                          - accumulation

                          - and combining functions.






    ○ Are immutable reduction ,is used to reduce the stream of elements into a single valued immutable variable.
          by using:

                   * reduce() method               --   or it's special cases:

                                - average,
                                - sum,
                                - min,
                                - max,
                                - count
                                - summaryStatistics()

    ○ The Stream.reduce() method is a general-purpose reduction operation.



    ○ The reduce operation always returns a new value.

                   * However, the accumulator function also returns a new value every time it processes an element
               of a stream.

    ○ Suppose that you want to reduce the elements of a stream to a more complex object, such as a collection.

                   * This might hinder the performance of your application.

                   * If your reduce operation involves adding elements to a collection, then every time your accumulator
                         function processes an element, it creates a new collection that includes the element, which is
                         inefficient.

                   * It would be more efficient for you to update an existing collection instead. You can do this with
                         the Stream.collect method, which the next section describes.

    ○ Associativity

                  * For parallelism, reduction operation must be associative

                            (a+b) + c = a+ (b+c)

    ○ Non-Associativity implies

                  * incorrect result

                  * inconsistent results on multiple runs

       eg. avg is not associative


                                             reduce() vs collect()


    ○ Both terminal operations, reduce() and collect(), are categorized as REDUCTION operations.

    ○ In collect() operations,

                   * elements are incorporated by updating the state of a mutable container object.

    ○ In reduce() operations,

                    * result is updated by replacing the previous result.


 */


import java.util.stream.Stream;
public class Reduce_ {
    Stream str;
}
