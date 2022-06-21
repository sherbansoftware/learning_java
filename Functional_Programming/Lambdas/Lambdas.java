package Functional_Programming.Lambdas;

// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26605802#overview


/*                                        Lambdas Expressions (Lambdas)


    ○ Lambda comes from  Lambda-calculus:

                 * which is a mathematical notation for functions.

    ○  All Lambda-calculus functions

                 * are anonymous.

    ○ LAMBDA is essentially:

                  * An anonymous FUNCTION.

                  * Compact way to define functions

                  * Usefully for passing around functionality

                  * It is basically an expression, a lambda expression.


    ○ Creating a Thread using Lambdas:  -------------------------------------------------------------------------------

       We need to pass an INSTANCE of Runnable Interface like argument
       We define a Lambda Expressions which is an IMPLEMENTATION of run method.

                  * new Thread(()-> System.out.println("some string")).start;

                  * ()-> System.out.println("some string")     -- Lambda Expressions


                                    Languages that support Lambda expressions


    ○ LISP,Scala,C#, Ruby,C++,Python


    ○ The TARGET date for lambda expression

                 * is a Functional Interface.

    ○ It is not associated with any class, and it is simply

                  * a function by itself

                  * that is, in our familiar terminology, a method by itself.

    ○   Lambda expressions enabling in writing

                  * faster,

                  * more compact

                  * and cleaner code.

    ○ To benefit of Functional Programming Java came up with Lambdas

    ○ You can send

                  * behaviour or function as an argument

          by using lambda expressions and most of the other programming languages like:

                   * JavaScript,
                   * Python,
                   * C++,

           already having this feature.And Java is the last one to join the party.

    ○ And finally, to use :

                    * parallel processing using LAMBDA, with streams.

    ○ Lambda expressions are just a way of:

                    * passing a block of code to a method

                    * and can only be used with interfaces that contain only one method that has to be implemented.

            So these interfaces are also referred to as Functional Interfaces

    ○ By using a lambda expression instead of a creating a class that implements runnable or using an anonymous class
          actually able to reduce the lines of code we have to write.

    ○ Lambda expressions got three parts:

                      * first one is the argument list ()

                      * second one is an arrow token   ->

                       * and thirdly the body


                                      Functional Interface:


    ○ Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may
           be treated lambda expressions.

    ○ Java 8's

                        *  default methods are not abstract and do not count:

                        * a functional interface may still have multiple default methods.

    ○ Functional interfaces which are gathered in the java.util.function package, satisfy most developers' needs in
           providing target types for lambda expressions and method references.
      Each of these interfaces is general and abstract, making them easy to adapt to almost any lambda expression.

    ○ Developers should explore this package before creating new functional interfaces.

    ○ Annotate your functional interfaces with

                         * @FunctionalInterface.

                 An interface, which was designed to be functional,

                          * could accidentally be changed by adding of otherabstract method/methods,

                          * rendering it unusable as a functional interface.


                                            Anonymous Classes vs Lambdas


             Anonymous class                                               Lambdas

     ○  Has associated object + verbose                        ○ No associated object(invoke-dynamic)
        Objects are created on every use                             + compact representation
        unless they are declared as Singletons                    Is not associated object as it is implemented
          using static final phase.                               differently, and it is based on the bytecode instruction
                                                                   called in dynamic,
                                                                  Lambdas memory is allocated only once, photometric
                                                                  has very little memory footprint as used.

     ○ In performance benchmarks lambdas are more efficient than using anonymous objects.


                                                   NOTE


            * can use variable in lambda expressions if they are effectively final- it cannot be resigned new value
            * lambda expressions is an object
            * functional programming languages

                      - had their roots in lambda calculus,

                and they're all about programming using functions.

             * Lambda expression

                       - cannot be assigned to a Method parameter or any variable

                whose type is NOT a Functional Interface


 */
public class Lambdas {
    // Lambda Expressions
    public static void main(String[] args) {
// create a thread
        Thread john = new Thread(() -> System.out.println("John"));
        System.out.println(Thread.currentThread().getName());
        System.out.println("Print:" + john.getName());
        john.start();
    }


}
