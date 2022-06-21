package Functional_Programming.Functional_Interfaces.BinaryOperator;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BinaryOperator.html


/*                                             Module java.base
                                               Package java.util.function
                                               Interface BinaryOperator<T>


    ○ @FunctionalInterface
      public interface BinaryOperator<T> extends BiFunction<T,T,T>

    ○ Represents an

                  * operation upon two operands of the same type, producing a result of the same type as the operands.

          This is a specialization of BiFunction for the case where the operands and the result are all of the same type.


 */



// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BinaryOperator.html

import java.util.Objects;
import java.util.Comparator;
import java.util.function.*;



/**
 * Represents an operation upon two operands of the same type, producing a result
 * of the same type as the operands.  This is a specialization of
 * {@link BiFunction} for the case where the operands and the result are all of
 * the same type.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object, Object)}.
 *
 * @param <T> the type of the operands and result of the operator
 *
 * @see BiFunction
 * @see UnaryOperator
 * @since 1.8
 */
@FunctionalInterface
public interface BinaryOperator_<T> extends BiFunction<T,T,T> {
    /**
     * Returns a {@link BinaryOperator} which returns the lesser of two elements
     * according to the specified {@code Comparator}.
     *
     * @param <T> the type of the input arguments of the comparator
     * @param comparator a {@code Comparator} for comparing the two values
     * @return a {@code BinaryOperator} which returns the lesser of its operands,
     *         according to the supplied {@code Comparator}
     * @throws NullPointerException if the argument is null
     */
    public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
    }

    /**
     * Returns a {@link BinaryOperator} which returns the greater of two elements
     * according to the specified {@code Comparator}.
     *
     * @param <T> the type of the input arguments of the comparator
     * @param comparator a {@code Comparator} for comparing the two values
     * @return a {@code BinaryOperator} which returns the greater of its operands,
     *         according to the supplied {@code Comparator}
     * @throws NullPointerException if the argument is null
     */
    public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return (a, b) -> comparator.compare(a, b) >= 0 ? a : b;
    }
}

