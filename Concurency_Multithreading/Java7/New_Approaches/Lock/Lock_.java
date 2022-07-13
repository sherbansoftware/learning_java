package Concurency_Multithreading.Java7.New_Approaches.Lock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Lock.html


/*
                                                   Lock


    ○ Simply put, 
                
                    * a lock is a more flexible and sophisticated thread synchronization mechanism 
                
                    * than the standard synchronized block.
                   

                            Differences Between Lock and Synchronized Block 


    1) A synchronized block is fully contained within a method 
        
                    * we can have Lock API's 
                      
                                  - lock() 
                                  
                                  - and unlock() 
                                  
                          operation in separate methods
                          
    2) A synchronized block doesn't support the fairness, 
    
                    * any thread can acquire the lock once released, 
                    
                    * no preference can be specified.
                    
    3) We can achieve fairness within the Lock APIs by specifying the fairness property.
 
                    * It makes sure that longest waiting thread is given access to the lock
                    
    4) A thread gets blocked if it can't get access to the synchronized block.
  
                    * The Lock API provides tryLock() method. 
                    
                    * The thread acquires lock only if it's available and not held by any other thread.
  
             This reduces blocking time of thread waiting for the lock

    5) A thread which is in waiting state to acquire the access to synchronized block,

                    * can't be interrupted.

       The Lock API provides a method

                    * lockInterruptibly() which can be used

                                  - to interrupt the thread when it's waiting for the lock


    ○ When 10 methods are declared as synchronized,

                    * only one of them is executed by any of the threads at any point in time.

                    * This has severe performance impact.

    ○ Another new approach introduced in Java 5 is

                    * to use lock and unlock methods.

            Lock and unlock methods are used

                    * to divide methods into different blocks

                    * and help enhance concurrency.

    ○ The 10 methods can be

                    * divided into different blocks,

                    * which can be synchronized based on different variables.


                                          NOTE


    ○ surrounding the code that we ultimately want to be thread-safe to avoid thread interference

                   * with lock

                   * and unlock

    ○ To release the lock is very important when using lock objects

                    * we're responsible for releasing the lock

                    * it won't happen automatically it doesn't

                                  - as it would when we use the synchronized block

 */


/**
    ○ Lock implementations provide more extensive locking operations

                  * than can be obtained using synchronized methods and statements.

   ○  They allow more flexible structuring,

                  * may have quite different properties,

                  * and may support multiple associated

                                - {@link Condition} objects.

   ○ A lock is a tool for controlling access to a shared resource by multiple threads.

   ○ Commonly, a lock provides exclusive access to a shared resource:

                  * only one thread at a time can acquire the lock

                  * and all access to the shared resource requires

                  * that the lock be acquired first.

    ○ However, some locks may allow concurrent access to a shared resource,

                  * such as the read lock of a {@link ReadWriteLock}.

    ○ The use of synchronized methods or statements

                  * provides access to the

                                - implicit monitor lock associated with every object,

          but forces all lock acquisition and release to occur in a block-structured way:

                    * when multiple locks are acquired

                                  - they must be released in the opposite order,

                    * and all locks must be released in the same lexical scope

                                  - in which they were acquired.

     ○ While the scoping mechanism for synchronized methods and statements

                   * makes it much easier to program with monitor locks,

                   * and helps avoid many common programming errors involving locks,

           there are occasions where you need to work with locks in a more flexible way.

     ○ For example, some algorithms for traversing concurrently accessed data structures

                   * require the use of

                             - hand-over-hand

                             -  or chain locking  :

                   * you acquire the lock of node A,

                   * then node B,

                    * then release A

                    * and acquire C,

                    * then release B

                    * and acquire D and so on.

     ○ Implementations of the Lock interface

                     * enable the use of such techniques by

                                   - allowing a lock to be acquired and released in different scopes,

                                    - and allowing multiple locks to be acquired and released in any order.

    ○ With this increased flexibility comes additional responsibility

    ○ The absence of block-structured locking

                    * removes the automatic release of locks that occurs with synchronized methods and statements.

    ○ In most cases, the following idiom should be used:

                    * Lock l = ...;
                    * l.lock();
                    * try {
                    *   // access the resource protected by this lock
                    * } finally {
                    * l.unlock();
                    * }}

    ○ When locking and unlocking occur in different scopes,

                    * care must be taken to ensure that all code that is executed while the lock is held

                    * is protected by try-finally or try-catch to ensure that the lock is released when necessary.

    ○ Lock implementations provide additional functionality over the use of  synchronized methods and statements

                    * by providing a non-blocking attempt to acquire a lock ({@link #tryLock()}),

                    * an attempt to acquire the lock that can be interrupted ({@link #lockInterruptibly},

                    * and an attempt to acquire the lock that can timeout ({@link #tryLock(long, TimeUnit)}).

    ○ A Lock class can also provide behavior and semantics

                    * that is quite different from that of the implicit monitor lock,

                    * such as

                                  - guaranteed ordering,

                                  - non-reentrant usage,

                                  - or deadlock detection.

     ○ If an implementation provides such specialized semantics then the implementation must document those semantics.

     ○ Note that

                  * Lock instances are just normal objects and can themselves be used as the target in a

                                - synchronized statement.

     ○  Acquiring the  monitor lock of a Lock instance

                 * has no specified relationship with invoking any of the {@link #lock} methods of that instance.

    ○ It is recommended that to avoid confusion you never use Lock instances in this way,

                * except within their own implementation.

    ○ Except where noted, passing a null value for any parameter

                * will result in a {@link NullPointerException} being thrown.


                                            Memory Synchronization


    ○ All Lock implementations

               * must enforce the same memory synchronization semantics as provided

                             - by the built-in monitor lock,

       as described in <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-17.html#jls-17.4">
 * Chapter 17 of
 * <cite>The Java&trade; Language Specification</cite></a>:
 * <ul>
 * <li>A successful   lock} operation has the same memory
 * synchronization effects as a successful <em>Lock</em> action.
 * <li>A successful   unlock} operation has the same
 * memory synchronization effects as a successful <em>Unlock</em> action.
 * </ul>
 *
 * Unsuccessful locking and unlocking operations, and reentrant
 * locking/unlocking operations, do not require any memory
 * synchronization effects.
 *
 * <h3>Implementation Considerations</h3>
 *
 * <p>The three forms of lock acquisition (interruptible,
 * non-interruptible, and timed) may differ in their performance
 * characteristics, ordering guarantees, or other implementation
 * qualities.  Further, the ability to interrupt the <em>ongoing</em>
 * acquisition of a lock may not be available in a given   Lock}
 * class.  Consequently, an implementation is not required to define
 * exactly the same guarantees or semantics for all three forms of
 * lock acquisition, nor is it required to support interruption of an
 * ongoing lock acquisition.  An implementation is required to clearly
 * document the semantics and guarantees provided by each of the
 * locking methods. It must also obey the interruption semantics as
 * defined in this interface, to the extent that interruption of lock
 * acquisition is supported: which is either totally, or only on
 * method entry.
 *
 * <p>As interruption generally implies cancellation, and checks for
 * interruption are often infrequent, an implementation can favor responding
 * to an interrupt over normal method return. This is true even if it can be
 * shown that the interrupt occurred after another action may have unblocked
 * the thread. An implementation should document this behavior.
 *
 * @see ReentrantLock
 * @see Condition
 * @see ReadWriteLock
 *
 * @since 1.5
 * @author Doug Lea
 */
public interface Lock_ {

    /**
     * Acquires the lock.
     *
     * <p>If the lock is not available then the current thread becomes
     * disabled for thread scheduling purposes and lies dormant until the
     * lock has been acquired.
     *
     * <p><b>Implementation Considerations</b>
     *
     * <p>A   Lock} implementation may be able to detect erroneous use
     * of the lock, such as an invocation that would cause deadlock, and
     * may throw an (unchecked) exception in such circumstances.  The
     * circumstances and the exception type must be documented by that
     *   Lock} implementation.
     */
    void lock();

    /**
     * Acquires the lock unless the current thread is
     * {@linkplain Thread#interrupt interrupted}.
     *
     * <p>Acquires the lock if it is available and returns immediately.
     *
     * <p>If the lock is not available then the current thread becomes
     * disabled for thread scheduling purposes and lies dormant until
     * one of two things happens:
     *
     * <ul>
     * <li>The lock is acquired by the current thread; or
     * <li>Some other thread {@linkplain Thread#interrupt interrupts} the
     * current thread, and interruption of lock acquisition is supported.
     * </ul>
     *
     * <p>If the current thread:
     * <ul>
     * <li>has its interrupted status set on entry to this method; or
     * <li>is {@linkplain Thread#interrupt interrupted} while acquiring the
     * lock, and interruption of lock acquisition is supported,
     * </ul>
     * then {@link InterruptedException} is thrown and the current thread's
     * interrupted status is cleared.
     *
     * <p><b>Implementation Considerations</b>
     *
     * <p>The ability to interrupt a lock acquisition in some
     * implementations may not be possible, and if possible may be an
     * expensive operation.  The programmer should be aware that this
     * may be the case. An implementation should document when this is
     * the case.
     *
     * <p>An implementation can favor responding to an interrupt over
     * normal method return.
     *
     * <p>A   Lock} implementation may be able to detect
     * erroneous use of the lock, such as an invocation that would
     * cause deadlock, and may throw an (unchecked) exception in such
     * circumstances.  The circumstances and the exception type must
     * be documented by that   Lock} implementation.
     *
     * @throws InterruptedException if the current thread is
     *         interrupted while acquiring the lock (and interruption
     *         of lock acquisition is supported)
     */
    void lockInterruptibly() throws InterruptedException;

    /**
     * Acquires the lock only if it is free at the time of invocation.
     *
     * <p>Acquires the lock if it is available and returns immediately
     * with the value   true}.
     * If the lock is not available then this method will return
     * immediately with the value   false}.
     *
     * <p>A typical usage idiom for this method would be:
     * <pre> {@code
     * Lock lock = ...;
     * if (lock.tryLock()) {
     *   try {
     *     // manipulate protected state
     *   } finally {
     *     lock.unlock();
     *   }
     * } else {
     *   // perform alternative actions
     * }}</pre>
     *
     * This usage ensures that the lock is unlocked if it was acquired, and
     * doesn't try to unlock if the lock was not acquired.
     *
     * @return   true} if the lock was acquired and
     *           false} otherwise
     */
    boolean tryLock();

    /**
     * Acquires the lock if it is free within the given waiting time and the
     * current thread has not been {@linkplain Thread#interrupt interrupted}.
     *
     * <p>If the lock is available this method returns immediately
     * with the value   true}.
     * If the lock is not available then
     * the current thread becomes disabled for thread scheduling
     * purposes and lies dormant until one of three things happens:
     * <ul>
     * <li>The lock is acquired by the current thread; or
     * <li>Some other thread {@linkplain Thread#interrupt interrupts} the
     * current thread, and interruption of lock acquisition is supported; or
     * <li>The specified waiting time elapses
     * </ul>
     *
     * <p>If the lock is acquired then the value   true} is returned.
     *
     * <p>If the current thread:
     * <ul>
     * <li>has its interrupted status set on entry to this method; or
     * <li>is {@linkplain Thread#interrupt interrupted} while acquiring
     * the lock, and interruption of lock acquisition is supported,
     * </ul>
     * then {@link InterruptedException} is thrown and the current thread's
     * interrupted status is cleared.
     *
     * <p>If the specified waiting time elapses then the value   false}
     * is returned.
     * If the time is
     * less than or equal to zero, the method will not wait at all.
     *
     * <p><b>Implementation Considerations</b>
     *
     * <p>The ability to interrupt a lock acquisition in some implementations
     * may not be possible, and if possible may
     * be an expensive operation.
     * The programmer should be aware that this may be the case. An
     * implementation should document when this is the case.
     *
     * <p>An implementation can favor responding to an interrupt over normal
     * method return, or reporting a timeout.
     *
     * <p>A   Lock} implementation may be able to detect
     * erroneous use of the lock, such as an invocation that would cause
     * deadlock, and may throw an (unchecked) exception in such circumstances.
     * The circumstances and the exception type must be documented by that
     *   Lock} implementation.
     *
     * @param time the maximum time to wait for the lock
     * @param unit the time unit of the   time} argument
     * @return   true} if the lock was acquired and   false}
     *         if the waiting time elapsed before the lock was acquired
     *
     * @throws InterruptedException if the current thread is interrupted
     *         while acquiring the lock (and interruption of lock
     *         acquisition is supported)
     */
    boolean tryLock(long time, TimeUnit unit) throws InterruptedException;

    /**
     * Releases the lock.
     *
     * <p><b>Implementation Considerations</b>
     *
     * <p>A   Lock} implementation will usually impose
     * restrictions on which thread can release a lock (typically only the
     * holder of the lock can release it) and may throw
     * an (unchecked) exception if the restriction is violated.
     * Any restrictions and the exception
     * type must be documented by that   Lock} implementation.
     */
    void unlock();

    /**
     * Returns a new {@link Condition} instance that is bound to this
     *   Lock} instance.
     *
     * <p>Before waiting on the condition the lock must be held by the
     * current thread.
     * A call to {@link Condition#await()} will atomically release the lock
     * before waiting and re-acquire the lock before the wait returns.
     *
     * <p><b>Implementation Considerations</b>
     *
     * <p>The exact operation of the {@link Condition} instance depends on
     * the   Lock} implementation and must be documented by that
     * implementation.
     *
     * @return A new {@link Condition} instance for this   Lock} instance
     * @throws UnsupportedOperationException if this   Lock}
     *         implementation does not support conditions
     */
    Condition newCondition();
}

