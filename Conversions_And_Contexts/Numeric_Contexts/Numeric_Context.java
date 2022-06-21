package Conversions_And_Contexts.Numeric_Contexts;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6

/*                                                Numeric Contexts

    Numeric contexts apply to the operands of an arithmetic operator.

    Numeric contexts allow the use of:

        * an identity conversion                  https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.1

        * a widening primitive conversion         https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.1

        * an unboxing conversion
            optionally followed by a widening
            primitive conversion                  https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.1

    A numeric promotion is a process by which, given an arithmetic operator and its argument expressions, the arguments
        are converted to an inferred target type T. T is chosen during promotion such that each argument expression can
         be converted to T and the arithmetic operation is defined for values of type T.

    The two kinds of numeric promotion are:

            * unary numeric promotion             https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6.1
            * binary numeric promotion            https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6.2

                                                      NOTE

    * must be really carefully when make the cast

    * Have I got enough memory in the type that I'm casting to, to store the value that I'm casting from.
        Otherwise you'll get very strange results.


 */

public class Numeric_Context {
    public static void main(String[] args) {


        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 25567;
        // declare float
        float floatValue = 8834.3f;
        float floatValue1 = (float) 659.65;
        double doubleValue = 32.4;

        //  System.out.println(Byte.MAX_VALUE);
        intValue = (int) longValue;
        System.out.println(intValue);
        doubleValue = intValue;
        System.out.println(doubleValue);
        // lose some precision
        intValue = (int) floatValue;
        System.out.println(intValue);

        // it will not work like we expect to!!!
        // 128 is too big for byte
        byteValue = (byte) 128;
        System.out.println(byteValue);

    }
}
