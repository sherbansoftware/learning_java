package Classes.Classes_Types.Anonymous_Class.Implement_a_Interface;

interface Plant {
    public void grow();
}

public class Implement_A_Interface {
    public static void main(String[] args) {

        // extend a interface
        new Plant() {
            public void grow() {
                System.out.println("Plants are growing normally");
            }
        }.grow();

        // using lambda expressions
        Plant plant = () -> System.out.println("Plant is lambda growing");
         plant.grow();
    }
}
