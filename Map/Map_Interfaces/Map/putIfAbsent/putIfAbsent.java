package Map.Map_Interfaces.Map.putIfAbsent;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                                default V putIfAbsent(K key, V value)


    ○ If the specified key

                   * is not already associated with a value (or is mapped to null)

                   * associates it with the given value and returns null, else returns the current value.


    ○ Implementation Requirements:

                   * The default implementation is equivalent to, for this map:

 V v = map.get(key);
 if (v == null)
     v = map.put(key, value);

 return v;

    ○ The default implementation makes no guarantees about

                   * synchronization

                   * or atomicity properties of this method.

           Any implementation providing atomicity guarantees must override this method and document its concurrency properties.


    ○ Parameters:

                   * key

                                 - key with which the specified value is to be associated

                   * value

                                 - value to be associated with the specified key

    ○ Returns:

                   * the previous value associated with the specified key,

                   * or null if there was no mapping for the key. (A null return can also indicate that the map previously
                        associated null with the key, if the implementation supports null values.)

    ○ Throws:

                   * UnsupportedOperationException

                                 - if the put operation is not supported by this map (optional)

                   * ClassCastException

                                  - if the key or value is of an inappropriate type for this map (optional)

                   * NullPointerException

                                   - if the specified key or value is null, and this map does not permit null
                                         keys or values (optional)

                   * IllegalArgumentException

                                   - if some property of the specified key or value prevents it from being stored in
                                         this map (optional)


 */


import java.util.HashMap;
import java.util.Map;

public class putIfAbsent {
    public static void main(String[] args) {

        // create a HashMap
        Map<Integer, String> languages = new HashMap<>();

        // add mappings to HashMap
        languages.put(1, "Python");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages: " + languages);

        // key already not present in HashMap
        String absentValue = languages.putIfAbsent(4, "JavaScript");

        System.out.println(absentValue);

        // key already present in HashMap
        languages.putIfAbsent(2, "Swift");

        System.out.println("Updated Languages: " + languages);
    }
}
