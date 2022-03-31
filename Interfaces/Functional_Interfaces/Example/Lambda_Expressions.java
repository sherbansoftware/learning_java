package Interfaces.Functional_Interfaces.Example;

public class Lambda_Expressions {
    public static void main(String args[]) {

        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New lambda thread created");
            String name = Thread.currentThread().getName();
            System.out.println("Thread name: " + name);
        }).start();

        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        }).start();

    }
}
