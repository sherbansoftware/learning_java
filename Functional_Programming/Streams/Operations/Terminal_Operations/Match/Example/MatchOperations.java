package Functional_Programming.Streams.Operations.Terminal_Operations.Match.Example;


import java.util.ArrayList;
import java.util.List;


public class MatchOperations {
	
	static class Book {		
		private long isbn;
		private String title;	
		private double rating;
		private double price;
		private String source;
		
		public Book(long isbn, String title, double rating, double price, String source) {
			this.isbn = isbn;
			this.title = title;
			this.rating = rating;
			this.price = price;
			this.source = source;
		}
		
		public long getIsbn() {
			return isbn;
		}
		
		public String getTitle() {
			return title;
		}
		
		public double getRating() {
			return rating;
		}
		
		public double getPrice() {
			return price;
		}
		
		public String getSource() {
			return source;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (isbn ^ (isbn >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (isbn != other.isbn)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", source="
					+ source + "]";
		}
		
	}
	
	
	// Queries:
	//  (a) Is there at least one highly rated book (>= 4.8) that is inexpensive (<= $50)?
	//  (b) Do all the books have a rating >= 4.8
	//  (c) Check if none of books have bad rating (2.0)?
	private static void match(List<Book> books) {
		System.out.println("\nMatching ... ");
		boolean anyMatch = books.stream()
			.anyMatch(d -> d.getRating() >= 4.8 && d.getPrice() <= 50.0);
		System.out.println("anyMatch? " + anyMatch);// -----------------------------------------------------------------
		
		boolean allMatch = books.stream()
			.allMatch(d -> d.getRating() >= 4.8);
			//.noneMatch(d -> d.getRating() < 4.8);
		System.out.println("allMatch? " + allMatch); //-----------------------------------------------------------------
		
		boolean noneMatch = books.stream()
				.noneMatch(d -> d.getRating() <= 2.0);
			    // .allMatch(d -> d.getRating() > 2.0);
				//.anyMatch(d -> d.getRating() <= 2.0);
		System.out.println("noneMatch? " + noneMatch); //----------------------------------------------------------------
		
	}
		


	
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		
		// intermediate operations (return stream objects)
		//slice(books);		
		
		// terminal operations (return non-stream objects)
		match(books);  // matching stream elements to some criteria
		
		// All matching & finding operations + limit 
		//    are short-circuit operations (recall &&, ||)		
		
	}
	
}