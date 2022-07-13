package Classes.Class_Declarations.Abstract_Classes.Example;

public class Main {
    public static void main(String[] args) {
                       // cannot be instantiated - abstract class

        // Machine machine1 = new Machine();

        Camera cam = new Camera();
        cam.setId(5);

        Machine car = new Car();
        car.setId(4);

        cam.run();
        System.out.println("__________________________");
        car.run();

    }
}
