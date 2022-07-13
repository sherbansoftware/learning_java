package Map.Map_Interfaces.Map.forEach;


/*                         default void forEach(BiConsumer<? super K,? super V> action)


    ○ Performs the given action for each entry in this map

                  * until all entries have been processed

                  * or the action throws an exception.

          Unless otherwise specified by the implementing class,

                  * actions are performed in the order of entry set iteration (if an iteration order is specified.)

          Exceptions thrown by the action are relayed to the caller.


    ○ Implementation Requirements:

       The default implementation is equivalent to, for this map:

 for (Map.Entry<K, V> entry : map.entrySet())
     action.accept(entry.getKey(), entry.getValue());

    ○ The default implementation makes no guarantees

                   * about synchronization

                   * or atomicity properties of this method.

           Any implementation providing atomicity guarantees must override this method and document its concurrency properties.


    ○ Parameters:

                   * action

                                 - The action to be performed for each entry

    ○ Throws:

                   * NullPointerException

                                  - if the specified action is null

                   * ConcurrentModificationException

                                   - if an entry is found to be removed during iteration
Since:
1.8


 */

import java.util.HashMap;
import java.util.Map;

public class forEach {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(4, "Mary");
        map.put(68, "Anne");
        map.put(0, "John");
        map.put(685, "Valery");
        //  map.put(null, "John");
        //   map.put(33, null);

        map.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}