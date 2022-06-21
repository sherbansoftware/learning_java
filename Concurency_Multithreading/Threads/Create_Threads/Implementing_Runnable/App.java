package Concurency_Multithreading.Threads.Create_Threads.Implementing_Runnable;

public class App {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();

    }
}
