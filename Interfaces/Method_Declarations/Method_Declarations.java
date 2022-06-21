package Interfaces.Method_Declarations;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.4

/*                                                        Method Declarations

InterfaceMethodDeclaration:
    {InterfaceMethodModifier} MethodHeader MethodBody

InterfaceMethodModifier:
    (one of)
    Annotation

        * public
        * abstract
        * default
        * static
        * strictfp

    The following productions from §8.4, §8.4.5, and §8.4.7 are shown here for convenience:

MethodHeader:
    Result MethodDeclarator [Throws]
TypeParameters {Annotation} Result MethodDeclarator [Throws]
    Result:
    UnannType
    void
MethodDeclarator:
    Identifier ( [FormalParameterList] ) [Dims]
MethodBody:
    Block
    ;

    The rules for annotation modifiers on an interface method declaration are specified in §9.7.4 and §9.7.5.

    Every method declaration in the body of an interface is implicitly public (§6.6). It is permitted, but discouraged
        as a matter of style, to redundantly specify the public modifier for a method declaration in an interface.

            * default method
                is a method that is declared in an interface with the default modifier; its body is always represented by
                a block.It provides a default implementation for any class that implements the interface without overriding
                the method.Default methods are distinct from concrete methods (§8.4.3.1), which are declared in classes.

            * static methods,
                 which are invoked without reference to a particular object.

    It is a compile-time error to use the name of a type parameter of any surrounding declaration in the header or body
        of a static method of an interface.

    The effect of the strictfp modifier is to make all float or double expressions within the body of a default or static
        method be explicitly FP-strict (§15.4).

    An interface method lacking a default modifier or a static modifier is implicitly abstract, so its body is represented
        by a semicolon, not a block. It is permitted, but discouraged as a matter of style, to redundantly specify the
        abstract modifier for such a method declaration.

    It is a compile-time error if
        the same keyword appears more than once as a modifier for a method declaration in an interface.

    It is a compile-time error if
         a method is declared with more than one of the modifiers abstract, default, or static.

    It is a compile-time error if
         an abstract method declaration contains the keyword strictfp.

    It is a compile-time error for the body of an interface to declare, explicitly or implicitly, two methods with override-equivalent
         signatures (§8.4.2). However, an interface may inherit several abstract methods with such signatures (§9.4.1).

    A method in an interface may be generic.
        The rules for type parameters of a generic method in an interface are the same as for a generic method in a class (§8.4.4).

*/

public class Method_Declarations {
}
