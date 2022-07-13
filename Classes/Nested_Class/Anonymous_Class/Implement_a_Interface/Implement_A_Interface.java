package Classes.Nested_Class.Anonymous_Class.Implement_a_Interface;

interface Plant {
    void grow();
}

public class Implement_A_Interface {
    public static void main(String[] args) {

        // implement interface Plant
        new Plant() {
            public void grow() {
                System.out.println("Plant is anonymous growing!");
            }
        }.grow();

        // using lambda expressions
        Plant plant = () -> System.out.println("Plant is lambda growing!");
        plant.grow();
    }
}
