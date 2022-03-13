package Types_Values_and_Variables.Reifiable_Types;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.7

/*                                                        Reifiable Types

    Because some type information is erased during compilation, not all types are available at run time. Types that are
        completely available at run time are known as reifiable types.

    A type is reifiable if and only if one of the following holds:

            * It refers to a non-generic class or interface type declaration.

            * It is a parameterized type in which all type arguments are unbounded wildcards (§4.5.1).

            * It is a raw type (§4.8).

            * It is a primitive type (§4.2).

            * It is an array type (§10.1) whose element type is reifiable.

            * It is a nested type where, for each type T separated by a ".", T itself is reifiable.

    For example, if a generic class X<T> has a generic member class Y<U>, then the type X<?>.Y<?> is reifiable because
        X<?> is reifiable and Y<?> is reifiable. The type X<?>.Y<Object> is not reifiable because Y<Object> is not reifiable.

    An intersection type is not reifiable.

    The decision not to make all generic types reifiable is one of the most crucial, and controversial design decisions
        involving the type system of the Java programming language.

    Ultimately, the most important motivation for this decision is compatibility with existing code. In a naive sense,
        the addition of new constructs such as generics has no implications for pre-existing code. The Java programming
        language, per se, is compatible with earlier versions as long as every program written in the previous versions
        retains its meaning in the new version. However, this notion, which may be termed language compatibility, is of
        purely theoretical interest. Real programs (even trivial ones, such as "Hello World") are composed of several
        compilation units, some of which are provided by the Java SE platform (such as elements of java.lang or java.util).
        In practice, then, the minimum requirement is platform compatibility - that any program written for the prior
        version of the Java SE platform continues to function unchanged in the new version.

    One way to provide platform compatibility is to leave existing platform functionality unchanged, only adding new
        functionality. For example, rather than modify the existing Collections_ hierarchy in java.util, one might introduce
         a new library utilizing generics.

    The disadvantages of such a scheme is that it is extremely difficult for pre-existing clients of the Collection library
        to migrate to the new library. Collections_ are used to exchange data between independently developed modules; if
        a vendor decides to switch to the new, generic, library, that vendor must also distribute two versions of their
        code, to be compatible with their clients. Libraries that are dependent on other vendors code cannot be modified
        to use generics until the supplier's library is updated. If two modules are mutually dependent, the changes must b
        e made simultaneously.

    Clearly, platform compatibility, as outlined above, does not provide a realistic path for adoption of a pervasive
        new feature such as generics. Therefore, the design of the generic type system seeks to support migration compatibility.
        Migration compatibiliy allows the evolution of existing code to take advantage of generics without imposing dependencies
        between independently developed software modules.

    The price of migration compatibility is that a full and sound reification of the generic type system is not possible,
        at least while the migration is taking place.

 */

public class Reifiable_Types {
}
