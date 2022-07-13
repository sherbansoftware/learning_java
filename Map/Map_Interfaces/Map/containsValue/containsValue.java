package Map.Map_Interfaces.Map.containsValue;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                       boolean   containsValue(Object value)

    ○ Returns true if this map

                   * maps one or more keys to the specified value.

            More formally, returns true if and only if this map contains at least one mapping to a value v such that
                Objects.equals(value, v).

    ○ This operation will probably require time linear in the map size for most implementations of the Map interface.


Parameters:
value - value whose presence in this map is to be tested
Returns:
true if this map maps one or more keys to the specified value
Throws:
ClassCastException - if the value is of an inappropriate type for this map (optional)
NullPointerException - if the specified value is null and this map does not permit null values (optional)



 */


import java.util.HashMap;
import java.util.Map;

public class containsValue {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        boolean containsVaLue  = map.containsValue(null);

        System.out.println(containsVaLue);

    }

}
