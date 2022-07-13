package Map.Map_Interfaces.Map.size;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                          int size()


    ○ Returns the number of key-value mappings in this map.

                  * If the map contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.


 */

import java.util.HashMap;
import java.util.Map;

public class Size {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        int size = map.size();

        System.out.println(size);

    }
}
