package Collection_Framework.Collection_Interfaces.List;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html

import java.util.*;
import java.util.function.UnaryOperator;


/**
    ○ An ordered collection (also known as a sequence).The user of this interface

               * has precise control over where in the list each element is inserted.

    ○ The user

               * can access elements by their integer index (position in the list),

               *  and search for elements in the list.

    ○ Unlike sets, lists typically allow duplicate elements.

                * More formally, lists typically allow pairs of elements  e1} and  e2}
                      such that  e1.equals(e2)},

                * and they typically allow multiple null elements if they allow null elements at all.

    ○ It is not inconceivable that someone 
 
                 * might wish to implement a list that prohibits duplicates, 
 
                 * by throwing runtime exceptions when the user attempts to insert them, but we
                       expect this usage to be rare.
 
    ○ The  List interface places additional stipulations, beyond those specified in the  Collection interface,

                  * on the contracts of the

                               - iterator,

                               - add,

                               - remove,

                               - equals,

                               - and

                               - hashCode methods.

    ○ Declarations for other inherited methods are also included here for convenience.

    ○ The List interface provides four methods for positional (indexed) access to list elements.

    ○ Lists (like Java arrays) are zero based.

    ○ Note

                  * that these operations may execute

                                 - in time proportional to the index value for some implementations

                                  - (the LinkedList class, for example).

    ○ Thus,

                  * iterating over the elements in a list

                  * is typically preferable to indexing through it if the caller does not know the implementation.

    ○  The  List interface provides a special iterator, called a

                   * ListIterator, that allows element insertion and replacement, and

                   * bidirectional access in addition to the normal operations that the Iterator interface provides.

    ○ A method is provided to obtain a list iterator that starts at a specified position in the list.

    ○ The List interface provides two methods to search for a specified object.

    ○ From a performance standpoint, these methods should be used with caution.

      In many implementations they will perform costly linear searches.

    ○ The  List interface provides two methods to efficiently insert and remove multiple elements
          at an arbitrary point in the list.

    ○ Note: While it is permissible for lists to contain themselves as elements,

                  * extreme caution is advised: the  equals and  hashCode methods are no longer well defined on such a list.

    ○ Some list implementations have restrictions on the elements that they may contain.

    ○ For example, some implementations prohibit null elements,

                  * and some have restrictions on the types of their elements.

    ○ Attempting to add an ineligible element throws an unchecked exception, typically

                  * NullPointerException

                  * or  ClassCastException.

    ○ Attempting  to query the presence of an ineligible element

                  * may throw an exception,

                  * or it may simply return false;

    ○ some implementations will exhibit the former behavior and some will exhibit the latter.

    ○ More generally, attempting an operation on an ineligible element whose completion would not result in
          the insertion of an ineligible element into the list may throw an exception or it may succeed,
          at the option of the implementation.

    ○ Such exceptions are marked as "optional" in the specification for this interface.


                                            Unmodifiable Lists


    ○  The  List#of(Object...) List.of and

                   *  List#copyOf List.copyOf static factory methods provide a convenient way to create unmodifiable lists.

    ○ The  List instances created by these methods have the following characteristics:

 * <li>They are <a href="Collection.html#unmodifiable">unmodifiable</a>. Elements cannot
 * be added, removed, or replaced. Calling any mutator method on the List
 * will always cause  UnsupportedOperationException to be thrown.
 * However, if the contained elements are themselves mutable,
 * this may cause the List's contents to appear to change.
 * <li>They disallow  null elements. Attempts to create them with
 *  null elements result in  NullPointerException.
 * <li>They are serializable if all elements are serializable.
 * <li>The order of elements in the list is the same as the order of the
 * provided arguments, or of the elements in the provided array.
 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>.
 * Callers should make no assumptions about the identity of the returned instances.
 * Factories are free to create new instances or reuse existing ones. Therefore,
 * identity-sensitive operations on these instances (reference equality ( ==),
 * identity hash code, and synchronization) are unreliable and should be avoided.
 * <li>They are serialized as specified on the
 * <a href="{@docRoot/serialized-form.html#java.util.CollSer">Serialized Form</a>
 * page.
 * </ul>
 *
 * This interface is a member of the
 * <a href="{@docRoot/java.base/java/util/package-summary.html#CollectionsFramework">
 * Java Collections Framework</a>.
 *
 * @param <E> the type of elements in this list
 *
 * @author  Josh Bloch
 * @author  Neal Gafter
 * @see Collection
 * @see Set
 * @see ArrayList
 * @see LinkedList
 * @see Vector
 * @see Arrays#asList(Object[])
 * @see Collections#nCopies(int, Object)
 * @see Collections#EMPTY_LIST
 * @see AbstractList
 * @see AbstractSequentialList
 * @since 1.2
 */

public interface List_<E> extends Collection<E> {
    // Query Operations

    /**
     * Returns the number of elements in this list.  If this list contains
     * more than  Integer.MAX_VALUE elements, returns
     *  Integer.MAX_VALUE.
     *
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns  true if this list contains no elements.
     *
     * @return  true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns  true if this list contains the specified element.
     * More formally, returns  true if and only if this list contains
     * at least one element  e such that
     *  Objects.equals(o, e).
     *
     * @param o element whose presence in this list is to be tested
     * @return  true if this list contains the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    boolean contains(Object o);

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    Iterator<E> iterator();

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     *
     * The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must
     * allocate a new array even if this list is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     * @see Arrays#asList(Object[])
     */
    Object[] toArray();

    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the list fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this list.
     *
     * If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the element in the array
     * immediately following the end of the list is set to  null.
     * (This is useful in determining the length of the list only if
     * the caller knows that the list does not contain any null elements.)
     *
     * Like the  #toArray() method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * Suppose  x is a list known to contain only strings.
     * The following code can be used to dump the list into a newly
     * allocated array of  String:
     *
     * <pre>
     *     String[] y = x.toArray(new String[0]);
     * </pre>
     *
     * Note that  toArray(new Object[0]) is identical in function to
     *  toArray().
     *
     * @param a the array into which the elements of this list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of this list
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this list
     * @throws NullPointerException if the specified array is null
     */
    <T> T[] toArray(T[] a);


    // Modification Operations

    /**
     * Appends the specified element

                   * to the end of this list (optional operation).

     * Lists that support this operation may place limitations on what
     * elements may be added to this list.  In particular, some
     * lists will refuse to add null elements, and others will impose
     * restrictions on the type of elements that may be added.  List
     * classes should clearly specify in their documentation any restrictions
     * on what elements may be added.
     *
     * @param e element to be appended to this list
     * @return  true (as specified by  Collection#add)
     * @throws UnsupportedOperationException if the  add operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being added to this list
     */
    boolean add(E e);

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation).  If this list does not contain
     * the element, it is unchanged.  More formally, removes the element with
     * the lowest index  i such that
     *  Objects.equals(o, get(i))
     * (if such an element exists).  Returns  true if this list
     * contained the specified element (or equivalently, if this list changed
     * as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return  true if this list contained the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException if the  remove operation
     *         is not supported by this list
     */
    boolean remove(Object o);


    // Bulk Modification Operations

    /**
     * Returns  true if this list contains all of the elements of the
     * specified collection.
     *
     * @param  c collection to be checked for containment in this list
     * @return  true if this list contains all of the elements of the
     *         specified collection
     * @throws ClassCastException if the types of one or more elements
     *         in the specified collection are incompatible with this
     *         list
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #contains(Object)
     */
    boolean containsAll(Collection<?> c);

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator (optional operation).  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return  true if this list changed as a result of the call
     * @throws UnsupportedOperationException if the  addAll operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of the specified
     *         collection prevents it from being added to this list
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this list
     * @see #add(Object)
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * Inserts all the elements in the specified collection into this
     * list at the specified position (optional operation).  Shifts the
     * element currently at that position (if any) and any subsequent
     * elements to the right (increases their indices).  The new elements
     * will appear in this list in the order that they are returned by the
     * specified collection's iterator.  The behavior of this operation is
     * undefined if the specified collection is modified while the
     * operation is in progress.  (Note that this will occur if the specified
     * collection is this list, and it's nonempty.)
     *
     * @param index index at which to insert the first element from the
     *              specified collection
     * @param c collection containing elements to be added to this list
     * @return  true if this list changed as a result of the call
     * @throws UnsupportedOperationException if the  addAll operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of the specified
     *         collection prevents it from being added to this list
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ( index < 0 || index > size())
     */
    boolean addAll(int index, Collection<? extends E> c);

    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection (optional operation).
     *
     * @param c collection containing elements to be removed from this list
     * @return  true if this list changed as a result of the call
     * @throws UnsupportedOperationException if the  removeAll operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    boolean removeAll(Collection<?> c);

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this list all of its elements that are not contained in the
     * specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return  true if this list changed as a result of the call
     * @throws UnsupportedOperationException if the  retainAll operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
    boolean retainAll(Collection<?> c);

    /**
     * Replaces each element of this list with the result of applying the
     * operator to that element.  Errors or runtime exceptions thrown by
     * the operator are relayed to the caller.
     *
     * @implSpec
     * The default implementation is equivalent to, for this  list:
     * <pre>
     *     final ListIterator<E> li = list.listIterator();
     *     while (li.hasNext()) {
     *         li.set(operator.apply(li.next()));
     *     
     * </pre>
     *
     * If the list's list-iterator does not support the  set operation
     * then an  UnsupportedOperationException} will be thrown when
     * replacing the first element.
     *
     * @param operator the operator to apply to each element
     * @throws UnsupportedOperationException if this list is unmodifiable.
     *         Implementations may throw this exception if an element
     *         cannot be replaced or if, in general, modification is not
     *         supported
     * @throws NullPointerException if the specified operator is null or
     *         if the operator result is a null value and this list does
     *         not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @since 1.8
     */
    default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }

    /**
     * Sorts this list according to the order induced by the specified
     *  Comparator}.  The sort is stable: this method must not
     * reorder equal elements.
     *
     * All elements in this list must be mutually comparable using the
     * specified comparator (that is,  c.compare(e1, e2) must not throw
     * a  ClassCastException for any elements  e1 and  e2
     * in the list).
     *
     * If the specified comparator is  null then all elements in this
     * list must implement the  Comparable interface and the elements'
     * plain Comparable natural ordering should be used.
     *
     * This list must be modifiable, but need not be resizable.
     *
     * @implSpec
     * The default implementation obtains an array containing all elements in
     * this list, sorts the array, and iterates over this list resetting each
     * element from the corresponding position in the array. (This avoids the
     * n<sup>2</sup> log(n) performance that would result from attempting
     * to sort a linked list in place.)
     *
     * @implNote
     * This implementation is a stable, adaptive, iterative mergesort that
     * requires far fewer than n lg(n) comparisons when the input array is
     * partially sorted, while offering the performance of a traditional
     * mergesort when the input array is randomly ordered.  If the input array
     * is nearly sorted, the implementation requires approximately n
     * comparisons.  Temporary storage requirements vary from a small constant
     * for nearly sorted input arrays to n/2 object references for randomly
     * ordered input arrays.
     *
     * The implementation takes equal advantage of ascending and
     * descending order in its input array, and can take advantage of
     * ascending and descending order in different parts of the same
     * input array.  It is well-suited to merging two or more sorted arrays:
     * simply concatenate the arrays and sort the resulting array.
     *
     * The implementation was adapted from Tim Peters's list sort for Python
     * (<a href="http://svn.python.org/projects/python/trunk/Objects/listsort.txt">
     * TimSort</a>).  It uses techniques from Peter McIlroy's "Optimistic
     * Sorting and Information Theoretic Complexity", in Proceedings of the
     * Fourth Annual ACM-SIAM Symposium on Discrete Algorithms, pp 467-474,
     * January 1993.
     *
     * @param c the  Comparator used to compare list elements.
     *          A  null value indicates that the elements'
     *          plain Comparable natural ordering should be used
     * @throws ClassCastException if the list contains elements that are not
     *         mutually comparable using the specified comparator
     * @throws UnsupportedOperationException if the list's list-iterator does
     *         not support the  set operation
     * @throws IllegalArgumentException
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     *         if the comparator is found to violate the  Comparator
     *         contract
     * @since 1.8
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    default void sort(Comparator<? super E> c) {
        Object[] a = this.toArray();
        Arrays.sort(a, (Comparator) c);
        ListIterator<E> i = this.listIterator();
        for (Object e : a) {
            i.next();
            i.set((E) e);
        }
    }

    /**
     * Removes all of the elements from this list (optional operation).
     * The list will be empty after this call returns.
     *
     * @throws UnsupportedOperationException if the  clear operation
     *         is not supported by this list
     */
    void clear();


    // Comparison and hashing

    /**
     * Compares the specified object with this list for equality.  Returns
     *  true if and only if the specified object is also a list, both
     * lists have the same size, and all corresponding pairs of elements in
     * the two lists are equal.  (Two elements  e1 and
     *  e2 are equal if  Objects.equals(e1, e2).)
     * In other words, two lists are defined to be
     * equal if they contain the same elements in the same order.  This
     * definition ensures that the equals method works properly across
     * different implementations of the  List interface.
     *
     * @param o the object to be compared for equality with this list
     * @return  true if the specified object is equal to this list
     */
    boolean equals(Object o);

    /**
     * Returns the hash code value for this list.  The hash code of a list
     * is defined to be the result of the following calculation:
     * <pre>
     *     int hashCode = 1;
     *     for (E e : list)
     *         hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
     * </pre>
     * This ensures that  list1.equals(list2) implies that
     *  list1.hashCode()==list2.hashCode() for any two lists,
     *  list1 and  list2, as required by the general
     * contract of  Object#hashCode.
     *
     * @return the hash code value for this list
     * @see Object#equals(Object)
     * @see #equals(Object)
     */
    int hashCode();


    // Positional Access Operations

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ( index < 0 || index >= size()})
     */
    E get(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element (optional operation).
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the  set operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and
     *         this list does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ( index < 0 || index >= size())
     */
    E set(int index, E element);

    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation).  Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws UnsupportedOperationException if the  add operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and
     *         this list does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ( index < 0 || index > size())
     */
    void add(int index, E element);

    /**
     * Removes the element at the specified position in this list (optional
     * operation).  Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the element that was removed from the
     * list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the  remove operation
     *         is not supported by this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ( index < 0 || index >= size())
     */
    E remove(int index);


    // Search Operations

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index  i such that
     *  Objects.equals(o, get(i)),
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    int indexOf(Object o);

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the highest index  i such that
     *  Objects.equals(o, get(i)),
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    int lastIndexOf(Object o);


    // List Iterators

    /**
     * Returns a list iterator over the elements in this list (in proper
     * sequence).
     *
     * @return a list iterator over the elements in this list (in proper
     *         sequence)
     */
    ListIterator<E> listIterator();

    /**
     * Returns a list iterator over the elements in this list (in proper sequence),

                   * starting at the specified position in the list.

     * The specified index indicates the first element that would be
     * returned by an initial call to  ListIterator#next next.
     * An initial call to  ListIterator#previous previous would
     * return the element with the specified index minus one.
     *
     * @param index index of the first element to be returned from the
     *        list iterator (by a call to  ListIterator#next next)
     * @return a list iterator over the elements in this list (in proper
     *         sequence), starting at the specified position in the list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ( index < 0 || index > size())
     */
    ListIterator<E> listIterator(int index);

    // View

    /**
     * Returns a view of the portion of this list between the specified
     *  fromIndex, inclusive, and  toIndex, exclusive.  (If
     *  fromIndex and  toIndex are equal, the returned list is
     * empty.)  The returned list is backed by this list, so non-structural
     * changes in the returned list are reflected in this list, and vice-versa.
     * The returned list supports all of the optional list operations supported
     * by this list.
     *
     * This method eliminates the need for explicit range operations (of
     * the sort that commonly exist for arrays).  Any operation that expects
     * a list can be used as a range operation by passing a subList view
     * instead of a whole list.  For example, the following idiom
     * removes a range of elements from a list:
     * <pre>
     *      list.subList(from, to).clear();
     * </pre>
     * Similar idioms may be constructed for  indexOf and
     *  lastIndexOf, and all of the algorithms in the
     *  Collections class can be applied to a subList.
     *
     * The semantics of the list returned by this method become undefined if
     * the backing list (i.e., this list) is structurally modified in
     * any way other than via the returned list.  (Structural modifications are
     * those that change the size of this list, or otherwise perturb it in such
     * a fashion that iterations in progress may yield incorrect results.)
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value
     *         ( fromIndex < 0 || toIndex > size ||
     *         fromIndex > toIndex)
     */
    List<E> subList(int fromIndex, int toIndex);

    /**
     * Creates a  Spliterator over the elements in this list.
     *
     * The  Spliterator reports  Spliterator#SIZED and
     *  Spliterator#ORDERED.  Implementations should document the
     * reporting of additional characteristic values.
     *
     * @implSpec
     * The default implementation creates a
     * <em><a href="Spliterator.html#binding">late-binding</a></em>
     * spliterator as follows:
     * <ul>
     * <li>If the list is an instance of  RandomAccess then the default
     *     implementation creates a spliterator that traverses elements by
     *     invoking the method  List#get.  If such invocation results or
     *     would result in an  IndexOutOfBoundsException then the
     *     spliterator will <em>fail-fast</em> and throw a
     *      ConcurrentModificationException.
     *     If the list is also an instance of  AbstractList then the
     *     spliterator will use the list's  AbstractList# modCount modCount}
     *     field to provide additional <em>fail-fast</em> behavior.
     * <li>Otherwise, the default implementation creates a spliterator from the
     *     list's  Iterator}.  The spliterator inherits the
     *     <em>fail-fast</em> of the list's iterator.
     * </ul>
     *
     * @implNote
     * The created  Spliterator} additionally reports
     *  Spliterator#SUBSIZED}.
     *
     * @return a  Spliterator} over the elements in this list
     * @since 1.8
     */
//    @Override
//    default Spliterator<E> spliterator() {
//        if (this instanceof RandomAccess) {
//            return new AbstractList_.RandomAccessSpliterator<>(this);
//        } else {
//            return Spliterators.spliterator(this, Spliterator.ORDERED);
//        }
//    }

    /**
     * Returns an unmodifiable list containing zero elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @return an empty  List}
     *
     * @since 9
     */
//    static <E> List<E> of() {
//        return ImmutableCollections.emptyList();
//    }

    /**
     * Returns an unmodifiable list containing one element.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the single element
     * @return a  List} containing the specified element
     * @throws NullPointerException if the element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1) {
//        return new ImmutableCollections.List12<>(e1);
//    }

    /**
     * Returns an unmodifiable list containing two elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2) {
//        return new ImmutableCollections_.List12<>(e1, e2);
//    }

    /**
     * Returns an unmodifiable list containing three elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3);
//    }

    /**
     * Returns an unmodifiable list containing four elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4);
//    }

    /**
     * Returns an unmodifiable list containing five elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @param e5 the fifth element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4, E e5) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4, e5);
//    }

    /**
     * Returns an unmodifiable list containing six elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @param e5 the fifth element
     * @param e6 the sixth element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4, e5,
//                e6);
//    }

    /**
     * Returns an unmodifiable list containing seven elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @param e5 the fifth element
     * @param e6 the sixth element
     * @param e7 the seventh element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4, e5,
//                e6, e7);
//    }

    /**
     * Returns an unmodifiable list containing eight elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @param e5 the fifth element
     * @param e6 the sixth element
     * @param e7 the seventh element
     * @param e8 the eighth element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4, e5,
//                e6, e7, e8);
//    }

    /**
     * Returns an unmodifiable list containing nine elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @param e5 the fifth element
     * @param e6 the sixth element
     * @param e7 the seventh element
     * @param e8 the eighth element
     * @param e9 the ninth element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4, e5,
//                e6, e7, e8, e9);
//    }

    /**
     * Returns an unmodifiable list containing ten elements.
     *
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @param <E> the  List}'s element type
     * @param e1 the first element
     * @param e2 the second element
     * @param e3 the third element
     * @param e4 the fourth element
     * @param e5 the fifth element
     * @param e6 the sixth element
     * @param e7 the seventh element
     * @param e8 the eighth element
     * @param e9 the ninth element
     * @param e10 the tenth element
     * @return a  List} containing the specified elements
     * @throws NullPointerException if an element is  null}
     *
     * @since 9
     */
//    static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
//        return new ImmutableCollections.ListN<>(e1, e2, e3, e4, e5,
//                e6, e7, e8, e9, e10);
//    }

    /**
     * Returns an unmodifiable list containing an arbitrary number of elements.
     * See <a href="#unmodifiable">Unmodifiable Lists</a> for details.
     *
     * @apiNote
     * This method also accepts a single array as an argument. The element type of
     * the resulting list will be the component type of the array, and the size of
     * the list will be equal to the length of the array. To create a list with
     * a single element that is an array, do the following:
     *
     * <pre>
     *     String[] array = ... ;
     *     List<String[]> list = List.<String[]>of(array);
     * }</pre>
     *
     * This will cause the  List#of(Object) List.of(E) method
     * to be invoked instead.
     *
     * @param <E> the  List's element type
     * @param elements the elements to be contained in the list
     * @return a  List containing the specified elements
     * @throws NullPointerException if an element is  null or if the array is  null
     *
     * @since 9
     */
 //   @SafeVarargs
 //   @SuppressWarnings("varargs")
//    static <E> List<E> of(E... elements) {
//        switch (elements.length) { // implicit null check of elements
//            case 0:
//                return ImmutableCollections.emptyList();
//            case 1:
//                return new ImmutableCollections.List12<>(elements[0]);
//            case 2:
//                return new ImmutableCollections.List12<>(elements[0], elements[1]);
//            default:
//                return new ImmutableCollections.ListN<>(elements);
//        }
//    }

    /**
     * Returns an <a href="#unmodifiable">unmodifiable List</a> containing the elements of
     * the given Collection, in its iteration order. The given Collection must not be null,
     * and it must not contain any null elements. If the given Collection is subsequently
     * modified, the returned List will not reflect such modifications.
     *
     * @implNote
     * If the given Collection is an <a href="#unmodifiable">unmodifiable List</a>,
     * calling copyOf will generally not create a copy.
     *
     * @param <E> the  List's element type
     * @param coll a  Collection from which elements are drawn, must be non-null
     * @return a  List containing the elements of the given  Collection
     * @throws NullPointerException if coll is null, or if it contains any nulls
     * @since 10
     */
//    static <E> List<E> copyOf(Collection<? extends E> coll) {
//        return ImmutableCollections.listCopy(coll);
//    }
}
