package lang.classes.Thread.Thread_Example.currentThread;

public class CurrentThread_Class implements Runnable {

    CurrentThread_Class() throws InterruptedException {
        // main thread
        Thread currThread = Thread.currentThread();

        // thread created
        Thread t = new Thread(this, "Admin Thread");


        System.out.println("current thread = " + currThread.getState());
        System.out.println("thread created = " + t);

        // this will call run() function
        t.start();
    }

    public void run() {
        System.out.println("This is run() method");
    }

    public static void main(String args[]) throws InterruptedException {
        new CurrentThread_Class();
    }
}