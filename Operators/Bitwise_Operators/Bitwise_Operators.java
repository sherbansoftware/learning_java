package Operators.Bitwise_Operators;

// https://www.baeldung.com/java-bitwise-operators


/*                                                   Bitwise Operators


    ○ How Bitwise Operators work?

                  * work on a binary equivalent of decimal numbers

                   * and perform operations on them bit by bit

           as per the given operator:

                            - First,

                                  the operands are converted to their binary representation

                            - Next,

                                  the operator is applied to each binary number and the result is calculated

                            - Finally,

                                  the result is converted back to its decimal representation

    ○ Bitwise operators types:

                  1. Bitwise AND Operator & :

                                 * The AND operator compares each binary digit of two integers and gives back 1 if BOTH
                                       are 1, otherwise it returns 0.
                                   This is similar to the && operator with boolean values. When the values of two booleans
                                       are true the result of a && operation is true.

		          2. Bitwise OR Operator | :

		                         * The OR operator compares each binary digit of two integers and gives back 1 if EITHER
		                               of them is 1.
                                    This is similar to the || logical operator used with booleans. When two booleans are
                                        compared the result is true if either of them is true. Similarly, the output is
                                        1 when either of them is 1.

		          3. Bitwise XOR Operator ^ :

		                         * The XOR operator compares each binary digit of two integers and gives back 1 if
		                               BOTH THE COMPARED BITS ARE DIFFERENT.
		                            This means that if bits of both the integers
		                               are 1 or 0 the result will be 0; otherwise, the result will be 1:

		          4. Bitwise Complement Operator ~ :

		                         * Bitwise Not or Complement operator simply means the negation of each bit of the input value.
		                               It takes only one integer and it's equivalent to the ! operator.
                                   This operator changes each binary digit of the integer, which means all 0 become 1 and
                                       all 1 become 0. The ! operator works similarly for boolean values: it reverses
                                       boolean values from true to false and vice versa.

                   5. Bitwise Shift Operators:

                                 * Signed Left Shift  <<

                                           - The left shift operator shifts the bits to the left by the number of times
                                                 specified by the right side of the operand. After the left shift,
                                                 the empty space in the right is filled with 0.

		                         * Signed Right Shift >>

				                              - The right shift operator shifts all the bits to the right. The empty space
				                                    in the left side is filled depending on the input number:

                                                     • When an input number is negative, where the leftmost bit is 1,
                                                           then the empty spaces will be filled with 1
                                                     • When an input number is positive, where the leftmost bit is 0,
                                                           then the empty spaces will be filled with 0

                                  * Unsigned Right Shift >>>

                                                - This operator is very similar to the signed right shift operator.
                                                      The only difference is that the empty spaces in the left are
                                                      filled with 0 irrespective of whether the number is positive or
                                                      negative. Therefore, the result will always be a positive integer.

                                   *  * Unsigned Left Shift <<<

                                                 - There is no unsigned left-shift operator in Java.


                                        Difference Between Bitwise and Logical Operators


    ○ There are a few differences between the bitwise operators we've discussed here and the more commonly known
           logical operators.

                  * First,

                           - logical operators work on boolean expressions and return boolean values (either true or false),

                           - whereas bitwise operators work on binary digits of integer values (long, int, short, char, and byte)
                                 and return an integer.

                   * Also,

                           - logical operators always evaluate the first boolean expression and, depending on its result
                              and the operator used, may or may not evaluate the second.

                            - on the other hand, bitwise operators always evaluate both operands.

                    * Finally,

                            - logical operators are used in making decisions based on multiple conditions,

                            - while bitwise operators work on bits and perform bit by bit operations.


                                                   Use Cases


    ○ Some potential use cases of bitwise operators are:

                   * Communication stacks

                             - where the individual bits in the header attached to the data signify important information

                   * In embedded systems

                              - to set/clear/toggle just one single bit of a specific register without modifying the
                                    remaining bits

                   * To encrypt data

                               - for safety issues using the XOR operator

                   * In data compression

                                - by converting data from one representation to another, to reduce the amount of space used



 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bitwise_Operators {


 /*    ○ Bitwise OR (|)  ---------------------------------------------------------------------------------------------

                      * https://www.baeldung.com/java-bitwise-operators#1-bitwise-or-    */

    @Test
    public void givenTwoIntegers_whenOrOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 | value2;
        assertEquals(7, result);
    }

 /*   the binary representation of Bitwise OR (|):

                  0110
                  0101
                  -----
                  0111

        The OR operator compares each binary digit of two integers and gives back 1 if either of them is 1.
        This is similar to the || logical operator used with booleans

*/

/*    ○  Bitwise AND Operator & ---------------------------------------------------------------------------------------

                      * https://www.baeldung.com/java-bitwise-operators#2-bitwiseand-amp   */

    @Test
    public void givenTwoIntegers_whenAndOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 & value2;
        assertEquals(4, result);
    }

/*     Binary representation of Bitwise AND Operator &:

                   0110
                   0101
                   -----
                   0100

 */

/*    ○   Bitwise XOR (^):   ------------------------------------------------------------------------------------------

                       * https://www.baeldung.com/java-bitwise-operators#3-bitwisexor-
*/

    @Test
    public void givenTwoIntegers_whenXorOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 ^ value2;
        assertEquals(3, result);
    }


    /*   the binary representation:

                   0110
                   0101
                   -----
                   0011


 */
/*    ○ Bitwise COMPLEMENT (~): ---------------------------------------------------------------------------------------

                     * https://www.baeldung.com/java-bitwise-operators#4-bitwisecomplement-    */

@Test
public void givenOneInteger_whenNotOperator_thenNewDecimalNumber() {
    int value1 = 6;
    int result = ~value1;
    assertEquals(-7, result);
}


/*  binary representation for Bitwise COMPLEMENT (~):

                    0000 0110 -> 1111 1001                                */


/*     ○  Signed Left Shift [<<]   -----------------------------------------------------------------------------------*/


@Test
public void givenOnePositiveInteger_whenLeftShiftOperator_thenNewDecimalNumber() {
    int value = 12;
    int leftShift = value << 2;
    assertEquals(48, leftShift);
}
  //  This works similarly for a negative value:

    @Test
    public void givenOneNegativeInteger_whenLeftShiftOperator_thenNewDecimalNumber() {
        int value = -12;
        int leftShift = value << 2;
        assertEquals(-48, leftShift);
    }

/*     ○ Signed Right Shift [>>]*  ------------------------------------------------------------------------------------*/

    @Test
    public void givenOnePositiveInteger_whenSignedRightShiftOperator_thenNewDecimalNumber() {
        int value = 12;
        int rightShift = value >> 2;
        assertEquals(3, rightShift);
    }

 //   Also, for a negative value:

    @Test
    public void givenOneNegativeInteger_whenSignedRightShiftOperator_thenNewDecimalNumber() {
        int value = -12;
        int rightShift = value >> 2;
        assertEquals(-3, rightShift);
    }

/*    ○  Unsigned Right Shift >>> -------------------------------------------------------------------------------------*/

    @Test
    public void givenOnePositiveInteger_whenUnsignedRightShiftOperator_thenNewDecimalNumber() {
        int value = 12;
        int unsignedRightShift = value >>> 2;
        assertEquals(3, unsignedRightShift);
    }

//    And now, the negative value:

    @Test
    public void givenOneNegativeInteger_whenUnsignedRightShiftOperator_thenNewDecimalNumber() {
        int value = -12;
        int unsignedRightShift = value >>> 2;
        assertEquals(1073741821, unsignedRightShift);
    }

}
