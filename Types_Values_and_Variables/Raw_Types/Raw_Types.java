package Types_Values_and_Variables.Raw_Types;

/*                                                        Raw Types

    To facilitate interfacing with non-generic legacy code, it is possible to use as a type the erasure (§4.6) of a
        parameterized type (§4.5) or the erasure of an array type (§10.1) whose element type is a parameterized type.
        Such a type is called a raw type.

    More precisely, a raw type is defined to be one of:

            * The reference type that is formed by taking the name of a generic type declaration without an accompanying
                type argument list.

            * An array type whose element type is a raw type.

            * A non-static member type of a raw type R that is not inherited from a superclass or superinterface of R.

    A non-generic class or interface type is not a raw type.

    To see why a non-static type member of a raw type is considered raw, consider the following example:

class Outer<T>{
    T t;
    class Inner {
        T setOuterT(T t1) { t = t1; return t; }
    }
}
    The type of the member(s) of Inner depends on the type parameter of Outer. If Outer is raw, Inner must be treated as
        raw as well, as there is no valid binding for T.

    This rule applies only to type members that are not inherited. Inherited type members that depend on type variables
        will be inherited as raw types as a consequence of the rule that the supertypes of a raw type are erased, described later in this section.

    Another implication of the rules above is that a generic inner class of a raw type can itself only be used as a raw
        type:

class Outer<T>{
    class Inner<S> {
        S s;
    }
}

    It is not possible to access Inner as a partially raw type (a "rare" type):

Outer.Inner<Double> x = null;  // illegal
Double d = x.s;
     because Outer itself is raw, hence so are all its inner classes including Inner, and so it is not possible to pass
         any type arguments to Inner.

    The superclasses (respectively, superinterfaces) of a raw type are the erasures of the superclasses (superinterfaces)
        of any of the parameterizations of the generic type.

    The type of a constructor (§8.8), instance method (§8.4, §9.4), or non-static field (§8.3) of a raw type C that is not
        inherited from its superclasses or superinterfaces is the raw type that corresponds to the erasure of its type in
        the generic declaration corresponding to C.

    The type of a static method or static field of a raw type C is the same as its type in the generic declaration
        corresponding to C.

    It is a compile-time error to pass type arguments to a non-static type member of a raw type that is not inherited from
        its superclasses or superinterfaces.

    It is a compile-time error to attempt to use a type member of a parameterized type as a raw type.

    This means that the ban on "rare" types extends to the case where the qualifying type is parameterized, but we attempt to use the inner class as a raw type:

        Outer<Integer>.Inner x = null; // illegal

    This is the opposite of the case discussed above. There is no practical justification for this half-baked type. In
        legacy code, no type arguments are used. In non-legacy code, we should use the generic types correctly and pass
        all the required type arguments.

    The supertype of a class may be a raw type. Member accesses for the class are treated as normal, and member accesses
        for the supertype are treated as for raw types. In the constructor of the class, calls to super are treated as
        method calls on a raw type.

    The use of raw types is allowed only as a concession to compatibility of legacy code. The use of raw types in code
        written after the introduction of generics into the Java programming language is strongly discouraged. It is
        possible that future versions of the Java programming language will disallow the use of raw types.

    To make sure that potential violations of the typing rules are always flagged, some accesses to members of a raw type
        will result in compile-time unchecked warnings. The rules for compile-time unchecked warnings when accessing members
        or constructors of raw types are as follows:

            * At an assignment to a field: if the type of the Primary in the field access expression (§15.11) is a raw type,
                then a compile-time unchecked warning occurs if erasure changes the field's type.

            * At an invocation of a method or constructor: if the type of the class or interface to search (§15.12.1) is
                a raw type, then a compile-time unchecked warning occurs if erasure changes any of the formal parameter
                types of the method or constructor.

            * No compile-time unchecked warning occurs for a method call when the formal parameter types do not change
                under erasure (even if the return type and/or throws clause changes), for reading from a field, or for a
                class instance creation of a raw type.

    Note that the unchecked warnings above are distinct from the unchecked warnings possible from unchecked conversion
        (§5.1.9), casts (§5.5.2), method declarations (§8.4.1, §8.4.8.3, §8.4.8.4, §9.4.1.2), and variable arity method
        invocations (§15.12.4.2).

    The warnings here cover the case where a legacy consumer uses a generified library. For example, the library declares
        a generic class Foo<T extends String> that has a field f of type Vector<T>, but the consumer assigns a vector of
        integers to e.f where e has the raw type Foo. The legacy consumer receives a warning because it may have caused
        heap pollution (§4.12.2) for generified consumers of the generified library.

    (Note that the legacy consumer can assign a Vector<String> from the library to its own Vector variable without
        receiving a warning. That is, the subtyping rules (§4.10.2) of the Java programming language make it possible for
        a variable of a raw type to be assigned a value of any of the type's parameterized instances.)

    The warnings from unchecked conversion cover the dual case, where a generified consumer uses a legacy library.
    For example, a method of the library has the raw return type Vector, but the consumer assigns the result of the
    method invocation to a variable of type Vector<String>. This is unsafe, since the raw vector might have had a
    different element type than String, but is still permitted using unchecked conversion in order to enable
    interfacing with legacy code. The warning from unchecked conversion indicates that the generified consumer may
    experience problems from heap pollution at other points in the program.

Example 4.8-1. Raw Types

class Cell<E> {
    E value;

    Cell(E v)     { value = v; }
    E get()       { return value; }
    void set(E v) { value = v; }

    public static void main(String[] args) {
        Cell x = new Cell<String>("abc");
        System.out.println(x.value);  // OK, has type Object
        System.out.println(x.get());  // OK, has type Object
        x.set("def");                 // unchecked warning
    }
}

Example 4.8-2. Raw Types and Inheritance

import java.util.*;
class NonGeneric {
    Collection<Number> myNumbers() { return null; }
}

abstract class RawMembers<T> extends NonGeneric
                             implements Collection<String> {
    static Collection<NonGeneric> cng =
        new ArrayList_<NonGeneric>();

    public static void main(String[] args) {
        RawMembers rw = null;
        Collection<Number> cn = rw.myNumbers();
                              // OK
        Iterator_Interface<String> is = rw.iterator();
                            // Unchecked warning
        Collection<NonGeneric> cnn = rw.cng;
                                   // OK, static member
    }
}
    In this program (which is not meant to be run), RawMembers<T> inherits the method:

    Iterator_Interface<String> iterator()
        from the Collection<String> superinterface. The raw type RawMembers inherits iterator() from Collection,
        the erasure of Collection<String>, which means that the return type of iterator() in RawMembers is Iterator_Interface.
        As a result, the attempt to assign rw.iterator() to Iterator_Interface<String> requires an unchecked conversion, so a
        compile-time unchecked warning is issued.

    In contrast, RawMembers inherits myNumbers() from the NonGeneric class whose erasure is also NonGeneric. Thus,
        the return type of myNumbers() in RawMembers is not erased, and the attempt to assign rw.myNumbers() to
        Collection<Number> requires no unchecked conversion, so no compile-time unchecked warning is issued.

    Similarly, the static member cng retains its parameterized type even when accessed through a object of raw type.

        Note that access to a static member through an instance is considered bad style and is discouraged.

    This example reveals that certain members of a raw type are not erased, namely static members whose types are
        parameterized, and members inherited from a non-generic supertype.

    Raw types are closely related to wildcards. Both are based on existential types. Raw types can be thought of as
        wildcards whose type rules are deliberately unsound, to accommodate interaction with legacy code. Historically,
        raw types preceded wildcards; they were first introduced in GJ, and described in the paper Making the future
        safe for the past: Adding Genericity to the Java Programming Language by Gilad Bracha, Martin Odersky, David
        Stoutamire, and Philip Wadler, in Proceedings of the ACM Conference on Object-Oriented Programming, Systems,
        Languages and Applications (OOPSLA 98), October 1998.

 */

public class Raw_Types {
}
