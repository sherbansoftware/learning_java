package Functional_Programming.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.*;

// https://www.baeldung.com/java-8-streams


// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606048#overview

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html


/**                                              Streams


    ○ When we are dealing with streams, we also have

                  * Lambdas

                  * Method References

                  * on standard Functional Interfaces

    ○ These are all tightly bound and this is all you need to remember about streams.

    ○ It's all about performing SQL on collections

                   * so we can perform some complex operations on Collections

    ○ A sequence of elements supporting sequential and parallel Aggregate Operations.The following example illustrates
           an aggregate operation using Stream and IntStream:

 
             int sum = widgets.stream()
                              .filter(w -> w.getColor() == RED)
                              .mapToInt(w -> w.getWeight())
                              .sum();

    ○ In this example,  widgets is a  Collection<Widget>.We create a stream of  Widget objects via  Collection#stream
          Collection.stream(), filter it to produce a stream containing only the red widgets, and then transform it into
          a stream of  int values representing the weight of each red widget. Then this stream is summed to produce
          a total weight.

    ○ In addition to Stream, which is a stream of object references, there are PRIMITIVE specializations for

                    * IntStream,
                    * LongStream,
                    * and  DoubleStream,
 
         all of which are referred to as "streams" and  conform to the characteristics and restrictions described here.
   
    ○ To perform a computation, stream operations are composed into a

                    * stream pipeline.


                                         A stream pipeline consists of a:


                   * SOURCE  --which might be an:

                             - array,
                             - a collection,
                             - a generator function,
                             - an I/O channel, etc.

                  * zero or more INTERMEDIATE OPERATIONS:

                              - (which transform a stream into another stream, such as Stream_#filter(Predicate)),

                  * a TERMINAL OPERATION -- which produces a

                              - result

                              - or side-effect,

                       such as  Stream #count() or  Stream #forEach(Consumer)).


                                                Side effect in Java


    ○ A side effect method is a method which

                  * MODIFIES some state variable value/arguments passed having a consequence beyond its scope,

                  * that is to say it has an observable effect besides returning a value (the main effect) to the invoker
                        of the operation.


                                             Side effect in OOP


    ○  In OO programming, side effects are

                    * when a function does something it doesn't communicate, something that might not be anticipated.

             Those are side effects. Good functions don't have side effects, whether you're doing OO or functional.


    ○ Streams are lazy;

         computation on the source data is only performed when

                 * the terminal operation is initiated,

                 * and source elements are consumed only as needed.
 
    ○ Collections and streams, while bearing some superficial similarities, have different goals.
 
                   * Collections
        
                           - are primarily concerned with the efficient management of, and access to, their elements.
  
                   * By contrast, streams
 
                            - do not provide a means to directly access or manipulate their elements,

                            - and are instead concerned with declaratively describing their source and the computational
                                  operations which will be performed in aggregate on that source.
 
    ○ However, if the provided stream operations do not offer the desired functionality, the
 
                     * iterator() and  
                     * spliterator() 
        
                 operations can be used to perform a controlled traversal.
 
    ○ A stream pipeline, like the "widgets" example above, can be viewed as
 
                      * a query on the stream source.
 
    ○ Unless the source was explicitly designed for concurrent modification (such as a  ConcurrentHashMap),

                      * unpredictable or erroneous behavior may result from modifying the stream source
                            while it is being queried.
 
    ○ Most stream operations accept parameters that describe user-specified behavior, such as the:
 
                      * lambda expression  w -> w.getWeight()

               passed to mapToInt in the example above.
 
    ○ To preserve correct behavior, these behavioral parameters must be :
  
                      * must be non-interfering  (they do not modify the stream source);
      
                      * and  in most cases must be stateless  (their result should not depend on any state that might change
                           during execution  of the stream pipeline).
 
    ○ Such parameters are always instances of a functional interface such as  Function, and are often

                      * lambda expressions or

                      * method references.

         Unless otherwise specified these parameters must be non-null.

    ○ A stream should be operated on (invoking an intermediate or terminal stream operation) only once.

      This rules out,for example,

                      * "forked" streams,

              where the same source feeds

                       * two or more pipelines,

                       * or multiple traversals of the same stream.

              A stream implementation may

                       * throw  IllegalStateException if it detects that the stream is being reused.

              However, since some stream operations

                       * may return their receiver rather than a new stream object, it may  not be possible to detect
                             reuse in all cases.

    ○ Streams have a  #close() method and implement  AutoCloseable, but nearly all stream instances do not actually need to
          be closed after use.

    ○ Generally, only streams whose source is an

            IO channel (such as those returned  by  Files#lines(Path, Charset)) will require closing.

    ○ Most streams are backed by collections, arrays, or generating functions, which require no special resource management.
          (If a stream does require closing, it can be declared as a resource in a  try-with-resources statement.)

    ○ Stream pipelines may Execute either:

                        * sequentially or in

                        * parallel.

                    This execution mode is a property of the stream.

    ○ Streams are created with an initial choice of sequential or parallel execution.(For example, Collection#stream()

                * Collection.stream()

                          - creates a sequential stream,

                 * Collection.parallelStream()

                           - creates a parallel one.)

    ○ This choice of execution mode may be:

                 * modified by the sequential() or  parallel() methods,

                 * and may be queried with the  isParallel() method.


                                                    NOTE


             * A stream is not a Data Structure like a collection, it is just a bunch of computations
                   applied on each element of the source, which typically is a collection.

             * Terminal operation is the last operation and that is what initiates the processing of the stream.

             * We cannot invoke another intermediate or another terminal operation on a terminal operation.

             * Streams cannot mutated. What this means is the original data structure is unaffected.


 * @param <T> the type of the stream elements
 * @since 1.8
 * @see IntStream
 * @see LongStream
 * @see DoubleStream
 * @see <a href="package-summary.html">java.util.stream
 */
public interface Stream_<T> extends BaseStream<T, Stream_<T>> {

    /**
     * Returns a stream consisting of the elements of this stream that match the given predicate.
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering,
     *                  <a href="package-summary.html#Statelessness">stateless
     *                  predicate to apply to each element to determine if it
     *                  should be included
     * @return the new stream
     */
    Stream<T> filter(Predicate<? super T> predicate);

    /**
     * Returns a stream consisting of the results of applying the given function to the elements of this stream.
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate operation.
     *
     * @param <R> The element type of the new stream
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element
     * @return the new stream
     */
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);

    /**
     * Returns an  IntStream consisting of the results of applying the
     * given function to the elements of this stream.
     *
     * This is an <a href="package-summary.html#StreamOps">
     *     intermediate operation.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element
     * @return the new stream
     */
    IntStream mapToInt(ToIntFunction<? super T> mapper);

    /**
     * Returns a  LongStream consisting of the results of applying the
     * given function to the elements of this stream.
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element
     * @return the new stream
     */
    LongStream mapToLong(ToLongFunction<? super T> mapper);

    /**
     * Returns a  DoubleStream consisting of the results of applying the
     * given function to the elements of this stream.
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element
     * @return the new stream
     */
    DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper);

    /**
     * Returns a stream consisting of the results of replacing each element of
     * this stream with the contents of a mapped stream produced by applying
     * the provided mapping function to each element.  Each mapped stream is
     *  BaseStream#close() closed after its contents
     * have been placed into this stream.  (If a mapped stream is  null
     * an empty stream is used, instead.)
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @apiNote
     * The  flatMap() operation has the effect of applying a one-to-many
     * transformation to the elements of the stream, and then flattening the
     * resulting elements into a new stream.
     *
     * <b>Examples.</b>
     *
     * If  orders is a stream of purchase orders, and each purchase
     * order contains a collection of line items, then the following produces a
     * stream containing all the line items in all the orders:
     * <pre>
     *     orders.flatMap(order -> order.getLineItems().stream())...
     * </pre>
     *
     * If  path is the path to a file, then the following produces a
     * stream of the  words contained in that file:
     * <pre>
     *     Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
     *     Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
     * </pre>
     * The  mapper function passed to  flatMap splits a line,
     * using a simple regular expression, into an array of words, and then
     * creates a stream of words from that array.
     *
     * @param <R> The element type of the new stream
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element which produces a stream
     *               of new values
     * @return the new stream
     */
    <R> Stream<R> flatMap(Function<? super T, ? extends Stream_<? extends R>> mapper);

    /**
     * Returns an  IntStream consisting of the results of replacing each
     * element of this stream with the contents of a mapped stream produced by
     * applying the provided mapping function to each element.  Each mapped
     * stream is  BaseStream#close() closed after its
     * contents have been placed into this stream.  (If a mapped stream is
     *  null an empty stream is used, instead.)
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element which produces a stream
     *               of new values
     * @return the new stream
     * @see #flatMap(Function)
     */
    IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper);

    /**
     * Returns an  LongStream consisting of the results of replacing each
     * element of this stream with the contents of a mapped stream produced by
     * applying the provided mapping function to each element.  Each mapped
     * stream is  BaseStream#close() closed after its
     * contents have been placed into this stream.  (If a mapped stream is
     *  null an empty stream is used, instead.)
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element which produces a stream
     *               of new values
     * @return the new stream
     * @see #flatMap(Function)
     */
    LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper);

    /**
     * Returns an  DoubleStream consisting of the results of replacing
     * each element of this stream with the contents of a mapped stream produced
     * by applying the provided mapping function to each element.  Each mapped
     * stream is  BaseStream#close() closed after its
     * contents have placed been into this stream.  (If a mapped stream is
     *  null an empty stream is used, instead.)
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering,
     *               <a href="package-summary.html#Statelessness">stateless
     *               function to apply to each element which produces a stream
     *               of new values
     * @return the new stream
     * @see #flatMap(Function)
     */
    DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper);

    /**
     * Returns a stream consisting of the distinct elements (according to
     *  Object#equals(Object)) of this stream.
     *
     * For ordered streams, the selection of distinct elements is stable
     * (for duplicated elements, the element appearing first in the encounter
     * order is preserved.)  For unordered streams, no stability guarantees
     * are made.
     *
     * This is a <a href="package-summary.html#StreamOps">stateful
     * intermediate operation.
     *
     * @apiNote
     * Preserving stability for  distinct() in parallel pipelines is
     * relatively expensive (requires that the operation act as a full barrier,
     * with substantial buffering overhead), and stability is often not needed.
     * Using an unordered stream source (such as {generate(Supplier))
     * or removing the ordering constraint with  #unordered() may result
     * in significantly more efficient execution for  distinct() in parallel
     * pipelines, if the semantics of your situation permit.  If consistency
     * with encounter order is required, and you are experiencing poor performance
     * or memory utilization with  distinct() in parallel pipelines,
     * switching to sequential execution with  #sequential() may improve
     * performance.
     *
     * @return the new stream
     */
    Stream<T> distinct();

    /**
     * Returns a stream consisting of the elements of this stream, sorted
     * according to natural order.  If the elements of this stream are not
     *  Comparable, a  java.lang.ClassCastException may be thrown
     * when the terminal operation is executed.
     *
     * For ordered streams, the sort is stable.  For unordered streams, no
     * stability guarantees are made.
     *
     * This is a <a href="package-summary.html#StreamOps">stateful
     * intermediate operation.
     *
     * @return the new stream
     */
    Stream<T> sorted();

    /**
     * Returns a stream consisting of the elements of this stream, sorted
     * according to the provided  Comparator.
     *
     * For ordered streams, the sort is stable.  For unordered streams, no
     * stability guarantees are made.
     *
     * This is a <a href="package-summary.html#StreamOps">stateful
     * intermediate operation.
     *
     * @param comparator a <a href="package-summary.html#NonInterference">non-interfering,
     *                   <a href="package-summary.html#Statelessness">stateless
     *                    Comparator to be used to compare stream elements
     * @return the new stream
     */
    Stream<T> sorted(Comparator<? super T> comparator);

    /**
     * Returns a stream consisting of the elements of this stream, additionally
     * performing the provided action on each element as elements are consumed
     * from the resulting stream.
     *
     * This is an <a href="package-summary.html#StreamOps">intermediate
     * operation.
     *
     * For parallel stream pipelines, the action may be called at
     * whatever time and in whatever thread the element is made available by the
     * upstream operation.  If the action modifies shared state,
     * it is responsible for providing the required synchronization.
     *
     * @apiNote This method exists mainly to support debugging, where you want
     * to see the elements as they flow past a certain point in a pipeline:
     * <pre>
     *     Stream.of("one", "two", "three", "four")
     *         .filter(e -> e.length() > 3)
     *         .peek(e -> System.out.println("Filtered value: " + e))
     *         .map(String::toUpperCase)
     *         .peek(e -> System.out.println("Mapped value: " + e))
     *         .collect(Collectors.toList());
     * </pre>
     *
     * @param action a <a href="package-summary.html#NonInterference">
     *                 non-interfering action to perform on the elements as
     *                 they are consumed from the stream
     * @return the new stream
     */
    Stream<T> peek(Consumer<? super T> action);

    /**
     * Returns a stream consisting of the elements of this stream, truncated
     * to be no longer than  maxSize in length.
     *
     * This is a <a href="package-summary.html#StreamOps">short-circuiting
     * stateful intermediate operation.
     *
     * @apiNote
     * While  limit() is generally a cheap operation on sequential
     * stream pipelines, it can be quite expensive on ordered parallel pipelines,
     * especially for large values of  maxSize, since  limit(n)
     * is constrained to return not just any n elements, but the
     * first n elements in the encounter order.  Using an unordered
     * stream source (such as {@lin #generate(Supplier)) or removing the
     * ordering constraint with  #unordered() may result in significant
     * speedups of  limit() in parallel pipelines, if the semantics of
     * your situation permit.  If consistency with encounter order is required,
     * and you are experiencing poor performance or memory utilization with
     *  limit() in parallel pipelines, switching to sequential execution
     * with  #sequential() may improve performance.
     *
     * @param maxSize the number of elements the stream should be limited to
     * @return the new stream
     * @throws IllegalArgumentException if  maxSize is negative
     */
    Stream<T> limit(long maxSize);

    /**
     * Returns a stream consisting of the remaining elements of this stream
     * after discarding the first  n elements of the stream.
     * If this stream contains fewer than  n elements then an
     * empty stream will be returned.
     *
     * This is a <a href="package-summary.html#StreamOps">stateful
     * intermediate operation.
     *
     * @apiNote
     * While  skip() is generally a cheap operation on sequential
     * stream pipelines, it can be quite expensive on ordered parallel pipelines,
     * especially for large values of  n, since  skip(n)
     * is constrained to skip not just any n elements, but the
     * first n elements in the encounter order.  Using an unordered
     * stream source (such as {@l#generate(Supplier)) or removing the
     * ordering constraint with  #unordered() may result in significant
     * speedups of  skip() in parallel pipelines, if the semantics of
     * your situation permit.  If consistency with encounter order is required,
     * and you are experiencing poor performance or memory utilization with
     *  skip() in parallel pipelines, switching to sequential execution
     * with  #sequential() may improve performance.
     *
     * @param n the number of leading elements to skip
     * @return the new stream
     * @throws IllegalArgumentException if  n is negative
     */
    Stream<T> skip(long n);

    /**
     * Performs an action for each element of this stream.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * The behavior of this operation is explicitly nondeterministic.
     * For parallel stream pipelines, this operation does not
     * guarantee to respect the encounter order of the stream, as doing so
     * would sacrifice the benefit of parallelism.  For any given element, the
     * action may be performed at whatever time and in whatever thread the
     * library chooses.  If the action accesses shared state, it is
     * responsible for providing the required synchronization.
     *
     * @param action a <a href="package-summary.html#NonInterference">
     *               non-interfering action to perform on the elements
     */
    void forEach(Consumer<? super T> action);

    /**
     * Performs an action for each element of this stream, in the encounter
     * order of the stream if the stream has a defined encounter order.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * This operation processes the elements one at a time, in encounter
     * order if one exists.  Performing the action for one element
     * <a href="../concurrent/package-summary.html#MemoryVisibility"><i>happens-before</i>
     * performing the action for subsequent elements, but for any given element,
     * the action may be performed in whatever thread the library chooses.
     *
     * @param action a <a href="package-summary.html#NonInterference">
     *               non-interfering action to perform on the elements
     * @see #forEach(Consumer)
     */
    void forEachOrdered(Consumer<? super T> action);

    /**
     * Returns an array containing the elements of this stream.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @return an array containing the elements of this stream
     */
    Object[] toArray();

    /**
     * Returns an array containing the elements of this stream, using the
     * provided  generator function to allocate the returned array, as
     * well as any additional arrays that might be required for a partitioned
     * execution or for resizing.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @apiNote
     * The generator function takes an integer, which is the size of the
     * desired array, and produces an array of the desired size.  This can be
     * concisely expressed with an array constructor reference:
     * <pre>
     *     Person[] men = people.stream()
     *                          .filter(p -> p.getGender() == MALE)
     *                          .toArray(Person[]::new);
     * </pre>
     *
     * @param <A> the element type of the resulting array
     * @param generator a function which produces a new array of the desired
     *                  type and the provided length
     * @return an array containing the elements in this stream
     * @throws ArrayStoreException if the runtime type of the array returned
     * from the array generator is not a supertype of the runtime type of every
     * element in this stream
     */
    <A> A[] toArray(IntFunction<A[]> generator);

    /**
     * Performs a <a href="package-summary.html#Reduction">reduction on the
     * elements of this stream, using the provided identity value and an
     * <a href="package-summary.html#Associativity">associative
     * accumulation function, and returns the reduced value.  This is equivalent
     * to:
     * <pre>
     *     T result = identity;
     *     for (T element : this stream)
     *         result = accumulator.apply(result, element)
     *     return result;
     * </pre>
     *
     * but is not constrained to execute sequentially.
     *
     * The  identity value must be an identity for the accumulator
     * function. This means that for all  t,
     *  accumulator.apply(identity, t) is equal to  t.
     * The  accumulator function must be an
     * <a href="package-summary.html#Associativity">associative function.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @apiNote Sum, min, max, average, and string concatenation are all special
     * cases of reduction. Summing a stream of numbers can be expressed as:
     *
     * <pre>
     *     Integer sum = integers.reduce(0, (a, b) -> a+b);
     * </pre>
     *
     * or:
     *
     * <pre>
     *     Integer sum = integers.reduce(0, Integer::sum);
     * </pre>
     *
     * While this may seem a more roundabout way to perform an aggregation
     * compared to simply mutating a running total in a loop, reduction
     * operations parallelize more gracefully, without needing additional
     * synchronization and with greatly reduced risk of data races.
     *
     * @param identity the identity value for the accumulating function
     * @param accumulator an <a href="package-summary.html#Associativity">associative,
     *                    <a href="package-summary.html#NonInterference">non-interfering,
     *                    <a href="package-summary.html#Statelessness">stateless
     *                    function for combining two values
     * @return the result of the reduction
     */
    T reduce(T identity, BinaryOperator<T> accumulator);

    /**
     * Performs a <a href="package-summary.html#Reduction">reduction on the
     * elements of this stream, using an
     * <a href="package-summary.html#Associativity">associative accumulation
     * function, and returns an  Optional describing the reduced value,
     * if any. This is equivalent to:
     * <pre>
     *     boolean foundAny = false;
     *     T result = null;
     *     for (T element : this stream) {
     *         if (!foundAny) {
     *             foundAny = true;
     *             result = element;
     *         
     *         else
     *             result = accumulator.apply(result, element);
     *     
     *     return foundAny ? Optional.of(result) : Optional.empty();
     * </pre>
     *
     * but is not constrained to execute sequentially.
     *
     * The  accumulator function must be an
     * <a href="package-summary.html#Associativity">associative function.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @param accumulator an <a href="package-summary.html#Associativity">associative,
     *                    <a href="package-summary.html#NonInterference">non-interfering,
     *                    <a href="package-summary.html#Statelessness">stateless
     *                    function for combining two values
     * @return an  Optional describing the result of the reduction
     * @throws NullPointerException if the result of the reduction is null
     * @see #reduce(Object, BinaryOperator)
     * @see #min(Comparator)
     * @see #max(Comparator)
     */
    Optional<T> reduce(BinaryOperator<T> accumulator);

    /**
     * Performs a <a href="package-summary.html#Reduction">reduction on the
     * elements of this stream, using the provided identity, accumulation and
     * combining functions.  This is equivalent to:
     * <pre>
     *     U result = identity;
     *     for (T element : this stream)
     *         result = accumulator.apply(result, element)
     *     return result;
     * </pre>
     *
     * but is not constrained to execute sequentially.
     *
     * The  identity value must be an identity for the combiner
     * function.  This means that for all  u,  combiner(identity, u)
     * is equal to  u.  Additionally, the  combiner function
     * must be compatible with the  accumulator function; for all
     *  u and  t, the following must hold:
     * <pre>
     *     combiner.apply(u, accumulator.apply(identity, t)) == accumulator.apply(u, t)
     * </pre>
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @apiNote Many reductions using this form can be represented more simply
     * by an explicit combination of  map and  reduce operations.
     * The  accumulator function acts as a fused mapper and accumulator,
     * which can sometimes be more efficient than separate mapping and reduction,
     * such as when knowing the previously reduced value allows you to avoid
     * some computation.
     *
     * @param <U> The type of the result
     * @param identity the identity value for the combiner function
     * @param accumulator an <a href="package-summary.html#Associativity">associative,
     *                    <a href="package-summary.html#NonInterference">non-interfering,
     *                    <a href="package-summary.html#Statelessness">stateless
     *                    function for incorporating an additional element into a result
     * @param combiner an <a href="package-summary.html#Associativity">associative,
     *                    <a href="package-summary.html#NonInterference">non-interfering,
     *                    <a href="package-summary.html#Statelessness">stateless
     *                    function for combining two values, which must be
     *                    compatible with the accumulator function
     * @return the result of the reduction
     * @see #reduce(BinaryOperator)
     * @see #reduce(Object, BinaryOperator)
     */
    <U> U reduce(U identity,
                 BiFunction<U, ? super T, U> accumulator,
                 BinaryOperator<U> combiner);

    /**
     * Performs a <a href="package-summary.html#MutableReduction">mutable
     * reduction operation on the elements of this stream.  A mutable
     * reduction is one in which the reduced value is a mutable result container,
     * such as an  ArrayList_, and elements are incorporated by updating
     * the state of the result rather than by replacing the result.  This
     * produces a result equivalent to:
     * <pre>
     *     R result = supplier.get();
     *     for (T element : this stream)
     *         accumulator.accept(result, element);
     *     return result;
     * </pre>
     *
     * Like  #reduce(Object, BinaryOperator),  collect operations
     * can be parallelized without requiring additional synchronization.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @apiNote There are many existing classes in the JDK whose signatures are
     * well-suited for use with method references as arguments to  collect().
     * For example, the following will accumulate strings into an  ArrayList_:
     * <pre>
     *     List<String> asList = stringStream.collect(ArrayList_::new, ArrayList_::add,
     *                                                ArrayList_::addAll);
     * </pre>
     *
     * The following will take a stream of strings and concatenates them into a
     * single string:
     * <pre>
     *     String concat = stringStream.collect(StringBuilder::new, StringBuilder::append,
     *                                          StringBuilder::append)
     *                                 .toString();
     * </pre>
     *
     * @param <R> type of the result
     * @param supplier a function that creates a new result container. For a
     *                 parallel execution, this function may be called
     *                 multiple times and must return a fresh value each time.
     * @param accumulator an <a href="package-summary.html#Associativity">associative,
     *                    <a href="package-summary.html#NonInterference">non-interfering,
     *                    <a href="package-summary.html#Statelessness">stateless
     *                    function for incorporating an additional element into a result
     * @param combiner an <a href="package-summary.html#Associativity">associative,
     *                    <a href="package-summary.html#NonInterference">non-interfering,
     *                    <a href="package-summary.html#Statelessness">stateless
     *                    function for combining two values, which must be
     *                    compatible with the accumulator function
     * @return the result of the reduction
     */
    <R> R collect(Supplier<R> supplier,
                  BiConsumer<R, ? super T> accumulator,
                  BiConsumer<R, R> combiner);

    /**
     * Performs a <a href="package-summary.html#MutableReduction">mutable
     * reduction operation on the elements of this stream using a
     *  Collector.  A  Collector
     * encapsulates the functions used as arguments to
     *  #collect(Supplier, BiConsumer, BiConsumer), allowing for reuse of
     * collection strategies and composition of collect operations such as
     * multiple-level grouping or partitioning.
     *
     * If the stream is parallel, and the  Collector
     * is  Collector.Characteristics#CONCURRENT concurrent, and
     * either the stream is unordered or the collector is
     *  Collector.Characteristics#UNORDERED unordered,
     * then a concurrent reduction will be performed (see  Collector for
     * details on concurrent reduction.)
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * When executed in parallel, multiple intermediate results may be
     * instantiated, populated, and merged so as to maintain isolation of
     * mutable data structures.  Therefore, even when executed in parallel
     * with non-thread-safe data structures (such as  ArrayList_), no
     * additional synchronization is needed for a parallel reduction.
     *
     * @apiNote
     * The following will accumulate strings into an ArrayList_:
     * <pre>
     *     List<String> asList = stringStream.collect(Collectors.toList());
     * </pre>
     *
     * The following will classify  Person objects by city:
     * <pre>
     *     Map<String, List<Person>> peopleByCity
     *         = personStream.collect(Collectors.groupingBy(Person::getCity));
     * </pre>
     *
     * The following will classify  Person objects by state and city,
     * cascading two  Collectors together:
     * <pre>
     *     Map<String, Map<String, List<Person>>> peopleByStateAndCity
     *         = personStream.collect(Collectors.groupingBy(Person::getState,
     *                                                      Collectors.groupingBy(Person::getCity)));
     * </pre>
     *
     * @param <R> the type of the result
     * @param <A> the intermediate accumulation type of the  Collector
     * @param collector the  Collector describing the reduction
     * @return the result of the reduction
     * @see #collect(Supplier, BiConsumer, BiConsumer)
     * @see Collectors
     */
    <R, A> R collect(Collector<? super T, A, R> collector);

    /**
     * Returns the minimum element of this stream according to the provided
     *  Comparator.  This is a special case of a
     * <a href="package-summary.html#Reduction">reduction.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal operation.
     *
     * @param comparator a <a href="package-summary.html#NonInterference">non-interfering,
     *                   <a href="package-summary.html#Statelessness">stateless
     *                    Comparator to compare elements of this stream
     * @return an  Optional describing the minimum element of this stream,
     * or an empty  Optional if the stream is empty
     * @throws NullPointerException if the minimum element is null
     */
    Optional<T> min(Comparator<? super T> comparator);

    /**
     * Returns the maximum element of this stream according to the provided
     *  Comparator.  This is a special case of a
     * <a href="package-summary.html#Reduction">reduction.
     *
     * This is a <a href="package-summary.html#StreamOps">terminal
     * operation.
     *
     * @param comparator a <a href="package-summary.html#NonInterference">non-interfering,
     *                   <a href="package-summary.html#Statelessness">stateless
     *                    Comparator to compare elements of this stream
     * @return an  Optional describing the maximum element of this stream,
     * or an empty  Optional if the stream is empty
     * @throws NullPointerException if the maximum element is null
     */
    Optional<T> max(Comparator<? super T> comparator);

    /**
     * Returns the count of elements in this stream.  This is a special case of
     * a <a href="package-summary.html#Reduction">reduction and is
     * equivalent to:
     * <pre>
     *     return mapToLong(e -> 1L).sum();
     * </pre>
     *
     * This is a <a href="package-summary.html#StreamOps">terminal operation.
     *
     * @return the count of elements in this stream
     */
    long count();

    /**
     * Returns whether any elements of this stream match the provided
     * predicate.  May not evaluate the predicate on all elements if not
     * necessary for determining the result.  If the stream is empty then
     *  false is returned and the predicate is not evaluated.
     *
     * This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation.
     *
     * @apiNote
     * This method evaluates the existential quantification of the
     * predicate over the elements of the stream (for some x P(x)).
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering,
     *                  <a href="package-summary.html#Statelessness">stateless
     *                  predicate to apply to elements of this stream
     * @return  true if any elements of the stream match the provided
     * predicate, otherwise  false
     */
    boolean anyMatch(Predicate<? super T> predicate);

    /**
     * Returns whether all elements of this stream match the provided predicate.
     * May not evaluate the predicate on all elements if not necessary for
     * determining the result.  If the stream is empty then  true is
     * returned and the predicate is not evaluated.
     *
     * This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation.
     *
     * @apiNote
     * This method evaluates the universal quantification of the
     * predicate over the elements of the stream (for all x P(x)).  If the
     * stream is empty, the quantification is said to be vacuously
     * satisfied and is always  true (regardless of P(x)).
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering,
     *                  <a href="package-summary.html#Statelessness">stateless
     *                  predicate to apply to elements of this stream
     * @return  true if either all elements of the stream match the
     * provided predicate or the stream is empty, otherwise  false
     */
    boolean allMatch(Predicate<? super T> predicate);

    /**
     * Returns whether no elements of this stream match the provided predicate.
     * May not evaluate the predicate on all elements if not necessary for
     * determining the result.  If the stream is empty then  true is
     * returned and the predicate is not evaluated.
     *
     * This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation.
     *
     * @apiNote
     * This method evaluates the universal quantification of the
     * negated predicate over the elements of the stream (for all x ~P(x)).  If
     * the stream is empty, the quantification is said to be vacuously satisfied
     * and is always  true, regardless of P(x).
     *
     * @param predicate a <a href="package-summary.html#NonInterference">non-interfering,
     *                  <a href="package-summary.html#Statelessness">stateless
     *                  predicate to apply to elements of this stream
     * @return  true if either no elements of the stream match the
     * provided predicate or the stream is empty, otherwise  false
     */
    boolean noneMatch(Predicate<? super T> predicate);

    /**
     * Returns an  Optional describing the first element of this stream,
     * or an empty  Optional if the stream is empty.  If the stream has
     * no encounter order, then any element may be returned.
     *
     * This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation.
     *
     * @return an  Optional describing the first element of this stream,
     * or an empty  Optional if the stream is empty
     * @throws NullPointerException if the element selected is null
     */
    Optional<T> findFirst();

    /**
     * Returns an  Optional describing some element of the stream, or an
     * empty  Optional if the stream is empty.
     *
     * This is a <a href="package-summary.html#StreamOps">short-circuiting
     * terminal operation.
     *
     * The behavior of this operation is explicitly nondeterministic; it is
     * free to select any element in the stream.  This is to allow for maximal
     * performance in parallel operations; the cost is that multiple invocations
     * on the same source may not return the same result.  (If a stable result
     * is desired, use  #findFirst() instead.)
     *
     * @return an  Optional describing some element of this stream, or an
     * empty  Optional if the stream is empty
     * @throws NullPointerException if the element selected is null
     * @see #findFirst()
     */
    Optional<T> findAny();

    // Static factories

    /**
     * Returns a builder for a  Stream.
     *
     * @param <T> type of elements
     * @return a stream builder
     */
//    public static<T> Builder<T> builder() {
//        return new Streams.StreamBuilderImpl<>();
//    

    /**
     * Returns an empty sequential  Stream.
     *
     * @param <T> the type of stream elements
     * @return an empty sequential stream
     */
//    public static<T> Stream_<T> empty() {
//        return StreamSupport.stream(Spliterators.<T>emptySpliterator(), false);
//    

    /**
     * Returns a sequential  Stream containing a single element.
     *
     * @param t the single element
     * @param <T> the type of stream elements
     * @return a singleton sequential stream
     */
//    public static<T> Stream<T> of(T t) {
//        return StreamSupport.stream(new Streams.StreamBuilderImpl<>(t), false);


    /**
     * Returns a sequential ordered stream whose elements are the specified values.
     *
     * @param <T> the type of stream elements
     *  values the elements of the new stream
     * @return the new stream
     */
//    @SafeVarargs
//    @SuppressWarnings("varargs") // Creating a stream from an array is safe
//    public static<T> Stream<T> of(T... values) {
//        return Arrays.stream(values);
//

    /**
     * Returns an infinite sequential ordered  Stream produced by iterative
     * application of a function  f to an initial element  seed,
     * producing a  Stream consisting of  seed,  f(seed),
     *  f(f(seed)), etc.
     *
     * The first element (position  0) in the  Stream will be
     * the provided  seed.  For  n > 0, the element at position
     *  n, will be the result of applying the function  f to the
     * element at position  n - 1.
     *
     * @param <T> the type of stream elements
     * @param seed the initial element
     * @param f a function to be applied to the previous element to produce
     *          a new element
     * @return a new sequential  Stream
     */
//    public static<T> Stream_<T> iterate(final T seed, final UnaryOperator<T> f) {
//        Objects.requireNonNull(f);
//        final Iterator_Interface<T> iterator = new Iterator_Interface<T>() {
//            @SuppressWarnings("unchecked")
//            T t = (T) Streams.NONE;
//
//            @Override
//            public boolean hasNext() {
//                return true;
//
//
//            @Override
//            public T next() {
//                return t = (t == Streams.NONE) ? seed : f.apply(t);
//
//        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
//                iterator,
//                Spliterator.ORDERED | Spliterator.IMMUTABLE), false);
//

    /**
     * Returns an infinite sequential unordered stream where each element is
     * generated by the provided  Supplier.  This is suitable for
     * generating constant streams, streams of random elements, etc.
     *
     * @param <T> the type of stream elements
     * @param s the  Supplier of generated elements
     * @return a new infinite sequential unordered  Stream
     */

//    public static<T> Stream<T> generate(Supplier<T> s) {
//        Objects.requireNonNull(s);
//        return StreamSupport.stream(
//                new StreamSpliterators.InfiniteSupplyingSpliterator.OfRef<>(Long.MAX_VALUE, s), false);


    /**
     * Creates a lazily concatenated stream whose elements are all the
     * elements of the first stream followed by all the elements of the
     * second stream.  The resulting stream is ordered if both
     * of the input streams are ordered, and parallel if either of the input
     * streams is parallel.  When the resulting stream is closed, the close
     * handlers for both input streams are invoked.
     *
     * @implNote
     * Use caution when constructing streams from repeated concatenation.
     * Accessing an element of a deeply concatenated stream can result in deep
     * call chains, or even  StackOverflowException.
     *
     * @param <T> The type of stream elements
     * @param a the first stream
     * @param b the second stream
     * @return the concatenation of the two input streams
     */
//    public static <T> Stream_<T> concat(Stream_<? extends T> a, Stream_<? extends T> b) {
//        Objects.requireNonNull(a);
//        Objects.requireNonNull(b);
//
//        @SuppressWarnings("unchecked")
//        Spliterator<T> split = new Streams.ConcatSpliterator.OfRef<>(
//                (Spliterator<T>) a.spliterator(), (Spliterator<T>) b.spliterator());
//        Stream_<T> stream = StreamSupport.stream(split, a.isParallel() || b.isParallel());
//        return stream.onClose(Streams.composedClose(a, b));
//

    /**
     * A mutable builder for a  Stream.  This allows the creation of a
     *  Stream by generating elements individually and adding them to the
     *  Builder (without the copying overhead that comes from using
     * an  ArrayList_ as a temporary buffer.)
     *
     * A stream builder has a lifecycle, which starts in a building
     * phase, during which elements can be added, and then transitions to a built
     * phase, after which elements may not be added.  The built phase begins
     * when the  #build() method is called, which creates an ordered
     *  Stream whose elements are the elements that were added to the stream
     * builder, in the order they were added.
     *
     * @param <T> the type of stream elements
     * @se Stream_#builder()
     * @since 1.8
     */
    public interface Builder<T> extends Consumer<T> {

        /**
         * Adds an element to the stream being built.
         *
         * @throws IllegalStateException if the builder has already transitioned to
         * the built state
         */
        @Override
        void accept(T t);

        /**
         * Adds an element to the stream being built.
         *
         * @implSpec
         * The default implementation behaves as if:
         * <pre>
         *     accept(t)
         *     return this;
         * </pre>
         *
         * @param t the element to add
         * @return  this builder
         * @throws IllegalStateException if the builder has already transitioned to
         * the built state
         */
        default Builder<T> add(T t) {
            accept(t);
            return this;
        }

        /**
         * Builds the stream, transitioning this builder to the built state.
         * An  IllegalStateException} is thrown if there are further attempts
         * to operate on the builder after it has entered the built state.
         *
         * @return the built stream
         * @throws IllegalStateException if the builder has already transitioned to
         * the built state
         */
        Stream<T> build();

    }
}
