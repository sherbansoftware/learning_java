package Atomic.Atomic_Variables;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.baeldung.com/java-atomic-variables

// https://docs.oracle.com/javase/tutorial/essential/concurrency/atomicvars.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/package-summary.html


/*                                              Atomic Variables


    ○ The java.util.concurrent.atomic package defines classes

                   * that support atomic operations on single variables.

           All classes have

                   * get

                   * and set methods that work like reads and writes on volatile variables.

    ○ That is, a set has a happens-before relationship with any subsequent get on the same variable.

    ○ The atomic compareAndSet method also has these memory consistency features,

                   * as do the simple atomic arithmetic methods that apply to integer atomic variables.

    ○ To see how this package might be used, let's return to the Counter class we originally used to demonstrate thread interference:


class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}

    ○ One way to make Counter safe from thread interference is to make its methods synchronized, as in SynchronizedCounter:


class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

}

    ○ For this simple class, synchronization is an acceptable solution.

                   * But for a more complicated class,

                   * we might want to avoid the liveness impact of unnecessary synchronization.

           Replacing the int field with

                    * an AtomicInteger allows us to prevent thread interference without resorting to synchronization, as in AtomicCounter:


import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

}



 */


public class Atomic_Variables_ {

    //  Replacing the int field with
    // an AtomicInteger allows us to prevent thread interference without resorting to synchronization

    private static AtomicInteger c = new AtomicInteger(0);

    public static void main(String[] args) {
        new Atomic_Variables_().increment();
        System.out.println(c);

    }


    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }


}
