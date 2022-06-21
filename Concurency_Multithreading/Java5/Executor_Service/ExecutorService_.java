package Concurency_Multithreading.Java5.Executor_Service;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executors.html
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ExecutorService.html


/*                                                  ExecutorService

    Released as part of Java 5(Release Year 2004)
    In simply words: is an Asynchronous Task execution Engine.

    The Java ExecutorService interface, java.util.concurrent.ExecutorService, represents an asynchronous execution
        mechanism which is capable of executing tasks concurrently in the background in a much simpler way compared to
        thread.

    This enabled cause greened task based parallelism in Java.


                                                 Components of ExecutorService

          1. ThreadPool

          2. WorkQueue           - this is a BlockingQueue

                 - Any time the client submits a task for the executive service, the task will be placed in the queue.

          3. CompletionQueue

                 - where the tasks that are completed with the threads and the ThreadPool will be pleased in the

                       completion queue.


                                                          How it works


      1.Client(your code interacting with the ExecutorService)      ->       place the task in the WorkQueue

      2. You get in return A Future


    When the task is available in the queue one of the threads from the actual ThreadPool is going to:

                 take that work and  execute the task
                 and place the result in the CompletionQueue

         and then the client read the result from it using the Future reference.

    In a nutshell, this is how they execute a service.

    ThreadPool and the future work together to provide task based parallelism in Java.

                                                    Shutting Down an ExecutorService

    In general, the ExecutorService will not be automatically destroyed when there is no task to process. It will stay
        alive and wait for new work to do.

            * shutdown()

                  method doesn't cause immediate destruction of the ExecutorService.It will make the ExecutorService stop
                      accepting new tasks and shut down after all running threads finish their current work:

                              List<Runnable> notExecutedTasks = executorService.shutDownNow();

            * shutdownNow()

                  method tries to destroy the ExecutorService immediately, but it doesn't guarantee that all the running
                      threads will be stopped at the same time:

                               List<Runnable> notExecutedTasks = executorService.shutDownNow();

            * awaitTermination()

                 One good way to shut down the ExecutorService (which is also recommended by Oracle) is to use both of
                     these methods combined with the awaitTermination() method:


                               executorService.shutdown();

                                        try {
                                            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                                                 executorService.shutdownNow();
                                            }
                                        } catch (InterruptedException e) {
                                                 executorService.shutdownNow();
                                         }

                                           Inconvenience with ExecutorService

   Calling the get() method while the task is still running will cause execution to block until the task properly executes
         and the result is available.

    With very long blocking caused by the get() method, an application's performance can degrade. If the resulting data
        is not crucial, it is possible to avoid such a problem

            by using timeouts:

                     String result = future.get(200, TimeUnit.MILLISECONDS);

    If the execution period is longer than specified (in this case, 200 milliseconds),

        a TimeoutException will be thrown.

    We can use the isDone() method to check if the assigned task already processed or not.

            Future<Integer> future = new SquareCalculator().calculate(10);

                   while(!future.isDone()) {
                        System.out.println("Calculating...");
                        Thread.sleep(300);
                     }

                   Integer result = future.get();




                                                         NOTE

            * ExecutorService provides a way to asynchronously, execute the task and provide the result in a much simpler
                  way compared to thread.



 */

public class ExecutorService_ {
}
