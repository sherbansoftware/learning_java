package Basic_Principles_OOP.Aggregation;

/*                                               Aggregation in Java

    If a class have an entity reference, it is known as Aggregation.
    Aggregation is actually a special form of association.This means that it is referred as the relationship between
        two classes like Association. However, it's a directional association, which means it strictly follows a
        one-way association.

    Aggregation represents:

        HAS-A relationship.

    The Aggregate class contains a reference to another class and
        is said to HAVE THE OWNERSHIP of that class. Each class that is referenced is considered to be a part of
        the Aggregate class.

                                                  When use Aggregation?

        * Code reuse is also best achieved by aggregation when there is no is-a relationship.
        * Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects
          involved; otherwise, aggregation is the best choice.

                                       When to use Inheritance and Aggregation?

        * When you want to use some property or behaviour of any class without the requirement of modifying it or adding
              more functionality to it, in such case Aggregation is a better option because in case of Aggregation we are
              just using any external class inside our class as a variable.

        * Whereas when you want to use and modify some property or behaviour of any external class or may be want to add
              more function on top of it, its best to use Inheritance.

                                                         NOTE

*/

public class Aggregation {

    static class Publisher {

        String name;
        String publisherID;
        String city;

        Publisher(String name, String publisherID, String city) {
            this.name = name;
            this.publisherID = publisherID;
            this.city = city;
        }
    }

    static class Author {

        String authorName;
        int age;
        String place;

        // Author class constructor
        Author(String name, int age, String place) {
            this.authorName = name;
            this.age = age;
            this.place = place;
        }

        public void getSignature() {
            System.out.println ("Get : " + this.authorName + "'s signature ");
        }
    }

    static class Book {
        String name;
        int price;
        // author details
        private Author author;
        private Publisher publisher;

        Book(String n, int p, Author author, Publisher publisher) {
            this.name = n;
            this.price = p;
            this.author = author;
            this.publisher = publisher;
        }

        public static void main(String[] args) {
            Publisher publisher = new Publisher ("Sun Publication", "JDSR-III4", "LA");
            Author author = new Author ("John", 42, "USA");
            Book b = new Book ("Java for Beginners", 800, author, publisher);
            System.out.println ("Book Name: " + b.name);
            System.out.println ("Book Price: " + b.price);
            System.out.println ("------------Author Details----------");
            System.out.println ("Author Name: " + b.author.authorName);
            System.out.println ("Author Age: " + b.author.age);
            System.out.println ("Author place: " + b.author.place);
            System.out.println ("------------Publisher Details-------");
            System.out.println ("Publisher Name: " + b.publisher.name);
            System.out.println ("Publisher ID: " + b.publisher.publisherID);
            System.out.println ("Publisher City: " + b.publisher.city);
            b.author.getSignature ();
        }

    }
}
