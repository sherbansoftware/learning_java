package Map_.miscelanous;

import java.util.HashMap;
import java.util.Map;

public class ObjectHashMap {

	public static void main(String[] args) {
		Map<Order, String> ef = new HashMap<>();

		Order o1=new Order(1, "Meal order");
		Order o2=new Order(2, "Juice order");
		
		
		ef.put(o1, "First order");
		ef.put(o2, "Second order");
		for(Map.Entry<Order, String> o:ef.entrySet()) {
		
		System.out.println(o);
		}

	}

}
