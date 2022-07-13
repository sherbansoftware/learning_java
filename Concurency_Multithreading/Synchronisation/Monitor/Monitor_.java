package Concurency_Multithreading.Synchronisation.Monitor;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html


/*                                                 What Is a Monitor?


    ○ A monitor is a synchronization mechanism that allows threads to have:

                   * mutual exclusion

                                 - only one thread can execute the method at a certain point in time, using locks

                   * cooperation

                                 - the ability to make threads wait for certain conditions to be met, using wait-set


                                                Why is this feature called monitor?


    ○ Because it monitors how threads access some resources.

           Monitors formally became subject of interest in the early 70s in the paper written by P.B. Hansen named Shared Classes.
        After that, C.A.R. Hoare wrote the paper Monitors an Operating System Structuring Concept where he developed the
        concept of Monitors even further. The paper introduced a form of synchronization and proposed a model of
        implementation using semaphores.


                                                      Monitor Features


    ○ Monitors provide three main features to the concurrent programming:

                   * only one thread at a time has mutually exclusive access to a critical code section

                   * threads running in a monitor could be blocked while they are waiting for certain conditions to be met

                   * one thread can notify other threads when conditions they are waiting on are met


                                               How Does Java Implement Monitors?


    ○ A critical section is a part of the code that accesses the same data through different threads.
          In Java, we use the

                   * synchronized keyword to mark critical sections. We can use it to mark:

                                 - methods (also called synchronized methods)

                                 - or even smaller portions of code (synchronized statements).

    ○ There are opposed opinions about which approach to favor:

                   * method synchronization is usually the recommended simpler approach,

                   * while the synchronized statements could be a better choice from the security point of view.

    ○ In Java, there is a logical connection between the monitor and every object or class. Hence, they cover instance and
        also static methods. Mutual exclusion is accomplished with a lock associated with every object and class. This
        lock is a binary semaphore called a mutex.


                                               Building and Exclusive Room Analogy


    Java is implementation of a monitor mechanism relies on two concepts

            - the entry set
            - and the wait set.

        In literature, authors use a building and exclusive room analogy to represent the monitor mechanism. In this analogy,
            only one person can be present in an exclusive room at a time.

    So, in this analogy:

                * the monitor is a building that contains two rooms and a hallway
                * the synchronized resource is the exclusive room
                * wait set is a waiting room
                * entry set is a hallway

        threads are people who want to get to the exclusive room

    When the person wants to enter the exclusive room, he first goes to the hallway (the entry set) where he waits for a
        scheduler. Therefore, the scheduler will pick the person and send him to the exclusive room.

    Schedulers in JVMs use a

        priority-based scheduling algorithm.

        In case two threads have the same priority, the JVM uses the

            FIFO approach.

    Hence, when the scheduler picks the person, he enters the exclusive room. It could be that some specific situation
        is happening in this room, so that person needs to go out and wait for the exclusive room to become available again.
        Therefore, that person will end up in the waiting room (the wait set). Consequently, the scheduler will schedule
        this person to enter an exclusive room later.

    Also, it's important to mention the steps that threads go through during this process, using the same analogy:

                * entering the building                           � entering the monitor
                * entering the exclusive room                     � acquiring the monitor
                * being in the exclusive room                     � owning the monitor
                * leaving the exclusive room                      � releasing the monitor
                * leaving the building                            � exiting the monitor.

    Luckily, Java does most of the work in the background, and we don�t need to write semaphores when we�re dealing with
        multi-threaded applications.

    Therefore, the only thing we need to do is wrap our critical section with the synchronized keywords and it momentarily
        becomes a monitor region.

*/


public class Monitor_ {
}
