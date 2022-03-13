
package Java8.Lambda_Expressions;
/*                                        lambdas Expressions (Lambdas)

            expressions can only be used with interfaces that contain only one method that has to be implemented so these
            interfaces are also referred to as functional interfaces now by using a lambda expression instead of a
            creating a class that implements runnable or using an anonymous class actually able to reduce the lines of
            code we have to write.

      Lambda expressions got three parts: ------------------------------------------------------------------------------

            first one is the argument list ()

            second one is an arrow token   ->

             and thirdly the body

       Functional Interface_Class: ------------------------------------------------------------------------------------------

               Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may
               be treatedas lambda expressions.
               Java 8's default methods are not abstract and do not count: a functional interface may still have multiple
               default methods.

        Functional interfaces which are gathered in the java.util.function package,

               satisfy most developers' needs in providing target types for lambda expressions and method references.
               Each of these interfaces is general and abstract, making them easy to adapt to almost any lambda expression.
               Developers should explore this package before creating new functional interfaces.

        Annotate your functional interfaces with @FunctionalInterface.

               An interface, which was designed to be functional, could accidentally be changed by adding of other abstract
               method/methods, rendering it unusable as a functional interface.


 */