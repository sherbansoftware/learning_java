package Concurency_Multithreading.Threads.Thread.Thread_Synchronization;



/*                                                    Synchronization


    ○ Threads communicate primarily by

                   * sharing access to fields

                   * and the objects reference fields refer to.

           This form of communication is extremely efficient,

                  * but makes two kinds of errors possible:

                                - thread interference

                                - and memory consistency errors.

    ○ The tool needed to prevent these errors is synchronization.

    ○ However, synchronization can introduce

                   * thread contention,

           which occurs when two or more threads

                    * try to access the same resource simultaneously and cause the Java runtime

                    * to execute one or more threads more slowly,

                    * or even suspend their execution.

            Starvation and livelock are forms of thread contention. 


                                        What is synchronization of threads?
                                        
                                        
    ○ Since Threads run in parallel,a new problem arises.

    ○ What if thread1 modifies data which is being accessed by thread2?

    ○ How do we ensure that different threads don’t leave the system in an inconsistent state?

    ○ This problem is usually called synchronization problem.


    ○ The way you can prevent multiple threads from	executing the same	method

                   * is by using the synchronized keyword  on  the  method.

    ○ If a method is marked synchronized,

                   * a different thread gets access to the method

                   * only when there is	no other thread	currently executing	the	method.


                                                 Why we use Synchronization


    ○ Synchronization helps in preventing thread interference.

    ○ Synchronization helps to prevent concurrency issues.


                                      Thread Synchronization:   -- 2 types


    1.Mutual Exclusive:

                 * A Mutex or Mutual Exclusive

                               - helps only one thread to access the shared resources.
                                     It won’t allow the accessing of shared resources at a time.

      It can be achieved in the following ways.


                  * Synchronized Method

                  * Synchronized block

                  * Static Synchronization


    2. Cooperation (Inter Thread Communication in java)

                   * Inter-thread communication in Java

                                 - is a mechanism in which a thread is paused running in its critical section

                                 - and another thread is allowed to enter (or lock) in the same critical section to be executed.

       Note: Inter-thread communication is also known as Cooperation in Java

 */


public class Thread_Synchronization_ {
}
