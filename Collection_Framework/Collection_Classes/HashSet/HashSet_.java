package Collection_Framework.Collection_Classes.HashSet;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashSet.html



/*                                   This class implements the Set interface,


    ○ Backed by a Hashtable (actually a HashMap instance).

                   * It makes no guarantees as to the iteration order of the set;

      In particular,

                   * it does not guarantee that the order will remain constant over time.

    ○ This class permits the null element.

    ○ This class offers

                   * constant time performance for the basic operations  O(1)

                                  - add,
                                  - remove,
                                  - contains
                                  - and size

                           assuming the hash function disperses the elements properly among the buckets.

    ○ Iterating over this set requires time proportional

                  * to the sum of the HashSet instance's size (the number of elements)

                  * plus the "capacity" of the backing HashMap instance (the number of buckets).

    ○ Thus, it's very important

                   * not to set the initial capacity too high

                   * or the load factor too low

           if iteration performance is important.


                                            Constructors and descriptions


    1. HashSet()

                  * Constructs a new, empty set;

                  * The backing HashMap instance has default initial capacity (16) and load factor (0.75)

      Dummy value to associate with an Object in the backing Map

                  * private static final Object PRESENT = new Object();

                                 public HashSet() {
                                     map = new HashMap<>();
                                  }

    2. HashSet(int initialCapacity)

                   * Constructs a new, empty set; the backing HashMap instance has

                                 - the specified initial capacity

                                 - and default load factor (0.75).

    3. HashSet(int initialCapacity, float loadFactor)

                   * Constructs a new, empty set;

                   * the backing HashMap instance has

                                 - the specified initial capacity and the specified load factor.

    ○ HashSet(Collection<? extends E> c)

                   * Constructs a new set containing the elements in the specified collection.


                                                     NOTE

    ○ Doesn't support order of insertion, unsorted

                  - iterates in random order

    ○ uses hashCode()

    ○ Does not allow duplicate elements

    ○ Allows only one null value

    ○ underlying data structure of HashSet is HashTable

    ○ implements Cloneable and Serializable interface

                  * That this implementation is not synchronized.

    ○ If multiple threads access a HashSet concurrently,  and at least one of the threads modifies the set,

                  * it must be synchronized externally.

           his is typically accomplished by

                  * synchronizing on some object that naturally encapsulates the set.

                  * If no such object exists, the set should be "wrapped" using the

                                - Collections.synchronizedSet method.

                  * This is best done at creation time, to prevent accidental unsynchronized access to the set:

                                 - Set s = Collections.synchronizedSet(new HashSet(...));

    ○ Hashing is the fastest ever algorithm to search

    ○ The iterators returned by this class's iterator method

                   * are fail-fast:

                                 - if the set is modified at any time after the iterator is created,

                                 - in any way except through the iterator's own remove method,

                          the Iterator

                                  - throws a ConcurrentModificationException.



 */

import java.util.HashSet;

public class HashSet_ {
    HashSet hs;
}
