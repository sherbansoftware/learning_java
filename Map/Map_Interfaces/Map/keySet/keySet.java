package Map.Map_Interfaces.Map.keySet;

//


/*                                                        Set<K> keySet()


    ○ Returns a Set view of the keys contained in this map.

                  * The set is backed by the map,

                  * so changes to the map are reflected in the set, and vice-versa.

    ○ If the map is modified while an iteration over the set is in progress (except through the iterator's own remove
           operation),

                  * the results of the iteration are undefined.

          The set supports

                       * element removal which removes the corresponding mapping from the map, via the

                                     - Iterator.remove,

                                      - Set.remove,

                                      - removeAll,

                                      - retainAll,

                                      - and clear operations.

                              It does not support the add or addAll operations.


     ○ Returns:

                  * a set view of the keys contained in this map




 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class keySet {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(70, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(73, null);
        map.put(28, null);

        Set<Integer> ids = map.keySet();
        if (map.containsKey(null)) {
            map.remove(null);
        }

        Iterator<Integer> itr = ids.iterator();
        while (itr.hasNext()) {
            if (itr.next() > 68) {
                itr.remove();
            }
        }

        System.out.println(map);
    }


}

