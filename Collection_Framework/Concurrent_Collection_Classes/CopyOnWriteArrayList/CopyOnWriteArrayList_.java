package Collection_Framework.Concurrent_Collection_Classes.CopyOnWriteArrayList;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CopyOnWriteArrayList.html


import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import jdk.internal.misc.SharedSecrets;

/**
    ○ A thread-safe variant of  java.util.ArrayList in which all mutative operations

                   * add,

                   * set,

                   * and so on

            are implemented by making a fresh copy of the underlying array.

    ○ This is ordinarily too costly,

                  * but may be more efficient than alternatives when traversal operations vastly outnumber mutations,

                  * and is useful when you cannot or don't want to synchronize traversals,

                  * yet need to preclude interference among concurrent threads.

    ○  The "snapshot" style iterator method uses

                  * a reference to the state of the array at the point that the iterator was created.

    ○  This array never changes during the lifetime of the iterator,

                  * so interference is impossible and the iterator

                                - is guaranteed not to throw  ConcurrentModificationException.

    ○ The iterator will not reflect additions, removals, or changes to the list since the iterator was created.

    ○ Element-changing  operations on iterators themselves ( remove,  set, and  add)

                  *  are not supported.

          These methods throw  UnsupportedOperationException.

    ○ All elements are permitted, including  null.

    ○ Memory consistency effects: As with other concurrent collections,

                 * actions in a thread prior to placing an object into a CopyOnWriteArrayList

                                    MemoryVisibility

    ○ happen-before actions subsequent to the access or removal of that element from the CopyOnWriteArrayList in another thread.

    ○ This class is a member of the Java Collections Framework
 *
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this list
 */
public class CopyOnWriteArrayList_<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable {
    private static final long serialVersionUID = 8673264195747942595L;

    /**
     * The lock protecting all mutators. (We have a mild preference
     * for builtin monitors over ReentrantLock when either will do.)
     */
    final transient Object lock = new Object();

    /** The array, accessed only via getArray/setArray. */
    private transient volatile Object[] array;

    /**
     * Creates an empty list.
     */
    public CopyOnWriteArrayList_() {
        setArray(new Object[0]);
    }

    /**
     * Creates a list containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.
     *
     * @param c the collection of initially held elements
     * @throws NullPointerException if the specified collection is null
     */
    public CopyOnWriteArrayList_(Collection<? extends E> c) {
        Object[] es;
        if (c.getClass() == CopyOnWriteArrayList_.class)
            es = ((CopyOnWriteArrayList_<?>)c).getArray();
        else {
            es = c.toArray();
            if (c.getClass() != java.util.ArrayList.class)
                es = Arrays.copyOf(es, es.length, Object[].class);
        }
        setArray(es);
    }

    /**
     * Creates a list holding a copy of the given array.
     *
     * @param toCopyIn the array (a copy of this array is used as the
     *        internal array)
     * @throws NullPointerException if the specified array is null
     */
    public CopyOnWriteArrayList_(E[] toCopyIn) {
        setArray(Arrays.copyOf(toCopyIn, toCopyIn.length, Object[].class));
    }

    /**
     * static version of indexOf, to allow repeated calls without
     * needing to re-acquire array each time.
     * @param o element to search for
     * @param es the array
     * @param from first index to search
     * @param to one past last index to search
     * @return index of element, or -1 if absent
     */
    private static int indexOfRange(Object o, Object[] es, int from, int to) {
        if (o == null) {
            for (int i = from; i < to; i++)
                if (es[i] == null)
                    return i;
        } else {
            for (int i = from; i < to; i++)
                if (o.equals(es[i]))
                    return i;
        }
        return -1;
    }

    /**
     * static version of lastIndexOf.
     * @param o element to search for
     * @param es the array
     * @param from index of first element of range, last element to search
     * @param to one past last element of range, first element to search
     * @return index of element, or -1 if absent
     */
    private static int lastIndexOfRange(Object o, Object[] es, int from, int to) {
        if (o == null) {
            for (int i = to - 1; i >= from; i--)
                if (es[i] == null)
                    return i;
        } else {
            for (int i = to - 1; i >= from; i--)
                if (o.equals(es[i]))
                    return i;
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    static <E> E elementAt(Object[] a, int index) {
        return (E) a[index];
    }

    static String outOfBounds(int index, int size) {
        return "Index: " + index + ", Size: " + size;
    }

    private static long[] nBits(int n) {
        return new long[((n - 1) >> 6) + 1];
    }

    private static void setBit(long[] bits, int i) {
        bits[i >> 6] |= 1L << i;
    }

    private static boolean isClear(long[] bits, int i) {
        return (bits[i >> 6] & (1L << i)) == 0;
    }

    private static int hashCodeOfRange(Object[] es, int from, int to) {
        int hashCode = 1;
        for (int i = from; i < to; i++) {
            Object x = es[i];
            hashCode = 31 * hashCode + (x == null ? 0 : x.hashCode());
        }
        return hashCode;
    }

    /**
     * Gets the array.  Non-private so as to also be accessible
     * from CopyOnWriteArraySet class.
     */
    final Object[] getArray() {
        return array;
    }

    /**
     * Sets the array.
     */
    final void setArray(Object[] a) {
        array = a;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return getArray().length;
    }

    /**
     * Returns  true if this list contains no elements.
     *
     * @return  true if this list contains no elements
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns  true if this list contains the specified element.
     * More formally, returns  true if and only if this list contains
     * at least one element  e such that  Objects.equals(o, e).
     *
     * @param o element whose presence in this list is to be tested
     * @return  true if this list contains the specified element
     */
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        Object[] es = getArray();
        return indexOfRange(o, es, 0, es.length);
    }

    // Positional Access Operations

    /**
     * Returns the index of the first occurrence of the specified element in
     * this list, searching forwards from  index, or returns -1 if
     * the element is not found.
     * More formally, returns the lowest index  i such that
     *  i >= index && Objects.equals(get(i), e),
     * or -1 if there is no such index.
     *
     * @param e element to search for
     * @param index index to start searching from
     * @return the index of the first occurrence of the element in
     *         this list at position  index or later in the list;
     *          -1 if the element is not found.
     * @throws IndexOutOfBoundsException if the specified index is negative
     */
    public int indexOf(E e, int index) {
        Object[] es = getArray();
        return indexOfRange(e, es, index, es.length);
    }

    /**
     *
     */
    public int lastIndexOf(Object o) {
        Object[] es = getArray();
        return lastIndexOfRange(o, es, 0, es.length);
    }

    /**
     * Returns the index of the last occurrence of the specified element in
     * this list, searching backwards from  index, or returns -1 if
     * the element is not found.
     * More formally, returns the highest index  i} such that
     *  i <= index && Objects.equals(get(i), e)},
     * or -1 if there is no such index.
     *
     * @param e element to search for
     * @param index index to start searching backwards from
     * @return the index of the last occurrence of the element at position
     *         less than or equal to  index} in this list;
     *         -1 if the element is not found.
     * @throws IndexOutOfBoundsException if the specified index is greater
     *         than or equal to the current size of this list
     */
    public int lastIndexOf(E e, int index) {
        Object[] es = getArray();
        return lastIndexOfRange(e, es, 0, index + 1);
    }

    /**
     * Returns a shallow copy of this list.  (The elements themselves
     * are not copied.)
     *
     * @return a clone of this list
     */
    public Object clone() {
        try {
            @SuppressWarnings("unchecked")
            CopyOnWriteArrayList_<E> clone =
                    (CopyOnWriteArrayList_<E>) super.clone();
            clone.resetLock();
            // Unlike in readObject, here we cannot visibility-piggyback on the
            // volatile write in setArray().
            VarHandle.releaseFence();
            return clone;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError();
        }
    }

    /**
     * Returns an array containing all of the elements in this list
     * in proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all the elements in this list
     */
    public Object[] toArray() {
        return getArray().clone();
    }

    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the list fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this list.
     *
     * <p>If this list fits in the specified array with room to spare
     * (i.e., the array has more elements than this list), the element in
     * the array immediately following the end of the list is set to
     *  null}.  (This is useful in determining the length of this
     * list <i>only</i> if the caller knows that this list does not contain
     * any null elements.)
     *
     * <p>Like the  #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>Suppose  x} is a list known to contain only strings.
     * The following code can be used to dump the list into a newly
     * allocated array of  String}:
     *
     * <pre>  String[] y = x.toArray(new String[0]);}</pre>
     *
     * Note that  toArray(new Object[0])} is identical in function to
     *  toArray()}.
     *
     * @param a the array into which the elements of the list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing all the elements in this list
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this list
     * @throws NullPointerException if the specified array is null
     */
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        Object[] es = getArray();
        int len = es.length;
        if (a.length < len)
            return (T[]) Arrays.copyOf(es, len, a.getClass());
        else {
            System.arraycopy(es, 0, a, 0, len);
            if (a.length > len)
                a[len] = null;
            return a;
        }
    }

    /**
     *
     *
     * @throws IndexOutOfBoundsException
     */
    public E get(int index) {
        return elementAt(getArray(), index);
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @throws IndexOutOfBoundsException
     */
    public E set(int index, E element) {
        synchronized (lock) {
            Object[] es = getArray();
            E oldValue = elementAt(es, index);

            if (oldValue != element) {
                es = es.clone();
                es[index] = element;
            }
            // Ensure volatile write semantics even when oldvalue == element
            setArray(es);
            return oldValue;
        }
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return  true} (as specified by  Collection#add})
     */
    public boolean add(E e) {
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            es = Arrays.copyOf(es, len + 1);
            es[len] = e;
            setArray(es);
            return true;
        }
    }

    /**
     * Inserts the specified element at the specified position in this
     * list. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     *
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, E element) {
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            if (index > len || index < 0)
                throw new IndexOutOfBoundsException(outOfBounds(index, len));
            Object[] newElements;
            int numMoved = len - index;
            if (numMoved == 0)
                newElements = Arrays.copyOf(es, len + 1);
            else {
                newElements = new Object[len + 1];
                System.arraycopy(es, 0, newElements, 0, index);
                System.arraycopy(es, index, newElements, index + 1,
                        numMoved);
            }
            newElements[index] = element;
            setArray(newElements);
        }
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).  Returns the element that was removed from the list.
     *
     * @throws IndexOutOfBoundsException
     */
    public E remove(int index) {
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            E oldValue = elementAt(es, index);
            int numMoved = len - index - 1;
            Object[] newElements;
            if (numMoved == 0)
                newElements = Arrays.copyOf(es, len - 1);
            else {
                newElements = new Object[len - 1];
                System.arraycopy(es, 0, newElements, 0, index);
                System.arraycopy(es, index + 1, newElements, index,
                        numMoved);
            }
            setArray(newElements);
            return oldValue;
        }
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index
     *  i} such that  Objects.equals(o, get(i))}
     * (if such an element exists).  Returns  true} if this list
     * contained the specified element (or equivalently, if this list
     * changed as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return  true} if this list contained the specified element
     */
    public boolean remove(Object o) {
        Object[] snapshot = getArray();
        int index = indexOfRange(o, snapshot, 0, snapshot.length);
        return index >= 0 && remove(o, snapshot, index);
    }

    /**
     * A version of remove(Object) using the strong hint that given
     * recent snapshot contains o at the given index.
     */
    private boolean remove(Object o, Object[] snapshot, int index) {
        synchronized (lock) {
            Object[] current = getArray();
            int len = current.length;
            if (snapshot != current) findIndex: {
                int prefix = Math.min(index, len);
                for (int i = 0; i < prefix; i++) {
                    if (current[i] != snapshot[i]
                            && Objects.equals(o, current[i])) {
                        index = i;
                        break findIndex;
                    }
                }
                if (index >= len)
                    return false;
                if (current[index] == o)
                    break findIndex;
                index = indexOfRange(o, current, index, len);
                if (index < 0)
                    return false;
            }
            Object[] newElements = new Object[len - 1];
            System.arraycopy(current, 0, newElements, 0, index);
            System.arraycopy(current, index + 1,
                    newElements, index,
                    len - index - 1);
            setArray(newElements);
            return true;
        }
    }

    /**
     * Removes from this list all of the elements whose index is between
     *  fromIndex}, inclusive, and  toIndex}, exclusive.
     * Shifts any succeeding elements to the left (reduces their index).
     * This call shortens the list by  (toIndex - fromIndex)} elements.
     * (If  toIndex==fromIndex}, this operation has no effect.)
     *
     * @param fromIndex index of first element to be removed
     * @param toIndex index after last element to be removed
     * @throws IndexOutOfBoundsException if fromIndex or toIndex out of range
     *         ( fromIndex < 0 || toIndex > size() || toIndex < fromIndex})
     */
    void removeRange(int fromIndex, int toIndex) {
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;

            if (fromIndex < 0 || toIndex > len || toIndex < fromIndex)
                throw new IndexOutOfBoundsException();
            int newlen = len - (toIndex - fromIndex);
            int numMoved = len - toIndex;
            if (numMoved == 0)
                setArray(Arrays.copyOf(es, newlen));
            else {
                Object[] newElements = new Object[newlen];
                System.arraycopy(es, 0, newElements, 0, fromIndex);
                System.arraycopy(es, toIndex, newElements,
                        fromIndex, numMoved);
                setArray(newElements);
            }
        }
    }

    /**
     * Appends the element, if not present.
     *
     * @param e element to be added to this list, if absent
     * @return  true} if the element was added
     */
    public boolean addIfAbsent(E e) {
        Object[] snapshot = getArray();
        return indexOfRange(e, snapshot, 0, snapshot.length) < 0
                && addIfAbsent(e, snapshot);
    }

    /**
     * A version of addIfAbsent using the strong hint that given
     * recent snapshot does not contain e.
     */
    private boolean addIfAbsent(E e, Object[] snapshot) {
        synchronized (lock) {
            Object[] current = getArray();
            int len = current.length;
            if (snapshot != current) {
                // Optimize for lost race to another addXXX operation
                int common = Math.min(snapshot.length, len);
                for (int i = 0; i < common; i++)
                    if (current[i] != snapshot[i]
                            && Objects.equals(e, current[i]))
                        return false;
                if (indexOfRange(e, current, common, len) >= 0)
                    return false;
            }
            Object[] newElements = Arrays.copyOf(current, len + 1);
            newElements[len] = e;
            setArray(newElements);
            return true;
        }
    }

    /**
     * Returns  true} if this list contains all of the elements of the
     * specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return  true} if this list contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection is null
     * @see #contains(Object)
     */
    public boolean containsAll(Collection<?> c) {
        Object[] es = getArray();
        int len = es.length;
        for (Object e : c) {
            if (indexOfRange(e, es, 0, len) < 0)
                return false;
        }
        return true;
    }

    /**
     * Removes from this list all of its elements that are contained in
     * the specified collection. This is a particularly expensive operation
     * in this class because of the need for an internal temporary array.
     *
     * @param c collection containing elements to be removed from this list
     * @return  true} if this list changed as a result of the call
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     * (<a href="{@docRoot}/java.base/java/util/Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     * (<a href="{@docRoot}/java.base/java/util/Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     */
    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        return bulkRemove(e -> c.contains(e));
    }

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection.  In other words, removes from this list all of
     * its elements that are not contained in the specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return  true} if this list changed as a result of the call
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     * (<a href="{@docRoot}/java.base/java/util/Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     * (<a href="{@docRoot}/java.base/java/util/Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     */
    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        return bulkRemove(e -> !c.contains(e));
    }

    /**
     * Appends all of the elements in the specified collection that
     * are not already contained in this list, to the end of
     * this list, in the order that they are returned by the
     * specified collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return the number of elements added
     * @throws NullPointerException if the specified collection is null
     * @see #addIfAbsent(Object)
     */
    public int addAllAbsent(Collection<? extends E> c) {
        Object[] cs = c.toArray();
        if (c.getClass() != ArrayList.class) {
            cs = cs.clone();
        }
        if (cs.length == 0)
            return 0;
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            int added = 0;
            // uniquify and compact elements in cs
            for (int i = 0; i < cs.length; ++i) {
                Object e = cs[i];
                if (indexOfRange(e, es, 0, len) < 0 &&
                        indexOfRange(e, cs, 0, added) < 0)
                    cs[added++] = e;
            }
            if (added > 0) {
                Object[] newElements = Arrays.copyOf(es, len + added);
                System.arraycopy(cs, 0, newElements, len, added);
                setArray(newElements);
            }
            return added;
        }
    }

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    public void clear() {
        synchronized (lock) {
            setArray(new Object[0]);
        }
    }

    // A tiny bit set implementation

    /**
     * Appends all of the elements in the specified collection to the end
     * of this list, in the order that they are returned by the specified
     * collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return  true} if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     * @see #add(Object)
     */
    public boolean addAll(Collection<? extends E> c) {
        Object[] cs = (c.getClass() == CopyOnWriteArrayList_.class) ?
                ((CopyOnWriteArrayList_<?>)c).getArray() : c.toArray();
        if (cs.length == 0)
            return false;
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            Object[] newElements;
            if (len == 0 && (c.getClass() == CopyOnWriteArrayList_.class ||
                    c.getClass() == ArrayList.class)) {
                newElements = cs;
            } else {
                newElements = Arrays.copyOf(es, len + cs.length);
                System.arraycopy(cs, 0, newElements, len, cs.length);
            }
            setArray(newElements);
            return true;
        }
    }

    /**
     * Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).  The new elements will appear
     * in this list in the order that they are returned by the
     * specified collection's iterator.
     *
     * @param index index at which to insert the first element
     *        from the specified collection
     * @param c collection containing elements to be added to this list
     * @return  true} if this list changed as a result of the call
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException if the specified collection is null
     * @see #add(int,Object)
     */
    public boolean addAll(int index, Collection<? extends E> c) {
        Object[] cs = c.toArray();
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            if (index > len || index < 0)
                throw new IndexOutOfBoundsException(outOfBounds(index, len));
            if (cs.length == 0)
                return false;
            int numMoved = len - index;
            Object[] newElements;
            if (numMoved == 0)
                newElements = Arrays.copyOf(es, len + cs.length);
            else {
                newElements = new Object[len + cs.length];
                System.arraycopy(es, 0, newElements, 0, index);
                System.arraycopy(es, index,
                        newElements, index + cs.length,
                        numMoved);
            }
            System.arraycopy(cs, 0, newElements, index, cs.length);
            setArray(newElements);
            return true;
        }
    }

    /**
     * @throws NullPointerException
     */
    public void forEach(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        for (Object x : getArray()) {
            @SuppressWarnings("unchecked") E e = (E) x;
            action.accept(e);
        }
    }

    /**
     * @throws NullPointerException
     */
    public boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        return bulkRemove(filter);
    }

    private boolean bulkRemove(Predicate<? super E> filter) {
        synchronized (lock) {
            return bulkRemove(filter, 0, getArray().length);
        }
    }

    boolean bulkRemove(Predicate<? super E> filter, int i, int end) {
        // assert Thread.holdsLock(lock);
        final Object[] es = getArray();
        // Optimize for initial run of survivors
        for (; i < end && !filter.test(elementAt(es, i)); i++)
            ;
        if (i < end) {
            final int beg = i;
            final long[] deathRow = nBits(end - beg);
            int deleted = 1;
            deathRow[0] = 1L;   // set bit 0
            for (i = beg + 1; i < end; i++)
                if (filter.test(elementAt(es, i))) {
                    setBit(deathRow, i - beg);
                    deleted++;
                }
            // Did filter reentrantly modify the list?
            if (es != getArray())
                throw new ConcurrentModificationException();
            final Object[] newElts = Arrays.copyOf(es, es.length - deleted);
            int w = beg;
            for (i = beg; i < end; i++)
                if (isClear(deathRow, i - beg))
                    newElts[w++] = es[i];
            System.arraycopy(es, i, newElts, w, es.length - i);
            setArray(newElts);
            return true;
        } else {
            if (es != getArray())
                throw new ConcurrentModificationException();
            return false;
        }
    }

    public void replaceAll(UnaryOperator<E> operator) {
        synchronized (lock) {
            replaceAllRange(operator, 0, getArray().length);
        }
    }

    void replaceAllRange(UnaryOperator<E> operator, int i, int end) {
        // assert Thread.holdsLock(lock);
        Objects.requireNonNull(operator);
        final Object[] es = getArray().clone();
        for (; i < end; i++)
            es[i] = operator.apply(elementAt(es, i));
        setArray(es);
    }

    public void sort(Comparator<? super E> c) {
        synchronized (lock) {
            sortRange(c, 0, getArray().length);
        }
    }

    @SuppressWarnings("unchecked")
    void sortRange(Comparator<? super E> c, int i, int end) {
        // assert Thread.holdsLock(lock);
        final Object[] es = getArray().clone();
        Arrays.sort(es, i, end, (Comparator<Object>)c);
        setArray(es);
    }

    /**
     * Saves this list to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData The length of the array backing the list is emitted
     *               (int), followed by all of its elements (each an Object)
     *               in the proper order.
     */
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {

        s.defaultWriteObject();

        Object[] es = getArray();
        // Write out array length
        s.writeInt(es.length);

        // Write out all elements in the proper order.
        for (Object element : es)
            s.writeObject(element);
    }

    /**
     * Reconstitutes this list from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {

        s.defaultReadObject();

        // bind to new lock
        resetLock();

        // Read in array length and allocate array
        int len = s.readInt();
        SharedSecrets.getJavaObjectInputStreamAccess().checkArray(s, Object[].class, len);
        Object[] es = new Object[len];

        // Read in all elements in the proper order.
        for (int i = 0; i < len; i++)
            es[i] = s.readObject();
        setArray(es);
    }

    /**
     * Returns a string representation of this list.  The string
     * representation consists of the string representations of the list's
     * elements in the order they are returned by its iterator, enclosed in
     * square brackets ( "[]"}).  Adjacent elements are separated by
     * the characters  ", "} (comma and space).  Elements are
     * converted to strings as by  String#valueOf(Object)}.
     *
     * @return a string representation of this list
     */
    public String toString() {
        return Arrays.toString(getArray());
    }

    /**
     * Compares the specified object with this list for equality.
     * Returns  true} if the specified object is the same object
     * as this object, or if it is also a  List} and the sequence
     * of elements returned by an plain List#iterator() iterator}
     * over the specified list is the same as the sequence returned by
     * an iterator over this list.  The two sequences are considered to
     * be the same if they have the same length and corresponding
     * elements at the same position in the sequence are <em>equal</em>.
     * Two elements  e1} and  e2} are considered
     * <em>equal</em> if  Objects.equals(e1, e2)}.
     *
     * @param o the object to be compared for equality with this list
     * @return  true} if the specified object is equal to this list
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof List))
            return false;

        List<?> list = (List<?>)o;
        Iterator<?> it = list.iterator();
        for (Object element : getArray())
            if (!it.hasNext() || !Objects.equals(element, it.next()))
                return false;
        return !it.hasNext();
    }

    /**
     * Returns the hash code value for this list.
     *
     * <p>This implementation uses the definition in  List#hashCode}.
     *
     * @return the hash code value for this list
     */
    public int hashCode() {
        Object[] es = getArray();
        return hashCodeOfRange(es, 0, es.length);
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     *  remove} method.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    public Iterator<E> iterator() {
        return new CopyOnWriteArrayList_.COWIterator<E>(getArray(), 0);
    }

    /**
     * 
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     *  remove},  set} or  add} methods.
     */
    public ListIterator<E> listIterator() {
        return new CopyOnWriteArrayList_.COWIterator<E>(getArray(), 0);
    }

    /**
     * 
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     *  remove},  set} or  add} methods.
     *
     * @throws IndexOutOfBoundsException 
     */
    public ListIterator<E> listIterator(int index) {
        Object[] es = getArray();
        int len = es.length;
        if (index < 0 || index > len)
            throw new IndexOutOfBoundsException(outOfBounds(index, len));

        return new CopyOnWriteArrayList_.COWIterator<E>(es, index);
    }

    /**
     * Returns a  Spliterator} over the elements in this list.
     *
     * <p>The  Spliterator} reports  Spliterator#IMMUTABLE},
     *  Spliterator#ORDERED},  Spliterator#SIZED}, and
     *  Spliterator#SUBSIZED}.
     *
     * <p>The spliterator provides a snapshot of the state of the list
     * when the spliterator was constructed. No synchronization is needed while
     * operating on the spliterator.
     *
     * @return a  Spliterator} over the elements in this list
     * @since 1.8
     */
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator
                (getArray(), Spliterator.IMMUTABLE | Spliterator.ORDERED);
    }

    /**
     * Returns a view of the portion of this list between
     *  fromIndex}, inclusive, and  toIndex}, exclusive.
     * The returned list is backed by this list, so changes in the
     * returned list are reflected in this list.
     *
     * <p>The semantics of the list returned by this method become
     * undefined if the backing list (i.e., this list) is modified in
     * any way other than via the returned list.
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException
     */
    public List<E> subList(int fromIndex, int toIndex) {
        synchronized (lock) {
            Object[] es = getArray();
            int len = es.length;
            int size = toIndex - fromIndex;
            if (fromIndex < 0 || toIndex > len || size < 0)
                throw new IndexOutOfBoundsException();
            return new CopyOnWriteArrayList_.COWSubList(es, fromIndex, size);
        }
    }

    /** Initializes the lock; for use when deserializing or cloning. */
    private void resetLock() {
        Field lockField = java.security.AccessController.doPrivileged(
                (java.security.PrivilegedAction<Field>) () -> {
                    try {
                        Field f = CopyOnWriteArrayList_.class
                                .getDeclaredField("lock");
                        f.setAccessible(true);
                        return f;
                    } catch (ReflectiveOperationException e) {
                        throw new Error(e);
                    }});
        try {
            lockField.set(this, new Object());
        } catch (IllegalAccessException e) {
            throw new Error(e);
        }
    }

    static final class COWIterator<E> implements ListIterator<E> {
        /** Snapshot of the array */
        private final Object[] snapshot;
        /** Index of element to be returned by subsequent call to next.  */
        private int cursor;

        COWIterator(Object[] es, int initialCursor) {
            cursor = initialCursor;
            snapshot = es;
        }

        public boolean hasNext() {
            return cursor < snapshot.length;
        }

        public boolean hasPrevious() {
            return cursor > 0;
        }

        @SuppressWarnings("unchecked")
        public E next() {
            if (! hasNext())
                throw new NoSuchElementException();
            return (E) snapshot[cursor++];
        }

        @SuppressWarnings("unchecked")
        public E previous() {
            if (! hasPrevious())
                throw new NoSuchElementException();
            return (E) snapshot[--cursor];
        }

        public int nextIndex() {
            return cursor;
        }

        public int previousIndex() {
            return cursor - 1;
        }

        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always;  remove}
         *         is not supported by this iterator.
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always;  set}
         *         is not supported by this iterator.
         */
        public void set(E e) {
            throw new UnsupportedOperationException();
        }

        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always;  add}
         *         is not supported by this iterator.
         */
        public void add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            final int size = snapshot.length;
            int i = cursor;
            cursor = size;
            for (; i < size; i++)
                action.accept(elementAt(snapshot, i));
        }
    }

    private static class COWSubListIterator<E> implements ListIterator<E> {
        private final ListIterator<E> it;
        private final int offset;
        private final int size;

        COWSubListIterator(List<E> l, int index, int offset, int size) {
            this.offset = offset;
            this.size = size;
            it = l.listIterator(index + offset);
        }

        public boolean hasNext() {
            return nextIndex() < size;
        }

        public E next() {
            if (hasNext())
                return it.next();
            else
                throw new NoSuchElementException();
        }

        public boolean hasPrevious() {
            return previousIndex() >= 0;
        }

        public E previous() {
            if (hasPrevious())
                return it.previous();
            else
                throw new NoSuchElementException();
        }

        public int nextIndex() {
            return it.nextIndex() - offset;
        }

        public int previousIndex() {
            return it.previousIndex() - offset;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(E e) {
            throw new UnsupportedOperationException();
        }

        public void add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override
        @SuppressWarnings("unchecked")
        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            while (hasNext()) {
                action.accept(it.next());
            }
        }
    }

    /**
     * Sublist for CopyOnWriteArrayList.
     */
    private class COWSubList implements List<E>, RandomAccess {
        private final int offset;
        private int size;
        private Object[] expectedArray;

        COWSubList(Object[] es, int offset, int size) {
            // assert Thread.holdsLock(lock);
            expectedArray = es;
            this.offset = offset;
            this.size = size;
        }

        private void checkForComodification() {
            // assert Thread.holdsLock(lock);
            if (getArray() != expectedArray)
                throw new ConcurrentModificationException();
        }

        private Object[] getArrayChecked() {
            // assert Thread.holdsLock(lock);
            Object[] a = getArray();
            if (a != expectedArray)
                throw new ConcurrentModificationException();
            return a;
        }

        private void rangeCheck(int index) {
            // assert Thread.holdsLock(lock);
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException(outOfBounds(index, size));
        }

        private void rangeCheckForAdd(int index) {
            // assert Thread.holdsLock(lock);
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException(outOfBounds(index, size));
        }

        public Object[] toArray() {
            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }
            return Arrays.copyOfRange(es, offset, offset + size);
        }

        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }
            if (a.length < size)
                return (T[]) Arrays.copyOfRange(
                        es, offset, offset + size, a.getClass());
            else {
                System.arraycopy(es, offset, a, 0, size);
                if (a.length > size)
                    a[size] = null;
                return a;
            }
        }

        public int indexOf(Object o) {
            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }
            int i = indexOfRange(o, es, offset, offset + size);
            return (i == -1) ? -1 : i - offset;
        }

        public int lastIndexOf(Object o) {
            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }
            int i = lastIndexOfRange(o, es, offset, offset + size);
            return (i == -1) ? -1 : i - offset;
        }

        public boolean contains(Object o) {
            return indexOf(o) >= 0;
        }

        public boolean containsAll(Collection<?> c) {
            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }
            for (Object o : c)
                if (indexOfRange(o, es, offset, offset + size) < 0)
                    return false;
            return true;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public String toString() {
            return Arrays.toString(toArray());
        }

        public int hashCode() {
            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }
            return hashCodeOfRange(es, offset, offset + size);
        }

        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof List))
                return false;
            Iterator<?> it = ((List<?>)o).iterator();

            final Object[] es;
            final int offset;
            final int size;
            synchronized (lock) {
                es = getArrayChecked();
                offset = this.offset;
                size = this.size;
            }

            for (int i = offset, end = offset + size; i < end; i++)
                if (!it.hasNext() || !Objects.equals(es[i], it.next()))
                    return false;
            return !it.hasNext();
        }

        public E set(int index, E element) {
            synchronized (lock) {
                rangeCheck(index);
                checkForComodification();
                E x = CopyOnWriteArrayList_.this.set(offset + index, element);
                expectedArray = getArray();
                return x;
            }
        }

        public E get(int index) {
            synchronized (lock) {
                rangeCheck(index);
                checkForComodification();
                return CopyOnWriteArrayList_.this.get(offset + index);
            }
        }

        public int size() {
            synchronized (lock) {
                checkForComodification();
                return size;
            }
        }

        public boolean add(E element) {
            synchronized (lock) {
                checkForComodification();
                CopyOnWriteArrayList_.this.add(offset + size, element);
                expectedArray = getArray();
                size++;
            }
            return true;
        }

        public void add(int index, E element) {
            synchronized (lock) {
                checkForComodification();
                rangeCheckForAdd(index);
                CopyOnWriteArrayList_.this.add(offset + index, element);
                expectedArray = getArray();
                size++;
            }
        }

        public boolean addAll(Collection<? extends E> c) {
            synchronized (lock) {
                final Object[] oldArray = getArrayChecked();
                boolean modified =
                        CopyOnWriteArrayList_.this.addAll(offset + size, c);
                size += (expectedArray = getArray()).length - oldArray.length;
                return modified;
            }
        }

        public boolean addAll(int index, Collection<? extends E> c) {
            synchronized (lock) {
                rangeCheckForAdd(index);
                final Object[] oldArray = getArrayChecked();
                boolean modified =
                        CopyOnWriteArrayList_.this.addAll(offset + index, c);
                size += (expectedArray = getArray()).length - oldArray.length;
                return modified;
            }
        }

        public void clear() {
            synchronized (lock) {
                checkForComodification();
                removeRange(offset, offset + size);
                expectedArray = getArray();
                size = 0;
            }
        }

        public E remove(int index) {
            synchronized (lock) {
                rangeCheck(index);
                checkForComodification();
                E result = CopyOnWriteArrayList_.this.remove(offset + index);
                expectedArray = getArray();
                size--;
                return result;
            }
        }

        public boolean remove(Object o) {
            synchronized (lock) {
                checkForComodification();
                int index = indexOf(o);
                if (index == -1)
                    return false;
                remove(index);
                return true;
            }
        }

        public Iterator<E> iterator() {
            return listIterator(0);
        }

        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public ListIterator<E> listIterator(int index) {
            synchronized (lock) {
                checkForComodification();
                rangeCheckForAdd(index);
                return new CopyOnWriteArrayList_.COWSubListIterator<E>(
                        CopyOnWriteArrayList_.this, index, offset, size);
            }
        }

        public List<E> subList(int fromIndex, int toIndex) {
            synchronized (lock) {
                checkForComodification();
                if (fromIndex < 0 || toIndex > size || fromIndex > toIndex)
                    throw new IndexOutOfBoundsException();
                return new CopyOnWriteArrayList_.COWSubList(expectedArray, fromIndex + offset, toIndex - fromIndex);
            }
        }

        public void forEach(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            int i, end; final Object[] es;
            synchronized (lock) {
                es = getArrayChecked();
                i = offset;
                end = i + size;
            }
            for (; i < end; i++)
                action.accept(elementAt(es, i));
        }

        public void replaceAll(UnaryOperator<E> operator) {
            synchronized (lock) {
                checkForComodification();
                replaceAllRange(operator, offset, offset + size);
                expectedArray = getArray();
            }
        }

        public void sort(Comparator<? super E> c) {
            synchronized (lock) {
                checkForComodification();
                sortRange(c, offset, offset + size);
                expectedArray = getArray();
            }
        }

        public boolean removeAll(Collection<?> c) {
            Objects.requireNonNull(c);
            return bulkRemove(e -> c.contains(e));
        }

        public boolean retainAll(Collection<?> c) {
            Objects.requireNonNull(c);
            return bulkRemove(e -> !c.contains(e));
        }

        public boolean removeIf(Predicate<? super E> filter) {
            Objects.requireNonNull(filter);
            return bulkRemove(filter);
        }

        private boolean bulkRemove(Predicate<? super E> filter) {
            synchronized (lock) {
                final Object[] oldArray = getArrayChecked();
                boolean modified = CopyOnWriteArrayList_.this.bulkRemove(
                        filter, offset, offset + size);
                size += (expectedArray = getArray()).length - oldArray.length;
                return modified;
            }
        }

        public Spliterator<E> spliterator() {
            synchronized (lock) {
                return Spliterators.spliterator(
                        getArrayChecked(), offset, offset + size,
                        Spliterator.IMMUTABLE | Spliterator.ORDERED);
            }
        }

    }
}