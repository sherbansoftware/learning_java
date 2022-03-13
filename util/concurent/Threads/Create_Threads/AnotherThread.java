package util.concurent.Threads.Create_Threads;


import static util.concurent.Threads.Create_Threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread." + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Anothre thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed i'm awake");
    }
}
