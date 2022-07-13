package Map.Map_Interfaces.Map.get;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html

/*                                                    V get(Object key)


    ○ Returns

                  * the value to which the specified key is mapped,

                  * or null if this map contains no mapping for the key.

          More formally,

                  * if this map contains a mapping from a key k to a value v such that Objects.equals(key, k),

                                - then this method returns v;

                        otherwise it returns null. (There can be at most one such mapping.)

    ○ If this map permits null values,

                   * then a return value of null does not necessarily indicate that the map contains no mapping for the key;

                   * it's also possible that the map explicitly maps the key to null.

           The containsKey operation may be used to distinguish these two cases.

    ○ Parameters:

                  * key - the key whose associated value is to be returned

    ○ Returns:

                   * the value to which the specified key is mapped,

                   * or null if this map contains no mapping for the key

     ○ Throws:

                   * ClassCastException

                                 - if the key is of an inappropriate type for this map (optional)

                   * NullPointerException

                                  - if the specified key is null and this map does not permit null keys (optional)



 */


import java.util.HashMap;
import java.util.Map;

public class Get {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        String value  = map.get(0);

        System.out.println(value);

    }
}
