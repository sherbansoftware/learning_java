package Concurency_Multithreading.Threads;


// https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html


/*                                                   THREAD


      ○ Is a unit of execution within a PROCESS.
         Threads API got introduced in Java1

      ○ Every PROCESS have at least one THREAD(main) but can have multiple threads which handle tasks like:

                     * memory managements,

                     * I/O.

      ○ Our code RUN in MAIN THREAD or in other THREADS that we explicitly create.


                                          Every THREAD created by a PROCESS:


    ○ shares the process's memory and files

    ○ and has his thread STACK MEMORY

                  * which only that thread can access.

    ○  Every Java application run as a single process and each PROCESS have a multiple THREADS

    ○  Every PROCESS have a HEAP memory and every thread have a THREAD STACK memory.


    ○  Every thread has a priority:

                    * m.setPriority(Thread.MIN_PRIORITY);    1

                    * m.setPriority(Thread.NORM_PRIORITY)    5

                    * m.setPriority(Thread.MAX_PRIORITY);   10

    ○ Threads with higher priority are

                    * executed in preference to threads with lower priority.

    ○ Each thread may or may not also be marked as a daemon.

    ○ When code running in some thread creates a new Thread object,

                  * the new thread has its priority initially set equal to the priority of the  creating thread,

                  * and is a daemon thread if and only if the  creating thread is a daemon.


                                                  Task


    ○ A task is simply a set of instructions loaded into the memory.

    ○ Threads can split themselves into two or more simultaneously running tasks.


                                             States of a Thread:


    1. NEW

                   * A thread is in NEW state

                                 - when an object of the thread is created but the start method	is not yet called.

    2. RUNNABLE

                   * A thread is in RUNNABLE state when it is eligible to run,

                                  - but not running yet.

           A number of Threads can be in RUNNABLE state.

                          Scheduler selects which Thread to move to RUNNING state

    3. RUNNING

                  * A thread is RUNNING state when it?s the one that is currently,

                                - what else to say, Running

    4. BLOCKED/WAITING

                  * A thread is in BLOCKED/WAITING/SLEEPING state

                                 - when it is not eligible to be run by the Scheduler.

    5. TERMINATED/DEAD;

                  * A thread is in DEAD/TERMINATED state

                                  - when it has completed its execution.

                          Once a thread enters dead state, it cannot be made active again.


                                            THREAD-SAFE


    ○ a class or a method is thread-safe what that means is that

                  * the developer has synchronized all the critical sections within the code

                                - so that we as a developer don't have to worry about the thread interference


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

     ○ The performance impact of multithreading is

                    * Completing a complex task much faster.

                    * Finish more work in the same period of time than with a single thread.

                    * And if we're running a high scale service on multiple machines,

     ○ We will need:

                    * fewer machines,

                    * which will also mean less expenses on infrastructure

                    * and more money in our pocket.


                                             Concurrency- Multitasking


    ○ By multitasking quickly between different threads

                    * our computer can create an illusion that

                                  - all those tasks are actually happening in the same time.

    ○ The therm we use for this kind of multitasking is concurrency.

      Not as that, we don't even need multiple cores to achieve concurrency.

                    * Even with one core, we can create responsive applications by using multiple threads.


                                       When to prefer Multithreaded Architecture


    ○ If the task share a lot of data

    ○ Threads are much faster to create and destroy

    ○  Switching between multiple threads of the same process is much faster (shorter context switcher)


                                  When to prefer Multi-Process Architecture


            * If security and stability is of higher priority for us.A separate processes are completely isolated from
                  each other.Whereas one thread in a multithreaded application can bring down the entire app.

            * If the tasks are unrelated to each other in any way, then it makes no sense to put them together in the
                  same process.


                                     Threads Scheduling - Dynamic priority


            * Dynamic Priority = Static Priority + Bonus ( bonus can be negative)

                      - The static priority is set by the developer ahead of time.

                                   m1.setPriority(Thread.MIN_PRIORITY);  - 1
                                   m2.setPriority(Thread.NORM_PRIORITY) - 5
                                   m2.setPriority(Thread.MAX_PRIORITY);  -10

                      - And the bonus is adjusted by the operating system.


                                               NOTE


    ○ Threads API got introduced in Java1

    ○ Threads are normally used to offload blocking tasks as background tasks.

    ○ Basically, threads allowed the developers to write asynchronous style of code.

    ○ Multithreaded programming is fundamentally different than the traditional single thread programming.

    ○ Multiple threads in a single process share:

                   1 The Heap

                   2. Code

                   3. The process's open file

                   4. The process's open metadata

     ○ Most of Java Virtual Machine(JVM) instance (implementations) run as a process.



*/

public class Threads_ {

}
