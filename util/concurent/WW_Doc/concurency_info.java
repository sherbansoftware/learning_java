package util.concurent.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/index.html?java/util/concurrent/package-summary.html

/*                                      PROCESS (APPLICATION)

     Process class :       https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html

     Process:
         is a unit of execution that has its own memory space(heap memory)
         The HEAP isn't share between PROCESSES.
         Most of Java Virtual Machine(JVM) instance (implementations) run as a process.

                                           THREAD

      Is a unit of execution within a PROCESS.
      Every PROCESS have at least one THREAD(main) but can have multiple threads which handle tasks like: memory
          managements, andI/O.
      Our code RUN in MAIN THREAD or in other THREADS that we explicitly create.
      Every THREAD created by a PROCESS shares the process's memory anf files and has his thread STACK MEMORY
          which only that thread can access.
      Every Java application run as a single process and each PROCESS have a multiple THREADS
      Every PROCESS have a HEAP memory and every thread have a THREAD STACK memory.

      Every thread has a priority--------------------------------------------------------------------------------------

          m1.setPriority(Thread.MIN_PRIORITY);
          m2.setPriority(Thread.MAX_PRIORITY);

      Threads with higher priority are executed in preference to threads with lower
      priority. Each thread may or may not also be marked as a daemon. When code running in some thread creates a new
      <code>Thread</code> object, the new thread has its priority initially set equal to the priority of the  creating
      thread, and is a daemon thread if and only if the  creating thread is a daemon.

                                          THREAD-SAFE

      a class or a method is thread-safe what that means is that the developer has synchronized all the critical sections
      within the code so that we as a developer don't have to worry about the thread interference

                                         MULTIPLE THREADS: 2 reasons

 *    FIRST REASON:--------------------------------------------------------------------------------------------------------

         perform a task that's going to TAKE A LONG TIME: QUERRY.A DATABASE OR FETCH DATA FROM SOMWHERE FROM INTERNET
         We could do in MAIN THREAD but code within MAIN THREAD EXECUTES LINEAR AND IT WON'T BE ABLE TO DO ANYTHING ELSE
         WHILE IT'S === WAITING === FOR  THE DATA.
         The MAIN THREAD WILL BE === SUSPENDED === SO IT HAS TO WAIT FOR THE DATA TO BE RETURNED BEFORE EXECUTES NEXT LINE OF
         CODE APPLICATION CAN APPEAR THAT IS DIED OR FROZEN FOR USER ESPECIALLY FPR UI APPLICATION.
         WE CAN CREATE ANOTHER THREAD WHICH EXECUTE LONG RUNNING TASK IN BACKGROUND IN ORDER TO FREE UP MAIN THREAD

 *    SECOND REASON:-------------------------------------------------------------------------------------------------------

   An API REQUIRES US TO PROVIDE ONE
   Somethimes we have to provide the code that will run when a method we've called  reaches a certain point in it's execution
   We pass in the code that we want to run on the thread

                                                    CONCURENCY

    https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html

         refers to an Application doing more than one thing at time.
     progress can be made on more that one task.




    RELATED:

    https://www.baeldung.com/tag/java-concurrency/


*/