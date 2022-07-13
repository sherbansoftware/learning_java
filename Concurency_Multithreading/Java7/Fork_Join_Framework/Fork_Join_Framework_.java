package Concurency_Multithreading.Java7.Fork_Join_Framework;

// https://docs.oracle.com/javase/tutorial/essential/concurrency/forkjoin.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinPool.html

/*                                             Fork/Join Framework


    ○ This got released as part of Java seven.(2011)

    ○ This framework extends the ExecutorService.

    ○ The primary difference between the Fork/Join Framework and the ExecutorService is:

                   * Fork/Join Framework

                             - is designed for Data Parallelism

                    * ExecutorService

                              -  is designed for Task Based Parallelism.


                                                       Data Parallelism


    ○ Data parallelism is a concept where

                  * a given task is recursively split into subtasks to its least possible size

                  * and run those tasks in parallel.

    ○  Basically it uses "Divide and Conquer" Algorithm paradigm


                                       How  Fork/Join Framework work internally


    ○ it has a dedicated

                   * ForkJoin Pool

                                 - to support data parallelism


                                              ForkJoin Pool is made by:


            1. Shared Work Queue

                here  the client(code) submit the ForkJoinTask
                ForkJoin Pool accept only ForkJoinTask because this task has the ability to split the task and join
                    them after sequential  execution(executed in parallel by multiple core)


            2. Worker Threads

                   each worker thread has allocated a   Double Ended Work Queue - Deque


                                               ForkJoin Task


    represents a part of the data and its computation

    We have a class of type named ForkJoinTask, specifically created to work with  ForkJoin Task.
    In reality, the application normally does not work with for Joint Task Force. This is mostly used by the Java creators
        for internal purposes.

    There are two separate classes
            which are normally used by the developers to interact with the ForkJoin Pool

                * RecursiveTask   task that return a value
                * Recursive action Task that not return a value


 */
public class Fork_Join_Framework_ {
}
