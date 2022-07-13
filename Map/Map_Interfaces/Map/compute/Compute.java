package Map.Map_Interfaces.Map.compute;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#replace(K,V)


/*                              default V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)


    ○ Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).

     For example, to either create or append a String msg to a value mapping:

 map.compute(key, (k, v) -> (v == null) ? msg : v.concat(msg))

(Method merge() is often simpler to use for such purposes.)

If the remapping function returns null, the mapping is removed (or remains absent if initially absent).
If the remapping function itself throws an (unchecked) exception, the exception is rethrown, and the current mapping is left unchanged.

The remapping function should not modify this map during computation.

Implementation Requirements:
The default implementation is equivalent to performing the following steps for this map, then returning the current
value or null if absent:

 V oldValue = map.get(key);
 V newValue = remappingFunction.apply(key, oldValue);
 if (oldValue != null) {
    if (newValue != null)
       map.put(key, newValue);
    else
       map.remove(key);
 } else {
    if (newValue != null)
       map.put(key, newValue);
    else
       return null;
 }

The default implementation makes no guarantees about detecting if the remapping function modifies this map during computation
 and, if appropriate, reporting an error. Non-concurrent implementations should override this method and, on a best-effort
 basis, throw a ConcurrentModificationException if it is detected that the remapping function modifies this map during
 computation. Concurrent implementations should override this method and, on a best-effort basis, throw an
 IllegalStateException if it is detected that the remapping function modifies this map during computation and as
 a result computation would never complete.

The default implementation makes no guarantees about synchronization or atomicity properties of this method.
Any implementation providing atomicity guarantees must override this method and document its concurrency properties.
In particular, all implementations of subinterface ConcurrentMap must document whether the remapping function is applied
once atomically only if the value is not present.

    ○ Parameters:

                  * key

                                - key with which the specified value is to be associated

                  * remappingFunction

                                - the remapping function to compute a value

    ○ Returns:

                 * the new value associated with the specified key,

                 * or null if none

    ○ Throws:

                * NullPointerException

                                - if the specified key is null and this map does not support null keys, or the
                                      remappingFunction is null

               * UnsupportedOperationException

                                 - if the put operation is not supported by this map (optional)

               * ClassCastException

                                 - if the class of the specified key or value prevents it from being stored in this
                                       map (optional)

               * IllegalArgumentException

                                  - if some property of the specified key or value prevents it from being stored in
                                       this map (optional)
Since:
1.8





 */

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Compute {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(4, 66);
        map.put(1, 96);
        map.put(5, 66);
        map.put(3, 66);
        map.put(2, 66);



        //BiFunction<Integer, Integer, Integer> remappingFunction = (k, v) -> k * v;
        Integer in = map.compute(4, (k, v) -> k * v);

        System.out.println(in);

        System.out.println(map);
    }
}
