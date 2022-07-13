package Map.Map_Interfaces.Map.replaceAll;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                     default void replaceAll(BiFunction<? super K,? super V,? extends V> function)


    ○ Replaces

                   * each entry's value

                   * with the result of invoking the given function on that entry

          until all entries have been processed or the function throws an exception.

    ○ Exceptions thrown by the function are relayed to the caller.


    ○ Implementation Requirements:

                  * The default implementation is equivalent to, for this map:


 for (Map.Entry<K, V> entry : map.entrySet())
     entry.setValue(function.apply(entry.getKey(), entry.getValue()));

    ○ The default implementation makes no guarantees about

                  * synchronization or atomicity properties of this method.

          Any implementation providing atomicity guarantees must override this method and document its concurrency properties.


    ○ Parameters:

                  * function

                                - the function to apply to each entry

    ○ Throws:

                  * UnsupportedOperationException

                                 - if the set operation is not supported by this map's entry set iterator.

                  * ClassCastException

                                  - if the class of a replacement value prevents it from being stored in this map

                   * NullPointerException

                                  - if the specified function is null, or the specified replacement value is null,
                                        and this map does not permit null values

                    * ClassCastException

                                  - if a replacement value is of an inappropriate type for this map (optional)

                    * NullPointerException

                                   - if function or a replacement value is null,
                                         and this map does not permit null keys or values (optional)

                    * IllegalArgumentException

                                   - if some property of a replacement value prevents it from being stored in this map (optional)

                    * ConcurrentModificationException

                                   - if an entry is found to be removed during iteration



 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class replaceAll {
    // Main method
    public static void main(String[] args) {

        // create a HashMap having
        // record of the year of birth
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Tushar", 2000);
        map1.put("Anushka", 2001);
        map1.put("Sanskriti", 2003);
        map1.put("Anuj", 2002);

        // print map details
        System.out.println("HashMap1: " + map1.toString());

        // replace yearOfBirth with current age
        // using replaceAll method
        map1.replaceAll((key, yearOfBirth) -> LocalDate.now().getYear() - yearOfBirth);

        // print new mapping
        System.out.println("New HashMap: " + map1);
    }

}
