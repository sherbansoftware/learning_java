package Interfaces.Static_Methods;

/*                                                     Static Methods:

    The interfaces can have static methods as well which is similar to static method of classes.

                                              Default Methods and Multiple Inheritance

    In case both the implemented interfaces contain default methods with same method signature, the implementing class
        should explicitly specify which default method is to be used or it should override the default method.

                                                        NOTE

*/


// A simple Java program to TestClass static methods in java

interface Static_Methods {
    // abstract method
    public void square(int a);

    // static method
    static void show() {
        System.out.println("Static Method Executed");
    }
}

class TestClass implements Static_Methods {
    // Implementation of square abstract method
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.square(4);

        // Static method executed
        Static_Methods.show();
    }
}


// A simple Java program to demonstrate multiple  inheritance through default methods.

interface TestInterface1 {
    // default method
    default void show() {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2 {
    // Default method
    default void show() {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code
class TestClass1 implements TestInterface1, TestInterface2 {
    // Overriding default show method
    public void show() {
        // use super keyword to call the show method of TestInterface1 interface
        TestInterface1.super.show();

        // use super keyword to call the show method of TestInterface2 interface
        TestInterface2.super.show();
    }

    public static void main(String args[]) {
        TestClass1 d = new TestClass1();
        d.show();
    }
}
