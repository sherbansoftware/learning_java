package Packages.Top_Level_Type_Declarations;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.6

/*                                                         Top Level Type Declarations

    A top level type declaration declares a top level class type (§8 (Classes)) or a top level interface type (§9 (Interfaces)).

            TypeDeclaration:
            ClassDeclaration
            InterfaceDeclaration
            ;

    Extra ";" tokens appearing at the level of type declarations in a compilation unit have no effect on the meaning of
        the compilation unit. Stray semicolons are permitted in the Java programming language solely as a concession to
        C++ programmers who are used to placing ";" after a class declaration. They should not be used in new Java code.

    In the absence of an access modifier, a top level type has package access: it is accessible only within compilation units
        of the package in which it is declared (§6.6.1). A type may be declared public to grant access to the type from code
        in other packages.

    It is a compile-time ERROR
        if a top level type declaration contains any one of the following access modifiers:

        protected,
        private,
        or static.

    It is a compile-time ERROR
        if the name of a top level type appears as the name of any other top level class or interface type declared
        in the same package.

    The scope and shadowing of a top level type is specified in §6.3 and §6.4.

    The fully qualified name of a top level type is specified in §6.7.

    Example 7.6-1. Conflicting Top Level Type Declarations

package test;
import java.util.Vector;
class Point {
    int x, y;
}
interface Point {  // compile-time error #1
    int getR();
    int getTheta();
}
class Vector { Point[] pts; }  // compile-time error #2
Here, the first compile-time error is caused by the duplicate declaration of the name Point as both a class and an interface in the same package. A second compile-time error is the attempt to declare the name Vector both by a class type declaration and by a single-type-import declaration.

Note, however, that it is not an error for the name of a class to also name a type that otherwise might be imported by a type-import-on-demand declaration (§7.5.2) in the compilation unit (§7.3) containing the class declaration. Thus, in this program:

package test;
import java.util.*;
class Vector {}  // not a compile-time error
the declaration of the class Vector is permitted even though there is also a class java.util.Vector. Within this compilation unit, the simple name Vector refers to the class test.Vector, not to java.util.Vector (which can still be referred to by code within the compilation unit, but only by its fully qualified name).


Example 7.6-2. Scope of Top Level Types

package points;
class Point {
    int x, y;           // coordinates
    PointColor color;   // color of this point
    Point next;         // next point with this color
    static int nPoints;
}
class PointColor {
    Point first;        // first point with this color
    PointColor(int color) { this.color = color; }
    private int color;  // color components
}

    This program defines two classes that use each other in the declarations of their class members. Because the class
        types Point and PointColor have all the type declarations in package points, including all those in the current
        compilation unit, as their scope, this program compiles correctly. That is, forward reference is not a problem.


    Example 7.6-3. Fully Qualified Names


class Point { int x, y; }

    In this code, the class Point is declared in a compilation unit with no package statement, and thus Point is its fully
        qualified name, whereas in the code:


package vista;
class Point { int x, y; }

    the fully qualified name of the class Point is vista.Point. (The package name vista is suitable for local or personal
        use; if the package were intended to be widely distributed, it would be better to give it a unique package name (§6.1).)


    An implementation of the Java SE platform must keep track of types within packages by their binary names (§13.1).
        Multiple ways of naming a type must be expanded to binary names to make sure that such names are understood as
        referring to the same type.

    For example, if a compilation unit contains the single-type-import declaration (§7.5.1):


import java.util.Vector;

    then within that compilation unit, the simple name Vector and the fully qualified name java.util.Vector refer to the
        same type.

    If and only if packages are stored in a file system (§7.2), the host system may choose to enforce the restriction
        that it is a compile-time error if a type is not found in a file under a name composed of the type name plus an
        extension (such as .java or .jav) if either of the following is true:

            * The type is referred to by code in other compilation units of the package in which the type is declared.

            * The type is declared public (and therefore is potentially accessible from code in other packages).

    This restriction implies that there must be at most one such type per compilation unit. This restriction makes it easy
        for a Java compiler to find a named class within a package. In practice, many programmers choose to put each class
        or interface type in its own compilation unit, whether or not it is public or is referred to by code in other
        compilation units.

    For example, the source code for a public type wet.sprocket.Toad would be found in a file Toad.java in the directory
        wet/sprocket, and the corresponding object code would be found in the file Toad.class in the same directory.


 */

public class Top_Level_Type_Declarations {
}
