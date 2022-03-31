package Map.Map_Classes.WeakHashMap;

// https://docs.oracle.com/javase/8/docs/api/java/util/WeakHashMap.html

/*                       public class WeakHashMap<K,V>   extends AbstractMap<K,V> implements Map<K,V>

    Hash table based implementation of the Map interface, with weak keys. An entry in a WeakHashMap will automatically
        be removed when its key is no longer in ordinary use. More precisely, the presence of a mapping for a given key
        will not prevent the key from being discarded by the garbage collector, that is, made finalizable, finalized,
        and then reclaimed. When a key has been discarded its entry is effectively removed from the map, so this class
        behaves somewhat differently from other Map implementations.


                                                     NOTE

         * If the object specified as a key doesn't contain any reference, then it will be available for garbage collector
               to clean the object.
               Garbage Collection mechanism dominate WeakHashMap related to clean up key without reference.
               so WeakHashMap have weak references at key level

        * Does not implement Cloneable and sSerializable Interfaces

        * Both null values and the null key are supported

        * This class has performance characteristics similar to those of the HashMap class, and has the same efficiency
              parameters of initial capacity and load factor.

        * This class is not synchronized. A synchronized WeakHashMap may be constructed using the

                      Collections.synchronizedMap method.




 */

import Map.miscelanous.Order;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMap_ {

	public static void main(String[] args) {

		
		Map<Order,Integer> orders = new WeakHashMap<>();
		//strong reference for Order
		Order ord1 = new Order(1, "This is first order");
		Order ord2 = new Order(2, "This is second order");
		orders.put(ord1, 100);
		orders.put(ord2, 200);
		//orders.put(null, 200);
        
		//weak reference for Order
		orders.put(new Order(3,"This is third order"),150);
		orders.put(new Order(4,"This is fourth order"),200);
		
		for (Map.Entry<Order, Integer> entry : orders.entrySet()) {

			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		
		  System.out.println(orders.size());
		  System.gc();// if new Order(int,String) has no strong reference garbage collectors can take it from memory
		  Runtime.getRuntime().gc();
		  System.out.println(orders.size());
		 
	}

}

