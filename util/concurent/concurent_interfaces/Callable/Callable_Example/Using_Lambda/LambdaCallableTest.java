package util.concurent.concurent_interfaces.Callable.Callable_Example.Using_Lambda;

import java.util.concurrent.*;

public class LambdaCallableTest {
    public static void main(String args[]) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable c = () -> {   // Lambda Expression
            int n = 0;
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread's name " + Thread.currentThread().getName());
                n += i;
            }

            return n;
        };
        Future<Integer> future = executor.submit(c);
        try {
            Integer result = future.get(); //wait for a thread to complete
            System.out.println(result + Thread.currentThread().getName());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
