package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.AsCollection.AsSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class AsSetOperations {

	private static void collectToCollection(List<Book> books) {


		// collect to TreeSet ----------------------------------------------------------------------------------------------
		TreeSet<Book> set = books.stream()
				.filter(b -> b.getRating() >= 4.5)
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("set.size: " + set.size());
		
	}

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		

		collectToCollection(books);
		
	}	
		
}