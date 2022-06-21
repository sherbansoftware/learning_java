package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.Summarizing.Example;


//
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizingOperations {

	private static void collectToMap(List<Book> books) {

		Map<Long, Book> treeMap = books.stream()
				//.collect(Collectors.toMap(b -> b.getIsbn(), b -> b));
				//.collect(Collectors.toMap(Book::getIsbn, Function.identity(), (b1, b2) -> b1.getPrice() <= b2.getPrice() ? b1 : b2, () -> new TreeMap()));
				.collect(Collectors.toMap(Book::getIsbn, Function.identity(), BinaryOperator.minBy(Comparator.comparingDouble(Book::getPrice))));
			for (Entry<Long, Book> entry : treeMap.entrySet()) {
				System.out.println("isbn: " + entry.getKey() + ", book: " + entry.getValue());
			}
		

			System.out.println("\ngroupingBy with values as List ... "); // ---------------------------------------------
			Map<Double, List<Book>> ratingsMap1 = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating));
			for (Entry<Double, List<Book>> entry : ratingsMap1.entrySet()) {
				System.out.println("\nRating: " + entry.getKey());
				for (Book b : entry.getValue()) {
					System.out.println(b);
				}
			}
			
			System.out.println("\ngroupingBy with values as Set ... ");// ---------------------------------------------
			Map<Double, Set<Book>> ratingsMap2 = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating, TreeMap::new, toSet()));
			for (Entry<Double, Set<Book>> entry : ratingsMap2.entrySet()) {
				System.out.println("\nRating: " + entry.getKey());
				for (Book b : entry.getValue()) {
					System.out.println(b);
				}
			}
			
			Map<Double, Map<String, List<Book>>> multiLevelMap = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating, Collectors.groupingBy(Book::getSource, toList())));
			System.out.println("\nmultiLevelMap: " + multiLevelMap);

			Map<Double, Long> ratingsCountMap = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating, Collectors.counting()));
			System.out.println("\nratingsCountMap: " + ratingsCountMap);
			System.out.println("\ncount: " + treeMap.values().stream().collect(Collectors.counting()));

			Map<Double, Double> ratingsAvgPriceMap = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating, Collectors.averagingDouble(Book::getPrice)));
			System.out.println("\nratingsAvgPriceMap: " + ratingsAvgPriceMap);

			Map<Double, Optional<Book>> ratingsMinPriceMap = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating, Collectors.minBy(Comparator.comparingDouble(Book::getPrice))));
			System.out.println("\nratingsMinPriceMap: " + ratingsMinPriceMap);

			Map<Double, DoubleSummaryStatistics> ratingsSummaryMap = treeMap.values().stream()
			.collect(Collectors.groupingBy(Book::getRating, Collectors.summarizingDouble(Book::getPrice)));
			System.out.println("\nDoubleSummaryStatistics: " + ratingsSummaryMap);

			Map<Boolean, List<Book>> partitionedMap = treeMap.values().stream()
					.collect(Collectors.partitioningBy(b -> b.getRating() >= 4.5));
			System.out.println("\npartitionedMap: " + partitionedMap);

			//System.out.println("\ngroupingBy with values as List ... ");
			Map<Double, List<String>> ratingsTitleMap = treeMap.values().stream()
					.collect(Collectors.groupingBy(Book::getRating, Collectors.mapping(Book::getTitle, toList())));
			System.out.println("\nratingsTitleMap: " + ratingsTitleMap);
	}
	
	private static void collectToCollection(List<Book> books) {
		System.out.println("\nIn collectToCollection ...");
		List<Book> list1 = books.stream()
			.filter(b -> b.getRating() >= 4.5)
			.distinct()
			.collect(ArrayList::new,
					ArrayList::add,
					ArrayList::addAll);
			//.collect(Collectors.toList());
		System.out.println("list1.size: " + list1.size());
		
		Set<Book> set1 = books.stream()
				.filter(b -> b.getRating() >= 4.5)
				.collect(toSet());
		System.out.println("set1.size: " + set1.size());
		
		TreeSet<Book> set2 = books.stream()
				.filter(b -> b.getRating() >= 4.5)
				.collect(toCollection(TreeSet:: new));
		System.out.println("set2.size: " + set2.size());
	}
	
	// if accumulator mutates, use collect(). Otherwise, use reduce()
	private static void mutableReduction() {
		System.out.println("\nmutableReduction ... ");
		String[] grades = {"A", "A", "B"};
		
		StringBuilder concat2 = Arrays.stream(grades).parallel()
				/*.collect(() -> new StringBuilder(), 
						(sb, s) -> sb.append(s),
						(sb1, sb2) -> sb1.append(sb2));*/
				.collect(StringBuilder::new, 
						StringBuilder::append,
						StringBuilder::append);
		System.out.println("concat2: " + concat2);
		
		String concatWithJoining = Arrays.stream(grades).parallel()
				.collect(joining());
		System.out.println("concatWithJoining: " + concatWithJoining);
	}
	
	static void overloadedReductions() {
		System.out.println("\noverloadedReductions ... ");
		
		String[] grades = {"A", "A", "B"};
		
		// Stream API: Design Principle!!!
		// API does not differentiate between sequential & parallel streams
		String concat1 = Arrays.stream(grades)
			.reduce("", (s1, s2) -> s1 + s2);
		System.out.println("concat1: " + concat1);
		
		// Single instance of container is used + 
		//                SB is not thread-safe + 
		//                combiner redundantly combines
		StringBuilder concat2 = Arrays.stream(grades).parallel()
		.reduce(new StringBuilder(), 
				(sb, s) -> sb.append(s),
				(sb1, sb2) -> sb1.append(sb2));
				//null);
		System.out.println("concat2: " + concat2);
		
		
		// Not efficient: Each accumulation step creates a new StringBuilder
		StringBuilder concat3 = Arrays.stream(grades).parallel()
				.reduce(new StringBuilder(), 
						(sb, s) -> new StringBuilder().append(sb).append(s),
						(sb1, sb2) -> sb1.append(sb2));						
				System.out.println("concat3: " + concat3);
								
	}
	
	// Limitations:
	//   1. Cumbersome
	//   2. Parallelizing is painful
	//   3. Synchronizing shared mutable variable is expensive
	private static void reduceImperatively(List<Book> books) {
		System.out.println("\nReducing imperatively ...");
		Book result = null;
		
		for (Book book : books) {
			// Initialize result with first book having rating >= 4.5
			if (result == null) {
				if (book.getRating() >= 4.5) {
					result = book;
				}				
				continue;
			}
			
			if (book.getRating() >= 4.5 && result.getPrice() > book.getPrice()) {
				result = book;
			}
		}
		
		System.out.println("(Imperative) Lowest priced book with rating >= 4.5: " + result);
		
	}	
		
	// Find the lowest priced book with a rating >= 4.5
	private static void reduce(List<Book> books) {
		System.out.println("\nReduce ...");
		books.stream()
			.filter(b -> b.getRating() >= 4.5)
			.reduce((b1, b2) -> b1.getPrice() <= b2.getPrice() ? b1 : b2)
			.ifPresent(b -> System.out.println("Lowest priced book: " + b));				
	}
	
		


	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));

			collectToMap(books);
		
	}	
		
}