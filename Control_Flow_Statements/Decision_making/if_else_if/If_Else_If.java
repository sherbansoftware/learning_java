package Control_Flow_Statements.Decision_making.if_else_if;


/*
                                       if-else-if statement in Java:

    We can create multiple branches using the else if keyword. The else if keyword tests for another condition if and only
        if the previous condition was not met. Note that we can use multiple else if keywords in our tests.

Syntax:
if (expression)
{
      statement-1;
}
else if{
     statement-2;
}
else {
     statement-3;
}
            	 Condition in if should always be boolean
 */

public class If_Else_If {
    public static void main(String[] args) {
        // Nested else if the code in the first if condition that is true is executed.
        // If none of the if conditions are true, then code in else is executed.
        int z = 15;
        if (z == 10) {
            System.out.println("Z is 10");// NOT executed
        } else if (z == 12) {
            System.out.println("Z is 12");// NOT executed
        } else if (z == 15) {
            System.out.println("Z is 15");// executed. Rest of the if else are skipped.
        } else {
            System.out.println("Z is Something Else.");// NOT executed
        }

        z = 18;
        if (z == 10) {
            System.out.println("Z is 10");// NOT executed
        } else if (z == 12) {
            System.out.println("Z is 12");// NOT executed
        } else if (z == 15) {
            System.out.println("Z is 15");// NOT executed
        } else {
            System.out.println("Z is Something Else.");// executed
        }

        // Guess the output
        int k = 15;
        if (k > 20) {
            System.out.println(1);
        } else if (k > 10) {
            System.out.println(2);
        } else if (k < 20) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
        // Output is 2. Once a condition in nested-if-else is true the rest of
        // the code is not executed.

    }
}