package Interfaces.Method_Declarations.Overloading;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.4.2

/*                                                          Overloading

    If two methods of an interface (whether both declared in the same interface, or both inherited by an interface, or
        one declared and one inherited) have the same name but different signatures that are not override-equivalent (§8.4.2),
        then the method name is said to be overloaded.

    This fact causes no difficulty and never of itself results in a compile-time error. There is no required relationship
        between the return types or between the throws clauses of two methods with the same name but different signatures
        that are not override-equivalent.

    Example 9.4.2-1. Overloading an abstract Method Declaration

interface PointInterface {
    void move(int dx, int dy);
}

interface RealPointInterface extends PointInterface {
    void move(float dx, float dy);
    void move(double dx, double dy);
}

    Here, the method named move is overloaded in interface RealPointInterface with three different signatures, two of them
    declared and one inherited. Any non-abstract class that implements interface RealPointInterface must provide implementations
    of all three method signatures.

*/

public class Overloading {
}
