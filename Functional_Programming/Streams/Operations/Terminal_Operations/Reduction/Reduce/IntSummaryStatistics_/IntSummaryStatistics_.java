package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.IntSummaryStatistics_;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/IntSummaryStatistics.html


/*                       public class IntSummaryStatistics extends Object implements IntConsumer


    ○ A state object for collecting statistics such as:

                  * count,

                  * min,

                  * max,

                  * sum,

                  * and average.

    ○ This class is designed to work with (though does not require) streams.

       For example, you can compute summary statistics on a stream of ints with:


                   IntSummaryStatistics stats = intStream.collect(IntSummaryStatistics::new,
                                                                        IntSummaryStatistics::accept,
                                                                        IntSummaryStatistics::combine);

    ○ IntSummaryStatistics can be used as a reduction target for a stream. For example:


 IntSummaryStatistics stats = people.stream()
                                    .collect(Collectors.summarizingInt(Person::getDependents));


    ○ This computes, in a single pass, the count of people, as well as the minimum, maximum, sum, and average of their
           number of dependents.


                                                     Implementation Note:


    ○ This implementation is not thread safe.

                   * However, it is safe to use Collectors.summarizingInt() on a parallel stream,

           because the parallel implementation of Stream.collect() provides the necessary

                    * partitioning,

                    * isolation,

                    * and merging of results

            for safe and efficient parallel execution.


                                                              NOTE


            * Java 8 added three Summary Statistics classes viz.,

                          - IntSummaryStatistics,

                          - LongSummaryStatistics

                          - and DoubleSummaryStatistics

                  These are state objects used for collecting statistics such as count, min, max, sum, and average.



 */


public class IntSummaryStatistics_ {
}
