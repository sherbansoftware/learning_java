package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606080#questions

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606080#questions 6:40

// https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/collect.html



// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html



/*                                 collect methods( 2 methods)


    1. <R,A> R collect(Collector<? super T,A,R> collector)

                   * Performs a mutable reduction operation on the elements of this stream using a Collector.

    2. <R> R	collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)

                   * This method reduces stream element of type T to a mutable result container of type R.

       supplier:

                    * this function creates a new result container.
                          In sequential execution it's called only once, whereas, for parallel execution, it may be
                          called multiple times to get a new instance for different parallel threads.

       accumulator:

                    * an associative function to incorporate the current element to the result object (the result object
                          is created in supplier function)

       combiner:

                    * in parallel execution this function combines the results received from different threads.
                          This must be associative function.

    ○ Example: StringBuilder as the mutable container to concatenate the strings:

                     List<String> list = Arrays.asList("Mike", "Nicki", "John");
                     String s = list.stream().collect(StringBuilder::new,
                                   (sb, s1) -> sb.append(" ").append(s1),
                                   (sb1, sb2) -> sb1.append(sb2.toString())).toString();
                     System.out.println(s);

    ○  The collect methods are used to

                   * collect a stream of elements into a container.

    ○ Container can be something like a

                  * list

                  * a site

                  * a map

                  * or any particular object.

              It need not be a data structure like a list or a set. It can be any regular object.
              And so it has to be a container.


                                  Typical Collections ~ Predefined Collectors


    ○ Collection:


                  * toList()

                                - Returns a Collector that accumulates the input elements into a new List.

                  * toSet()

                                 - Returns a Collector that accumulates the input elements into a new Set.

                  * toCollection(Supplier)

                                  - Returns a Collector that accumulates the input elements into a new Collection,
                                         in encounter order.



    ○ Grouping & Multilevel Groupings:


                  * toMap()

                                  - toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)

                                                • Returns a Collector that accumulates elements into a Map whose keys and
                                                      values are the result of applying the provided mapping functions
                                                      to the input elements.

                                   - toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper,
                                         BinaryOperator<U> mergeFunction)

                                                 • Returns a Collector that accumulates elements into a Map whose keys
                                                       and values are the result of applying the provided mapping functions
                                                       to the input elements.

                  * groupingBy()

                                   - six Methods

                                                 • https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html

                  * partitioningBy()

                                    - 2 methods

                                                 • is used to group the stream of elements into two groups.


    ○ Reducing & Summarizing


                  * maxBy()

                  * summingInt()

                  * averagingInt()

                  * summarizingInt()

                  * joining()


    ○  in case if these methods do not satisfy your requirement, then you can implement a collector by yourself,
            so we can

                  * implement the collector interface, and we can implement our own collector.



                                              reduce() vs collect()


    ○ Both terminal operations, reduce() and collect(), are categorized as REDUCTION operations.

    ○ In collect() operations,

                   * elements are incorporated by updating the state of a mutable container object.

    ○ In reduce() operations,

                    * result is updated by replacing the previous result.


 */


import java.util.Arrays;
import java.util.List;

public class Collect_ {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Mike", "Nicki", "John");
        String s = list.stream().collect(StringBuilder::new,
                (sb, s1) -> sb.append(" ").append(s1),
                (sb1, sb2) -> sb1.append(sb2.toString())).toString();
        System.out.println(s);
    }
}
