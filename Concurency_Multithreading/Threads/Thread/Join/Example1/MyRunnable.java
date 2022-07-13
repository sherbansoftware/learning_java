package Concurency_Multithreading.Threads.Thread.Join.Example1;

import static Concurency_Multithreading.Threads.Thread.Join.Example1.ThreadColor.ANSI_RED;


public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
