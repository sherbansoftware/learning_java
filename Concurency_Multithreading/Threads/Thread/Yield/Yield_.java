package Concurency_Multithreading.Threads.Thread.Yield;

/*                                       Thread yield method


    ○ Yield is a static method in the Thread class.

                   * It is like a thread saying " I have enough time in the limelight.

                                  - Can some other thread run next?".

    ○ A call to yield method

                    * changes the state of thread from  RUNNING  to  RUNNABLE.

    ○ However, the scheduler might pick up the same thread to run again, especially if it is the thread with highest priority.

    ○ Summary is yield method

                    * is a request from a thread to go to Runnable state.

    ○ However, the scheduler can immediately put the thread back to RUNNING state.





 */


public class Yield_ {
}
