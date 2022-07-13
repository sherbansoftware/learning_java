package Collection_Framework.Collection_Interfaces.NavigableSet;


import java.util.Iterator;
import java.util.SortedSet;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/NavigableSet.html



/**                                                     NavigableSet

    ○ A SortedSet

                   * extended with NAVIGATION methods reporting  closest matches for given search targets.

    ○ Methods

                  * lower ,

                  * floor ,

                  * ceiling ,

                  * and  higher

          return elements  respectively

                  * less than,

                  * less than or equal,

                  * greater than or equal,

                  * and greater than a given element,

          returning null if there is no such element.

     ○ A NavigableSet  may be accessed and traversed in either

                  * ascending or descending order.

    ○ The descendingSet  method returns

                  * a view of the set with the senses of all relational and directional methods inverted.

    ○ The performance of  ascending operations and views is likely to be faster than that of  descending ones.This interface
        additionally defines methods     pollFirst  and    pollLast  that return and remove the lowest and highest
        element, if one exists, else returning    null .Methods    subSet ,    headSet , and    tailSet 
        differ from the like-named    SortedSet  methods in accepting additional arguments describing whether lower
        and upper bounds are inclusive versus exclusive.
    Subsets of any    NavigableSet  must implement the    NavigableSet  interface.

    ○ The return values of navigation methods may be ambiguous in implementations that permit    null  elements.However,
        even in this case the result can be disambiguated by checking    contains(null) .To avoid such issues,implementations
        of this interface are encouraged to not permit insertion of     null  elements. (Note that sorted sets of  
        Comparable  elements intrinsically do not permit    null .)

    ○ Methods:

                   *  #subSet(Object, Object) subSet(E, E) ,

                   *  #headSet(Object) headSet(E) ,

                   *  #tailSet(Object) tailSet(E)

    ○ are specified to return  SortedSet  to allow existing implementations of SortedSet

                   * to be compatibly retrofitted to implement  NavigableSet ,

                    * but extensions and implementations of this interface are encouraged to override
                          these methods to return NavigableSet .


                                                    NOTE


    ○ subinterface of SortedSet

    ○ Contains methods related to Navigation functionality

    ○  Both SortedSet and NavigableSet have same implementation class as TreeSet


 * @author Doug Lea
 * @author Josh Bloch
 * @param <E> the type of elements maintained by this set
 * @since 1.6
 */
public interface NavigableSet_<E> extends SortedSet<E>  {
    /**
     * Returns the greatest element in this set strictly less than the
     * given element, or    null  if there is no such element.
     *
     * @param e the value to match
     * @return the greatest element less than    e ,
     *         or    null  if there is no such element
     * @throws ClassCastException if the specified element cannot be
     *         compared with the elements currently in the set
     * @throws NullPointerException if the specified element is null
     *         and this set does not permit null elements
     */
    E lower(E e);

    /**
     * Returns the greatest element in this set less than or equal to
     * the given element, or    null  if there is no such element.
     *
     * @param e the value to match
     * @return the greatest element less than or equal to    e ,
     *         or    null  if there is no such element
     * @throws ClassCastException if the specified element cannot be
     *         compared with the elements currently in the set
     * @throws NullPointerException if the specified element is null
     *         and this set does not permit null elements
     */
    E floor(E e);

    /**
     * Returns the least element in this set greater than or equal to
     * the given element, or    null  if there is no such element.
     *
     * @param e the value to match
     * @return the least element greater than or equal to    e ,
     *         or    null  if there is no such element
     * @throws ClassCastException if the specified element cannot be
     *         compared with the elements currently in the set
     * @throws NullPointerException if the specified element is null
     *         and this set does not permit null elements
     */
    E ceiling(E e);

    /**
     * Returns the least element in this set strictly greater than the
     * given element, or    null  if there is no such element.
     *
     * @param e the value to match
     * @return the least element greater than    e ,
     *         or    null  if there is no such element
     * @throws ClassCastException if the specified element cannot be
     *         compared with the elements currently in the set
     * @throws NullPointerException if the specified element is null
     *         and this set does not permit null elements
     */
    E higher(E e);

    /**
     * Retrieves and removes the first (lowest) element,
     * or returns    null  if this set is empty.
     *
     * @return the first element, or  null  if this set is empty
     */
    E pollFirst();

    /**
     * Retrieves and removes the last (highest) element,
     * or returns    null  if this set is empty.
     *
     * @return the last element, or    null  if this set is empty
     */
    E pollLast();

    /**
     * Returns an iterator over the elements in this set, in ascending order.
     *
     * @return an iterator over the elements in this set, in ascending order
     */
    Iterator<E> iterator();

    /**
     * Returns a reverse order view of the elements contained in this set.
     * The descending set is backed by this set, so changes to the set are
     * reflected in the descending set, and vice-versa.  If either set is
     * modified while an iteration over either set is in progress (except
     * through the iterator's own    remove  operation), the results of
     * the iteration are undefined.
     *
     * <p>The returned set has an ordering equivalent to
     * <tt>  Collections#reverseOrder(Comparator) Collections_.reverseOrder (comparator())</tt>.
     * The expression    s.descendingSet().descendingSet()  returns a
     * view of    s  essentially equivalent to    s .
     *
     * @return a reverse order view of this set
     */
    NavigableSet_<E> descendingSet();

    /**
     * Returns an iterator over the elements in this set, in descending order.
     * Equivalent in effect to    descendingSet().iterator() .
     *
     * @return an iterator over the elements in this set, in descending order
     */
    Iterator<E> descendingIterator();

    /**
     * Returns a view of the portion of this set whose elements range from
     *    fromElement  to    toElement .  If    fromElement  and
     *    toElement  are equal, the returned set is empty unless   
     * fromInclusive  and    toInclusive  are both true.  The returned set
     * is backed by this set, so changes in the returned set are reflected in
     * this set, and vice-versa.  The returned set supports all optional set
     * operations that this set supports.
     *
     * <p>The returned set will throw an    IllegalArgumentException 
     * on an attempt to insert an element outside its range.
     *
     * @param fromElement low endpoint of the returned set
     * @param fromInclusive    true  if the low endpoint
     *        is to be included in the returned view
     * @param toElement high endpoint of the returned set
     * @param toInclusive    true  if the high endpoint
     *        is to be included in the returned view
     * @return a view of the portion of this set whose elements range from
     *            fromElement , inclusive, to    toElement , exclusive
     * @throws ClassCastException if    fromElement  and
     *            toElement  cannot be compared to one another using this
     *         set's comparator (or, if the set has no comparator, using
     *         natural ordering).  Implementations may, but are not required
     *         to, throw this exception if    fromElement  or
     *            toElement  cannot be compared to elements currently in
     *         the set.
     * @throws NullPointerException if    fromElement  or
     *            toElement  is null and this set does
     *         not permit null elements
     * @throws IllegalArgumentException if    fromElement  is
     *         greater than    toElement ; or if this set itself
     *         has a restricted range, and    fromElement  or
     *            toElement  lies outside the bounds of the range.
     */
    NavigableSet_<E> subSet(E fromElement, boolean fromInclusive,
                            E toElement, boolean toInclusive);

    /**
     * Returns a view of the portion of this set whose elements are less than
     * (or equal to, if    inclusive  is true)    toElement .  The
     * returned set is backed by this set, so changes in the returned set are
     * reflected in this set, and vice-versa.  The returned set supports all
     * optional set operations that this set supports.
     *
     * <p>The returned set will throw an    IllegalArgumentException 
     * on an attempt to insert an element outside its range.
     *
     * @param toElement high endpoint of the returned set
     * @param inclusive    true  if the high endpoint
     *        is to be included in the returned view
     * @return a view of the portion of this set whose elements are less than
     *         (or equal to, if    inclusive  is true)    toElement 
     * @throws ClassCastException if    toElement  is not compatible
     *         with this set's comparator (or, if the set has no comparator,
     *         if    toElement  does not implement   Comparable ).
     *         Implementations may, but are not required to, throw this
     *         exception if    toElement  cannot be compared to elements
     *         currently in the set.
     * @throws NullPointerException if    toElement  is null and
     *         this set does not permit null elements
     * @throws IllegalArgumentException if this set itself has a
     *         restricted range, and    toElement  lies outside the
     *         bounds of the range
     */
    NavigableSet_<E> headSet(E toElement, boolean inclusive);

    /**
     * Returns a view of the portion of this set whose elements are greater
     * than (or equal to, if    inclusive  is true)    fromElement .
     * The returned set is backed by this set, so changes in the returned set
     * are reflected in this set, and vice-versa.  The returned set supports
     * all optional set operations that this set supports.
     *
     * <p>The returned set will throw an    IllegalArgumentException 
     * on an attempt to insert an element outside its range.
     *
     * @param fromElement low endpoint of the returned set
     * @param inclusive    true  if the low endpoint
     *        is to be included in the returned view
     * @return a view of the portion of this set whose elements are greater
     *         than or equal to    fromElement 
     * @throws ClassCastException if    fromElement  is not compatible
     *         with this set's comparator (or, if the set has no comparator,
     *         if    fromElement  does not implement   Comparable ).
     *         Implementations may, but are not required to, throw this
     *         exception if    fromElement  cannot be compared to elements
     *         currently in the set.
     * @throws NullPointerException if    fromElement  is null
     *         and this set does not permit null elements
     * @throws IllegalArgumentException if this set itself has a
     *         restricted range, and    fromElement  lies outside the
     *         bounds of the range
     */
    NavigableSet_<E> tailSet(E fromElement, boolean inclusive);

    /**
     *  @inheritDoc 
     *
     * <p>Equivalent to    subSet(fromElement, true, toElement, false) .
     *
     * @throws ClassCastException        @inheritDoc 
     * @throws NullPointerException      @inheritDoc 
     * @throws IllegalArgumentException  @inheritDoc 
     */
    SortedSet<E> subSet(E fromElement, E toElement);

    /**
     *  @inheritDoc 
     *
     * <p>Equivalent to    headSet(toElement, false) .
     *
     * @throws ClassCastException        @inheritDoc 
     * @throws NullPointerException      @inheritDoc 
     * @throws IllegalArgumentException  @inheritDoc 
     */
    SortedSet<E> headSet(E toElement);

    /**
     *  @inheritDoc 
     *
     * <p>Equivalent to    tailSet(fromElement, true) .
     *
     * @throws ClassCastException        @inheritDoc 
     * @throws NullPointerException      @inheritDoc 
     * @throws IllegalArgumentException  @inheritDoc 
     */
    SortedSet<E> tailSet(E fromElement);
}
