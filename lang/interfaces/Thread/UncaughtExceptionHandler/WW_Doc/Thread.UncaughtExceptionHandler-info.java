package lang.interfaces.Thread.UncaughtExceptionHandler.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.UncaughtExceptionHandler.html

/*                                    Interface_Class Thread.UncaughtExceptionHandler

  https://www.geeksforgeeks.org/thread-uncaughtexceptionhandler-in-java-with-examples/

    All Known Implementing Classes:

        ThreadGroup

    Enclosing class:

        Thread

    Functional Interface_Class:

        This is a functional interface and can therefore be used as the assignment target for a lambda expression or
        method reference.

    @FunctionalInterface
    public static interface Thread.UncaughtExceptionHandler

        Interface_Class for handlers invoked when a Thread abruptly terminates due to an uncaught exception.
        When a thread is about to terminate due to an uncaught exception the Java Virtual Machine will query the thread
            for its UncaughtExceptionHandler using Thread.getUncaughtExceptionHandler() and will invoke the handler's
            uncaughtException method, passing the thread and the exception as arguments. If a thread has not had its
            UncaughtExceptionHandler explicitly set, then its ThreadGroup object acts as its UncaughtExceptionHandler.
            If the ThreadGroup object has no special requirements for dealing with the exception, it can forward the
            invocation to the default uncaught exception handler.

    Since:
        1.5

    See Also:
        Thread.setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler),
        Thread.setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler),
        ThreadGroup.uncaughtException(java.lang.Thread, java.lang.Throwable)


             Modifier and Type	                                         Method and Description

    void uncaughtException(Thread t, Throwable e)            Method invoked when the given thread terminates due to the
                                                                 given uncaught exception.


   RELATED

       https://medium.com/@yosimizrachi/advanced-exception-handling-thread-uncaughtexceptionhandler-c72e013da092

 */