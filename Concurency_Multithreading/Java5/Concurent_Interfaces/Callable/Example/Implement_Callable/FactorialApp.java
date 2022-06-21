package Concurency_Multithreading.Java5.Concurent_Interfaces.Callable.Example.Implement_Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FactorialApp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        List<Future<Integer>> resultList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            FactorialCalculator calculator = new FactorialCalculator(i);
            Future<Integer> result = executor.submit(calculator);
            resultList.add(result);
        }

        executor.awaitTermination(5, TimeUnit.SECONDS);

        for (int i = 0; i < resultList.size(); i++) {
            Future<Integer> result = resultList.get(i);
            Integer number = null;
            try {
                number = result.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.printf("Interface_Class: Task %d: %d\n", i, number);
        }

        executor.shutdown();
    }
}
