package Interfaces.Member_Type_Declarations;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.5

/*                                                  Member Type Declarations

    Interfaces may contain member type declarations (§8.5).

    A member type declaration in an interface is implicitly

        * public
        * and static.

    It is permitted to redundantly specify either or both of these modifiers.

    It is a compile-time error if
        a member type declaration in an interface has the modifier protected or private.

    It is a compile-time error if
        the same keyword appears more than once as a modifier for a member type declaration in an interface.

    If an interface declares a member type with a certain name, then the declaration of that type is said to hide any and
        all accessible declarations of member types with the same name in superinterfaces of the interface.

    An interface inherits from its direct superinterfaces all the non-private member types of the superinterfaces that
        are both accessible to code in the interface and not hidden by a declaration in the interface.

    An interface may inherit two or more type declarations with the same name. It is a compile-time error to attempt to
        refer to any ambiguously inherited class or interface by its simple name.

    If the same type declaration is inherited from an interface by multiple paths, the class or interface is considered
        to be inherited only once; it may be referred to by its simple name without ambiguity.

*/

public class Member_Type_Declarations {
}
