package Interfaces;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html


/*                                                 Interface


    ○ Another way to achieve abstraction in Java, is with interfaces.

    ○ An interface is a completely "abstract class" that is

                   * used to group related methods with empty bodies

           Simply, abstract class achieves

                   * partial abstraction (0 to 100%)

                   * whereas interface achieves fully abstraction (100%).

    ○ An interface declaration introduces a new reference type whose members are

                   * classes,

                   * interfaces,

                   * constants,

                   * and methods.

    ○ This type has no instance variables, and typically declares one or more abstract methods; otherwise unrelated
        classes can implement the interface by providing implementations for its abstract methods.

       Interface_Class may not be directly instantiated.

    ○ A NESTED interface:

                   * is any interface whose declaration occurs within the body of another class or interface.

     ○ A TOP LEVEL interface:

                   * is an interface that is not a nested interface.


                                       We distinguish between two kinds of interfaces:


     ○  normal interfaces

     ○  and annotation types


                                     Difference between interfaces and abstract classes


    ○  https://www.javatpoint.com/difference-between-abstract-class-and-interface

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

                                                 Functional interfaces


    https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html


                                                  When to use an interface


    * Implementing an interface just determines one thing that it does, and it can implement many interfaces, meaning it
          can do many different things.

    * If the functionality we are creating will be useful across a wide range of disparate objects, use an interface.
          Abstract classes should be used primarily for objects that are closely related, whereas interfaces are best
          suited for providing a common functionality to unrelated classes.

    * Interfaces are a good choice when we think that the API will not change for a while.

    * Interfaces are also good when we want to have something similar to multiple inheritances since we can implement
          multiple interfaces.
    * If we are designing small, concise bits of functionality, use interfaces. If we are designing large functional
          units, use an abstract class.

     * To achieve security - hide certain details and only show the important details of an object (interface).

     * Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be
           achieved with interfaces, because the class can implement multiple interfaces.

                                                      NOTE

    * An interface can be used to define a contract behavior and it can also act as a contract between two systems
          to interact

 */

public interface Interfaces {

}

