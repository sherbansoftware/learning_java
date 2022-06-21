package Classes.Class_Declarations.Abstract_Classes.SimpleExample;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Starting car.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutdown Car.");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff to Car");
    }
}
