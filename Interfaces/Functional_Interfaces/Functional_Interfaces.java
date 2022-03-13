package Interfaces.Functional_Interfaces;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.8

/*                                                      Functional Interfaces

    A functional interface is an interface

       that has just one abstract method (aside from the methods of Object), and thus represents a single function contract.
       This "single" method may take the form of multiple abstract methods with override-equivalent signatures inherited
       from superinterfaces; in this case, the inherited methods logically represent a single method.

    For an interface I, let M be the set of abstract methods that are members of I that do not have the same signature as
    any public instance method of the class Object. Then, I is a functional interface if there exists a method m in M for
    which both of the following are true:

            * The signature of m is a subsignature (§8.4.2) of every method's signature in M.

            * m is return-type-substitutable (§8.4.5) for every method in M.

    In addition to the usual process of creating an interface instance by declaring and instantiating a class (§15.9),
        instances of functional interfaces can be created with method reference expressions and
        lambda expressions (§15.13, §15.27).

    The definition of functional interface excludes methods in an interface that are also public methods in Object.
    This is to allow functional treatment of an interface like java.util.Comparator<T> that declares multiple abstract
    methods of which only one is really "new" - int compare(T,T). The other method - boolean equals(Object) - is an
    explicit declaration of an abstract method that would otherwise be implicitly declared, and will be automatically
    implemented by every class that implements the interface.

    Note that if non-public methods of Object, such as clone(), are declared in an interface, they are not automatically
    implemented by every class that implements the interface. The implementation inherited from Object is protected while
    the interface method is necessarily public. The only way to implement such an interface would be for a class to override
    the non-public Object method with a public method.

    Example 9.8-1. Functional Interfaces

    A simple example of a functional interface is:

interface Runnable {
    void run();
}

    The following interface is not functional because it declares nothing which is not already a member of Object:

interface NonFunc {
    boolean equals(Object obj);
}

    However, its subinterface can be functional by declaring an abstract method which is not a member of Object:

interface Func extends NonFunc {
    int compare(String o1, String o2);
}

    Similarly, the well known interface java.util.Comparator<T> is functional because it has one abstract non-Object method:

interface Comparator<T> {
    boolean equals(Object obj);
    int compare(T o1, T o2);
}

    The following interface is not functional because while it only declares one abstract method which is not a member of
        Object, it declares two abstract methods which are not public members of Object:

interface Foo {
    int m();
    Object clone();
}

    Example 9.8-2. Functional Interfaces and Erasure

    In the following interface hierarchy, Z is a functional interface because while it inherits two abstract methods which are
        not members of Object, they have the same signature, so the inherited methods logically represent a single method:

interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<String> arg); }
interface Z extends X, Y {}

    Similarly, Z is a functional interface in the following interface hierarchy because Y.m is a subsignature of X.m and
        is return-type-substitutable for X.m:

interface X { Iterable m(Iterable<String> arg); }
interface Y { Iterable<String> m(Iterable arg); }
interface Z extends X, Y {}

    The definition of functional interface respects the fact that an interface cannot have two members which are not
        subsignatures of each other, yet have the same erasure (§9.4.1.2). Thus, in the following three interface
        hierarchies where Z causes a compile-time error, Z is not a functional interface: (because none of its abstract
        members are subsignatures of all other abstract members)

interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<Integer> arg); }
interface Z extends X, Y {}

interface X { int m(Iterable<String> arg, Class c); }
interface Y { int m(Iterable arg, Class<?> c); }
interface Z extends X, Y {}

interface X<T> { void m(T arg); }
interface Y<T> { void m(T arg); }
interface Z<A, B> extends X<A>, Y<B> {}

    Similarly, the definition of "functional interface" respects the fact that an interface may only have methods with
        override-equivalent signatures if one is return-type-substitutable for all the others. Thus, in the following
        interface hierarchy where Z causes a compile-time error, Z is not a functional interface: (because none of its
        abstract members are return-type-substitutable for all other abstract members)

interface X { long m(); }
interface Y { int  m(); }
interface Z extends X, Y {}

    In the following example, the declarations of Foo<T,N> and Bar are legal: in each, the methods called m are not
        subsignatures of each other, but do have different erasures. Still, the fact that the methods in each are not
        subsignatures means Foo<T,N> and Bar are not functional interfaces. However, Baz is a functional interface
        because the methods it inherits from Foo<Integer,Integer> have the same signature and so logically represent a
        single method.

interface Foo<T, N extends Number> {
    void m(T arg);
    void m(N arg);
}

interface Bar extends Foo<String, Integer> {}
interface Baz extends Foo<Integer, Integer> {}

    Finally, the following examples demonstrate the same rules as above, but with generic methods:

interface Exec { <T> T execute(Action<T> a); }
  // Functional

interface X { <T> T execute(Action<T> a); }
interface Y { <S> S execute(Action<S> a); }
interface Exec extends X, Y {}
  // Functional: signatures are logically "the same"

interface X { <T>   T execute(Action<T> a); }
interface Y { <S,T> S execute(Action<S> a); }
interface Exec extends X, Y {}
  // Error: different signatures, same erasure

    Example 9.8-3. Generics Functional Interfaces

    Functional interfaces can be generic, such as java.util.function.Predicate<T>. Such a functional interface may be
        parameterized in a way that produces distinct abstract methods - that is, multiple methods that cannot be legally
        overridden with a single declaration. For example:

interface I    { Object m(Class c); }
interface J<S> { S m(Class<?> c); }
interface K<T> { T m(Class<?> c); }
interface Functional<S,T> extends I, J<S>, K<T> {}

    Functional<S,T> is a functional interface - I.m is return-type-substitutable for J.m and K.m - but the functional
        interface type Functional<String,Integer> clearly cannot be implemented with a single method. However, other
        parameterizations of Functional<S,T> which are functional interface types are possible.


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

                                                             NOTE

            * @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one
                  abstract method. In case more than one abstract methods are present, the compiler flags an ‘Unexpected
                  @FunctionalInterface annotation’ message. However, it is not mandatory to use this annotation.

*/

@FunctionalInterface
interface Square {
    int calculate(int x);
}


public class Functional_Interfaces {

    // using lambda
    public static void main(String[] args) {
        int value = 6;
        Square s = ((int x) -> x * x);
        System.out.println(s.calculate(value));
    }
}
