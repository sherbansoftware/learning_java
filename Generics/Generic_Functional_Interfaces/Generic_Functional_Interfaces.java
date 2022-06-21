package Generics.Generic_Functional_Interfaces;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#d5e16730

/*                                                          Example 9.8-3. Generic Functional Interfaces

    Functional interfaces can be generic, such as java.util.function.Predicate<T>. Such a functional interface may be
        parameterized in a way that produces distinct abstract methods - that is, multiple methods that cannot be legally
        overridden with a single declaration. For example:

interface I    { Object m(Class c); }
interface J<S> { S m(Class<?> c); }
interface K<T> { T m(Class<?> c); }
interface Functional<S,T> extends I, J<S>, K<T> {}

    Functional<S,T> is a functional interface - I.m is return-type-substitutable for J.m and K.m - but the functional interface
        type Functional<String,Integer> clearly cannot be implemented with a single method. However, other parameterizations
        of Functional<S,T> which are functional interface types are possible.


    The declaration of a functional interface allows a functional interface type to be used in a program.

                                              There are four kinds of functional interface type:

                * The type of a non-generic (§6.1) functional interface

                * A parameterized type that is a parameterization (§4.5) of a generic functional interface

                * The raw type (§4.8) of a generic functional interface

                * An intersection type (§4.9) that induces a notional functional interface

    In special circumstances, it is useful to treat an intersection type as a functional interface type. Typically, this
        will look like an intersection of a functional interface type with one or more marker interface types, such as
        Runnable & java.io.Serializable. Such an intersection can be used in casts (§15.16) that force a lambda expression
        to conform to a certain type. If one of the interface types in the intersection is java.io.Serializable, special
        run-time support for serialization is triggered (§15.27.4).

 */

public class Generic_Functional_Interfaces {
}
