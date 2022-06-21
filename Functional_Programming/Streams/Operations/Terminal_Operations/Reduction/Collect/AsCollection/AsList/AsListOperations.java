package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.AsCollection.AsList;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsListOperations {

	private static void collectToCollection(List<Book> books) {

		// Collect to list --------------------------------------------------------------------------------------------
		System.out.println("\nIn collectToCollection ...");
		List<Book> list1 = books.stream()
			.filter(b -> b.getRating() >= 4.5)
			.distinct()
			.collect(Collectors.toList());
		System.out.println("list1.size: " + list1.size());
	}
	

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		

		collectToCollection(books);
		
	}	
		
}