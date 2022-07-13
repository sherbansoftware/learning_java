package Concurency_Multithreading.Wait_Notify_NotifyAll;

/*
                                                      MONITOR

    ○ Every object,

                   * in addition to having an associated MONITOR,

                   * has an associated WAIT SET.

   ○ A wait set is a set of threads.

                   * Wait sets are manipulated solely through the methods

                                 - wait(), wait(long), wait(long, int)

                                 - notify(),

                                 - notifyAll().


                                               wait


    1. wait()

                   * causes the current thread to wait indefinitely

                   * until another thread either invokes notify() for this object or notifyAll().

    2. wait(long timeout)


    3. wait(long timeout, int nanos)

                                              notify()


    ○ notify() notifies any one of them to wake up arbitrarily.

                  * the choice of exactly which thread to wake is non-deterministic and depends upon the implementation.


                                             notifyAll()


    ○ this method simply wakes all threads that are waiting on this object's monitor.

* */


public class Wait_Notify_NotifyAll_ {
}
