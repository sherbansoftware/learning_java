package Concurency_Multithreading.Threads.Create_Threads.Extends_Thread;

import static Concurency_Multithreading.Threads.Create_Threads.ThreadColor.ANSI_BLUE;

public class Extends_Thread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread." + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed i'm awake");
    }
}
