package util.concurent.Threads.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html

/*                                     THREAD

    http://localhost:63342/JavaLearn/Concurency_/Threads/WW_Doc/Threads%20and%20Locks.html?_ijt=oje8lhh7gd2iql1qlegshksv26

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

      States of a Thread: ----------------------------------------------------------------------------------------------

           1. NEW;
              ATest.A	thread is in NEW state when	an object of the thread	is created but the start method	is not yet called.
          2. RUNNABLE;
              ATest.A thread is in RUNNABLE state when it is eligible to run, but not running yet.(ATest.A number of Threads can
              be in RUNNABLE state.Scheduler selects which Thread to move to RUNNING state
          3. RUNNING;
              ATest.A thread is RUNNING state when it�s the one that is currently, what else to say, Running
          4. BLOCKED/WAITING;
             ATest.A thread is in BLOCKED/WAITING/SLEEPING state when it is not eligible to be run by the Scheduler.
          5. TERMINATED/DEAD;
              ATest.A thread is in DEAD/TERMINATED state when it has completed its execution. Once a thread enters dead
              state, it cannot be made active again.



          Threads with higher priority are executed in preference to threads with lower
              priority. Each thread may or may not also be marked as a daemon. When code running in some thread creates
              a new <code>Thread</code> object, the new thread has its priority initially set equal to the priority of the  creating
      thread, and is a daemon thread if and only if the  creating thread is a daemon.

                                          THREAD-SAFE
      a class or a method is thread-safe what that means is that the developer has synchronized all the critical sections
      within the code so that we as a developer don't have to worry about the thread interference

                                         MULTIPLE THREADS: 2 reasons

 *    FIRST REASON:--------------------------------------------------------------------------------------------------------

         perform a task that's going to TAKE ATest.A LONG TIME: QUERRY ATest.A DATABASE OR FETCH DATA FROM SOMWHERE FROM INTERNET
         We could do in MAIN THREAD but code within MAIN THREAD EXECUTES LINEAR AND IT WON'T BE ABLE TO DO ANYTHING ELSE
         WHILE IT'S === WAITING === FOR  THE DATA.
         The MAIN THREAD WILL BE === SUSPENDED === SO IT HAS TO WAIT FOR THE DATA TO BE RETURNED BEFORE EXECUTES NEXT LINE OF
         CODE APPLICATION CAN APPEAR THAT IS DIED OR FROZEN FOR USER ESPECIALLY FPR UI APPLICATION.
         WE CAN CREATE ANOTHER THREAD WHICH EXECUTE LONG RUNNING TASK IN BACKGROUND IN ORDER TO FREE UP MAIN THREAD

 *    SECOND REASON:-------------------------------------------------------------------------------------------------------

        An API REQUIRES US TO PROVIDE ONE
        Sometimes we have to provide the code that will run when a method we've called  reaches a certain point in it's execution
        We pass in the code that we want to run on the thread

*/