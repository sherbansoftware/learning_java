package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceOperations {

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

	// Optional<T> reduce(BinaryOperator<T> accumulator);--------------------------------------------------------------
	// Find the lowest priced book with a rating >= 4.5
	private static void reduce(List<Book> books) {
		System.out.println("\nReduce ...");
		books.stream()
			.filter(b -> b.getRating() >= 4.5)
			.reduce((b1, b2) -> b1.getPrice() <= b2.getPrice() ? b1 : b2)
			.ifPresent(b -> System.out.println("Lowest priced book: " + b));
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


	static void overloadedReductions() {
		System.out.println("\noverloadedReductions ... ");

		String[] grades = {"A", "A", "B"};

		String concat1 = Arrays.stream(grades)
		// T reduce(T identity, BinaryOperator<T> accumulator); -------------------------------------------------------
			.reduce("", (s1, s2) -> s1 + s2);
		System.out.println("concat1: " + concat1);

		//    <U> U reduce(U identity,
		//                 BiFunction<U, ? super T, U> accumulator,
		//                 BinaryOperator<U> combiner); ---------------------------------------------------------------
		StringBuilder concat2 = Arrays.stream(grades)
		.reduce(new StringBuilder(), (sb, s) -> sb.append(s),
				(sb1, sb2) -> sb1.append(sb2));
		System.out.println("concat2: " + concat2);

	}


	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();

		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));

		reduce(books);
		reduceImperatively(books);
		overloadedReductions();

	}

}