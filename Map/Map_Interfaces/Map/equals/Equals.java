package Map.Map_Interfaces.Map.equals;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                           boolean   equals(Object o)


    ○ Compares

                  * the specified object

                  * with this map

          for equality. Returns true if the given object is also a map and the two maps represent the same mappings.

    ○ More formally, two maps m1 and m2 represent the same mappings if

                  * m1.entrySet().equals(m2.entrySet()).

              This ensures that the equals method works properly across different implementations of the Map interface.

    ○ Overrides:

                  * equals in class Object

    ○ Parameters:

                  * o

                              - object to be compared for equality with this map

    ○ Returns:

                  * true if the specified object is equal to this map



 */

import java.util.HashMap;
import java.util.Map;

public class Equals {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(54,65);
        map.put(4,668);
        map.put(9,765);
        map.put(6474,65);

        Map<Integer,Integer> map1 = new HashMap<>(map);
        System.out.println(map.equals(map1));
    }
}
