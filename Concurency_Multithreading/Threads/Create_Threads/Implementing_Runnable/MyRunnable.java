package Concurency_Multithreading.Threads.Create_Threads.Implementing_Runnable;


import static Concurency_Multithreading.Threads.Create_Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of Runnable");
    }
}
