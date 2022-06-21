package Basic_Principles_OOP.Polymorphism.Overloading;

/*                                  Compile-Time polymorphism in java is also known as Static Polymorphism.

    In this process, the call to the method is resolved at compile-time. Compile-Time polymorphism is achieved through
        Method Overloading.

                                                       Method Overloading

    is when a class has multiple methods with the same name, but the number, types and order of parameters and the return
        type of the methods are different. Java allows the user freedom to use the same name for various functions as
        long as it can distinguish between them by the type and number of parameters.
*/

class Shapes {
    public void area() {
        System.out.println("Find area ");
    }
    public void area(int r) {
        System.out.println("Circle area = "+3.14*r*r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area="+0.5*b*h);
    }
    public void area(int l, int b) {
        System.out.println("Rectangle area="+l*b);
    }


}

class Overloading {
    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object

        myShape.area();
        myShape.area(5);
        myShape.area(6.0,1.2);
        myShape.area(6,2);

    }
}

