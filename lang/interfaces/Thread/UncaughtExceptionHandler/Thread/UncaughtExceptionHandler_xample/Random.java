package lang.interfaces.Thread.UncaughtExceptionHandler.Thread.UncaughtExceptionHandler_xample;

// https://www.geeksforgeeks.org/thread-uncaughtexceptionhandler-in-java-with-examples/


// Lets try to create a class which implements the interface UncaughtExceptionHandler from the Thread class to handle
// a division by 0 exception as follows:

// Java program to demonstrate the exception handler
// Creating a random class to implement the interface
class Random implements Thread.UncaughtExceptionHandler {

    // Method to handle the uncaught exception
    public void uncaughtException(Thread t, Throwable e) {
        // Custom task that needs to be
        // performed when an exception occurs
        System.out.println(
                "Welcome to GeeksforGeeks");
    }
}

class GFG {

    public static void main(String[] args) {

        // Passing the object of the type
        // UncaughtExceptionHandler to the setter method
        // setDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler(
                        new Random());

        System.out.println(10 / 0);
    }
}
