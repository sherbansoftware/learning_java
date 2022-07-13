package Map.Map_Interfaces.Map.containsKey;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html

/*                                                    boolean containsKey(Object key)


    ○ Returns true if

                  * this map contains a mapping for the specified key.

           More formally, returns true if and only if this map contains a mapping for a key k such that

                  * Objects.equals(key, k). (There can be at most one such mapping.)


Parameters:
key - key whose presence in this map is to be tested
Returns:
true if this map contains a mapping for the specified key
Throws:
ClassCastException - if the key is of an inappropriate type for this map (optional)
NullPointerException - if the specified key is null and this map does not permit null keys (optional)



 */

import java.util.HashMap;
import java.util.Map;

public class containsKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        boolean containsKey = map.containsKey(null);

        System.out.println(containsKey);
    }
}

