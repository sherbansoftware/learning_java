package Java8.Streams_;
// https://www.baeldung.com/java-8-streams

/*                                            Stream

    ATest.A sequence of elements supporting sequential and parallel aggregate operations

    To perform a computation, stream operations are composed into a stream pipeline
    Stream pipeline consists of a:

        source ---------------------------------------------------------------------------------------------------------

            array
            collection
            a generator function
            an I/O channel
            etc

        zero or more intermediate operations --------------------------------------------------------------------------

            Transform a stream into another stream
            Intermediate operations are lazy.This means that they will be invoked only if it is necessary for the
            terminal operation execution.

        terminal operation ---------------------------------------------------------------------------------------------

    Most stream operations accept parameters that describe user-specified behavior, such as the lambda expression
    w -> w.getWeight() passed to mapToInt in the example above. To preserve correct behavior, these behavioral parameters:

        must be non-interfering (they do not modify the stream source); -----------------------------------------------

        and in most cases must be stateless ---------------------------------------------------------------------------
            (their result should not depend on any state that might change during
            execution of the stream pipeline).

*/