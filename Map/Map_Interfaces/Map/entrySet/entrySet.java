package Map.Map_Interfaces.Map.entrySet;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                          Set<Map.Entry<K,V>> entrySet()


    ○ Returns a Set view of the mappings contained in this map.

                  * The set is backed by the map,

                  * so changes to the map are reflected in the set, and vice-versa.

          If the map is modified while an iteration over the set is in progress (except through the iterator's own remove
              operation, or through the setValue operation on a map entry returned by the iterator)

                  * the results of the iteration are undefined.

    ○ The set supports element removal, which removes the corresponding mapping from the map, via the

                  * Iterator.remove,

                  * Set.remove,

                  * removeAll,

                  * retainAll

                  * and clear operations.

          It does not support the add or addAll operations.


    ○ Returns:

                  * a set view of the mappings contained in this map



 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println("Value :" + entry.getValue());

        }

    }
}
