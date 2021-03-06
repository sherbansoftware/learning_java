package Memory.Memory_Consistency_Properties;


/*                                            Memory Consistency Properties

    Chapter 17 of the Java Language Specification defines the happens-before relation on memory operations such as

                * reads
                * and writes

            of shared variables.

        The results of a write by one thread are guaranteed to be visible to a read by another thread only if the write
            operation happens-before the read operation. The synchronized and volatile constructs, as well as the
            Thread.start() and Thread.join() methods, can form happens-before relationships.
        In particular:

                    * Each action in a thread happens-before every action in that thread that comes later in the
                          program's order.

                    * An unlock (synchronized block or method exit) of a monitor happens-before every subsequent lock
                          (synchronized block or method entry) of that same monitor. And because the happens-before relation is transitive, all actions of a thread prior to unlocking happen-before all actions subsequent to any thread locking that monitor.

                    * A write to a volatile field happens-before every subsequent read of that same field. Writes and
                          reads of volatile fields have similar memory consistency effects as entering and exiting monitors,
                          but do not entail mutual exclusion locking.

                    * A call to start on a thread happens-before any action in the started thread.

                    * All actions in a thread happen-before any other thread successfully returns from a join on that thread.

    The methods of all classes in java.util.concurrent and its subpackages extend these guarantees to higher-level synchronization.
        In particular:

                    * Actions in a thread prior to placing an object into any concurrent collection happen-before actions
                          subsequent to the access or removal of that element from the collection in another thread.

                    * Actions in a thread prior to the submission of a Runnable to an Executor happen-before its execution
                          begins. Similarly for Callables submitted to an ExecutorService.

                     * Actions taken by the asynchronous computation represented by a Future happen-before actions
                           subsequent to the retrieval of the result via Future.get() in another thread.

                     * Actions prior to "releasing" synchronizer methods such as Lock.unlock, Semaphore.release, and
                           CountDownLatch.countDown happen-before actions subsequent to a successful "acquiring" method
                           such as Lock.lock, Semaphore.acquire, Condition.await, and CountDownLatch.await on the same
                           synchronizer object in another thread.

                     * For each pair of threads that successfully exchange objects via an Exchanger, actions prior to
                           the exchange() in each thread happen-before those subsequent to the corresponding exchange()
                           in another thread.

                     * Actions prior to calling CyclicBarrier.await and Phaser.awaitAdvance (as well as its variants)
                           happen-before actions performed by the barrier action, and actions performed by the barrier
                           action happen-before actions subsequent to a successful return from the corresponding await
                           in other threads.

 */
public class Memory_Consistency_Properties {
}
