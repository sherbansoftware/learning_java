package Map.Map_Interfaces.Map.isEmpty;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                                 boolean	isEmpty()


    ○ Returns true if this map contains no key-value mappings.



 */

import java.util.HashMap;
import java.util.Map;

public class isEmpty {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        boolean isEmpty  = map.isEmpty();

        System.out.println(isEmpty);

    }
}
