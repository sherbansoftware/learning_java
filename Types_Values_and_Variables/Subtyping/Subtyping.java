package Types_Values_and_Variables.Subtyping;

/*                                                     Subtyping

    The subtype and supertype relations are binary relations on types.

    The supertypes of a type are obtained by reflexive and transitive closure over the direct supertype relation,
        written S >1 T, which is defined by rules given later in this section. We write S :> T to indicate that the
        supertype relation holds between S and T.

    S is a proper supertype of T, written S > T, if S :> T and S ≠ T.

    The subtypes of a type T are all types U such that T is a supertype of U, and the null type. We write T <: S to
        indicate that that the subtype relation holds between types T and S.

    T is a proper subtype of S, written T < S, if T <: S and S ≠ T.

    T is a direct subtype of S, written T <1 S, if S >1 T.

    Subtyping does not extend through parameterized types: T <: S does not imply that C<T> <: C<S>.


 */


public class Subtyping {
}
