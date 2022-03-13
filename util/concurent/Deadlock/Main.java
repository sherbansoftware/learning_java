package util.concurent.Deadlock;

/*
                                               ==deadlock==

   so a deadlock occurs when two or more threads are blocked on locks and every
   thread that's blocked is holding a lock that another block thread wants

                                                ==for example==
    thread 1 is holding lock 1 and waiting to acquire lock 2 but
    thread 2 is holding lock 2 and waiting to acquire lock 1 because all the
    threads holding the locks are blocked they will never release the locks they're
    holding and so none of the waiting threads will actually ever run

                                                 ==solution==
     now if we made both threads obtain the locks in the same order a deadlock can't occur
* */

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();

    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Has lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 1: Waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Has lock1 and lock2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Released lock1. Exiting...");
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 2: Has lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 2: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 2: Has lock1 and lock2");
                }
                System.out.println("Thread 2: released lock2");
            }
            System.out.println("Thread 2: Released lock1. Exiting...");
        }
    }
}







