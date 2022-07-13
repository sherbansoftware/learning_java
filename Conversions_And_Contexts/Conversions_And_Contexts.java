package Conversions_And_Contexts;

/*                                                  Conversions and Contexts

    Every expression written in the Java programming language either produces no result (§15.1) or has a type that can be
        deduced at compile time (§15.3). When an expression appears in most contexts, it must be compatible with a type
        expected in that context; this type is called the target type. For convenience, compatibility of an expression
        with its surrounding context is facilitated in two ways:

                * First, for some expressions, termed poly expressions (§15.2), the deduced type can be influenced by the
                    target type. The same expression can have different types in different contexts.

                * Second, after the type of the expression has been deduced, an implicit conversion from the type of the
                    expression to the target type can sometimes be performed.

    If neither strategy is able to produce the appropriate type, a compile-time error occurs.

    The rules determining whether an expression is a poly expression, and if so, its type and compatibility in a particular
        context, vary depending on the kind of context and the form of the expression. In addition to influencing the type
        of the expression, the target type may in some cases influence the run time behavior of the expression in order to
        produce a value of the appropriate type.

    Similarly, the rules determining whether a target type allows an implicit conversion vary depending on the kind of
        context, the type of the expression, and, in one special case, the value of a constant expression (§15.28).
        A conversion from type S to type T allows an expression of type S to be treated at compile time as if it had type T
         instead. In some cases this will require a corresponding action at run time to check the validity of the conversion
         or to translate the run-time value of the expression into a form appropriate for the new type T.

                                             Example 5.0-1. Conversions at Compile Time and Run Time

    A conversion from:

            * type Object to type Thread
                requires a run-time check to make sure that the run-time value is actually an instance of class Thread
                or one of its subclasses; if it is not, an exception is thrown.

             * type Thread to type Object

                 requires no run-time action; Thread is a subclass of Object, so any reference produced by an expression
                 of type Thread is a valid reference value of type Object.

             * type int to type long

                  requires run-time sign-extension of a 32-bit integer value to the 64-bit long representation. No
                  information is lost.

            * type double to type long

                   requires a non-trivial translation from a 64-bit floating-point value to the 64-bit integer representation.
                   Depending on the actual run-time value, information may be lost.


    The conversions possible in the Java programming language are grouped into 13 categories:

1. Identity Conversion                            https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.1
2. Widening Primitive Conversion                  https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.2
3. Narrowing Primitive Conversion                 https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.3
4. Widening and Narrowing Primitive Conversion    https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.4
5. Widening Reference Conversion                  https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.5
6. Narrowing Reference Conversion                 https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.6
7. Boxing Conversion                              https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.7
8. Unboxing Conversion                            https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.8
9. Unchecked Conversion                           https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.9
10. Capture Conversion                            https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.10
11. String Conversion                             https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.11
12. Forbidden Conversions                         https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.12
13. Value Set Conversion                          https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.13

    There are six kinds of conversion contexts in which poly expressions may be influenced by context or implicit
        conversions may occur. Each kind of context has different rules for poly expression typing and allows conversions
        in some of the categories above but not others. The contexts are:

    Assignment contexts (§5.2, §15.26), in which an expression's value is bound to a named variable. Primitive and reference
        types are subject to widening, values may be boxed or unboxed, and some primitive constant expressions may be subject
        to narrowing. An unchecked conversion may also occur.

    Strict invocation contexts (§5.3, §15.9, §15.12), in which an argument is bound to a formal parameter of a constructor
        or method. Widening primitive, widening reference, and unchecked conversions may occur.

    Loose invocation contexts (§5.3, §15.9, §15.12), in which, like strict invocation contexts, an argument is bound to
        a formal parameter. Method or constructor invocations may provide this context if no applicable declaration can
        be found using only strict invocation contexts. In addition to widening and unchecked conversions, this context
        allows boxing and unboxing conversions to occur.

    String contexts (§5.4, §15.18.1), in which a value of any type is converted to an object of type String.

    Casting contexts (§5.5), in which an expression's value is converted to a type explicitly specified by a cast operator
        (§15.16). Casting contexts are more inclusive than assignment or loose invocation contexts, allowing any specific
        conversion other than a string conversion, but certain casts to a reference type are checked for correctness at run time.

    Numeric contexts (§5.6), in which the operands of a numeric operator may be widened to a common type so that an
        operation can be performed.

    The term "conversion" is also used to describe, without being specific, any conversions allowed in a particular context.
        For example, we say that an expression that is the initializer of a local variable is subject to "assignment conversion",
        meaning that a specific conversion will be implicitly chosen for that expression according to the rules for the
        assignment context.

                                                                NOTE
 */


public class Conversions_And_Contexts {
    public static void main(String[] args) {
        // Casting conversion (5.4) of a float literal to type int. Without the cast operator, this would  be a
        // compile-time error, because this is a narrowing conversion (5.1.3):
        int i = (int) 12.5f;

        // String conversion (5.4) of i's int value:
        System.out.println("(int)12.5f==" + i);

        // Assignment conversion (5.2) of i's value to type  float. This is a widening conversion (5.1.2):
        float f = i;

        // String conversion of f's float value:
        System.out.println("after float widening: " + f);

        // Numeric promotion (5.6) of i's value to type float. This is a binary numeric promotion.
        // After promotion, the operation is float*float:
        System.out.print(f);
        f = f * i;

        // Two string conversions of i and f:
        System.out.println("*" + i + "==" + f);

        // Invocation conversion (5.3) of f's value to type double, needed because the method Math.sin
        // accepts only a double argument:
        double d = Math.sin(f);

        // Two string conversions of f and d:
        System.out.println("Math.sin(" + f + ")==" + d);
    }
}

