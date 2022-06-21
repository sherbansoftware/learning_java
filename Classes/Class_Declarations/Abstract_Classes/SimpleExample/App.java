package Classes.Class_Declarations.Abstract_Classes.SimpleExample;

public class App {
    public static void main(String[] args) {
                       // cannot be instantiated - abstract class

        // Machine machine1 = new Machine();

        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        cam1.run();


    }
}
