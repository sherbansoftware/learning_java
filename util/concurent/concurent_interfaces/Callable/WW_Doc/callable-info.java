package util.concurent.concurent_interfaces.Callable.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html


/*                                       public interface Callable<V>

    https://www.baeldung.com/java-runnable-callable


    A task that returns a result and may throw an exception. Implementors define a single method with no arguments
    called call.
    The Callable interface is similar to Runnable, in that both are designed for classes whose instances are potentially
        executed by another thread. A Runnable, however, does not return a result and cannot throw a checked exception.


            @FunctionalInterface
            public interface Callable<V> {

              * Computes a result, or throws an exception if unable to do so.
              *
              * @return computed result
              * @throws Exception if unable to compute a result

             V call() throws Exception;
             }

    RELATED

    https://howtodoinjava.com/java/multi-threading/callable-future-example/

 */