package Variable.Default_Values;

/*                                                             Initial Values of Variables

    Every variable in a program must have a value before its value is used:

    Each class variable, instance variable, or array component is initialized with a default value when it is created
        (§15.9, §15.10.2):

        For type byte,
                the default value is zero

        For type short,
                the default value is zero

        For type int,
                the default value is zero

        For type long,
                the default value is zero

        For type float
                 the default value is positive zero, that is, 0.0f.

        For type double,
                 the default value is positive zero, that is, 0.0d.

        For type char,
                 the default value is the null character, that is, '\u0000'.

        For type boolean,
                 the default value is false.

        For all reference types (§4.3),
                 the default value is null.

    Each method parameter (§8.4.1) is initialized
        to the corresponding argument value provided by the invoker of the method (§15.12).

    Each constructor parameter (§8.8.1) is initialized
        to the corresponding argument value provided by a class instance creation expression (§15.9) or explicit
        constructor invocation (§8.8.7).

    An exception parameter (§14.20) is initialized
        to the thrown object representing the exception (§11.3, §14.18).

    A local variable (§14.4, §14.14) must be explicitly given a value before it is used,

        * by either initialization (§14.4) or
        * assignment (§15.26), in a way that can be verified using the rules for definite assignment
        (§16 (Definite Assignment)).

Example 4.12.5-1. Initial Values of Variables

class Point {
    static int npoints;
    int x, y;
    Point root;
}

class Test {
    public static void main(String[] args) {
        System.out.println("npoints=" + Point.npoints);
        Point p = new Point();
        System.out.println("p.x=" + p.x + ", p.y=" + p.y);
        System.out.println("p.root=" + p.root);
    }
}
This program prints:

npoints=0
p.x=0, p.y=0
p.root=null

    illustrating the default initialization of npoints, which occurs when the class Point is prepared (§12.3.2), and the
        default initialization of x, y, and root, which occurs when a new Point is instantiated. See §12 (Execution) for
        a full description of all aspects of loading, linking, and initialization of classes and interfaces, plus a
        description of the instantiation of classes to make new class instances.

*/

public class Default_Values_Of_Variables {
}
