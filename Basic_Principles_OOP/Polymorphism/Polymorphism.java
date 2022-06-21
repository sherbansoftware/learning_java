package Basic_Principles_OOP.Polymorphism;

// https://www.mygreatlearning.com/blog/polymorphism-in-java/

/*                                                    Polymorphism

    is defined as "Same code" giving "Different behaviour"

    is the ability of an object to take many forms. To simply put, polymorphism in java allows us to perform the same
        action in many different ways. Any Java object that can pass more than one IS-A test is considered to be
        polymorphic and in java, all the java objects are polymorphic as it has passed the IS-A test for their own type
        and for the class Object.

        There are two types of polymorphism in java:

                * compile-time polymorphism
                * runtime polymorphism.

                                   Compile-Time polymorphism in java is also known as Static Polymorphism.

    In this process, the call to the method is resolved at compile-time. Compile-Time polymorphism is achieved through

        Method Overloading.

                                                  Method Overloading

    is when a class has multiple methods with the same name, but the number, types and order of parameters and the return
        type of the methods are different. Java allows the user freedom to use the same name for various functions as
        long as it can distinguish between them by the type and number of parameters.

                             Runtime polymorphism in java is also known as Dynamic Binding
                                                 or Dynamic Method Dispatch.

    In this process, the call to an overridden method is resolved dynamically at runtime rather than at compile-time.
        Runtime polymorphism is achieved through

        Method Overriding.

                                                   Method Overriding

    is done when a child or a subclass has a method with the same name, parameters and return type as the parent or the
        superclass, then that function overrides the function in the superclass. In simpler terms, if the subclass provides
        its definition to a method already present in the superclass, then that function in the base class is said to
        be overridden.

    It should be noted that runtime polymorphism can only be achieved through functions and not data members.

    Overriding is done by using a reference variable of the superclass. Which method to be called is determined based
        on the object which is being referred to by the reference variable. This is also known as Upcasting.

                                                      NOTE

    * if you have a child class of some parent class, you can always use the child class anywhere where you would normally
         use the parent class.

*/

public class Polymorphism {
}
