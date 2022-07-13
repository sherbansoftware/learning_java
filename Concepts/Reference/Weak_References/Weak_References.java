package Concepts.Reference.Weak_References;

// https://www.baeldung.com/java-weakhashmap#3-weak-references


/*                                                 Weak References


    ○ The objects that are referenced only by weak references

                   * are garbage collected eagerly;

                   * the GC won't wait until it needs memory in that case.

    ○ We can create a WeakReference in Java in the following way:

Integer prime = 1;
WeakReference<Integer> soft = new WeakReference<Integer>(prime);
prime = null;

    ○ When we made a prime reference null,

                  * the prime object will be garbage collected in the next GC cycle,

          as there is no other strong reference pointing to it.

    ○ References of a WeakReference type are used as keys in WeakHashMap.






 */

import java.lang.ref.WeakReference;

public class Weak_References {
    public static void main(String[] args) {
        Integer prime = 1;
        WeakReference<Integer> weak = new WeakReference<Integer>(prime);
        prime = null;
    }

}
