package Map.Map_Interfaces.Map.clear;

// // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                               void clear()


    ○ Removes all of the mappings from this map (optional operation).

                  * The map will be empty after this call returns.

    ○ Throws:

                   * UnsupportedOperationException

                                 - if the clear operation is not supported by this map




 */

import java.util.HashMap;
import java.util.Map;

public class Clear {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        map.clear();

        System.out.println(map);

    }

}
