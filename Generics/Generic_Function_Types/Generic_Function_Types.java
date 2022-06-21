package Generics.Generic_Function_Types;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#d5e17052

/*                            The function type of functional interface is defined nondeterministically:


    ○ While the signatures in M are "the same", they may be syntactically different (HashMap.Entry and Map.Entry, for example);
           the return type may be a subtype of every other return type, but there may be other return types that are also
           subtypes (List<?> and List<? extends Object>, for example); and the order of thrown types is unspecified. These
            distinctions are subtle, but they can sometimes be important. However, function types are not used in the Java
            programming language in such a way that the nondeterminism matters. Note that the return type and throws clause
            of a "most specific method" are also defined nondeterministically when there are multiple abstract methods.

    ○ When a generic functional interface is parameterized by wildcards, there are many different instantiations that could
           satisfy the wildcard and produce different function types.

           For example, each of:

           Predicate<Integer> (function type Integer -> boolean), Predicate<Number> (function type Number -> boolean), and
           Predicate<Object> (function type Object -> boolean) is a Predicate<? super Integer>. Sometimes, it is possible
           to known from the context, such as the parameter types of a lambda expression, which function type is intended
           (§15.27.3). Other times, it is necessary to pick one; in these circumstances, the bounds are used. (This simple
           strategy cannot guarantee that the resulting type will satisfy certain complex bounds, so not all complex cases
           are supported.)

    ○ Example 9.9-2. Generic Function Types

          A function type may be generic, as a functional interface's abstract method may be generic. For example, in the
              following interface hierarchy:

interface G1 {
    <E extends Exception> Object m() throws E;
}
interface G2 {
    <F extends Exception> String m() throws Exception;
}
interface G extends G1, G2 {}
the function type of G is:

<F extends Exception> ()->String throws F

    A generic function type for a functional interface may be implemented by a method reference expression (§15.13),
        but not by a lambda expression (§15.27) as there is no syntax for generic lambda expressions.

 */

public class Generic_Function_Types {
}
