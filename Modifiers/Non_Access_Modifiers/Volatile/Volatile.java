package Modifiers.Non_Access_Modifiers.Volatile;

/*                  	        Volatile variable


     ○ A volatile variable is one whose value is always written to and read from "main memory".
           Each thread has its own cache in Java. The volatile variable will not be stored on a Thread cache.

     ○ The volatile modifier is used to let the JVM understand that a thread accessing the variable should always merge
           its own personal copy of the variable with the original in the memory.
           Accessing a volatile variable synchronizes all the cached copy of the variables in the main memory

                                       When should I use volatile in Java?

     ○ volatile must be used whenever you want

                * a mutable variable to be accessed by multiple threads.

            It is not very common usecase because typically you need to perform more than a single atomic operation
                (e.g. check the variable state before modifying it),

                * in which case you would use a synchronized block instead.

                                             Volatile vs synchronized

    ○ Marking a variable as volatile

                  * basically tells all threads to do READ and WRITE operations on main memory only

    ○  synchronized

                  * tells every thread to go update their value from main memory when they enter the block,
                        and flush the result back to main memory when they exit the block.


                                             NOTE

            * Volatile can only be applied to instance variables.
            * Accessing a volatile variable synchronizes all the cached copy of the variables in the main memory


*/

public class Volatile {
}
