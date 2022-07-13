package Map.Map_Interfaces.Map.putAll;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                            void putAll(Map<? extends K,? extends V> m)


    ○ Copies all of the mappings from the specified map to this map (optional operation).

      The effect of this call is equivalent to that of

                  * calling put(k, v) on this map once for each mapping from key k to value v in the specified map.

    ○ The behavior of this operation is undefined if the specified map is modified while the operation is in progress.


    ○ Parameters:

                   * m - mappings to be stored in this map

    ○  Throws:

                   * UnsupportedOperationException

                                 - if the putAll operation is not supported by this map

                   * ClassCastException

                                  - if the class of a key or value in the specified map prevents it from being stored in this map

                    * NullPointerException

                                   - if the specified map is null, or if this map does not permit null keys or values,
                                         and the specified map contains null keys or values

                     * IllegalArgumentException

                                    - if some property of a key or value in the specified map prevents it from being
                                          stored in this map





 */


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class putAll {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(55, "Julianne");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
       // map.put(null, "John");
        map.put(33, null);

        Map<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(741, "Anderson");
        map1.put(841, "Borg");
        map1.put(941, "Hanna");
        map.putAll(map1);

        System.out.println(map);

    }
}
