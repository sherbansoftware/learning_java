package Concurency_Multithreading.Java8.CompletableFuture;


// https://docs.oracle.com/javase/8/docs/api/index.html?java/util/concurrent/package-summary.html

// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html

/*                                             CompletableFuture


    ○ By default, CompletableFuture uses the Common ForkJoinPool

    ○ The number of cores in the pool == number of cores on the machine

    ○ Any time you use CompletableFuture in your code, it's going to use the common Fork Join Pool
          behind the scenes to  execute them.



*/

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_ {

    CompletableFuture cf;
}
