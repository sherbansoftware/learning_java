package util.concurent.Executor_Service.ExecutorService_Example.Types;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CachedThreadPool {

    public static void main(String[] args) {

        // for lot of short lives tasks
        ExecutorService service = Executors.newCachedThreadPool();

        // submit the tasks for execution
        for (int i = 0; i < 10; i++) {
            service.execute(new Task());

        }
        System.out.println("Thread name " + Thread.currentThread().getName());

    }

    static class Task implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Thread name " + Thread.currentThread().getName() + "--" + new Random().nextInt());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }

    }
}