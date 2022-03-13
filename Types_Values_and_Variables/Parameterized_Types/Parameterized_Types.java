package Types_Values_and_Variables.Parameterized_Types;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5

/*                                                        Parameterized Types

    A class or interface declaration that is generic (§8.1.2, §9.1.2) defines a set of parameterized types.

    A parameterized type is a class or interface type of the form C<T1,...,Tn>, where C is the name of a generic type
        and <T1,...,Tn> is a list of type arguments that denote a particular parameterization of the generic type.

    A generic type has type parameters F1,...,Fn with corresponding bounds B1,...,Bn. Each type argument Ti of a
        parameterized type ranges over all types that are subtypes of all types listed in the corresponding bound.
        That is, for each bound type S in Bi, Ti is a subtype of S[F1:=T1,...,Fn:=Tn] (§4.10).

    A parameterized type C<T1,...,Tn> is well-formed if all of the following are true:

    C is the name of a generic type.

    The number of type arguments is the same as the number of type parameters in the generic declaration of C.

    When subjected to capture conversion (§5.1.10) resulting in the type C<X1,...,Xn>, each type argument Xi is a
        subtype of S[F1:=X1,...,Fn:=Xn] for each bound type S in Bi.

    It is a compile-time error if a parameterized type is not well-formed.

    In this specification, whenever we speak of a class or interface type, we include the generic version as well, unless explicitly excluded.

    Two parameterized types are provably distinct if either of the following is true:

    They are parameterizations of distinct generic type declarations.

    Any of their type arguments are provably distinct.

    Given the generic types in the examples of §8.1.2, here are some well-formed parameterized types:

        * Seq<String>

        * Seq<Seq<String>>

        * Seq<String>.Zipper<Integer>

        * Pair<String,Integer>

    Here are some INCORRECT parameterization of those generic types:

        * Seq<int> is illegal, as primitive types cannot be type arguments.

        * Pair<String> is illegal, as there are not enough type arguments.

        * Pair<String,String,String> is illegal, as there are too many type arguments.

   A parameterized type may be an parameterization of a generic class or interface which is nested. For example, if a
       non-generic class C has a generic member class D<T>, then C.D<Object> is a parameterized type. And if a generic
       class C<T> has a non-generic member class D, then the member type C<String>.D is a parameterized type, even though
       the class D is not generic.



 */

public class Parameterized_Types {
}
