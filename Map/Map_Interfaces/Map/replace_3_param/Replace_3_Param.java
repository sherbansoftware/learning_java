package Map.Map_Interfaces.Map.replace_3_param;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                   default boolean replace(K key, V oldValue, V newValue)


    ○ Replaces the entry for the specified key only if currently mapped to the specified value.

    ○ Implementation Requirements:

                  * The default implementation is equivalent to, for this map:

 if (map.containsKey(key) && Objects.equals(map.get(key), value)) {
     map.put(key, newValue);
     return true;
 } else
     return false;

    ○ The default implementation

                   * does not throw NullPointerException for maps that do not support null values if oldValue is null

                   * unless newValue is also null.

                   * The default implementation makes no guarantees about

                                 - synchronization or atomicity properties of this method.

                         Any implementation providing atomicity guarantees must override this method and document its
                             concurrency properties.

    ○ Parameters:

                   * key

                                 - key with which the specified value is associated

                   * oldValue

                                 - value expected to be associated with the specified key

                   * newValue

                                 - value to be associated with the specified key


    ○ Returns:

                   * true if the value was replaced

    ○ Throws:


                   * UnsupportedOperationException

                                   - if the put operation is not supported by this map (optional)

                   * ClassCastException

                                    - if the class of a specified key or value prevents it from being stored in this map

                    * NullPointerException

                                      - if a specified key or newValue is null, and this map does not permit null keys or values

                    * NullPointerException

                                      - if oldValue is null and this map does not permit null values (optional)

                    * IllegalArgumentException

                                       - if some property of a specified key or value prevents it from being stored in this map
Since:
1.8



 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Replace_3_Param {

    // Java program to demonstrate
    // replace(K key,V oldValue, V newValue) method

    // Main method
    public static void main(String[] args) {

        // Create a HashMap and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 300);
        map.put("c", 300);
        map.put("d", 400);

        // print map details
        System.out.println("HashMap: " + map.toString());


        boolean isReplaced = map.replace("b", 300, 500);

        // print new mapping
        if (isReplaced) {
            System.out.println("New map: ");
            map.forEach((k, v) -> System.out.println(k + ":" + v));

        }
    }
}


