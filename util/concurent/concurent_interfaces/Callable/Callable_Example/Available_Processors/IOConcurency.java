package util.concurent.concurent_interfaces.Callable.Callable_Example.Available_Processors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOConcurency {

    public static void main(String[] args) {

        // much higher task for IOTask
        ExecutorService service = Executors.newFixedThreadPool (100);

        // submit the tasks for executions
        for (int i = 0; i < 100; i++) {
            service.execute (new IOTask ());
        }

    }

    static class IOTask implements Runnable {

        @Override
        public void run() {
            System.out.println (Thread.currentThread ().getName ());

        }

    }
}
