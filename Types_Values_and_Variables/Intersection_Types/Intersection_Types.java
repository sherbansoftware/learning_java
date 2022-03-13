package Types_Values_and_Variables.Intersection_Types;

/*                                                              Intersection Types

    An intersection type takes the form T1 & ... & Tn (n > 0), where Ti (1 ≤ i ≤ n) are types.

    Intersection types can be derived from type parameter bounds (§4.4) and cast expressions (§15.16); they also arise
        in the processes of capture conversion (§5.1.10) and least upper bound computation (§4.10.4).

    The values of an intersection type are those objects that are values of all of the types Ti for 1 ≤ i ≤ n.

    Every intersection type T1 & ... & Tn induces a notional class or interface for the purpose of identifying the members
        of the intersection type, as follows:

             * For each Ti (1 ≤ i ≤ n), let Ci be the most specific class or array type such that Ti <: Ci. Then there must
                 be some Ck such that Ck <: Ci for any i (1 ≤ i ≤ n), or a compile-time error occurs.

             * For 1 ≤ j ≤ n, if Tj is a type variable, then let Tj' be an interface whose members are the same as the
                 public members of Tj; otherwise, if Tj is an interface, then let Tj' be Tj.

             * If Ck is Object, a notional interface is induced; otherwise, a notional class is induced with direct
                 superclass Ck. This class or interface has direct superinterfaces T1', ..., Tn' and is declared in the
                 package in which the intersection type appears.

    The members of an intersection type are the members of the class or interface it induces.

    It is worth dwelling upon the distinction between intersection types and the bounds of type variables. Every type
        variable bound induces an intersection type. This intersection type is often trivial, consisting of a single type.
        The form of a bound is restricted (only the first element may be a class or type variable, and only one type
        variable may appear in the bound) to preclude certain awkward situations coming into existence. However,
        capture conversion can lead to the creation of type variables whose bounds are more general, such as array types).

 */

public class Intersection_Types {
}
