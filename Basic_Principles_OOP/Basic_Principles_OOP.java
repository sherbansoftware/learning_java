package Basic_Principles_OOP;

/*                                                  Definition of OOP Concepts in Java

    The main ideas behind Java’s Object-Oriented Programming, OOP concepts include:

                * abstraction,
                * encapsulation,
                * inheritance
                * polymorphism.

            Basically, Java OOP concepts let us create working methods and variables, then re-use all or part of them
            without compromising security. Grasping OOP concepts is key to understanding how Java works.

    Java defines OOP concepts as follows:

                                                          Abstraction.

    Using simple things to represent complexity. We all know how to turn the TV on, but we don’t need to know how it works
        in order to enjoy it. In Java, abstraction means simple things like objects, classes and variables represent more
        complex underlying code and data. This is important because it lets you avoid repeating the same work multiple times.

                                                         Encapsulation.

    The practice of keeping fields within a class private, then providing access to those fields via public methods.
    Encapsulation is a:

            protective barrier that keeps the data and code safe within the class itself.

        We can then reuse objects like code components or variables without allowing open access to the data system-wide.

                                                        Inheritance

    A special feature of Object-Oriented Programming in Java, Inheritance lets programmers

            create new classes that share some attributes of existing classes.

        Using Inheritance lets us build on previous work without reinventing the wheel.

                                                        Polymorphism

    Allows programmers to use the same word in Java to mean different things in different contexts.

    One form of polymorphism is method:

                * overloading.

        That’s when the code itself implies different meanings.

    The other form is method:

                * overriding.

        That’s when the values of the supplied variables imply different meanings.

                                                  How OOP Concepts in Java Work

    OOP concepts in Java work by letting programmers create components that are reusable in different ways while
        maintaining security.

                                                     How Abstraction Works

    Abstraction lets programmers create useful and reusable tools. For example, a programmer can create several different
        types of objects, which can be variables, functions or data structures. Programmers can also create different
        classes of objects as ways to define the objects.

    For instance, a class of variable might be an address. The class might specify that each address object shall have

                * a name,
                * street,
                * city
                * and zip code.

            The objects, in this case, might be employee addresses, customer addresses or supplier addresses.

                                                       How Encapsulation Works

    Encapsulation lets us reuse functionality without jeopardizing security.
        It’s a powerful, time-saving OOP concept in Java. For example, we may create a piece of code that calls specific
        data from a database. It may be useful to reuse that code with other databases or processes. Encapsulation lets
        us do that while keeping our original data private. It also lets us alter our original code without breaking it
        for others who have adopted it in the meantime.

                                                       How Inheritance Works

    Inheritance is another labor-saving Java OOP concept that works by:

            * letting a new class adopt the properties of another.

        We call the inheriting class a subclass or a child class.
        The original class is often called the parent.
        We use the keyword extends to define a new class that inherits properties from an old class.

                                                     How Polymorphism Works

    Polymorphism in Java works by:

            * using a reference to a parent class to affect an object in the child class.

        We might create a class called “horse” by extending the “animal” class. That class might also implement the
            “professional racing” class. The “horse” class is “polymorphic,” since it inherits attributes of both the
            “animal” and “professional racing” class.

    Two more examples of polymorphism in Java are method overriding and method overloading.

                                                    Overriding,

    the child class can use the OOP polymorphism concept to override a method of its parent class.
    That allows a programmer to use one method in different ways depending on whether it’s invoked by an object of the
        parent class or an object of the child class.

                                                   Overloading,

    a single method may perform different functions depending on the context in which it’s called.
    This means a single method name might work in different ways depending on what arguments are passed to it.

                                               Interface Vs. Abstract Class

    PARAMETERS	                              Interface	                                          Abstract class

       Speed	                               Slow                                                   Fast

 Multiple Inheritances	                Implement several Interfaces	                       Only one abstract class

   Structure	                         Abstract methods(default and static)	             Abstract & concrete methods

When to use	                                Future enhancement	                                 To avoid independence

Inheritance/ Implementation   	    A Class can implement multiple interfaces	        The class can inherit only one Abstract Class

Default                         While adding new stuff to the interface, it is            In case of Abstract Class, you can take
Implementation	                a nightmare to find all the implementors and               advantage of the default implementation.
                                 implement newly defined stuff.

Access Modifiers	             The interface does not have access modifiers.            Abstract Class can have an access modifier.
                                  Everything defined inside the interface is
                                  assumed public modifier

When to use	                    It is better to use interface when various         	      It should be used when various
                                implementations share only method signature               implementations of the same kind share a
                                Polymorphic hierarchy of value types.                     common behavior.

Data fields	                     the interface cannot contain data fields.	                the class can have data fields.

Multiple Inheritance Default	  A class may implement numerous interfaces.	            A class inherits only one abstract class.

Implementation	                   An interface is abstract so that 	                   An abstract class can give complete,
                                    it can’t provide any code.                                 default code which should be overridden.

Use of Access 	                 You cannot use access modifiers 	                       You can use an abstract class which
modifiers                         for the method, properties, etc.                             contains access modifiers.

Usage	                          Interfaces help to define the peripheral 	               An abstract class defines the identity
                                         abilities of a class.                                 of a class.

Defined fields	                      No fields can be defined	                            An abstract class allows you to define
                                                                                                both fields and constants

Inheritance	                      An interface can inherit multiple 	                    An abstract class can inherit a class
                                      interfaces but cannot inherit a class.                    and multiple interfaces.

Constructor 	                  An interface cannot declare 	                            An abstract class can declare
or destructors                        constructors or destructors.                              constructors and destructors.

Limit of Extensions	              It can extend any number of interfaces.	        It can extend only one class or one abstract class.

Abstract keyword	              In an abstract interface keyword, 	            In an abstract class, the abstract keyword is
                                    is optional for declaring a method                  compulsory for declaring a method as an abstract.
                                    as an abstract.

Class type	                    An interface can have  public 	                 An abstract class has protected and public abstract methods.
                                    abstract methods.(default and static)

 */

public class Basic_Principles_OOP {
}
