package util.concurent.concurent_interfaces.Callable.Callable_Example.Available_Processors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Callable_Interface {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // create the pool
        ExecutorService service = Executors.newFixedThreadPool(10);

        // submit the tasks for execution
        List<Future> allFuture = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = service.submit(new Task());
            allFuture.add(future);
        }

        // 100 future with 100 placeholders

        // perform some unrelated operations

        // 100 sec
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = allFuture.get(i);
            Integer result = future.get(); // blocking operations
            System.out.println("Result of future #" + i + "=" + result);
        }
    }

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }

    }
}
