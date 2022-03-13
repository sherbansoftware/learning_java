package Control_Flow_Statements.Decision_making.if_else;
/*
 if-else statement in Java:


        We can use the else keyword to create a simple branch. If the expression inside the square brackets following
            the if keyword evaluates to false, the statement following the else keyword is automatically executed.


        Syntax:
        if (expression)
        {
        statement-1;
        }
        else{
        statement-2;
        }

         	 Condition in if should always be boolean

 */

public class If_Else {
    public static void main(String[] args) {

        int y = 10;

        if (y == 10) {
            System.out.println("Y is 10");// executed y==10 is true
        } else {
            System.out.println("Y is Not 10");
        }

        y = 11;

        if (y == 10) {
            System.out.println("Y is 10");// NOT executed
        } else {
            System.out.println("Y is Not 10");// executed-condition y==10 is false
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
        // Output is 2.
        // Once a condition in nested-if-else is true the rest of the code is not executed.

        // Guess the output
        int l = 15;

        if (l < 20)
            System.out.println("l<20");
        if (l > 20)
            System.out.println("l>20");
        else
            System.out.println("Who am I?");
        // Output is "l<20" followed by "Who am I?" on next line.
        // else belong to the last if before it unless brackets ({}) are used.

        // Guess the output
        int m = 15;

        if (m > 20)
            if (m < 20)
                System.out.println("m>20");
            else
                System.out.println("Who am I?");
        // Nothing is printed to output. Above code is similar to code below
        if (m > 20) {// Condn is false. So, code in if is not executed
            if (m < 20)
                System.out.println("m>20");
            else
                System.out.println("Who am I?");
        }

        int x1 = 0;
        // Condition in if should always be boolean
        // if(x1) {} //COMPILER ERROR
        // if(x1=0) {}//COMPILER ERROR. Using = instead of ==

        boolean isTrue = false;
        if (isTrue == true) {
            System.out.println("TRUE TRUE");// Will not be printed
        }
        if (isTrue = true) {
            System.out.println("TRUE");// Will be printed.
        }
        // Condition is isTrue=true. This is assignment. Returns true. So, code
        // in if is executed.
    }
}
