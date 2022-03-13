package Expressions.Evaluation_Denotation_and_Result;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.1

/*                                                                Evaluation, Denotation, and Result

    When an expression in a program is evaluated (executed), the result denotes one of three things:

            * A variable (§4.12) (in C, this would be called an lvalue)

            * A value (§4.2, §4.3)

            * Nothing (the expression is said to be void)

    If an expression denotes a variable, and a value is required for use in further evaluation,
        then the value of that variable is used. In this context, if the expression denotes a variable or a value, we may speak simply of the value
        of the expression.

    Value set conversion (§5.1.13) is applied to the result of every expression that produces a value, including when the
        value of a variable of type float or double is used.

    An expression denotes nothing if and only if
        it is a method invocation (§15.12) that invokes a method that does not return a value, that is, a method declared
        void (§8.4). Such an expression can be used only as an expression statement (§14.8) or as the single expression
        of a lambda body (§15.27.2), because every other context in which an expression can appear requires the expression
        to denote something. An expression statement or lambda body that is a method invocation may also invoke a method
        that produces a result; in this case the value returned by the method is quietly discarded.

    Evaluation of an expression can produce side effects,
        because expressions may contain embedded assignments, increment operators, decrement operators, and method invocations.

    An expression occurs in either:

            * The declaration of some (class or interface) type that is being declared:

                • in a field initializer,
                •  in a static initializer,
                • in an instance initializer,
                • in a constructor declaration,
                • in a method declaration,
                • in an annotation.

             * An annotation on a package declaration or on a top level type declaration.

 */


public class Evaluation_Denotation_Aand_Result {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression");

        }







































        // In the following code that I will type below, write down what parts of the code
        // are expressions.
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score");
            score = 0;
        }












    }
}
