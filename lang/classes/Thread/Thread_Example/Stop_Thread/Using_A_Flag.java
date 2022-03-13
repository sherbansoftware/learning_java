package lang.classes.Thread.Thread_Example.Stop_Thread;

// https://www.baeldung.com/java-thread-stop

import java.util.concurrent.atomic.AtomicBoolean;

/*    In this brief article, we'll cover stopping a Thread in Java – which is not that simple since the Thread.stop()
          method is deprecated.

      As explained in this update from Oracle, stop() can lead to monitored objects being corrupted.
 */


  //  1. Using a Flag
public class Using_A_Flag implements Runnable {

    private Thread worker;
    private final AtomicBoolean running = new AtomicBoolean(false);
    private int interval;

    public Using_A_Flag(int sleepInterval) {
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
