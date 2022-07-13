package Map.Map_Interfaces.Map.values;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                               Collection<V> values()


    ○ Returns a Collection view of the values contained in this map.

              * The collection is backed by the map, so changes to the map are reflected in the collection, and vice-versa.

    ○ If the map is modified while an iteration over the collection is in progress
          (except through the iterator's own remove operation),

                  * the results of the iteration are undefined.

    ○ The collection supports element removal, which removes the corresponding mapping from the map, via the

                  * Iterator.remove,

                  * Collection.remove,

                  * removeAll,

                  * retainAll

                  * and clear operations.

       It does not support the add or addAll operations.


    ○ Returns:

               * a collection view of the values contained in this map

 */

import java.util.*;
import java.util.stream.Collectors;

public class Values {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        Collection<String> names = map.values();

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            // remove entries with value "John"
            if (itr.next() == "John") {
                itr.remove();
            }
        }
        System.out.println(map);

    }
}
