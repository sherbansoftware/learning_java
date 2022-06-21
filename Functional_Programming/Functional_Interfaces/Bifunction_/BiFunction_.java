package Functional_Programming.Functional_Interfaces.Bifunction_;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26605898#overview

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html


/*                                       Interface BiFunction<T,U,R>


    ○ @FunctionalInterface
      public interface BiFunction<T,U,R>

    ○ Represents a function that

                   * accepts two arguments

                   * and produces a result.

           This is the two-arity specialization of Function.
           This is a functional interface whose functional method is apply(Object, Object).

*/


import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;


/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the two-arity specialization of Function.
 * This is a functional interface
 * whose functional method is {@link #apply(Object, Object)}.
 *
 * @param <T> the type of the first argument to the function
 * @param <U> the type of the second argument to the function
 * @param <R> the type of the result of the function
 * @see Function
 * @since 1.8
 */
@FunctionalInterface
public interface BiFunction_<T, U, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     */
    R apply(T t, U u);

    /**
     * Returns a composed function that first applies this function to
     * its input, and then applies the {@code after} function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V>   the type of output of the {@code after} function, and of the
     *              composed function
     * @param after the function to apply after this function is applied
     * @return a composed function that first applies this function and then
     * applies the {@code after} function
     * @throws NullPointerException if after is null
     */
    default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
    }
}


