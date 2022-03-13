package Variables.Variable.Types_Classes_and_Interfaces;

/*                                                             Types, Classes, and Interfaces

    In the Java programming language,

            * every variable
            * and every expression

    has a type that can be determined at compile time. The type may be:

            * a primitive type
            * or a reference type.

    Reference types include

            * class types
            * interface types.

    Reference types are introduced by type declarations, which include class declarations (§8.1) and interface declarations
        (§9.1). We often use the term type to refer to either a class or an interface.

    In the Java Virtual Machine,

             * every object belongs to some particular class:
                 the class that was mentioned in the creation expression that produced the object (§15.9), or the class
                 whose Class object was used to invoke a reflective method to produce the object, or the String class for
                 objects implicitly created by the string concatenation operator + (§15.18.1). This class is called the
                 class of the object. An object is said to be an instance of its class and of all superclasses of its class.

              * every array also has a class.
                  The method getClass, when invoked for an array object, will return a class object (of class Class) that
                  represents the class of the array (§10.8).

    The compile-time type of a variable is always declared, and the compile-time type of an expression can be deduced at
        compile time. The compile-time type limits the possible values that the variable can hold at run time or the
        expression can produce at run time. If a run-time value is a reference that is not null, it refers to an object
        or array that has a class, and that class will necessarily be compatible with the compile-time type.

    Even though a variable or expression may have a compile-time type that is an interface type, there are no instances
        of interfaces. A variable or expression whose type is an interface type can reference any object whose class
        implements (§8.1.5) that interface.

    Sometimes a variable or expression is said to have a "run-time type". This refers to the class of the object referred
        to by the value of the variable or expression at run time, assuming that the value is not null.

    The correspondence between compile-time types and run-time types is incomplete for two reasons:

        1. At run time, classes and interfaces are loaded by the Java Virtual Machine using class loaders. Each class loader
             defines its own set of classes and interfaces. As a result, it is possible for two loaders to load an identical
             class or interface definition but produce distinct classes or interfaces at run time. Consequently, code that
             compiled correctly may fail at link time if the class loaders that load it are inconsistent.

             See the paper Dynamic Class Loading in the Java Virtual Machine, by Sheng Liang and Gilad Bracha, in Proceedings
             of OOPSLA '98, published as ACM SIGPLAN Notices, Volume 33, Number 10, October 1998, pages 36-44, and The Java
             Virtual Machine Specification, Java SE 8 Edition for more details.

        2. Type variables (§4.4) and type arguments (§4.5.1) are not reified at run time. As a result, the same class or
            interface at run time represents multiple parameterized types (§4.5) from compile time. Specifically, all
            compile-time parameterizations of a given generic type (§8.1.2, §9.1.2) share a single run-time representation.

    Under certain conditions, it is possible that a variable of a parameterized type refers to an object that is not of
        that parameterized type. This situation is known as heap pollution (§4.12.2). The variable will always refer to
        an object that is an instance of a class that represents the parameterized type.

    Example 4.12.6-1. Type of a Variable versus Class of an Object

interface Colorable {
    void setColor(byte r, byte g, byte b);
}

class Point { int x, y; }

class ColoredPoint extends Point implements Colorable {
    byte r, g, b;
    public void setColor(byte rv, byte gv, byte bv) {
        r = rv; g = gv; b = bv;
    }
}

class Test {
    public static void main(String[] args) {
        Point p = new Point();
        ColoredPoint cp = new ColoredPoint();
        p = cp;
        Colorable c = cp;
    }
}

    In this example:

            * The local variable p of the method main of class Test has type Point and is initially assigned a reference
                to a new instance of class Point.

            * The local variable cp similarly has as its type ColoredPoint, and is initially assigned a reference to a
                new instance of class ColoredPoint.

            * The assignment of the value of cp to the variable p causes p to hold a reference to a ColoredPoint object.
                This is permitted because ColoredPoint is a subclass of Point, so the class ColoredPoint is assignment-compatible
                (§5.2) with the type Point. A ColoredPoint object includes support for all the methods of a Point. In
                addition to its particular fields r, g, and b, it has the fields of class Point, namely x and y.

            * The local variable c has as its type the interface type Colorable, so it can hold a reference to any object whose
                class implements Colorable; specifically, it can hold a reference to a ColoredPoint.

    Note that an expression such as new Colorable() is not valid because it is not possible to create an instance of an
        interface, only of a class. However, the expression new Colorable() { public void setColor... } is valid because
        it declares an anonymous class (§15.9.5) that implements the Colorable interface.

*/

public class Types_Classes_And_Interfaces {
}
