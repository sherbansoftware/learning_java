package Atomic.Atomic_Variables.Example;

import Atomic.Atomic_Variables.Atomic_Variables_;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithoutLock {


    // Replacing the int field with an AtomicInteger
    // allows us to prevent thread interference without resorting to synchronization

    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        new Atomic_Variables_().increment();

        System.out.println("Counter: " + counter);
    }

    // A thread-safe counter implemented with AtomicInteger
    //we retry the compareAndSet operation and again on failure,
    // since we want to guarantee that the call to the increment method always increases the value by 1.
    public static int getValue() {
        return counter.get();
    }

    public static void increment() {
        while (true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if (counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }
}