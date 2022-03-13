package Types_Values_and_Variables.Type_Erasure;

//https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.6

/*                                                         Type Erasure

    Generics were introduced to the Java language to provide tighter type checks at compile time and to support generic
        programming. To implement generics, the Java compiler applies type erasure to:

            * Replace all type parameters in generic types with their bounds or Object if the type parameters are unbounded.
                 The produced bytecode, therefore, contains only ordinary classes, interfaces, and methods.

            * Insert type casts if necessary to preserve type safety.

            * Generate bridge methods to preserve polymorphism in extended generic types.

    Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no runtime
        overhead.

    Type erasure is a mapping from types (possibly including parameterized types and type variables) to types (that are
        never parameterized types or type variables). We write |T| for the erasure of type T. The erasure mapping is
        defined as follows:

            * The erasure of a parameterized type (§4.5) G<T1,...,Tn> is |G|.

            * The erasure of a nested type T.C is |T|.C.

            * The erasure of an array type T[] is |T|[].

            * The erasure of a type variable (§4.4) is the erasure of its leftmost bound.

            * The erasure of every other type is the type itself.

    Type erasure also maps the signature (§8.4.2) of a constructor or method to a signature that has no parameterized
        types or type variables. The erasure of a constructor or method signature s is a signature consisting of the same
        name as s and the erasures of all the formal parameter types given in s.

    The return type of a method (§8.4.5) and the type parameters of a generic method or constructor (§8.4.4, §8.8.4)
        also undergo erasure if the method or constructor's signature is erased.

    The erasure of the signature of a generic method has no type parameters.

 */

public class Type_Erasure {
}
