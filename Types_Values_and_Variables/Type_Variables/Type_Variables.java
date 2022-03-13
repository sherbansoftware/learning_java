package Types_Values_and_Variables.Type_Variables;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.4

/*                                                           Type Variables

    A type variable is an unqualified identifier used as a type in:

            * class
            * interface
            * method
            * constructor bodies.

    A type variable is introduced by the declaration of a type parameter of a :

            * generic class
            * interface
            * method
            * constructor

                                   The scope of a type variable declared as a type parameter is specified in §6.3.

    Every type variable declared as a type parameter has a bound.

        If no bound is declared for a type variable, Object is assumed.
        If a bound is declared, it consists of either:

                a single type variable T, or
                a class or interface type T possibly followed by interface types I1 & ... & In.

    It is a compile-time error if any of the types I1 ... In is a class type or type variable.
    The erasures (§4.6) of all constituent types of a bound must be pairwise different, or a compile-time error occurs.
    A type variable must not at the same time be a subtype of two interface types which are different parameterizations
        of the same generic interface, or a compile-time error occurs.
    The order of types in a bound is only significant in that the erasure of a type variable is determined by the first
        type in its bound, and that a class type or type variable may only appear in the first position.
    The members of a type variable X with bound T & I1 & ... & In are the members of the intersection type T & I1 & ... &
        In appearing at the point where the type variable is declared.

 */

//  Members of a Type Variable

class C {
    public void mCPublic() {
    }

    protected void mCProtected() {
    }

    void mCPackage() {
    }

    private void mCPrivate() {
    }
}

interface I {
    void mI();
}

class CT extends C implements I {
    public void mI() {
    }
}

class Type_Variables {
    <T extends C & I> void test(T t) {
        t.mI();           // OK
        t.mCPublic();     // OK
        t.mCProtected();  // OK
        t.mCPackage();    // OK
        //  t.mCPrivate();    // Compile-time error
    }

    /*
    The type variable T has the same members as the intersection type C & I, which in turn has the same members as the
        empty class CT, defined in the same scope with equivalent supertypes. The members of an interface are always
        public, and therefore always inherited (unless overridden). Hence, mI is a member of CT and of T. Among the
        members of C, all but mCPrivate are inherited by CT, and are therefore members of both CT and T.

    If C had been declared in a different package than T, then the call to mCPackage would give rise to a compile-time
        error, as that member would not be accessible at the point where T is declared.
     */
}
