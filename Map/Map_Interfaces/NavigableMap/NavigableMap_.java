package Map.Map_Interfaces.NavigableMap;

import java.util.NavigableSet;
import java.util.SortedMap;

// https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html

/**                                               Interface NavigableMap<K,V>

    A SortedMap extended with navigation methods:                           return

          * Entry<K,V> lowerEntry(K key);           an entry with the greatest key less than key, or null if there is no
                                                    such key

          * Entry<K,V> floorEntry(K key);           an entry with the greatest key less than or equal to key,or null if
                                                    there is no such key

          * Entry<K,V> ceilingEntry(K key);         an entry with the least key greater than or equal to key, or  null
                                                    if there is no such key

         *  Entry<K,V> higherEntry(K key);          an entry with the least key greater than  key, or  null if there
                                                        is no such key

    Similarly, methods

             * lowerKey,
             * floorKey,
             * ceilingKey, and
             * higherKey

         return only the associated keys.

     All of these methods are designed for locating, not traversing entries. A NavigableMap may be accessed and traversed
         in either

                 * ascending or
                 * descending key order.

         The descendingMap  method returns a view of the map with the senses of all relational and directional methods
             inverted.The performance of ascending operations and views is likely to be faster than that of descending ones.

     Methods

                  * subMap,
                  * eadMap,
                  * tailMap

         differ from the like-named SortedMap methods in accepting additional arguments describing whether lower and
             upper bounds are inclusive versus exclusive.

    Submaps of any  NavigableMap must implement the NavigableMap interface.

    This interface additionally defines methods

                   * firstEntry,
                   * pollFirstEntry,
                   * lastEntry, and
                   * pollLastEntry

        that return and/or remove the least and greatest mappings, if any exist, else returning  null.

    Implementations of entry-returning methods are expected to return  Map.Entry pairs representing snapshots of mappings
        at the time they were produced, and thus generally do not support the optional  Entry.setValue method. Note however
        that it is possible to change mappings in the associated map using  method  put.

    Methods

                *  #subMap(Object, Object) subMap(K, K),
                *  #headMap(Object) headMap(K), and
                *  #tailMap(Object) tailMap(K)

        are specified to return SortedMap to allow existing implementations of  SortedMap to be compatibly retrofitted to
            implement  NavigableMap, but extensions and implementations of this interface are encouraged to override these
            methods to return

                *  NavigableMap.

    Similarly, keySet() can be overriden to return  NavigableSet.

                                                             NOTE


 
 * @author Doug Lea
 * @author Josh Bloch
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 * @since 1.6
 */

public interface NavigableMap_<K,V> extends SortedMap<K,V> {
    /**
     * Returns a key-value mapping associated with the greatest key
     * strictly less than the given key, or  null if there is no such key.
     *
     * @param key the key
     *
     * @return an entry with the greatest key less than  key, or  null if there is no such key
     *
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    Entry<K,V> lowerEntry(K key);

    /**
     * Returns the greatest key strictly less than the given key, or
     *  null if there is no such key.
     *
     * @param key the key
     * @return the greatest key less than  key, or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    K lowerKey(K key);

    /**
     * Returns a key-value mapping associated with the greatest key
     * less than or equal to the given key, or  null if there
     * is no such key.
     *
     * @param key the key
     * @return an entry with the greatest key less than or equal to
     *          key, or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    Entry<K,V> floorEntry(K key);

    /**
     * Returns the greatest key less than or equal to the given key,
     * or  null if there is no such key.
     *
     * @param key the key
     * @return the greatest key less than or equal to  key,
     *         or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    K floorKey(K key);

    /**
     * Returns a key-value mapping associated with the least key
     * greater than or equal to the given key, or  null if
     * there is no such key.
     *
     * @param key the key
     * @return an entry with the least key greater than or equal to key, or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    Entry<K,V> ceilingEntry(K key);

    /**
     * Returns the least key greater than or equal to the given key,
     * or  null if there is no such key.
     *
     * @param key the key
     * @return the least key greater than or equal to  key,
     *         or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    K ceilingKey(K key);

    /**
     * Returns a key-value mapping associated with the least key
     * strictly greater than the given key, or  null if there
     * is no such key.
     *
     * @param key the key
     * @return an entry with the least key greater than  key, or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    Entry<K,V> higherEntry(K key);

    /**
     * Returns the least key strictly greater than the given key, or
     *  null if there is no such key.
     *
     * @param key the key
     * @return the least key greater than  key,
     *         or  null if there is no such key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map does not permit null keys
     */
    K higherKey(K key);

    /**
     * Returns a key-value mapping associated with the least
     * key in this map, or  null if the map is empty.
     *
     * @return an entry with the least key,
     *         or  null if this map is empty
     */
    Entry<K,V> firstEntry();

    /**
     * Returns a key-value mapping associated with the greatest
     * key in this map, or  null if the map is empty.
     *
     * @return an entry with the greatest key,
     *         or  null if this map is empty
     */
    Entry<K,V> lastEntry();

    /**
     * Removes and returns a key-value mapping associated with
     * the least key in this map, or  null if the map is empty.
     *
     * @return the removed first entry of this map,
     *         or  null if this map is empty
     */
    Entry<K,V> pollFirstEntry();

    /**
     * Removes and returns a key-value mapping associated with
     * the greatest key in this map, or  null if the map is empty.
     *
     * @return the removed last entry of this map,
     *         or  null if this map is empty
     */
    Entry<K,V> pollLastEntry();

    /**
     * Returns a reverse order view of the mappings contained in this map.
     * The descending map is backed by this map, so changes to the map are
     * reflected in the descending map, and vice-versa.  If either map is
     * modified while an iteration over a collection view of either map
     * is in progress (except through the iterator's own  remove
     * operation), the results of the iteration are undefined.
     *
     * <p>The returned map has an ordering equivalent to
     * <tt> Collections#reverseOrder(Comparator) Collections_.reverseOrder(comparator())</tt>.
     * The expression  m.descendingMap().descendingMap() returns a
     * view of  m essentially equivalent to  m.
     *
     * @return a reverse order view of this map
     */
    NavigableMap_<K,V> descendingMap();

    /**
     * Returns a  NavigableSet view of the keys contained in this map.
     * The set's iterator returns the keys in ascending order.
     * The set is backed by the map, so changes to the map are reflected in
     * the set, and vice-versa.  If the map is modified while an iteration
     * over the set is in progress (except through the iterator's own 
     * remove operation), the results of the iteration are undefined.  The
     * set supports element removal, which removes the corresponding mapping
     * from the map, via the  Iterator_Interface.remove,  Set.remove,
     *  removeAll,  retainAll, and  clear operations.
     * It does not support the  add or  addAll operations.
     *
     * @return a navigable set view of the keys in this map
     */
    NavigableSet<K> navigableKeySet();

    /**
     * Returns a reverse order  NavigableSet view of the keys contained in this map.
     * The set's iterator returns the keys in descending order.
     * The set is backed by the map, so changes to the map are reflected in
     * the set, and vice-versa.  If the map is modified while an iteration
     * over the set is in progress (except through the iterator's own 
     * remove operation), the results of the iteration are undefined.  The
     * set supports element removal, which removes the corresponding mapping
     * from the map, via the  Iterator_Interface.remove,  Set.remove,
     *  removeAll,  retainAll, and  clear operations.
     * It does not support the  add or  addAll operations.
     *
     * @return a reverse order navigable set view of the keys in this map
     */
    NavigableSet<K> descendingKeySet();

    /**
     * Returns a view of the portion of this map whose keys range from
     *  fromKey to  toKey.  If  fromKey and
     *  toKey are equal, the returned map is empty unless
     *  fromInclusive and  toInclusive are both true.  The
     * returned map is backed by this map, so changes in the returned map are
     * reflected in this map, and vice-versa.  The returned map supports all
     * optional map operations that this map supports.
     *
     * <p>The returned map will throw an  IllegalArgumentException
     * on an attempt to insert a key outside of its range, or to construct a
     * submap either of whose endpoints lie outside its range.
     *
     * @param fromKey low endpoint of the keys in the returned map
     * @param fromInclusive  true if the low endpoint
     *        is to be included in the returned view
     * @param toKey high endpoint of the keys in the returned map
     * @param toInclusive  true if the high endpoint
     *        is to be included in the returned view
     * @return a view of the portion of this map whose keys range from
     *          fromKey to  toKey
     * @throws ClassCastException if  fromKey and  toKey
     *         cannot be compared to one another using this map's comparator
     *         (or, if the map has no comparator, using natural ordering).
     *         Implementations may, but are not required to, throw this
     *         exception if  fromKey or  toKey
     *         cannot be compared to keys currently in the map.
     * @throws NullPointerException if  fromKey or  toKey
     *         is null and this map does not permit null keys
     * @throws IllegalArgumentException if  fromKey is greater than
     *          toKey; or if this map itself has a restricted
     *         range, and  fromKey or  toKey lies
     *         outside the bounds of the range
     */
    NavigableMap_<K,V> subMap(K fromKey, boolean fromInclusive,
                              K toKey, boolean toInclusive);

    /**
     * Returns a view of the portion of this map whose keys are less than (or
     * equal to, if  inclusive is true)  toKey.  The returned
     * map is backed by this map, so changes in the returned map are reflected
     * in this map, and vice-versa.  The returned map supports all optional
     * map operations that this map supports.
     *
     * <p>The returned map will throw an  IllegalArgumentException
     * on an attempt to insert a key outside its range.
     *
     * @param toKey high endpoint of the keys in the returned map
     * @param inclusive  true if the high endpoint
     *        is to be included in the returned view
     * @return a view of the portion of this map whose keys are less than
     *         (or equal to, if  inclusive is true)  toKey
     * @throws ClassCastException if  toKey is not compatible
     *         with this map's comparator (or, if the map has no comparator,
     *         if  toKey does not implement  Comparable).
     *         Implementations may, but are not required to, throw this
     *         exception if  toKey cannot be compared to keys
     *         currently in the map.
     * @throws NullPointerException if  toKey is null
     *         and this map does not permit null keys
     * @throws IllegalArgumentException if this map itself has a
     *         restricted range, and  toKey lies outside the
     *         bounds of the range
     */
    NavigableMap_<K,V> headMap(K toKey, boolean inclusive);

    /**
     * Returns a view of the portion of this map whose keys are greater than (or
     * equal to, if  inclusive is true)  fromKey.  The returned
     * map is backed by this map, so changes in the returned map are reflected
     * in this map, and vice-versa.  The returned map supports all optional
     * map operations that this map supports.
     *
     * <p>The returned map will throw an  IllegalArgumentException
     * on an attempt to insert a key outside its range.
     *
     * @param fromKey low endpoint of the keys in the returned map
     * @param inclusive  true if the low endpoint
     *        is to be included in the returned view
     * @return a view of the portion of this map whose keys are greater than
     *         (or equal to, if  inclusive is true)  fromKey
     * @throws ClassCastException if  fromKey is not compatible
     *         with this map's comparator (or, if the map has no comparator,
     *         if  fromKey does not implement  Comparable).
     *         Implementations may, but are not required to, throw this
     *         exception if  fromKey cannot be compared to keys
     *         currently in the map.
     * @throws NullPointerException if  fromKey is null
     *         and this map does not permit null keys
     * @throws IllegalArgumentException if this map itself has a
     *         restricted range, and  fromKey lies outside the
     *         bounds of the range
     */
    NavigableMap_<K,V> tailMap(K fromKey, boolean inclusive);

    /**
     * {@inheritDoc
     *
     * <p>Equivalent to  subMap(fromKey, true, toKey, false).
     *
     * @throws ClassCastException       {@inheritDoc
     * @throws NullPointerException     {@inheritDoc
     * @throws IllegalArgumentException {@inheritDoc
     */
    SortedMap<K,V> subMap(K fromKey, K toKey);

    /**
     * {@inheritDoc
     *
     * <p>Equivalent to  headMap(toKey, false).
     *
     * @throws ClassCastException       {@inheritDoc
     * @throws NullPointerException     {@inheritDoc
     * @throws IllegalArgumentException {@inheritDoc
     */
    SortedMap<K,V> headMap(K toKey);

    /**
     * {@inheritDoc
     *
     * <p>Equivalent to  tailMap(fromKey, true).
     *
     * @throws ClassCastException       {@inheritDoc
     * @throws NullPointerException     {@inheritDoc
     * @throws IllegalArgumentException {@inheritDoc
     */
    SortedMap<K,V> tailMap(K fromKey);
}
