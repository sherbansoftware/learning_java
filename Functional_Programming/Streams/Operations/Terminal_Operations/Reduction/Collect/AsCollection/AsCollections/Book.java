package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.AsCollection.AsCollections;

import java.util.Objects;

class Book implements Comparable {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Double.compare(book.rating, rating) == 0 && Double.compare(book.price, price) == 0 && title.equals(book.title) && source.equals(book.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, rating, price, source);
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", source="
                + source + "]";
    }

    @Override
    public int compareTo(Object o) {
        return Long.valueOf(isbn).compareTo(((Book) o).getIsbn());
    }

}
