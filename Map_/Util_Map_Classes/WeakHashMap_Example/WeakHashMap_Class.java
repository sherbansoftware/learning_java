package Map_.Util_Map_Classes.WeakHashMap_Example;


import Map_.miscelanous.Order;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMap_Class {

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

