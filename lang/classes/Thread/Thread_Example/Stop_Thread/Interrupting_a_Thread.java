package lang.classes.Thread.Thread_Example.Stop_Thread;

/*
    What happens when sleep() is set to a long interval, or if we're waiting for a lock that might never be released?
    We face the risk of blocking for a long period or never terminating cleanly.
    We can create the interrupt() for these situations, let's add a few methods and a new flag to the class:
 */

import java.util.concurrent.atomic.AtomicBoolean;

public class Interrupting_a_Thread {
    private Thread worker;
    private AtomicBoolean running = new AtomicBoolean(false);
    private AtomicBoolean stopped = new AtomicBoolean(false);
    private int interval;

    // ...

    public void interrupt() {
        running.set(false);
        worker.interrupt();
    }

    boolean isRunning() {
        return running.get();
    }

    boolean isStopped() {
        return stopped.get();
    }

    public void run() {
        running.set(true);
        stopped.set(false);
        while (running.get()) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(
                        "Thread was interrupted, Failed to complete operation");
            }
            // do something
        }
        stopped.set(true);
    }
}
/* We've added an interrupt() method that sets our running flag to false and calls the worker thread's interrupt() method.

        If the thread is sleeping when this is called, sleep() will exit with an InterruptedException, as would any other blocking call.

        This returns the thread to the loop, and it will exit since running is false.

 */