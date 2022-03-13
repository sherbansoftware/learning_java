package util.concurent.Lock_and_Unlock;
/*
*                               ==Lock==
*
* Simply put, a lock is a more flexible and sophisticated thread synchronization mechanism than the standard synchronized block.
* LOCK INTERFACE is defined inside java.util.concurrent.lock package
*
*                              ==Differences Between Lock and Synchronized Block ==
*
1) ATest.A synchronized block is fully contained within a method � we can have Lock API's lock() and unlock() operation in separate methods
2) ATest.A synchronized block doesn't support the fairness, any thread can acquire the lock once released, no preference can be specified.
3) We can achieve fairness within the Lock APIs by specifying the fairness property.
  It makes sure that longest waiting thread is given access to the lock
4)ATest.A thread gets blocked if it can't get an access to the synchronized block.
  The Lock API provides tryLock() method. The thread acquires lock only if it's available and not held by any other thread.
  This reduces blocking time of thread waiting for the lock
5)ATest.A thread which is in �waiting� state to acquire the access to synchronized block, can't be interrupted.
  The Lock API provides a method lockInterruptibly() which can be used to interrupt the thread when it's waiting for the lock

                                  ==Lock API==

1. void lock() � acquire the lock if it's available; if the lock isn't available a thread gets blocked until the lock is released
2. void lockInterruptibly() � this is similar to the lock(), but it allows the blocked thread to be interrupted and resume
   the execution through a thrown java.lang.InterruptedException
3. boolean tryLock() � this is a non-blocking version of lock() method; it attempts to acquire the lock immediately,
   return true if locking succeeds
4. boolean tryLock(long timeout, TimeUnit timeUnit) � this is similar to tryLock(), except it waits up the given timeout
   before giving up trying to acquire the Lock
5. void unlock() � unlocks the Lock instance

                                   ==Lock Implementations=

1. ReentrantLock
    It offers the same concurrency and memory semantics, as the implicit monitor lock accessed using synchronized
    methods and statements, with extended capabilities.

2. ReentrantReadWriteLock
    ReentrantReadWriteLock class implements the ReadWriteLock interface.
    Let's see rules for acquiring the ReadLock or WriteLock by a thread:
2.1 Read Lock � if no thread acquired the write lock or requested for it then multiple threads can acquire the read lock
2.2 Write Lock � if no threads are reading or writing then only one thread can acquire the write lock

3. StampedLock
   StampedLock is introduced in Java 8. It also supports both read and write locks. However, lock acquisition methods
   return a stamp that is used to release a lock or to check if the lock is still valid
   Another feature provided by StampedLock is optimistic locking. Most of the time read operations don't need to wait
   for write operation completion and as a result of this, the full-fledged read lock isn't required.

                                           ==important==

   surrounding the code that we ultimately want to be thread-safe to avoid thread interference with .lock and .unlock
   to release the lock is very important when using lock objects
   we're responsible for releasing the lock it won't happen automatically it doesn't
   happend automatically as it would when we use the synchronized block

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static util.concurent.Lock_and_Unlock.Main.EOF;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
        //surrounding the code that we ultimately want to be thread-safe to avoid thread interference with .lock and .unlock
                bufferLock.lock();
                buffer.add(num);
                bufferLock.unlock();

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and exiting...");
        bufferLock.lock();
        buffer.add("EOF");
        bufferLock.unlock();
    }
}

class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    public void run() {
        while (true) {
            bufferLock.lock();
            if (buffer.isEmpty()) {
                bufferLock.unlock();
                continue;
            }
            if (buffer.get(0).equals(EOF)) {
                System.out.println(color + "Exiting");
                bufferLock.unlock();
                break;
            } else {
                System.out.println(color + "Removed " + buffer.remove(0));
            }
            bufferLock.unlock();
        }
    }
}


























