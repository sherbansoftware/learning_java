package Concurency_Multithreading;

// https://www.baeldung.com/java-concurrency

// https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html


/*                                      PROCESS (APPLICATION)


    ○ is a unit of execution that has its own memory space(heap memory)
        The HEAP isn't share between PROCESSES.
        Most of Java Virtual Machine(JVM) instance (implementations) run as a process.

    A few of the things that the process contains are the metadata, like:

                     * the process ID,
                     * the files                - that the application opens for reading and writing the code,
                     * the code                 - program instructions that are going to be executed on the CPU,
                     * the heap,                - which contains all the data, our application needs.
                     * least one thread         - called the main thread.


                                             THREAD


    Is a unit of execution within a PROCESS.
        Every PROCESS have at least one THREAD(main) but can have multiple threads which handle tasks like:

            memory managements,
            andI/O.

    Our code RUN in MAIN THREAD or in other THREADS that we explicitly create.
        Every THREAD created by a PROCESS shares the process's memory anf files and has his thread STACK MEMORY
          which only that thread can access.
    Every Java application run as a single process and each PROCESS have a multiple THREADS
    Every PROCESS have a HEAP memory and every thread have a THREAD STACK memory.

    The thread contains two main things,

                       * the stack
                             - is a region in memory where

                                   * the local variables are stored
                                   * and functions are executed.

                       * the instruction pointer

                               - is nothing more than a pointer that points to the address of the next instruction that
                                     the thread is going to execute.

    Each thread is executing a different instruction in a different function at any given moment.

                                           Race condition in Java

    is a type of concurrency bug or issue that is introduced in your program because of parallel execution of your program
        by multiple threads at the same time

                                         Every thread has a priority

            * m1.setPriority(Thread.MIN_PRIORITY);   = 1;
            * m.setPriority(Thread.NORM_PRIORITY);   = 5;
            * m2.setPriority(Thread.MAX_PRIORITY);   = 10 ;

      Threads with higher priority are executed in preference to threads with lower
          priority. Each thread may or may not also be marked as a daemon. When code running in some thread creates a new
          Thread object, the new thread has its priority initially set equal to the priority of the  creating thread,
          and is a daemon thread if and only if the  creating thread is a daemon.

                                                 THREAD-SAFE

    a class or a method is thread-safe what that means is that the developer has synchronized all the critical sections
        within the code so that we as a developer don't have to worry about the thread interference

                                           Why we need MULTIPLE THREADS:  2 reasons

    1. Responsiveness

            * responsiveness is particularly critical when it comes to applications with a
                  user interface.

            * This kind of responsiveness can be achieved by using multiple threads,
                  each thread for a different task.
            * And it's generally very hard to achieve otherwise.
            * Perform a task that's going to TAKE  A LONG TIME:
            * Example:

                     - QUERRY  A DATABASE OR
                     - FETCH DATA FROM SOMWHERE FROM INTERNET

                  We could do in MAIN THREAD but code within MAIN THREAD EXECUTES LINEAR AND IT WON'T BE ABLE TO DO ANYTHING
                      ELSE
                  WHILE IT'S === WAITING === FOR  THE DATA.
                  The MAIN THREAD WILL BE === SUSPENDED === SO IT HAS TO WAIT FOR THE DATA TO BE RETURNED BEFORE EXECUTES
                      NEXT LINE OF CODE APPLICATION CAN APPEAR THAT IS DIED OR FROZEN FOR USER ESPECIALLY FPR UI APPLICATION.

                  WE CAN CREATE ANOTHER THREAD WHICH EXECUTE LONG RUNNING TASK IN BACKGROUND IN ORDER TO FREE UP MAIN THREAD

    2. Performance

           Using concurrency:

               * we can create an illusion
                     of multiple tasks running in parallel using just a single core.

               * with multiple core we can truly
                    run tasks completely in parallel

        The performance impact of multithreading is

            * Completing a complex task much faster.
            * Finish more work in the same period of time than with a single thread.
            * And if we're running a high scale service on multiple machines,
                  we will need:

                - fewer machines,
                - which will also mean less expenses on infrastructure
                - and more money in our pocket.

                                                      CONCURRENCY

    ○ refers to an Application doing more than one thing at time.Progress can be made on more than one task.

                                                        NOTE

            * we cannot rely on the order of execution
            * Always use thread coordination
            * Design code for worst case scenario
            * Threads may take unreasonably long time to finnish   -then use Thread.join() with a time limit
            * Stop the thread if is not done by that time



*/
public class Concurency_Multithreading {
    Thread th;
}
