package Collection.Collection_Classes.TreeSet;

// https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html

/*                                                      TreeSet

    A NavigableSet implementation based on a TreeMap.The elements are ordered using their natural ordering, or by a
        Comparator provided at set creation time, depending on which constructor is used.
    This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).

                                             Constructor and Description

               public TreeSet() {
                   this(new TreeMap<E,Object>());
               }

        Constructs a new, empty tree set, sorted according to the natural ordering of its elements.

                public TreeSet(Comparator<? super E> comparator) {
                    this(new TreeMap<>(comparator));
                }

        Constructs a new tree set containing the elements in the specified collection, sorted according to the natural
            ordering of its elements.

     public TreeSet(Collection<? extends E> c) {
        this();
        addAll(c);
    }

        Constructs a new, empty tree set, sorted according to the specified comparator.

     public TreeSet(SortedSet<E> s) {
        this(s.comparator());
        addAll(s);
    }

        Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set.

                                                         NOTE

            * that this implementation is not synchronized.If multiple threads access a tree set concurrently, and at
                  least one of the threads modifies the set,it must be synchronized externally.This is typically accomplished
                  by synchronizing on some object that naturally encapsulates the set.If no such object exists, the set
                  should be "wrapped" using the Collections.synchronizedSortedSet method.This is best done at creation
                  time, to prevent accidental unsynchronized access to the set:

                          SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));

            * The iterators returned by this class's iterator method are fail-fast: if the set is modified at any time
                  after the iterator is created, in any way except through the iterator's own remove method, the iterator
                  will throw a ConcurrentModificationException.Thus, in the face of concurrent modification, the iterator
                  fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined t
                  ime in the future.
 */

import java.util.TreeSet;

public class TreSet_ {
    TreeSet ts;
}
