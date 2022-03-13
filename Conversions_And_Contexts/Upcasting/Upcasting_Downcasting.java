package Conversions_And_Contexts.Upcasting;

class Machine {
    public String name;

    public void start() {
        System.out.println("Machine started");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }

}

class Upcasting_Downcasting {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

//        machine1.start();
//        camera1.start();
//        camera1.snap();

        // upcasting is really safe -------------------------------------------------------------------------------

        // well I've taken a variable of type camera that refers to a, camera object,
        //and I've made this variable of type machine refer to the object.
        //So the, we say that I've upcasted or I casted.(camera to machine)
        // And this reference, this variable to this variable type.
        //And it's up, because we've gone up the class hierarchy from camera to machine.

        Camera camera1 = new Camera();
        Machine machine2 = camera1;
        System.out.println("Upcasting camera to machine");
        machine2.start();
        // error: machine.snap();

        // Downcasting  is not really safe ---------------------------------------------------------------------------
        // you wanna be really sure that the variable you're downcasting really does
        //refer to an object of the type you're downcasting.
        Machine machine3 = new Camera();
        System.out.println("Downcasting machine to camera");
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        // Doesn't work --- runtime error
        Machine machine4 = new Machine();
        //  Camera camera3 = (Camera) machine4;
//        camera3.start();
//        camera3.snap();

        // NOTE

        /* by the way, you can't Downcast between unrelated types.

        Again for the same reason that you can't downcast a machine object to a,to a camera.
        Because you can't change one object to another object.
        All you can do is change the references and the references then depend on the underlying object, which doesn't
            change to invoke the correct code.

        It's really common to cast objects to objects further down the hierarchy but you have to be sure that the the
           object variable that you're casting really does revert to the kind of object that you're trying to downcast to,
           otherwise you will get an error at runtime.

         */

    }
}