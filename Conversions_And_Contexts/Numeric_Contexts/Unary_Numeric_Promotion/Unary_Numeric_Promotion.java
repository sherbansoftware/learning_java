package Conversions_And_Contexts.Numeric_Contexts.Unary_Numeric_Promotion;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6.1

/*                                              Unary Numeric Promotion

    Some operators apply unary numeric promotion to a single operand, which must produce a value of a numeric type:

            * If the operand is of compile-time type Byte, Short, Character, or Integer, it is subjected to unboxing conversion
                  (§5.1.8). The result is then promoted to a value of type int by a widening primitive conversion (§5.1.2) or
                  an identity conversion (§5.1.1).

            * Otherwise, if the operand is of compile-time type Long, Float, or Double, it is subjected to unboxing conversion
                 (§5.1.8).

            * Otherwise, if the operand is of compile-time type byte, short, or char, it is promoted to a value of type
                  int by a widening primitive conversion (§5.1.2).

             * Otherwise, a unary numeric operand remains as is and is not converted.

                    After the conversion(s), if any, value set conversion (§5.1.13) is then applied.

                    Unary numeric promotion is performed on expressions in the following situations:

              * Each dimension expression in an array creation expression (§15.10.1)

              * The index expression in an array access expression (§15.10.3)

              * The operand of a unary plus operator + (§15.15.3)

              * The operand of a unary minus operator - (§15.15.4)

              * The operand of a bitwise complement operator ~ (§15.15.5)

              * Each operand, separately, of a shift operator <<, >>, or >>> (§15.19).

              * A long shift distance (right operand) does not promote the value being shifted (left operand) to long.

 */

public class Unary_Numeric_Promotion {
    public static void main(String[] args) {
        byte b = 2;
        int a[] = new int[b];  // dimension expression promotion
        char c = '\u0001';
        a[c] = 1;              // index expression promotion
        a[0] = -c;             // unary - promotion
        System.out.println("a: " + a[0] + "," + a[1]);
        b = -1;
        int i = ~b;            // bitwise complement promotion
        System.out.println("~0x" + Integer.toHexString(b)
                + "==0x" + Integer.toHexString(i));
        i = b << 4L;           // shift promotion (left operand)
        System.out.println("0x" + Integer.toHexString(b)
                + "<<4L==0x" + Integer.toHexString(i));
    }
}
