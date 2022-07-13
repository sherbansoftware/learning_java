package Concepts.Assert;

/*                                         What are	Asserts	used for?

    ○ Assertions are introduced in Java 1.4.

                   * They enable you to validate assumptions.

                                 - If an assert fails (i.e. returns false),

       AssertionError is thrown (if assertions are enabled). Basic assert is shown in the example below:

         private int computerSimpleInterest(int principal,float interest,int years){
				assert(principal>0);
				return 100;
       }


                                               Syntax of using Assertion:


    ○ There are two ways to use assertion. First way is:

                  * assert expression;

       and second way is:

                  * assert expression1 : expression2;


                                       When	should	Assert	be	used?



    ○ Assertions should NOT be used

                   * to validate input data to a public method or command line argument.

    ○ IllegalArgumentException

                   * would be a better option.

           In public method, only use assertions to check for cases which are never supposed to happen.


                                                   Advantage of Assertion:

    ○ It provides an effective way to detect and correct programming errors.


                                                    Enabling Assertions


    ○ By default,

                   * assertions are disabled.

           We need to run the code as given. The syntax for enabling assertion statement in Java source code is:

                    * java -ea

                    * java -enableassertions


    ○ Disabling Assertions


           The syntax for disabling assertions in java are:

                     * java -da

                     * java -disableassertions Test

             in VM option

*/

import java.util.Scanner;

public class Assert_ {
    public static void main(String args[]) {

        try {
            System.out.println("Testing assertions ");

            assert false : "If assertions are on, this will be printed";

        } catch (AssertionError e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur age ");

        int value = scanner.nextInt();
        assert value >= 18 : " Not valid";

        System.out.println("Value is " + value);
    }
}