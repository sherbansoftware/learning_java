package util.concurent.Threads.Create_Threads;
/*
 * PROCESS (APPLICATION) is a unit of execution that has its own memory space(heap memory)
 * The HEAP isn't share between PROCESSES.
 * Most of Java Virtual Machine(JVM) instance (implementations) run as a process.
 * THREAD is a unit of execution within a PROCESS.
 * Every PROCESS have at least one THREAD(main) but can have multiple threads which handle tasks like: memory managements, andI/O.
 * Our code RUN in MAIN THREAD or in other THREADS that we explicitly create.
 * Every THREAD created by a PROCESS shares the process's memory anf files and has his thread STACK MEMORY
 * which only that thread can access.
 * Every Java application run as a single process and each PROCESS have a multiple THREADS
 * Every PROCESS have a HEAP memory and every thread have a THREAD STACK memory.
 *
 * MULTIPLE THREADS: 2 reasons
 *
 * FIRST REASON:--------------------------------------------------------------------------------------------------------

 * * perform a task that's going to TAKE ATest.A LONG TIME: QUERRY ATest.A DATABASE OR FETCH DATA FROM SOMWHERE FROM INTERNET
 * We could do in MAIN THREAD but code within MAIN THREAD EXECUTES LINEAR AND IT WON'T BE ABLE TO DO ANYTHING ELSE
 *  WHILE IT'S === WAITING === FOR  THE DATA.
 * The MAIN THREAD WILL BE === SUSPENDED === SO IT HAS TO WAIT FOR THE DATA TO BE RETURNED BEFORE EXECUTES NEXT LINE OF
 *  CODE APPLICATION CAN APPEAR THAT IS DIED OR FROZEN FOR USER ESPECIALLY FPR UI APPLICATION.
 * WE CAN CREATE ANOTHER THREAD WHICH EXECUTE LONG RUNNING TASK IN BACKGROUND IN ORDER TO FREE UP MAIN THREAD
 *
 * SECOND REASON:-------------------------------------------------------------------------------------------------------

 * An API REQUIRES US TO PROVIDE ONE
 * Somethimes we have to provide the code that will run when a method we've called  reaches a certain point in it's execution
 *We pass in the code that we want to run on the thread
 *
 * CONCURENCY
 * refers to an Application doing more than one thing at time.
 * progress can be made on more that one task.
 *
 * */

public class Main {


    public static void main(String[] args) {
        System.out.println (ThreadColor.ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread ();
        anotherThread.setName (" == Another Thread ==");
        anotherThread.start ();

        //anonymous class it's useful if you want to run code once because is easier to configure

        new Thread () {
            public void run() {
                System.out.println (ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start ();

        // functional interface

        new Thread (() -> {
            System.out.println (ThreadColor.ANSI_RED + "Hello from MyRunnable's implementation of run()===");
            try {
                anotherThread.join (2000);
                System.out.println (ThreadColor.ANSI_RED + "Another thread terminated,or timeout, so i'm running again");
            } catch (InterruptedException e) {
                System.out.println (ThreadColor.ANSI_RED + "I couldn't wait after all.I was interrupted ");
            }
        }).start ();

        Thread myRunnable = new Thread (new MyRunnable());
        myRunnable.start ();

        System.out.println (ThreadColor.ANSI_PURPLE + "Hello again from the main thread.");

    }
}
