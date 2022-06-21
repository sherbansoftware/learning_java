package Concurency_Multithreading.Thread_Termination.Example1;

import static Concurency_Multithreading.Thread_Termination.Example1.ThreadColor.ANSI_RED;

/**
 * Created by timbuchalka on 25/05/2016.
 */
public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
