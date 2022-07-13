package Classes.Nested_Class.Anonymous_Class.Extended_A_Class;


class Book {
    public String name;

    public Book(String name) {
        this.name = name;
    }

    public void description() {
        System.out.println("Descriptions from Book class");
    }

    public void content() {
        System.out.println("Content...");

    }
}

public class Extended_A_Class {
    public static void main(String[] args) {

        // anonymous class for Book class

        new Book("Some name") {
            @Override
            public void description() {
                super.description();
            }
        }.description();


        // for the second method must use reference book

        Book book = new Book("New name") {
            @Override
            public void content() {
                //  super.content();  // this works
                System.out.println("Content for new Name");
            }
        };

        book.content();
    }
}
