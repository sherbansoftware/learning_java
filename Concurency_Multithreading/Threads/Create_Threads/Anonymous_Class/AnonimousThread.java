package Concurency_Multithreading.Threads.Create_Threads.Anonymous_Class;

import Concurency_Multithreading.Threads.Create_Threads.ThreadColor;

public class AnonimousThread {

    public static void main(String[] args) {
        //anonymous class it's useful if you want to run code once because is easier to configure

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();
    }

}
