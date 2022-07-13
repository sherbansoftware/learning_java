package Concurency_Multithreading.Java7.New_Approaches.Compare_And_Swap;

/*                                           CompareAndSwap approach


    ○ Compare and Swap	is one	of	the	new	approaches (Java 5)	introduced	in	java to	handle synchronization.

    ○ In traditional approach,

                   * a method which modifies a member variable used by multiple threads is completely synchronized

                   	               – to prevent other threads accessing stale value.

    ○ In compare and swap approach,

                  * instead of synchronizing entire method,

                                  - the value of the member variable before calculation is cached.

          After the calculation,

                  * the cached value is compared with the current value	of member variable.

          If the value is not modified,

                  * the	calculated result is stored	into the member variable.

         If another thread has modified the value,

                   * then the calculation

                                 - can be performed again.

                                 - or skipped

                         as the need might be.

    ○ ConcurrentLinkedQueue

                   * uses this approach.

 */

public class Compare_And_Swap_ {
}
