package Concurency_Multithreading.Java5.Callable;

// https://www.baeldung.com/java-runnable-callable

//  https://howtodoinjava.com/java/multi-threading/callable-future-example/

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
    ○ A task that returns a result and may throw an exception.

                   * Implementors define a single method with no arguments called  call.

    ○  Callable interface is similar to  java.lang.Runnable,

                   * in that both are designed for classes whose

                                 - instances are potentially executed by another thread.

    ○ A  Runnable, however,

                   * does not return a result

                   * and cannot throw a checked exception.

    ○ The {@link Executors} class contains utility methods to

                    * convert from other common forms to  Callable classes.

 * @see Executor
 * @since 1.5
 * @author Doug Lea
 * @param <V> the result type of method {@code call}
 */

@FunctionalInterface
public interface Callable_<V> {
    /**
     * Computes a result, or throws an exception if unable to do so.

     * @return computed result
     * @throws Exception if unable to compute a result
     */

    V call() throws Exception;
}
