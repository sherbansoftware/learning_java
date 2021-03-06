
package Collection.Collection_Interfaces.Set;

import Collection.Collection_Interfaces.Collection.Collection_;


import java.util.*;

// https://docs.oracle.com/javase/8/docs/api/java/util/Set.html

/**                                                            Set

    A collection that contains no duplicate elements.
     More formally set contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name,
        this interface models the mathematical set abstraction.

    The Set interface places additional stipulations, beyond those inherited from the Collection interface, on the contracts 
        of all constructors and on the contracts of the add, equals and  hashCode methods.Declarations for other inherited 
        methods are also included here for convenience. (The specifications accompanying these declarations have been 
        tailored to the Set interface, but they do not contain any additional stipulations.)

    The additional stipulation on constructors is, not surprisingly, that all constructors must create a set that contains 
        no duplicate elements (as defined above).

                                                             NOTE

            * Duplicate are not allowed
            * Insertion order is not preserved
            * One null value is accepted
            * Accepts heterogeneous elements
            * Great care must be exercised if mutable objects are used as set elements.The behavior of a set is not specified 
                  if the value of an object is changed in a manner that affects equals comparisons while the object is
                  an element in the set.
            * A special case of this prohibition is that it is not permissible for a set to contain itself as an element.
            * Some set implementations have restrictions on the elements that they may contain.For example,some implementations
                  prohibit null elements, and some have restrictions on the types of their elements.Attempting to add an
                  ineligible element throws an unchecked exception, typically NullPointerException or ClassCastException.

             * Attempting  to query the presence of an ineligible element may

                       - throw an exception,
                        - or it may simply return false;

                   some implementations will exhibit the former behavior and some will exhibit the latter. More generally,
                   attempting an operation on an ineligible element whose completion would not result in the insertion of
                   an ineligible element into the set may throw an exception or it may succeed, at the option of the
                   implementation.Such exceptions are marked as "optional" in the specification for this interface.

             * This interface is a member of the "{@docRoot}/../technotes/guides/collections/index.html"  Java Collections_Class Framework.

 * @param <E> the type of elements maintained by this set
 *
 * @author  Josh Bloch
 * @author  Neal Gafter
 * @see Collection
 * @see List
 * @see SortedSet
 * @see HashSet
 * @see TreeSet
 * @see AbstractSet
 * @see Collections#singleton(Object)
 * @see Collections#EMPTY_SET
 * @since 1.2
 */

public interface Set_<E> extends Collection_<E> {
    // Query Operations

    /**
     * Returns the number of elements in this set (its cardinality).If this set contains more than Integer.MAX_VALUE 
     * elements, returns  Integer.MAX_VALUE.
     * @return the number of elements in this set (its cardinality)
     */
    int size();

    /**
     * Returns true if this set contains no elements.
     * @return true if this set contains no elements
     */
    boolean isEmpty();

    /**
     * Returns true if this set contains the specified element.
     * More formally, returns true if and only if this set
     * contains an element e such that
     * (o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e)).
     *
     * @param o element whose presence in this set is to be tested
     * @return true if this set contains the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this set
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         set does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    boolean contains(Object o);

    /**
     * Returns an iterator over the elements in this set.  The elements are
     * returned in no particular order (unless this set is an instance of some
     * class that provides a guarantee).
     *
     * @return an iterator over the elements in this set
     */
    Iterator<E> iterator();

    /**
     * Returns an array containing all of the elements in this set.
     * If this set makes any guarantees as to what order its elements
     * are returned by its iterator, this method must return the
     * elements in the same order.
     *
     * The returned array will be "safe" in that no references to it
     * are maintained by this set.  (In other words, this method must
     * allocate a new array even if this set is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all the elements in this set
     */
    Object[] toArray();

    /**
     * Returns an array containing all of the elements in this set; the
     * runtime type of the returned array is that of the specified array.
     * If the set fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this set.
     *
     * If this set fits in the specified array with room to spare
     * (i.e., the array has more elements than this set), the element in
     * the array immediately following the end of the set is set to
     * null.  (This is useful in determining the length of this
     * set only if the caller knows that this set does not contain
     * any null elements.)
     *
     * If this set makes any guarantees as to what order its elements
     * are returned by its iterator, this method must return the elements
     * in the same order.
     *
     * Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * Suppose x is a set known to contain only strings.
     * The following code can be used to dump the set into a newly allocated
     * array of String:
     *
     * <pre>
     *     String[] y = x.toArray(new String[0]);</pre>
     *
     * Note that toArray(new lang.classes.Object[0]) is identical in function to
     * toArray().
     *
     * @param a the array into which the elements of this set are to be
     *        stored, if it is big enough; otherwise, a new array of the same
     *        runtime type is allocated for this purpose.
     * @return an array containing all the elements in this set
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in this
     *         set
     * @throws NullPointerException if the specified array is null
     */
    <T> T[] toArray(T[] a);


    // Modification Operations

    /**
     * Adds the specified element to this set if it is not already present
     * (optional operation).  More formally, adds the specified element
     * e to this set if the set contains no element e2
     * such that
     * (e==null&nbsp;?&nbsp;e2==null&nbsp;:&nbsp;e.equals(e2)).
     * If this set already contains the element, the call leaves the set
     * unchanged and returns false.  In combination with the
     * restriction on constructors, this ensures that sets never contain
     * duplicate elements.
     *
     * The stipulation above does not imply that sets must accept all
     * elements; sets may refuse to add any particular element, including
     * null, and throw an exception, as described in the
     * specification for {@link Collection_#add Collection.add}.
     * Individual set implementations should clearly document any
     * restrictions on the elements that they may contain.
     *
     * @param e element to be added to this set
     * @return true if this set did not already contain the specified
     *         element
     * @throws UnsupportedOperationException if the add operation
     *         is not supported by this set
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this set
     * @throws NullPointerException if the specified element is null and this
     *         set does not permit null elements
     * @throws IllegalArgumentException if some property of the specified element
     *         prevents it from being added to this set
     */
    boolean add(E e);


    /**
     * Removes the specified element from this set if it is present
     * (optional operation).  More formally, removes an element e
     * such that
     * (o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e)), if
     * this set contains such an element.  Returns true if this set
     * contained the element (or equivalently, if this set changed as a
     * result of the call).  (This set will not contain the element once the
     * call returns.)
     *
     * @param o object to be removed from this set, if present
     * @return true if this set contained the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this set
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         set does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException if the remove operation
     *         is not supported by this set
     */
    boolean remove(Object o);


    // Bulk Operations

    /**
     * Returns true if this set contains all of the elements of the
     * specified collection.  If the specified collection is also a set, this
     * method returns true if it is a subset of this set.
     *
     * @param  c collection to be checked for containment in this set
     * @return true if this set contains all of the elements of the
     *         specified collection
     * @throws ClassCastException if the types of one or more elements
     *         in the specified collection are incompatible with this
     *         set
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this set does not permit null
     *         elements
     * (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see    #contains(Object)
     */
    boolean containsAll(Collection_<?> c);

    /**
     * Adds all of the elements in the specified collection to this set if
     * they're not already present (optional operation).  If the specified
     * collection is also a set, the addAll operation effectively
     * modifies this set so that its value is the union of the two
     * sets.  The behavior of this operation is undefined if the specified
     * collection is modified while the operation is in progress.
     *
     * @param  c collection containing elements to be added to this set
     * @return true if this set changed as a result of the call
     *
     * @throws UnsupportedOperationException if the addAll operation
     *         is not supported by this set
     * @throws ClassCastException if the class of an element of the
     *         specified collection prevents it from being added to this set
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this set does not permit null
     *         elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this set
     * @see #add(Object)
     */
    boolean addAll(Collection_<? extends E> c);

    /**
     * Retains only the elements in this set that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this set all of its elements that are not contained in the
     * specified collection.  If the specified collection is also a set, this
     * operation effectively modifies this set so that its value is the
     * intersection of the two sets.
     *
     * @param  c collection containing elements to be retained in this set
     * @return true if this set changed as a result of the call
     * @throws UnsupportedOperationException if the retainAll operation
     *         is not supported by this set
     * @throws ClassCastException if the class of an element of this set
     *         is incompatible with the specified collection
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this set contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     */
    boolean retainAll(Collection_<?> c);

    /**
     * Removes from this set all of its elements that are contained in the
     * specified collection (optional operation).  If the specified
     * collection is also a set, this operation effectively modifies this
     * set so that its value is the asymmetric set difference of
     * the two sets.
     *
     * @param  c collection containing elements to be removed from this set
     * @return true if this set changed as a result of the call
     * @throws UnsupportedOperationException if the removeAll operation
     *         is not supported by this set
     * @throws ClassCastException if the class of an element of this set
     *         is incompatible with the specified collection
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this set contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    boolean removeAll(Collection_<?> c);

    /**
     * Removes all of the elements from this set (optional operation).
     * The set will be empty after this call returns.
     *
     * @throws UnsupportedOperationException if the clear method
     *         is not supported by this set
     */
    void clear();


    // Comparison and hashing

    /**
     * Compares the specified object with this set for equality.  Returns
     * true if the specified object is also a set, the two sets
     * have the same size, and every member of the specified set is
     * contained in this set (or equivalently, every member of this set is
     * contained in the specified set).  This definition ensures that the
     * equals method works properly across different implementations of the
     * set interface.
     *
     * @param o object to be compared for equality with this set
     * @return true if the specified object is equal to this set
     */
    boolean equals(Object o);

    /**
     * Returns the hash code value for this set.  The hash code of a set is
     * defined to be the sum of the hash codes of the elements in the set,
     * where the hash code of a null element is defined to be zero.
     * This ensures that s1.equals(s2) implies that
     * s1.hashCode()==s2.hashCode() for any two sets s1
     * and s2, as required by the general contract of
     * {@link Object#hashCode}.
     *
     * @return the hash code value for this set
     * @see Object#equals(Object)
     * @see Set_#equals(Object)
     */
    int hashCode();

    /**
     * Creates a {@code Spliterator} over the elements in this set.
     *
     * The {@code Spliterator} reports {@link Spliterator_#DISTINCT}.
     * Implementations should document the reporting of additional
     * characteristic values.
     *
     * @implSpec
     * The default implementation creates a
     * <em><a href="Spliterator.html#binding">late-binding</a></em> spliterator
     * from the set's {@code Iterator_Interface}.  The spliterator inherits the
     * <em>fail-fast</em> properties of the set's iterator.
     * 
     * The created {@code Spliterator} additionally reports
     * {@link Spliterator_#SIZED}.
     *
     * @implNote
     * The created {@code Spliterator} additionally reports
     * {@link Spliterator_#SUBSIZED}.
     *
     * @return a {@code Spliterator} over the elements in this set
     * @since 1.8
     */
 //   @Override
//    default Spliterator<E> spliterator() {
//        return Spliterators.spliterator(this, Spliterator.DISTINCT);
//    }
}
