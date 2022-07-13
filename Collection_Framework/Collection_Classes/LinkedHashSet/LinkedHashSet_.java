package Collection_Framework.Collection_Classes.LinkedHashSet;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedHashSet.html


/*                      public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable



    ○ Hashtable and linked list implementation of the Set interface with predictable iteration order.

    ○ This implementation differs from HashSet in that

                   * it maintains a doubly-linked list running through all of its entries.

           This linked list defines the iteration ordering,

                   * which is the order in which elements were inserted into the set (insertion-order).


                                            Constructor and Description


    1. LinkedHashSet()

                   * Constructs a new, empty linked hash set with the

                                 - default initial capacity (16) and load factor (0.75).

    2. LinkedHashSet(int initialCapacity)

                   * Constructs a new, empty linked hash set with

                                  - the specified initial capacity

                                  - and the default load factor (0.75).

    3. LinkedHashSet(int initialCapacity, float loadFactor)

                    Constructs a new, empty linked hash set with

                                   - the specified initial capacity

                                   - and load factor.

    4. LinkedHashSet(Collection<? extends E> c)

                  * Constructs a new linked hash set with the same elements as the specified collection.


                                                       NOTE


    ○ uses hashCode()

    ○ that insertion order is not affected if an element is re-inserted into the set.

      (An element e is reinserted into a set s if s.add(e) is invoked when s.contains(e) would return true immediately
      prior to the  invocation.)

    ○ This class provides all of the optional Set operations,

    ○ and permits null elements

    ○ This implementation is not synchronized.If multiple threads access a linked hash set concurrently, and at least
           one of the threads modifies the set,

                   * it must be synchronized externally.

           This is typically accomplished by synchronizing on some object that naturally encapsulates the set.
           If no such object exists, the set should be "wrapped" using the Collections.synchronizedSet method.
           This is best done at creation time, to prevent accidental unsynchronized access to the set:

                   * Set s = Collections.synchronizedSet(new LinkedHashSet(...));

    ○ The iterators returned by this class's iterator method are fail-fast:

                   * if the set is modified at any time after the iterator is created,

                   * in any way except through the iterator's own remove method,

           the iterator will throw

                   * a ConcurrentModificationException.

           Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking
               arbitrary, non-deterministic behavior at an undetermined time in the future.

 */


import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    LinkedHashSet lhs;
}
