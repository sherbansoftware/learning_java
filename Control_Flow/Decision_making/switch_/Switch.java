package Control_Flow.Decision_making.switch_;

/*                                           The switch Statement

    Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths.
    The body of a switch statement is known as a switch block. A statement in the switch block can be labeled with one
        or more case or default labels. The switch statement evaluates its expression, then executes all statements that
        follow the matching case label.


                              Deciding whether to use if-then-else statements or a switch statement

     is based on readability and the expression that the statement is testing. An if-then-else statement can test
     expressions based on ranges of values or conditions, whereas a switch statement tests expressions based only on a
     single integer, enumerated value, or String object.

                                              SYNTAX

switch(expression){
		case value1:
		//code to be executed;
		break;  //optional
		case value2:
		//code to be executed;
		break;  //optional
		......

default:
		code to be executed if all cases are not matched;
		}


                                            WORKS WITH


		  byte
		  short
		  char
		  int
	      Enum types
		  String
		  Byte,
		  Short,
		  Character
	      Integer


		                                     NOTE


           * default is optional
		   * default is executed if none of the case's match or is no brake keyword
		   * if there is no break, then all the case's until we find break are executed.
		   * default doesn't need to be the last case in a switch.
		   * Case value should be a compile time constant.
		   * can be used multiple case

*/

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // using int
        int month = 12;
        int number;

        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

        // Notice that there is not break after each case.
        // If there is no break, then all the case's until we find break are executed.
        number = 1;
        switch (number) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("Default not break there");
        }

        number = 2;
        switch (number) {
            case 1:
                System.out.println(1);
                break;
            case 2:
            case 3:
                System.out.println("Number is 2 or 3");
                break;
            default:
                System.out.println("Default");
                break;
        }
        // Output of above switch is Number is 2 or 3.

        // Case value should be a compile time constant.
        number = 10;
        switch (number) {
            // case number>5://COMPILER ERROR. Cannot have a condition
            // case number://COMPILER ERROR. Should be constant.
        }

        System.out.println("============================================================================================ ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a command:");
        String text = sc.nextLine();
        switch (text) {
            case "start":
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Command not recognised!");
                break;
        }

    }
}