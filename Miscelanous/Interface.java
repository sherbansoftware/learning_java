package Miscelanous;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html

/*                                                        Interface

    An interface declaration introduces a new reference type whose members are classes, interfaces, constants, and methods.
        This type has no instance variables, and typically declares one or more abstract methods; otherwise unrelated
        classes can implement the interface by providing implementations for its abstract methods. Interface_Class may not
        be directly instantiated.

        • A nested interface
             is any interface whose declaration occurs within the body of another class or interface.

        • A top level interface
             is an interface that is not a nested interface.

                                           We distinguish between two kinds of interfaces:

        • normal interfaces
        • and annotation types

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

    Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).

                                                  Interface Declarations

    An interface declaration specifies a new named reference type. There are two kinds of interface declarations -
        normal interface declarations and annotation type declarations (§9.6).

    InterfaceDeclaration:

            * NormalInterfaceDeclaration
            * AnnotationTypeDeclaration

    NormalInterfaceDeclaration:

        {InterfaceModifier} interface Identifier [TypeParameters] [ExtendsInterfaces] InterfaceBody

    The Identifier in an interface declaration specifies the name of the interface.
    It is a compile-time error if an interface has the same simple name as any of its enclosing classes or interfaces.

The scope and shadowing of an interface declaration is specified in §6.3 and §6.4.


                                                 Functional interfaces

    https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

                                                   Interface Modifiers

            * Annotation
            * public
            * protected
            * private
            * abstract
            * static
            * strictfp

                                                  abstract Interfaces

    Every interface is implicitly abstract.
    This modifier is obsolete and should not be used in new programs.

                                                   strictfp Interfaces

    The effect of the strictfp modifier is to make all float or double expressions within the interface declaration be
        explicitly FP-strict (§15.4).
    This implies that all methods declared in the interface, and all nested types declared in the interface, are
       implicitly strictfp.

                                                  Generics Interfaces and Type Parameters

    An interface is generic if it declares one or more type variables (§4.4).

                                                   Superinterfaces and Subinterfaces

    If an extends clause is provided, then the interface being declared extends each of the other named interfaces and
        therefore inherits the member types, methods, and constants of each of the other named interfaces.

    These other named interfaces are the direct superinterfaces of the interface being declared.

    Any class that implements the declared interface is also considered to implement all the interfaces that this i
        interface extends.

                                                    Interface Body and Member Declarations

    The body of an interface may declare members of the interface, that is, fields (§9.3), methods (§9.4), classes (§9.5),
        and interfaces (§9.5).

        InterfaceBody:
            { {InterfaceMemberDeclaration} }
        InterfaceMemberDeclaration:

                * ConstantDeclaration
                * InterfaceMethodDeclaration
                * ClassDeclaration
                * InterfaceDeclaration

    The scope of a declaration of a member m declared in or inherited by an interface type I is specified in §6.3.

 */




public interface Interface {
    // fields are constants
    int EMERGENCYNUMBER =112;

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    default void callEmergency() {

    }
}
