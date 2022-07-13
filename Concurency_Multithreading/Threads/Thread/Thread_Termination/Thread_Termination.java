package Concurency_Multithreading.Threads.Thread.Thread_Termination;

//https://docs.oracle.com/javase/tutorial/essential/concurrency/interrupt.html

/*                                              Thread Termination

    A thread is automatically destroyed when the run() method has completed.

    Interrupt

        An interrupt is an indication to a thread that it should stop what it is doing and do something else.
        It's up to the programmer to decide exactly how a thread responds to an interrupt, but it is very common for
            the thread to terminate. This is the usage emphasized in this lesson.


                * public void interrupt() {}
                * Using a volatile boolean flag:

            We can also use a volatile boolean flag to make our code thread safe. A volatile variable is directly stored
                in the main memory so that threads cannot have locally cached values of it. A situation may arise when
                more than one threads are accessing the same variable and the changes made by one might not be visible
                to other threads. In such a situation, we can use a volatile boolean flag.

                * using an AtomicBoolean

    Let's start with a class that creates and starts a thread. This task won't end on its own, so we need some way of
        stopping that thread.

    We'll use an atomic flag for that:

public class ControlSubThread implements Runnable {

    private Thread worker;
    private final AtomicBoolean running = new AtomicBoolean(false);
    private int interval;

    public ControlSubThread(int sleepInterval) {
        interval = sleepInterval;
    }

    public void start() {
        worker = new Thread(this);
        worker.start();
    }

    public void stop() {
        running.set(false);
    }

    public void run() {
        running.set(true);
        while (running.get()) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println(
                  "Thread was interrupted, Failed to complete operation");
            }
            // do something here
         }
    }
}
    Rather than having a while loop evaluating a constant true, we�re using an AtomicBoolean and now we can start/stop execution
        by setting it to true/false.
    As explained in our introduction to Atomic Variables, using an AtomicBoolean prevents conflicts in setting and checking the
        variable from different threads.

                                         why would we want to stop a thread?

            * We know the threads consume resources, even when the thread is not doing  anything,
                it's still consuming:

                     - Memory and some kernel resources.

                     - It's also consuming CPU cycles and cache memory

                     - If a thread that already finished its work, but the application is still running, we would like
                           to clean up those resources consumed by that unused thread.

                     - Another reason we would want to stop a thread is misbehaving in any way.It's fine possible that
                            it's sending a request to a server that is not responding or simply transfer very long
                            calculation, much longer than we want to allow it.

                      - The last reason we may want to stop a thread is if we want to stop or close the entire application
                            by default, as long as we have at least one thread running, the application will not end
                            even if the main thread already stopped running.

    So we want the ability to stop all the threads gracefully

                                            when would we want to stop a thread?

    We can use the thread interrupt method into scenarios:

             * The first one,
                   if the thread we're trying to interrupt is currently executing a method which throws an InterruptedException
                   when it gets interrupted.

             * Second one
                   if the thread we're trying to interrupt is handling the interrupt signal explicitly


 */


public class Thread_Termination {
}
