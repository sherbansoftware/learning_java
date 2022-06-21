package Concurency_Multithreading.Thread_Join.Example1;

import static Concurency_Multithreading.Thread_Join.Example1.ThreadColor.ANSI_RED;


public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
