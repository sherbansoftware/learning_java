package Interfaces.Function_Types;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.9

/*                                                 Function Types

    The function type of a functional interface I is a method type (§8.2) that can be used to override (§8.4.8) the
        abstract method(s) of I.

    Let M be the set of abstract methods defined for I.

        The function type of I consists of the following:

             * Type parameters, formal parameters, and return type:

                 Let m be a method in M with:

                     1. a signature that is a subsignature of every method's signature in M; and

                     2. a return type that is a subtype of every method's return type in M (after adapting for any type
                         parameters (§8.4.4)).

                If no such method exists, then let m be a method in M that:

                     1.has a signature that is a subsignature of every method's signature in M; and

                     2.is return-type-substitutable (§8.4.5) for every method in M.

                The function type's type parameters, formal parameter types, and return type are as given by m.

            * throws clause:

                The function type's throws clause is derived from the throws clauses of the methods in M. If the function
                    type is generic, these clauses are first adapted to the type parameters of the function type (§8.4.4).
                    If the function type is not generic but at least one method in M is generic, these clauses are first
                    erased. Then, the function type's throws clause includes every type, E, which satisfies the following
                    constraints:

                        • E is mentioned in one of the throws clauses.

                        • For each throws clause, E is a subtype of some type named in that clause.

    When some return types in M are raw and others are not, the definition of a function type tries to choose the most
        specific type, if possible. For example, if the return types are LinkedList and LinkedList<String>, then the latter
        is immediately chosen as the function type's return type. When there is no most specific type, the definition
        compensates by finding the most substitutable return type. For example, if there is a third return type, List<?>,
        then it is not the case that one of the return types is a subtype of every other (as raw LinkedList is not a subtype
        of List<?>); instead, LinkedList<String> is chosen as the function type's return type because it is return-type-substitutable
        for both LinkedList and List<?>.

    The goal driving the definition of a function type's thrown exception types is to support the invariant that a method
        with the resulting throws clause could override each abstract method of the functional interface. Per §8.4.6, this
        means the function type cannot throw "more" exceptions than any single method in the set M, so we look for as many
        exception types as possible that are "covered" by every method's throws clause.

    The function type of a functional interface type is specified as follows:

            * The function type of the type of a non-generic functional interface I is simply the function type of the
                functional interface I, as defined above.

            * The function type of a parameterized functional interface type I<A1...An>, where A1...An are types and the
                corresponding type parameters of I are P1...Pn, is derived by applying the substitution [P1:=A1, ..., Pn:=An]
                to the function type of the generic functional interface I<P1...Pn>.

            * The function type of a parameterized functional interface type I<A1...An>, where one or more of A1...An is a
                wildcard, is the function type of the non-wildcard parameterization of I, I<T1...Tn>. The non-wildcard
                parameterization is determined as follows.

         Let P1...Pn be the type parameters of I with corresponding bounds B1...Bn. For all i (1 ≤ i ≤ n), Ti is derived
            according to the form of Ai:

                 • If Ai is a type, then Ti = Ai.

                 • If Ai is a wildcard, and the corresponding type parameter's bound, Bi, mentions one of P1...Pn, then
                     Ti is undefined and there is no function type.

                 • Otherwise:

                        - If Ai is an unbound wildcard ?, then Ti = Bi.

                        - If Ai is a upper-bounded wildcard ? extends Ui, then Ti = glb(Ui, Bi) (§5.1.10).

                        - If Ai is a lower-bounded wildcard ? super Li, then Ti = Li.

            * The function type of the raw type of a generic functional interface I<...> is the erasure of the function
                type of the generic functional interface I<...>.

            * The function type of an intersection type that induces a notional functional interface is the function type
                of the notional functional interface.

Example 9.9-1. Function Types

Given the following interfaces:

interface X { void m() throws IOException; }
interface Y { void m() throws EOFException; }
interface Z { void m() throws ClassNotFoundException; }
the function type of:

interface XY extends X, Y {}
is:

()->void throws EOFException
while the function type of:

interface XYZ extends X, Y, Z {}
is:

()->void (throws nothing)
Given the following interfaces:

interface A {
    List<String> foo(List<String> arg)
      throws IOException, SQLTransientException;
}
interface B {
    List foo(List<String> arg)
      throws EOFException, SQLException, TimeoutException;
}
interface C {
    List foo(List arg) throws Exception;
}
the function type of:

interface D extends A, B {}
is:

(List<String>)->List<String>
  throws EOFException, SQLTransientException
while the function type of:

interface E extends A, B, C {}
is:

(List)->List throws EOFException, SQLTransientException

    The function type of a functional interface is defined nondeterministically: while the signatures in M are "the same",
        they may be syntactically different (HashMap.Entry and Map.Entry, for example); the return type may be a subtype
        of every other return type, but there may be other return types that are also subtypes (List<?> and List<? extends Object>,
        for example); and the order of thrown types is unspecified. These distinctions are subtle, but they can sometimes be
        important. However, function types are not used in the Java programming language in such a way that the nondeterminism
        matters. Note that the return type and throws clause of a "most specific method" are also defined nondeterministically
        when there are multiple abstract methods (§15.12.2.5).

    When a generic functional interface is parameterized by wildcards, there are many different instantiations that could
        satisfy the wildcard and produce different function types. For example, each of Predicate<Integer> (function type
        Integer -> boolean), Predicate<Number> (function type Number -> boolean), and Predicate<Object> (function type Object
         -> boolean) is a Predicate<? super Integer>. Sometimes, it is possible to known from the context, such as the
         parameter types of a lambda expression, which function type is intended (§15.27.3). Other times, it is necessary
         to pick one; in these circumstances, the bounds are used. (This simple strategy cannot guarantee that the resulting
         type will satisfy certain complex bounds, so not all complex cases are supported.)

    Example 9.9-2. Generics Function Types

    A function type may be generic, as a functional interface's abstract method may be generic. For example, in the following
        interface hierarchy:

interface G1 {
    <E extends Exception> Object m() throws E;
}
interface G2 {
    <F extends Exception> String m() throws Exception;
}
interface G extends G1, G2 {}
the function type of G is:

<F extends Exception> ()->String throws F

    A generic function type for a functional interface may be implemented by a method reference expression (§15.13), but
        not by a lambda expression (§15.27) as there is no syntax for generic lambda expressions.

*/

public class Function_Types {
}
