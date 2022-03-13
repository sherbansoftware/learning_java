package util.concurent.Livelocks_And_Fairloks.Livelock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
/*
                                      new ReentrantLock(true)

       The parameter for true: -----------------------------------------------------------------------------------------

            is whether it's a fair lock so first come first served or not so true means that we are doing it that way we
            want it to be set up to be a first come first served or to use a first-come first-served order now a few
            important notes about using a fair re entrant lock only

        ATest.A few important notes about using a fair re entrant lock: -----------------------------------------------------

         only fairness in acquiring the lock is guaranteed not fairness in threads scheduling so it's possible that the
         thread that gets the lock will execute a task that takes a long time so when using fair locks it's possible
         for threads to still have to wait a long  time to run the only thing a fair lock guarantees is the first come
         first served ordering for getting the lock  secondly the try lock method doesn't honor the fairness settings
          so it will not be first come first served


* */

    private static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
	    Thread t1 = new Thread(new Worker(ThreadColor.ANSI_RED), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_CYAN), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t3.start();
        t2.start();
        t5.start();
        t4.start();
        t1.start();


    }

    private static class Worker implements Runnable {
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for(int i=0; i<100; i++) {
                lock.lock();
                try {
                    System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
                    // execute critical section of code

                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
