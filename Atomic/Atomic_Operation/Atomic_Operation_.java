package Atomic.Atomic_Operation;

// https://www.baeldung.com/java-atomic-variables#atomic-operations


/*                                                    Atomic Operations


    ○ There is a branch of research focused on

                   * creating non-blocking algorithms for concurrent environments.

    ○ These algorithms exploit

                   * low-level atomic machine instructions such as

                                  - compare-and-swap (CAS),

                          to ensure data integrity.

    ○ A typical CAS operation works on three operands:

                   * The memory location on which to operate (M)

                   * The existing expected value (A) of the variable

                   * The new value (B) which needs to be set


    ○ The CAS operation

                   * updates atomically the value in M to B,

                   * but only if the existing value in M matches A,

                   * otherwise no action is taken.


    ○ In both cases, the existing value in M is returned.

    ○ This combines three steps

                   *  getting the value,

                   * comparing the value,

                   * and updating the value

           into a single machine level operation.

    ○ When multiple threads attempt to update the same value through CAS,

                   * one of them wins and updates the value.

    ○ However, unlike in the case of locks,

                   * no other thread gets suspended;

                   * instead, they're simply informed that they did not manage to update the value.

            The threads can then proceed to do further work

                   * and context switches are completely avoided.

    ○ One other consequence is that the core program logic becomes more complex.

                   * This is because we have to handle the scenario when the CAS operation didn't succeed.

                   * We can retry it again and again till it succeeds,

                   * or we can do nothing and move on depending on the use case.


                       Compare And Swap approach (CAS)


    ○ Compare and Swap

                  * is one of the new approaches (Java 5) introduced in java to handle synchronization.

    ○ In traditional approach, a method which modifies a member variable used by multiple threads

                  * is completely synchronized

                                 – to prevent other threads accessing stale value.

    ○ In compare and swap approach

                   * instead of synchronizing entire method,

                   * the value of the member variable before calculation is cached.

           After the calculation,

                   * the cached value is compared with the current value of member variable.

           If  the value is not modified,

                   * the calculated result is stored into the member variable.

                   * If another thread has modified the value,

                                 - then the calculation can be performed again.

                                 - Or skipped

                                                • as the need might be.

    ○ ConcurrentLinkedQueue uses this approach.




 */

public class Atomic_Operation_ {
}
