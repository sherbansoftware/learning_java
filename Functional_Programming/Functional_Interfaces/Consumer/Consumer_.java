
package Functional_Programming.Functional_Interfaces.Consumer;
import java.util.Objects;
import java.util.function.Consumer;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26605952#overview

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html

/**
    Represents an operation that accepts

                * a single input argument

                * and returns no  result.

 * Unlike most other functional interfaces,  Consumer is expected to operate via side-effects.
 *
 * This is a functional interface  whose functional method is

                * accept(Object)
 *
 * @param <T> the type of the input to the operation
 *
 * @since 1.8
 */
@FunctionalInterface
public interface Consumer_<T> {

    /**
     * Performs this operation on the given argument.
     * @param t the input argument
     */
    void accept(T t);

    /**
     * Returns a composed  Consumer that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code Consumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
