package Concurency_Multithreading.Java5.ThreadPool.FixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*                                             FixedThreadPool

    The code here will create a fixed pool that will have the same size as the number of cores in your
       machine but can be set another number.

 */


public class FixedThreadPool {

    public static void main(String[] args) {

        // Creating a User-Defined ThreadPool
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        // submit the tasks for execution
        for (int i = 0; i < 10; i++) {
            service.execute(new Thread(() -> System.out.println("Thread name " + Thread.currentThread().getName())));
        }
        System.out.println("Thread name " + Thread.currentThread().getName() + "++++++++++");
    }

//    static class Task implements Runnable {
//        @Override
//        public void run() {
//            System.out.println("Thread name " + Thread.currentThread().getName());
//        }

}
