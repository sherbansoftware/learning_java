package Classes.Classes_Types.Anonymous_Class.Extended_A_Class;


class Book {
    public String name;

    public Book(String name) {
        this.name = name;
    }
    public void description() {
        System.out.println("Descriptions");
    }
}

public class Extended_A_Class {
    public static void main(String[] args) {

        new Book("Design Patterns") {
            @Override
            public void description() {
                System.out.println("Famous GoF book.");
            }
        }.description();


     }

}
