package Concepts.Covariant;

// https://www.geeksforgeeks.org/covariant-return-types-java/

/*                                                 Covariant return type

    ○ Java version 5.0 onwards it is possible to have:

                * different return types for an overriding method in the child class,

                * but the child’s return type should be a subtype of the parent’s return type.

            The overriding method becomes variant with respect to return type.

    ○ The co-variant return type is based on the

                * Liskov substitution principle.

                                                Advantage to use:

             * It helps to avoid confusing type casts present in the class hierarchy and thus making the code readable,
                   usable and maintainable.

             * We get the liberty to have more specific return types when overriding methods.

             * Help in preventing run-time ClassCastExceptions on returns

                                                         Note:

              * If we swap return types of Base and Derived, then program would not work.

 */



public class Covariant {
}
