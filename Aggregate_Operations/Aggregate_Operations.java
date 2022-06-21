package Aggregate_Operations;

// https://docs.oracle.com/javase/tutorial/collections/streams/index.html#differences

/*                                             The aggregate operations

    are operations that allow us to express common manipulations on stream elements quickly and clearly.

                                            Is it possible to chain aggregate functions in Java?

    As you can see, we can combine (chain) some aggregate functions together to achieve desired results. Such chaining
        is very common with streams operations. That makes streams powerful and flexible.

                                          Differences Between Aggregate Operations and Iterators

    Aggregate operations,

            like forEach,

        appear to be like iterators.

    However, they have several fundamental differences:

                * They use internal iteration:

                      Aggregate operations do not contain a method like next to instruct them to process the next element
                          of the collection. With internal delegation, your application determines what collection it
                          iterates, but the JDK determines how to iterate the collection. With external iteration, your
                          application determines both what collection it iterates and how it iterates it. However,
                          external iteration can only iterate over the elements of a collection sequentially.

                      Internal iteration does not have this limitation. It can more easily take advantage of parallel
                          computing, which involves dividing a problem into subproblems, solving those problems
                          simultaneously, and then combining the results of the solutions to the subproblems. See the
                          section Parallelism for more information.

               * They process elements from a stream:

                      Aggregate operations process elements from a stream, not directly from a collection.Consequently,
                          they are also called stream operations.

               * They support behavior as parameters:

                      You can specify lambda expressions as parameters for most aggregate operations.
                      This enables you to customize the behavior of a particular aggregate operation.

                                                        NOTE


 */

public class Aggregate_Operations {
}
