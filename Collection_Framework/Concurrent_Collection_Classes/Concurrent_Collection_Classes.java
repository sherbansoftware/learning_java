package Collection_Framework.Concurrent_Collection_Classes;

// https://docs.oracle.com/javase/tutorial/essential/concurrency/collections.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html


/*                                   Concurrent collections


    ○ Utility classes commonly useful in concurrent programming.

                   * This package includes a few small standardized extensible frameworks,

                   * as well as some classes that provide useful functionality
                         and are otherwise tedious or difficult to implement.

                         Here are brief descriptions of the main components.





                  What is the difference between synchronized and concurrent collections in Java?


    ○ Synchronized collections

                   * are implemented using synchronized methods and synchronized blocks.

     ○ Only one thread can executing any of the synchronized code at a given point in time.

     ○ This places severe restrictions on the concurrency of threads

                  * thereby affecting performance of the application.

     ○ All the pre Java 5 synchronized collections

                    * (HashTable & Vector, for example)

                    *  use this approach.

     ○ Post Java 5, collections using new approaches to synchronization are available in Java.

     ○ These are called

                    * concurrent collections.


                              Explain about the new concurrent collections in Java?


    ○ Post Java 5, collections using new approaches to synchronization are available in Java.

    ○ These are called

                   * concurrent collections.

    ○ Examples of new approaches are:

                   * Copy on Write

                   * Compare and Swap

                   * Locks

    ○ These new approaches to concurrency provide better performance in specific context’s.


                                   CopyOnWrite concurrent collections approach?


    ○ Important points about Copy on Write approach

                   * All values in collection are stored in an internal immutable (not-changeable) array.

                   * A new array is created if there is any modification to the collection.

                   * Read operations are not synchronized.

                   * Only write operations are synchronized.

    ○ Copy on Write approach is used

                   * in scenarios where reads greatly out number write’s on a collection.

    ○ CopyOnWriteArrayList & CopyOnWriteArraySet are implementations of this approach.

    ○ Copy on Write collections are typically used in Subject

                  * Observer scenarios, where the observers very rarely change.

    ○ Most frequent operations would be iterating around the observers and notifying them.

                  * Example : CopyOnWriteArrayList : public boolean add(E e)


                                             Compare And Swap approach


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

public class Concurrent_Collection_Classes {
}
