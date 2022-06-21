package Functional_Programming.Streams.Operations.Intermediate_Operations.flatMap.SimpleExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates flatMap
 * 
 * @author Dheeru Mundluru
 *
 */
public class Order {
	private List<String> items;	
	
	public Order(List<String> items) {
		super();
		this.items = items;
	}
	
	public List<String> getItems() {
		return items;
	}


	public static void main(String[] args) {
		Order o1 = new Order(Arrays.asList("tv", "refrigerator", "ac"));
		Order o2 = new Order(Arrays.asList("tv", "washing machine"));
		Order o3 = new Order(Arrays.asList("laptop", "head phone"));
		
		List<Order> orders = Arrays.asList(o1, o2, o3);
		List<List<String>> itemsSold = orders.stream()
			.map(order -> order.getItems())
			.collect(Collectors.toList());
		System.out.println(itemsSold);
		
		List<String> itemsSold2 = orders.stream()
				.flatMap(order -> order.getItems().stream())
				.distinct()
				.collect(Collectors.toList());
			System.out.println(itemsSold2);		
	}


	
}
