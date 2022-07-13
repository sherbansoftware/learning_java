package Concurency_Multithreading.Threads.Thread.Thread_Termination.Example;

/**
 * Thread Termination & Daemon Threads
 * https://www.udemy.com/java-multithreading-concurrency-performance-optimization
 */
public class Interrupt_Method {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.start();
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            //do things
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Existing blocking thread!");
            }
        }
    }
}
