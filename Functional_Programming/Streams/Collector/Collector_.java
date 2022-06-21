package Functional_Programming.Streams.Collector;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html


/*                                  Module java.base
                                   Package java.util.stream
                                   Interface Collector<T,A,R>


    ○ Mutable accumulation of stream into container

    ○ Type Parameters:

                   * T

                                 - the type of input elements to the reduction operation

                    * A

                                 - the mutable accumulation type of the reduction operation (often hidden as an
                                       implementation detail)

                     * R

                                  - the result type of the reduction operation


    ○ Supplier<A>	supplier()

                   * A function that creates and returns a new mutable result container.

    ○ BiConsumer<A,T>	accumulator()

                   * A function that folds a value into a mutable result container.

    ○ BinaryOperator<A>	combiner()

                   * A function that accepts two partial results and merges them.

    ○ Function<A,R>	finisher()

                    * Perform the final transformation

                                  - from the intermediate accumulation type A

                                  - to the final result type R.

      Finishes the reduction and it can optionally

                    * transform the container object into something else.

      So we have the container, but sometimes we might want to transform that into something else.

      Like, for instance,

                  * the container could be a string builder,

                  * but we would want to output a string.

 */

public interface Collector_ {
}
