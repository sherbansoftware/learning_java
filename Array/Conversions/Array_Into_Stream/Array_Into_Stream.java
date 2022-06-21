package Array.Conversions.Array_Into_Stream;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Array_Into_Stream {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer[] arr = {55, 98, 554, 1, 99, 77};
        List<Integer> li = List.of(arr);

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                Arrays.sort(arr);
//                System.out.println(Thread.currentThread().getName());
//            }
//        });
        ExecutorService es = Executors.newFixedThreadPool(4);

        Future<List<Integer>> future = es.submit(() -> li.parallelStream().sorted().collect(Collectors.toList()));

        Long start = System.currentTimeMillis();

        while (!future.isDone()) {
            System.out.println("Working on it...");
        }
        es.shutdown();

        Long end = System.currentTimeMillis();
        System.out.println((end - start));

        System.out.println(future.get());

    }
}

