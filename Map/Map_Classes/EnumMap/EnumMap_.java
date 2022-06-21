package Map.Map_Classes.EnumMap;

// https://docs.oracle.com/javase/8/docs/api/java/util/EnumMap.html

/*         public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K,V> implements Serializable, Cloneable

    A specialized Map implementation for use with enum type keys.All of the keys in an enum map must come from a single
        enum type that is specified, explicitly or implicitly, when the map is created.Enum maps are represented internally
        as arrays. This representation is extremely compact and efficient.

                                                        NOTE

            * Null keys are not permitted. Attempts to insert a null key will throw NullPointerException
            * Null values are permitted.
            * Enum maps are maintained in the natural order of their keys (the order in which the enum constants are declared).
                  This is reflected in the iterators returned by the collections views (keySet(), entrySet(), and values()).
            * EnumMap is not synchronized

                          Map<EnumKey, V> m = Collections.synchronizedMap(new EnumMap<EnumKey, V>(...));

            * Iterators returned by the collection views are weakly consistent: they will never throw ConcurrentModificationException
                  and they may or may not show the effects of any modifications to the map that occur while the iteration is
                  in progress.

 */

public class EnumMap_ {
}
