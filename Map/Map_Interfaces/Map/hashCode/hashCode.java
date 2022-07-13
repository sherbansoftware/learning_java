package Map.Map_Interfaces.Map.hashCode;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html


/*                                              int hashCode()


    ○ Returns the hash code value for this map.

                  * The hash code of a map is defined to be the sum of the hash codes of each entry in the map's entrySet() view.

                  * This ensures that

                                - m1.equals(m2) implies that m1.hashCode()==m2.hashCode() for any two maps m1 and m2,

                    as required by the general contract of Object.hashCode().


    ○ Overrides:

                   * hashCode in class Object

    ○ Returns:

                  * the hash code value for this map


 */

import java.util.HashMap;

public class hashCode {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        map.put(null, "John");
        map.put(33, null);

        System.out.println(map.hashCode());
    }
}
