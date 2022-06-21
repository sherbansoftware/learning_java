package Classes.Classes_Types.Anonymous_Class;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.9.5

/*                                               Anonymous classes


    ○ Are inner classes with no name. Since they have no name,

                  * we can't use them in order to create instances of anonymous classes.

           As a result, we have to declare and instantiate anonymous classes in a single expression at the point of use.


                                                   We may either:


    ○ Extend an existing class

    ○ Implement an interface


                                               Extend an existing class:


        new Book("Design Patterns") {
        @Override
        public String description() {
                return "Famous GoF book.";
        }
    }


                                             Implement a interface:


     new Runnable() {
        @Override
        public void run() {
        ...
       }
    }


                                                    Anonymous Constructors


    ○ An anonymous class cannot have an explicitly declared constructor. Instead, an anonymous constructor is implicitly
        declared for an anonymous class.

                                                            Note

            * An anonymous class declaration is automatically derived from a class instance creation expression by the
                Java compiler.

            * An anonymous class is never abstract (§8.1.1.1).

            * An anonymous class is always implicitly final (§8.1.1.2).

            * An anonymous class is always an inner class (§8.1.3); it is never static (§8.1.1, §8.5.1).

            * you can just do it  ONE TIME, as a one shot thing.Which is, which is often quite useful.

            * It has to be 10 lines or fewer


                                       Anonymous Classes vs Lambdas


             Anonymous class                                               Lambdas

     ○  Has associated object + verbose                        ○ No associated object(invoke-dynamic)
        Objects are created on every use                             + compact representation
        unless they are declared as Singletons                    Is not associated object as it is implemented
          using static final phase.                               differently, and it is based on the bytecode instruction
                                                                   called in dynamic,
                                                                  Lambdas memory is allocated only once, photometric
                                                                  has very little memory footprint as used.

     ○ In performance benchmarks Lambdas are more efficient than using anonymous objects.

*/

class Machine {
    public void start() {
        System.out.println("Starting machine...");
    }
}

interface Plant {
    public void grow();
}

public class Anonymous_Class {
    public static void main(String[] args) {

        // extend a existing class Machine using lambda expressions
        new Machine() {
            public void start() {
                System.out.println("Machine starting...");
            }
        }.start();


        // implement interface Plant
        new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant grows...");
            }
        }.grow();

        // using lambda expressions
        Plant plant = () -> {
            System.out.println("Plant lambda grows...");
        };
        plant.grow();
    }
}

