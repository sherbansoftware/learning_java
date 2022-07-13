package Concurency_Multithreading.Java5.ThreadPool;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html


/*                                                ThreadPool


    ○ a group of threads that are created and readily available to handle any work submitted to them.

    ○ ThreadPool is a managed set of threads  we use thread polls through the ExecutorService implementations
          now if we want to we can actually implement our own ThreadPool by creating a class that implements one of
          the thread poll interfaces and by doing so we can configure how the underlying thread poll  ultimately is
          managed but it's recommended that we use the implementations provided by the jvm in most situations.


                                      Limitations of working with Threads.


    we have to manually:

                * create the thread,
                * start a thread
                * and join the thread

            in order to offload the work, to be run as a background task and retrieve the result.

    Threads in general are expensive

                 * have their own runtime stuck memory and registers and more.

    This is primarily the reason why creating and destroying the thread is an expensive process


     To solve this problem primarily, the third pool was created.


                                                 ThreadPool size


    ○ CPU Intensive Tasks

            * ThreadPool Size = Number of Cores

     Because at any given time, the number of tasks that can run in parallel is equal to the number of cores.

    ○ I/O task

            * ThreadPool Size > No of Cores

    The reason for this is because the thread executing the task will be waiting for the most part.


                                             THE BENEFITS OF THE POOL


    We don't have to manually create start our joint efforts.

    Helps in achieving concurrency for your application


                           WHY USE A DIFFERENT ThreadPool WHEN EVERYTHING WORKING AS EXPECTED?


    Common ForkJoinPool is shared by

            * ParallelStreams

            * CompletableFuture

    It's pretty common for an applications to use parallel streams and comparable future together.

    In this scenario, both the API will try to get a thread from the Common ForkJoinPool and use it for
        their execution.

    Will this ever cause an issue during runtime? The answer is probably yes.


                                               THE FOLLOWING ISSUES MAY OCCUR:


            * Thread being blocked, by a time-consuming task in either ParallelStreams or ComparableFuture

            * Thread not available because either the core executing the ParallelStreams or ComparableFuture is holding
                  the thread.

        These are the reasons you might consider using the user defined ThreadPool to execute your ComparableFuture code.

    ParallelStreams doesn't have an option to use a different ThreadPool, so it uses the Common ForkJoinPool
        by default and that's the only option available for ParallelStreams.


                                                        NOTE


    ○ Created a user-Defined ThreadPool:

                   * ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());



 */

public class ThreadPool_ {
}
