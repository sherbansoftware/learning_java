package Collection_Framework.Collection_Classes.Collections.Singleton;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html


/*                                                singleton(T)

    ○ static <T> Set<T>	         singleton(T o)

                  * Returns an immutable set containing only the specified object.

    ○ static <T> List<T>	     singletonList(T o)

                  * Returns an immutable list containing only the specified object.

    ○ static <K,V> Map<K,V>	     singletonMap(K key, V value)

                  * Returns an immutable map, mapping only the specified key to the specified value.

 */

import java.util.*;

public class Singleton_ {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(34);
        li.add(66);
        li.add(857);
        li.add(54);
        li.add(12);

        Set<Integer> s = Collections.singleton(66);
       // s.clear();  // UnsupportedOperationException
        System.out.println(s);
    }

}
