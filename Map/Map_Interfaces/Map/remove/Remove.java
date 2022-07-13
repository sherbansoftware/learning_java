package Map.Map_Interfaces.Map.remove;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                     V remove(Object key)


    ○ Removes the mapping for a key from this map if it is present (optional operation).

      More formally,

                  * if this map contains a mapping from key k to value v such that Objects.equals(key, k),

                  * that mapping is removed. (The map can contain at most one such mapping.)

    ○ Returns

                  * the value to which this map previously associated the key,

                  * or null if the map contained no mapping for the key.

    ○ If this map permits null values,

                  * then a return value of null does not necessarily indicate that the map contained no mapping for the key;

                  * it's also possible that the map explicitly mapped the key to null.

    ○ The map will not contain a mapping for the specified key once the call returns.

    ○ Parameters:

                   * key

                                 - key whose mapping is to be removed from the map

    ○ Returns:

                   * the previous value associated with key,

                   * or null if there was no mapping for key.

    ○ Throws:

                   * UnsupportedOperationException

                                    - if the remove operation is not supported by this map

                    * ClassCastException

                                      - if the key is of an inappropriate type for this map (optional)

                     * NullPointerException

                                      - if the specified key is null and this map does not permit null keys (optional)



 */

import java.util.HashMap;
import java.util.Map;

public class Remove {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(55, "Julianne");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        String removedName = map.remove(55);

        System.out.println(removedName);

    }
}
