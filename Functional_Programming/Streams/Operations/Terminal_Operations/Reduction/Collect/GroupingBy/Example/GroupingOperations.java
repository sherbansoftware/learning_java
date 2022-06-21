package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.GroupingBy.Example;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingOperations {


	// group elements into Map (toMap() -- 3 methods) ------------------------------------------------------------------
	private static void collectToMap(List<Book> books) {
		System.out.println("\nIn collectToHashMap ...");
		Map<Long, Book> map = books.stream()
				// toMap method 1	  -- 2 parameters --------------------------------------------------------------------------
			//.collect(Collectors.toMap(b -> b.getIsbn(), b -> b));

		// toMap - method 2     -- 3 parameters  -----------------------------------------------------------------------------
			.collect(Collectors.toMap(b -> b.getIsbn(), b -> b, (b1, b2) -> b1.getPrice() <= b2.getPrice() ? b1 : b2));
		for (Entry<Long, Book> entry : map.entrySet()) {
			System.out.println("isbn: " + entry.getKey() + ", book: " + entry.getValue());
		}

		System.out.println(map instanceof HashMap);


		// toMap 3 method   -- 4 parameters ----------------------------------------------------------------------------------
		System.out.println("\nIn collectToTreeMap ...");
		Map<Long, Book> treeMap = books.stream()
				//.collect(Collectors.toMap(b -> b.getIsbn(), b -> b));
				.collect(Collectors.toMap(Book::getIsbn, Function.identity(), (b1, b2) -> b1.getPrice() <= b2.getPrice() ? b1 : b2, TreeMap::new));
			for (Entry<Long, Book> entry : treeMap.entrySet()) {
			//	System.out.println(" isbn: " + entry.getKey() + ", book: " + entry.getValue());
			}

			/*Map<Double, List<Book>> ratingsMap = treeMap.values().stream()
				.collect(Collectors.toMap(Book::getRating, b -> Collections.singletonList(b), (l1, l2) -> { ArrayList<Book> l = new ArrayList<>(l1);
																				l.addAll(l2);
																				return l;}));
			for (Entry<Double, List<Book>> entry : ratingsMap.entrySet()) {
				System.out.println("\nRating: " + entry.getKey());
				for (Book b : entry.getValue()) {
					System.out.println(b);
				}
			}*/

		//GroupingBy method is much more simplified

			Map<Double, List<Book>> ratingsMap1 = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating));
			for (Entry<Double, List<Book>> entry : ratingsMap1.entrySet()) {
				System.out.println("\nRating: " + entry.getKey());
				for (Book b : entry.getValue()) {
					System.out.println(b);
				}
			}
	}
	

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();

		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));

		collectToMap(books);
		
	}	
		
}