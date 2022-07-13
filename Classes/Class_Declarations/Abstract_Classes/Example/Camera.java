package Classes.Class_Declarations.Abstract_Classes.Example;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Starting camera.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutdown Camera");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff to Camera");
    }
}
