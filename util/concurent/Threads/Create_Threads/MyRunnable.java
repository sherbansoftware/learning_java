package util.concurent.Threads.Create_Threads;


import static util.concurent.Threads.Create_Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
