package Map.Map_Interfaces.Map.remove_boolean;


import java.util.*;


/*                            default boolean remove(Object key, Object value)



    ○ Removes the entry for the specified key only if it is currently mapped to the specified value.

    ○ Implementation Requirements:

       The default implementation is equivalent to, for this map:

 if (map.containsKey(key) && Objects.equals(map.get(key), value)) {
     map.remove(key);
     return true;
 } else
     return false;

    ○ The default implementation makes no guarantees about

                   * synchronization or atomicity properties of this method.

           Any implementation providing atomicity guarantees must override this method and document its concurrency properties.

    ○  Parameters:

                    * key

                                  - key with which the specified value is associated

                    * value

                                   - value expected to be associated with the specified key

    ○ Returns:

                    * true

                                   - if the value was removed
    ○ Throws:

                    * UnsupportedOperationException

                                    - if the remove operation is not supported by this map (optional)

                    * ClassCastException

                                     - if the key or value is of an inappropriate type for this map (optional)

                    * NullPointerException

                                       - if the specified key or value is null, and this map does not permit null keys
                                             or values (optional)
Since:
1.8

 */
public class Remove_Boolean {


    public static void main(String[] args) {

        // Creating an empty HashMap
        Map<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        // Removing the existing key mapping
        boolean isRemoved = hash_map.remove(20, "Geeks");

        // Verifying if is removed this entry
        System.out.println("Is removed: " + isRemoved);

        if (isRemoved) {
            // Displaying the new map
            hash_map.forEach((k, v) -> System.out.println(k + ":" + v));
        }

    }
}
