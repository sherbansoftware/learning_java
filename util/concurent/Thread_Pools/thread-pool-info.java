package util.concurent.Thread_Pools;
/*
                            Service interface

         service interface now this is also found in the java.util.concurrent package and we use implementations of this
         interface to manage threads for us so that we don't have to explicitly create and start threads and unlike what
         we've been doing so far now the implementation is provided by the jdk manage things like thread scheduling and
         they also optimize the creation of threads which can generally be expensive in terms of performance and memory.
         Now we still have to provide runnable objects to the service because we obviously have to code the tasks we
         want to execute on background threads but we don't directly manage any threads as such the executive service
         implementations allow us to focus on the code we want to run without the fuss of managing threads and their
         life cycles.

                                    IMPORTANT

         so the executive service implementations make use of thread polls now I'm not

                                     Thread Poll

          the thread poll is a managed set of threads  we use thread polls through the executive service implementations
          now if we want to we can actually implement our own thread poll by creating a class that implements one of
          the thread poll interfaces and by doing so we can configure how the underlying thread poll  ultimately is
          managed but it's recommended that we use the implementations provided by the jvm in most situations

                                      ExecutorService

         ExecutorService is a framework provided by the JDK which simplifies the execution of tasks in asynchronous mode.
         Generally speaking, ExecutorService automatically provides a pool of threads and API for assigning tasks to it.

          For example, the following line of code will create a thread-pool with 10 threads:

          ExecutorService executor = Executors.newFixedThreadPool(10);

           https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html


*/