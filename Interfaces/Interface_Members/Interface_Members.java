package Interfaces.Interface_Members;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.2

/*                                                              Interface Members

    The members of an interface type are:

            * Members declared in the body of the interface (§9.1.4).

            * Members inherited from any direct superinterfaces (§9.1.3).

            * If an interface has no direct superinterfaces, then the interface implicitly declares a public abstract
                member method m with signature s, return type r, and throws clause t corresponding to each public instance
                method m with signature s, return type r, and throws clause t declared in Object, unless an abstract method
                with the same signature, same return type, and a compatible throws clause is explicitly declared by the interface.

    It is a compile-time error if
        the interface explicitly declares such a method m in the case where m is declared to be final in Object.

    It is a compile-time error if the interface explicitly declares a method with a signature that is override-equivalent
        (§8.4.2) to a public method of Object, but which has a different return type, or an incompatible throws clause,
        or is not abstract.

    The interface inherits, from the interfaces it extends,

        * all members of those interfaces,

     except for

        * fields,
         * classes,
         * and interfaces that it hides;
         * abstract or default methods that it overrides (§9.4.1);
         * and static methods.

    Fields, methods, and member types of an interface type may have the same name, since they are used in different contexts
        and are disambiguated by different lookup procedures (§6.5). However, this is discouraged as a matter of style.

 */

public class Interface_Members {
}
