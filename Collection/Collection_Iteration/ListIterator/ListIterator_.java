package Collection.Collection_Iteration.ListIterator;

import Collection.Collection_Iteration.Iterator.Iterator_;

import java.util.NoSuchElementException;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ListIterator.html

/**
    An iterator for lists that allows the programmer to:

                * traverse the list in either direction,
                * modify  the list during iteration,
                * and obtain the iterator's  current position in the list.

         A {@code ListIterator has no current element; its cursor position always  lies between the element that would
             be returned by a call to {@code previous()} and the element that would be  returned by a call to {@code next()}.
    An iterator for a list of length {@code n} has {@code n+1} possible  cursor positions, as illustrated by the carets
        ({@code ^}) below:


                       Element(0)   Element(1)   Element(2)   ... Element(n-1)
   cursor positions:  ^            ^            ^            ^                  ^

                                                        Advantages:

             * It supports all four CRUD (Create, Read, Update, Delete) operations.
             * It supports Bi-directional traversing i.e both forward and backward direction iteration.
             * Simple method names which are easy to use.

                                                          Limitations:

             * This iterator is only for list implementation classes.
             * Not a universal cursor.
             * It is not applicable for all collection API.
             * Parallel iteration of elements is not supported by list Iterator.
             * listiterator does not support the good performance of numerous elements iteration.

                                                          NOTE

            * that the {@link #remove} and {@link #set(Object)} methods are  not defined in terms of the cursor position;
                  they are defined to  operate on the last element returned by a call to {@link #next} or  {@link #previous()}.

            * This interface is a member of the "{@docRoot}/../technotes/guides/collections/index.html"> Java Collections_Class Framework
 *
 * @author  Josh Bloch
 * @see Collection_
 * @see List_
 * @see Iterator
 * @see Enumeration
 * @see List#listIterator()
 * @since   1.2
 */
public interface ListIterator_<E> extends Iterator_<E> {
    // Query Operations

    /**
     * Returns {@code true} if this list iterator has more elements when
     * traversing the list in the forward direction. (In other words,
     * returns {@code true} if {@link #next} would return an element rather
     * than throwing an exception.)
     *
     * @return {@code true} if the list iterator has more elements when
     *         traversing the list in the forward direction
     */
    boolean hasNext();

    /**
     * Returns the next element in the list and advances the cursor position.
     * This method may be called repeatedly to iterate through the list,
     * or intermixed with calls to {@link #previous} to go back and forth.
     * (Note that alternating calls to {@code next} and {@code previous}
     * will return the same element repeatedly.)
     *
     * @return the next element in the list
     * @throws NoSuchElementException if the iteration has no next element
     */
    E next();

    /**
     * Returns {@code true} if this list iterator has more elements when
     * traversing the list in the reverse direction.  (In other words,
     * returns {@code true} if {@link #previous} would return an element
     * rather than throwing an exception.)
     *
     * @return {@code true} if the list iterator has more elements when
     *         traversing the list in the reverse direction
     */
    boolean hasPrevious();

    /**
     * Returns the previous element in the list and moves the cursor
     * position backwards.  This method may be called repeatedly to
     * iterate through the list backwards, or intermixed with calls to
     * {@link #next} to go back and forth.  (Note that alternating calls
     * to {@code next} and {@code previous} will return the same
     * element repeatedly.)
     *
     * @return the previous element in the list
     * @throws NoSuchElementException if the iteration has no previous
     *         element
     */
    E previous();

    /**
     * Returns the index of the element that would be returned by a
     * subsequent call to {@link #next}. (Returns list size if the list
     * iterator is at the end of the list.)
     *
     * @return the index of the element that would be returned by a
     *         subsequent call to {@code next}, or list size if the list
     *         iterator is at the end of the list
     */
    int nextIndex();

    /**
     * Returns the index of the element that would be returned by a
     * subsequent call to {@link #previous}. (Returns -1 if the list
     * iterator is at the beginning of the list.)
     *
     * @return the index of the element that would be returned by a
     *         subsequent call to {@code previous}, or -1 if the list
     *         iterator is at the beginning of the list
     */
    int previousIndex();


    // Modification Operations

    /**
     * Removes from the list the last element that was returned by {@link
     * #next} or {@link #previous} (optional operation).  This call can
     * only be made once per call to {@code next} or {@code previous}.
     * It can be made only if {@link #add} has not been
     * called after the last call to {@code next} or {@code previous}.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *         operation is not supported by this list iterator
     * @throws IllegalStateException if neither {@code next} nor
     *         {@code previous} have been called, or {@code remove} or
     *         {@code add} have been called after the last call to
     *         {@code next} or {@code previous}
     */
    void remove();

    /**
     * Replaces the last element returned by {@link #next} or
     * {@link #previous} with the specified element (optional operation).
     * This call can be made only if neither {@link #remove} nor {@link
     * #add} have been called after the last call to {@code next} or
     * {@code previous}.
     *
     * @param e the element with which to replace the last element returned by
     *          {@code next} or {@code previous}
     * @throws UnsupportedOperationException if the {@code set} operation
     *         is not supported by this list iterator
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws IllegalArgumentException if some aspect of the specified
     *         element prevents it from being added to this list
     * @throws IllegalStateException if neither {@code next} nor
     *         {@code previous} have been called, or {@code remove} or
     *         {@code add} have been called after the last call to
     *         {@code next} or {@code previous}
     */
    void set(E e);

    /**
     * Inserts the specified element into the list (optional operation).
     * The element is inserted immediately before the element that
     * would be returned by {@link #next}, if any, and after the element
     * that would be returned by {@link #previous}, if any.  (If the
     * list contains no elements, the new element becomes the sole element
     * on the list.)  The new element is inserted before the implicit
     * cursor: a subsequent call to {@code next} would be unaffected, and a
     * subsequent call to {@code previous} would return the new element.
     * (This call increases by one the value that would be returned by a
     * call to {@code nextIndex} or {@code previousIndex}.)
     *
     * @param e the element to insert
     * @throws UnsupportedOperationException if the {@code add} method is
     *         not supported by this list iterator
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws IllegalArgumentException if some aspect of this element
     *         prevents it from being added to this list
     */
    void add(E e);
}
