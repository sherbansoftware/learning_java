package Classes.Class_Declarations.Abstract_Classes;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.1.1.1

/*                                                  abstract Classes

    An abstract class is a class that is incomplete, or to be considered incomplete
     Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).

                                            Difference between interfaces and abstract classes

   https://www.javatpoint.com/difference-between-abstract-class-and-interface

    Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract
        class and interface both can't be instantiated.

                        Abstract class	                                                   Interface_Class

    1) Abstract class can have abstract and non-abstract methods.	Interface_Class can have only abstract methods. Since Java 8,
                                                                         it can have default and static methods also.

    2) Abstract class doesn't support multiple inheritance.                 	Interface_Class supports multiple inheritance.

    3) Abstract class can have final, non-final, static and              Interface_Class has only static and final variables.
      non-static variables.

    4) Abstract class can provide the implementation of interface.	      Interface_Class can't provide the implementation of
                                                                                         abstract class.

    5) The abstract keyword is used to declare abstract class.	           The interface keyword is used to declare interface.

    6) An abstract class can extend another Java class and implement        An interface can extend another Java interface only.
                          multiple Java interfaces.

    7) An abstract class can be extended using keyword "extends".	        An interface can be implemented using keyword "implements".

    8) A Java abstract class can have class members like                       Members of a Java interface are public by default.
                 private, protected, etc.

    9)Example:
                                                                                      Example:
         public abstract class Shape{                                                   public interface Drawable{
             public abstract void draw();                                                  void draw();
         }	                                                                            }

                                                 When to use an abstract class

            * extending an abstract class is just a  really a more fundamental statement about identity than simply
                  implementing an interface.It's as if the parent class determines what your child class is.

            * An abstract class is a good choice if
                  we are using the inheritance concept since it provides a common base class implementation to
                  derived classes.

            * An abstract class is also good if
                  we want to declare non-public members. In an interface, all methods must be public.

             * If we want to add new methods in the future,
                   then an abstract class is a better choice. Because if we add
                   new methods to an interface, then all of the classes that already implemented that interface will have
                   to be changed to implement the new methods.

             * If we want to create multiple versions of our component, create an abstract class.
                   Abstract classes provide a simple and easy way to version our components. By updating the base class,
                   all inheriting classes are automatically updated with the change. Interfaces, on the other hand, cannot
                   be changed once created.
                   If a new version of an interface is required, we must create a whole new interface.

              * Abstract classes have the advantage of allowing better forward compatibility.
                    Once clients use an interface, we cannot change it; if they use an abstract class, we can still add
                    behavior without breaking the existing code.

               * If we want to provide common, implemented functionality among all implementations of our component,
                     use an abstract class. Abstract classes allow us to partially implement our class,
                     whereas interfaces contain no implementation for any members.

                                                     NOTE

           * an abstract class is mainly used to define default behavior for subclasses, it means that all child classes
                 should have performed the same functionality.

            * It is a compile-time error if an attempt is made to create an instance of an abstract class using a class
                  instance creation expression https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.9.1.

             * A subclass of an abstract class that is not itself abstract may be instantiated, resulting in the execution
                  of a constructor for the abstract class and, therefore, the execution of the field initializers for
                  instance variables of that class.

              * A normal class may have abstract methods, that is, methods that are declared but not yet
                  implemented https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4.3.1
                  only if it is an abstract class. It is a compile-time error if a normal class that is not abstract
                  has an abstract method.

               * A class C has abstract methods if either of the following is true:

                     - Any of the member methods (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.2)
                           of C - either declared or inherited - is abstract.

                     - Any of C's superclasses has an abstract method declared with package access, and there exists no
                           method that overrides the abstract method from C or from a superclass of C.

                     - It is a compile-time error to declare an abstract class type such that it is not possible to
                            create a subclass that implements all of its abstract methods. This situation can occur if
                            the class would have as members two abstract methods that have the same method
                            signature (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4.2) but
                            return types for which no type is return-type-substitutable with both
                            (https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4.5).


*/


abstract class Abstract_Classes {
    int x = 1, y = 1;

    void move(int dx, int dy) {
        x += dx;
        y += dy;
        alert();
    }

    abstract void alert();
}
abstract class ColoredPoint extends Abstract_Classes {
    int color;
}
class SimplePoint extends Abstract_Classes {
    void alert() { }
}