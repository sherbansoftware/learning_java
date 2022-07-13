package Concurency_Multithreading.Threads.Thread.Thread_Termination.Example1;

/**
 * Created by timbuchalka on 25/05/2016.
 */
public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
