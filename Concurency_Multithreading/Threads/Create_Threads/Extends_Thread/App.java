package Concurency_Multithreading.Threads.Create_Threads.Extends_Thread;

public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new Extends_Thread();
        thread1.start();

    }
}
