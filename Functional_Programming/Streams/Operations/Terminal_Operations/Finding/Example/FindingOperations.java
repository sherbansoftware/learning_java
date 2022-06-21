package Functional_Programming.Streams.Operations.Terminal_Operations.Finding.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperations {
	
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
	
	// findFirst needs more work in parallel env. Use findAny if it does the job.
	// java.util.Optional ~ 
	//     (a) to avoid dealing with null -- in case of find, 
	//     (b) to know if stream is empty -- in case of reduction operation
	private static void find(List<Book> books) {
		System.out.println("\nFinding ...");
		Book result = books.stream()
			.filter(d -> d.getRating() >= 4.8 && d.getPrice() <= 50.0)
			.findAny().orElseGet(FindingOperations::getDefault);

		Optional<Book> opt = Optional.ofNullable(result);
		System.out.println(opt.get());
		
		/*if (result.isPresent()) {
			System.out.println(result.get());
		} else {
			System.out.println("not found!!!");
		}*/
		
	}
	
	private static void print(Book b) {
		System.out.println(b);			 
	}
	
	private static Book getDefault() {			
		System.out.println("default ...");
		return new Book(0, "", 4.0, 25.0, "Amazon");
	}



	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();

		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		

		// All matching & finding operations + limit 
		//    are short-circuit operations (recall &&, ||)	
		
		find(books);		
	}
	
}