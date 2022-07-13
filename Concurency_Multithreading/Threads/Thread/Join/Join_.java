package Concurency_Multithreading.Threads.Thread.Join;
/*

                                                       Join


    ○ The join method allows one thread to wait for the completion of another.

                   * If t is a Thread object whose thread is currently executing,

                                 - t.join();

            causes the current thread to pause execution until t's thread terminates.

    ○  Like sleep, join responds to an interrupt by exiting with an InterruptedException.


                                            Thread coordination

            * public final void join()

                  When the join() method is invoked, the current thread stops its execution and the thread goes into the
                  wait state. The current thread remains in the wait state until the thread on which the join() method is
                  invoked has achieved its dead state. If interruption of the thread occurs,
                  then it throws the InterruptedException.

            * public final void join(long millis)

                  how much wait for thread to finish it's work.
                  When the join() method is invoked, the current thread stops its execution and the thread goes into the
                  wait state. The current thread remains in the wait state until the thread on which the join() method
                  is invoked called is dead or the wait for the specified time frame(in milliseconds) is over.

            * public final void join(long millis, int nanos)

                  join(long mls, int nanos): When the join() method is invoked, the current thread stops its execution
                  and go into the wait state. The current thread remains in the wait state until the thread on which
                  the join() method is invoked called is dead or the wait for the specified time frame(in milliseconds +
                  nanos) is over.

                                                    NOTE

            * Threads may take unreasonably long time to finnish   -then use Thread.join() with a time limit
            * Stop the thread if is not done by that time

 */
public class Join_ {
    public static void main(String[] args) {

    }
}
