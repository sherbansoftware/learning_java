package Number_System.Binary_Number_System;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Byte.html


/*                                                  Binary


    ○ The binary number system

                   * uses

                                 - 0s

                                 - and 1s

                         to represent numbers.

       Computers use binary numbers to

                   * store

                   * and perform operations

           on any data.

                                                         Binary Literals



    ○ Java added a new feature Binary Literal in Java 7. I allows you to express integral types (byte, short, int, and long)
        in binary number system.

    ○ To specify a binary literal, add the prefix

                   * 0b

                   * or 0B

           to the integral value.

 */


public class Binary_Number_System {
    public static void main(String[] args) {
        // Binary literal in byte type
        byte b1 = 0b101;    // Using b0, The b can be lower or upper case
        byte b2 = 0B101;    // Using B0
        System.out.println("----------Binary Literal in Byte----------------");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // Binary literal in short type
        short s1 = 0b101;   // Using b0, The b can be lower or upper case
        short s2 = 0B101;   // Using B0
        System.out.println("----------Binary Literal in Short----------------");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // Binary literal in int type
        int i1 = 0b101;     // Using b0, The b can be lower or upper case
        int i2 = 0B101;     // Using B0
        System.out.println("----------Binary Literal in Integer----------------");
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        // Binary literal in long type
        long l1 = 0b0000011111100001;   // Using b0, The b can be lower or upper case
        long l2 = 0B0000011111100001;   // Using B0
        System.out.println("----------Binary Literal in Long----------------");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
    }
}


