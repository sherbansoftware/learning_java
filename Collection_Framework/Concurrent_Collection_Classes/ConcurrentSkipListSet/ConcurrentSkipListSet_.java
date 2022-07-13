package Collection_Framework.Concurrent_Collection_Classes.ConcurrentSkipListSet;

import java.util.*;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;


import java.lang.reflect.Field;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentSkipListSet.html


/**
    ○ A scalable concurrent NavigableSet implementation based on
 
                   * a  ConcurrentSkipListMap.
 
    ○ The elements of the set are kept sorted according 
 
                   * to their Comparable natural ordering,
 
                   * or by a  Comparator provided at set creation time,
 
             depending on which constructor is used.

    ○ This implementation provides expected 
 
                    * average log(n) time
 
             cost for the  
 
                     * contains,
           
                     * add, 

                     * and  remove
 
             operations and their variants. 

    ○ Insertion, removal, and access operations 
 
                       * safely execute concurrently by multiple threads.

    ○ Iterators and spliterators are

                       * weakly consistent

    ○ Ascending ordered views and their iterators are faster than descending ones.
 
    ○ Beware that, unlike in most collections, 
 
                        * the  size method is not a constant-time operation.
 
             Because of the asynchronous nature of these sets, determining the current number of elements 
 
                         * requires a traversal of the elements, 
 
                         * and so may report inaccurate results if this collection is modified during traversal.
 
    ○ Bulk operations that add, remove, or examine multiple elements, such as  
 
                          * addAll, 
                          
                          * removeIf 
  
                          * or  #forEach,
 
                  are not guaranteed to be performed atomically.

    ○ For example,

                          * a forEach traversal concurrent with an  addAll operation

                          * might observe only some of the added elements.

    ○ This class and its iterators implement all of the  optional methods of the  Set and  Iterator interfaces.

    ○ Like most other concurrent collection implementations,

                           * this class does not permit the use of  null elements,

                   because  null arguments and return values

                           * cannot be reliably distinguished from the absence of elements.

    ○ This class is a member of the Java Collections Framework
 *
 * @author Doug Lea
 * @param <E> the type of elements maintained by this set
 * @since 1.6
 */
public class ConcurrentSkipListSet_<E> extends AbstractSet<E>
        implements NavigableSet<E>, Cloneable, java.io.Serializable {

    private static final long serialVersionUID = -2479143111061671589L;

    /**
     * The underlying map. Uses Boolean.TRUE as value for each
     * element.  This field is declared final for the sake of thread
     * safety, which entails some ugliness in clone().
     */
    private final ConcurrentNavigableMap<E,Object> m;

    /**
     * Constructs a new, empty set that orders its elements according to
     * their Comparable natural ordering}.
     */
    public ConcurrentSkipListSet_() {
        m = new ConcurrentSkipListMap<E,Object>();
    }

    /**
     * Constructs a new, empty set that orders its elements according to
     * the specified comparator.
     *
     * @param comparator the comparator that will be used to order this set.
     *        If  null}, the Comparable natural
     *        ordering} of the elements will be used.
     */
    public ConcurrentSkipListSet_(Comparator<? super E> comparator) {
        m = new ConcurrentSkipListMap<E,Object>(comparator);
    }

    /**
     * Constructs a new set containing the elements in the specified
     * collection, that orders its elements according to their
     * Comparable natural ordering}.
     *
     * @param c The elements that will comprise the new set
     * @throws ClassCastException if the elements in  c} are
     *         not  Comparable}, or are not mutually comparable
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
    public ConcurrentSkipListSet_(Collection<? extends E> c) {
        m = new ConcurrentSkipListMap<E,Object>();
        addAll(c);
    }

    /**
     * Constructs a new set containing the same elements and using the
     * same ordering as the specified sorted set.
     *
     * @param s sorted set whose elements will comprise the new set
     * @throws NullPointerException if the specified sorted set or any
     *         of its elements are null
     */
    public ConcurrentSkipListSet_(SortedSet<E> s) {
        m = new ConcurrentSkipListMap<E,Object>(s.comparator());
        addAll(s);
    }

    /**
     * For use by submaps
     */
    ConcurrentSkipListSet_(ConcurrentNavigableMap<E,Object> m) {
        this.m = m;
    }

    /**
     * Returns a shallow copy of this  ConcurrentSkipListSet}
     * instance. (The elements themselves are not cloned.)
     *
     * @return a shallow copy of this set
     */
//    public ConcurrentSkipListSet_<E> clone() {
//        try {
//            @SuppressWarnings("unchecked")
//            ConcurrentSkipListSet_<E> clone =
//                    (ConcurrentSkipListSet_<E>) super.clone();
//            clone.setMap(new ConcurrentSkipListMap<E,Object>(m));
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new InternalError();
//        }
//    }

    /* ---------------- Set operations -------------- */

    /**
     * Returns the number of elements in this set.  If this set
     * contains more than  Integer.MAX_VALUE} elements, it
     * returns  Integer.MAX_VALUE}.
     *
     * <p>Beware that, unlike in most collections, this method is
     * NOT a constant-time operation. Because of the
     * asynchronous nature of these sets, determining the current
     * number of elements requires traversing them all to count them.
     * Additionally, it is possible for the size to change during
     * execution of this method, in which case the returned result
     * will be inaccurate. Thus, this method is typically not very
     * useful in concurrent applications.
     *
     * @return the number of elements in this set
     */
    public int size() {
        return m.size();
    }

    /**
     * Returns  true} if this set contains no elements.
     * @return  true} if this set contains no elements
     */
    public boolean isEmpty() {
        return m.isEmpty();
    }

    /**
     * Returns  true} if this set contains the specified element.
     * More formally, returns  true} if and only if this set
     * contains an element  e} such that  o.equals(e)}.
     *
     * @param o object to be checked for containment in this set
     * @return  true} if this set contains the specified element
     * @throws ClassCastException if the specified element cannot be
     *         compared with the elements currently in this set
     * @throws NullPointerException if the specified element is null
     */
    public boolean contains(Object o) {
        return m.containsKey(o);
    }

    /**
     * Adds the specified element to this set if it is not already present.
     * More formally, adds the specified element  e} to this set if
     * the set contains no element  e2} such that  e.equals(e2)}.
     * If this set already contains the element, the call leaves the set
     * unchanged and returns  false}.
     *
     * @param e element to be added to this set
     * @return  true} if this set did not already contain the
     *         specified element
     * @throws ClassCastException if  e} cannot be compared
     *         with the elements currently in this set
     * @throws NullPointerException if the specified element is null
     */
    public boolean add(E e) {
        return m.putIfAbsent(e, Boolean.TRUE) == null;
    }

    /**
     * Removes the specified element from this set if it is present.
     * More formally, removes an element  e} such that
     *  o.equals(e)}, if this set contains such an element.
     * Returns  true} if this set contained the element (or
     * equivalently, if this set changed as a result of the call).
     * (This set will not contain the element once the call returns.)
     *
     * @param o object to be removed from this set, if present
     * @return  true} if this set contained the specified element
     * @throws ClassCastException if  o} cannot be compared
     *         with the elements currently in this set
     * @throws NullPointerException if the specified element is null
     */
    public boolean remove(Object o) {
        return m.remove(o, Boolean.TRUE);
    }

    /**
     * Removes all of the elements from this set.
     */
    public void clear() {
        m.clear();
    }

    /**
     * Returns an iterator over the elements in this set in ascending order.
     *
     * @return an iterator over the elements in this set in ascending order
     */
    public Iterator<E> iterator() {
        return m.navigableKeySet().iterator();
    }

    /**
     * Returns an iterator over the elements in this set in descending order.
     *
     * @return an iterator over the elements in this set in descending order
     */
    public Iterator<E> descendingIterator() {
        return m.descendingKeySet().iterator();
    }


    /* ---------------- AbstractSet Overrides -------------- */

    /**
     * Compares the specified object with this set for equality.  Returns
     *  true} if the specified object is also a set, the two sets
     * have the same size, and every member of the specified set is
     * contained in this set (or equivalently, every member of this set is
     * contained in the specified set).  This definition ensures that the
     * equals method works properly across different implementations of the
     * set interface.
     *
     * @param o the object to be compared for equality with this set
     * @return  true} if the specified object is equal to this set
     */
    public boolean equals(Object o) {
        // Override AbstractSet version to avoid calling size()
        if (o == this)
            return true;
        if (!(o instanceof Set))
            return false;
        Collection<?> c = (Collection<?>) o;
        try {
            return containsAll(c) && c.containsAll(this);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /**
     * Removes from this set all of its elements that are contained in
     * the specified collection.  If the specified collection is also
     * a set, this operation effectively modifies this set so that its
     * value is the asymmetric set difference of the two sets.
     *
     * @param  c collection containing elements to be removed from this set
     * @return  true} if this set changed as a result of the call
     * @throws ClassCastException if the class of an element of this set
     *         is incompatible with the specified collection
     * (<a href="/java.base/java/util/Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
    public boolean removeAll(Collection<?> c) {
        // Override AbstractSet version to avoid unnecessary call to size()
        boolean modified = false;
        for (Object e : c)
            if (remove(e))
                modified = true;
        return modified;
    }

    /* ---------------- Relational operations -------------- */

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if the specified element is null
     */
    public E lower(E e) {
        return m.lowerKey(e);
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if the specified element is null
     */
    public E floor(E e) {
        return m.floorKey(e);
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if the specified element is null
     */
    public E ceiling(E e) {
        return m.ceilingKey(e);
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if the specified element is null
     */
    public E higher(E e) {
        return m.higherKey(e);
    }

    public E pollFirst() {
        Map.Entry<E,Object> e = m.pollFirstEntry();
        return (e == null) ? null : e.getKey();
    }

    public E pollLast() {
        Map.Entry<E,Object> e = m.pollLastEntry();
        return (e == null) ? null : e.getKey();
    }


    /* ---------------- SortedSet operations -------------- */

    public Comparator<? super E> comparator() {
        return m.comparator();
    }

    /**
     * @throws java.util.NoSuchElementException 
     */
    public E first() {
        return m.firstKey();
    }

    /**
     * @throws java.util.NoSuchElementException 
     */
    public E last() {
        return m.lastKey();
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if  fromElement} or
     *          toElement} is null
     * @throws IllegalArgumentException 
     */
    public NavigableSet<E> subSet(E fromElement,
                                  boolean fromInclusive,
                                  E toElement,
                                  boolean toInclusive) {
        return new ConcurrentSkipListSet_<E>
                (m.subMap(fromElement, fromInclusive,
                        toElement,   toInclusive));
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if  toElement} is null
     * @throws IllegalArgumentException 
     */
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
        return new ConcurrentSkipListSet_<E>(m.headMap(toElement, inclusive));
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if  fromElement} is null
     * @throws IllegalArgumentException 
     */
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        return new ConcurrentSkipListSet_<E>(m.tailMap(fromElement, inclusive));
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if  fromElement} or
     *          toElement} is null
     * @throws IllegalArgumentException 
     */
    public NavigableSet<E> subSet(E fromElement, E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if  toElement} is null
     * @throws IllegalArgumentException 
     */
    public NavigableSet<E> headSet(E toElement) {
        return headSet(toElement, false);
    }

    /**
     * @throws ClassCastException 
     * @throws NullPointerException if  fromElement} is null
     * @throws IllegalArgumentException 
     */
    public NavigableSet<E> tailSet(E fromElement) {
        return tailSet(fromElement, true);
    }

    /**
     * Returns a reverse order view of the elements contained in this set.
     * The descending set is backed by this set, so changes to the set are
     * reflected in the descending set, and vice-versa.
     *
     * <p>The returned set has an ordering equivalent to
     *  Collections#reverseOrder(Comparator) Collections.reverseOrder (comparator()).
     * The expression  s.descendingSet().descendingSet() returns a
     * view of  s essentially equivalent to  s.
     *
     * @return a reverse order view of this set
     */
    public NavigableSet<E> descendingSet() {
        return new ConcurrentSkipListSet_<E>(m.descendingMap());
    }

    /**
     * Returns a  Spliterator over the elements in this set.
     *
     * <p>The  Spliterator reports  Spliterator#CONCURRENT,
     *  Spliterator#NONNULL,  Spliterator#DISTINCT,
     *  Spliterator#SORTED and  Spliterator#ORDERED, with an
     * encounter order that is ascending order.  Overriding implementations
     * should document the reporting of additional characteristic values.
     *
     * <p>The Spliterator#getComparator() spliterator's comparator
     * is  null if the #comparator() set's comparator
     * is  null.
     * Otherwise, the spliterator's comparator is the same as or imposes the
     * same total ordering as the set's comparator.
     *
     * @return a  Spliterator over the elements in this set
     * @since 1.8
     */
//    public Spliterator<E> spliterator() {
//        return (m instanceof ConcurrentSkipListMap)
//                ? ((ConcurrentSkipListMap<E,?>)m).keySpliterator()
//                : ((ConcurrentSkipListMap.SubMap<E,?>)m).new SubMapKeyIterator();
//
//
//    /** Initializes map field; for use in clone. */
//    private void setMap(ConcurrentNavigableMap<E,Object> map) {
//        Field mapField = java.security.AccessController.doPrivileged(
//                (java.security.PrivilegedAction<Field>) () -> {
//                    try {
//                        Field f = ConcurrentSkipListSet_.class
//                                .getDeclaredField("m");
//                        f.setAccessible(true);
//                        return f;
//                    } catch (ReflectiveOperationException e) {
//                        throw new Error(e);
//                    }});
//        try {
//            mapField.set(this, map);
//        } catch (IllegalAccessException e) {
//            throw new Error(e);
//        }
//    }
//}
}