package Concurency_Multithreading.Java5.Future;

// https://www.baeldung.com/java-executor-service-tutorial#interface

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Future.html

/*                                                     A Future

    represents the result of an asynchronous computation taken from CompletionQueue
    A result which will be available later.

        submit()

            return an object of type Future

        invokeAll()

            a collection of objects of type Future

         which allows us to get the result of a task's execution or to check the task's status (is it running).

    Future interface

        provides a special blocking method get() which returns

            * an actual result of the Callable task's execution
            * or null in the case of a Runnable task:

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

    The Future interface also provides for canceling task execution with the cancel() method and checking the cancellation
        with the isCancelled() method:

boolean canceled = future.cancel(true);
boolean isCancelled = future.isCancelled();

 */

public class Future_ {
}
