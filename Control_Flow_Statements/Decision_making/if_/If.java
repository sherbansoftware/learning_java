package Control_Flow_Statements.Decision_making.if_;


/*
                                                  if statement in Java:

    It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain
        condition is true then a block of statement is executed otherwise not.

    Syntax:
        if (expression)
        {
             statement;
         }

    	 Condition in if should always be boolean

 */

public class If {
    private static int x;

    public static void main(String[] args) {
        // Code inside If is executed only if the condition is true
        if (true) {
            System.out.println("Will be printed");
        }

        // Statement inside this condition is not executed
        if (false) {
            System.out.println("Will NOT be printed");// Not executed
        }

        //EXAMPLE

        int x = 5;

        if (x == 5) {
            System.out.println("x is 5");// executed since x==5 is true
        }

        x = 6;
        if (x == 5) {
            System.out.println("x is 5");// Not executed since x==5 is false
        }

        // Be very careful with formatting
        int number = 5;
        if (number < 0) // condition is false. So the line in if is not executed.
            number = number + 10; // Not executed
        number++; // This statement is not part of if
        System.out.println(number);// prints 6

      }
}
