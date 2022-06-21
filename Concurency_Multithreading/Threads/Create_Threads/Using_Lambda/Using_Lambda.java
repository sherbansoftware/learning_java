package Concurency_Multithreading.Threads.Create_Threads.Using_Lambda;

import Concurency_Multithreading.Threads.Create_Threads.ThreadColor;

public class Using_Lambda {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ThreadColor.ANSI_RED + "Hi from lambda thread: " + Thread.currentThread().getName());
        }
        );

    Thread thread2 =    new Thread(() ->
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ThreadColor.ANSI_BLUE + "Hi from second lambda thread: " + Thread.currentThread().getName());
        }
    );

    thread1.setName("T1") ;
    thread1.start();
    thread2.setName("T2");
    thread2.start();
    }
}

