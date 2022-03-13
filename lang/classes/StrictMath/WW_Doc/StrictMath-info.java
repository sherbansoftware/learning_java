package lang.classes.StrictMath.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/lang/StrictMath.html

// https://www.geeksforgeeks.org/java-lang-strictmath-class-java-set-1/

class StrictMath_RT {
    StrictMath strictMath;
}

/*               public final class StrictMath extends Object

    The class StrictMath contains methods for performing basic numeric operations such as the elementary exponential,
        logarithm, square root, and trigonometric functions.
    To help ensure portability of Java programs, the definitions of some of the numeric functions in this package require
        that they produce the same results as certain published algorithms.
        These algorithms are available from the well-known network library netlib as the package "Freely Distributable
        Math Library," fdlibm. These algorithms, which are written in the C programming language, are then to be
        understood as executed with all floating-point operations following the rules of Java floating-point arithmetic.

    The Java math library is defined with respect to fdlibm version 5.3. Where fdlibm provides more than one definition
        for a function (such as acos), use the "IEEE 754 core function" version (residing in a file whose name begins
        with the letter e). The methods which require fdlibm semantics are sin, cos, tan, asin, acos, atan, exp, log,
        log10, cbrt, atan2, pow, sinh, cosh, tanh, hypot, expm1, and log1p.

   The platform uses signed two's complement integer arithmetic with int and long primitive types. The developer should
       choose the primitive type to ensure that arithmetic operations consistently produce correct results, which in some
       cases means the operations will not overflow the range of values of the computation. The best practice is to
       choose the primitive type and algorithm to avoid overflow. In cases where the size is int or long and overflow
       errors need to be detected, the methods addExact, subtractExact, multiplyExact, and toIntExact throw an
       ArithmeticException when the results overflow. For other arithmetic operations such as divide, absolute value,
       increment, decrement, and negation overflow occurs only with a specific minimum or maximum value and should be
       checked against the minimum or maximum as appropriate.

Since:
1.3

    RELATED

 */ 