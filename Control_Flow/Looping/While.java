package Control_Flow.Looping;

/*                                                                while loop

    The Java while loop is a control flow statement that executes a part of the programs repeatedly on the basis of
        given boolean condition.

                                                                 Syntax

        while (condition){
        //code to be executed
        increment / decrement statement
        }

                                                                 When to use

    The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended
        to use the while loop

 */


public class While {
	public static void main(String[] args) {
		int count = 0;
		// While is used when it is not clear how many times loop has to be executed.

		while (count < 5) {    // while this condition is true, loop is executed.
			System.out.print(count);
			count++;
		}// output is 01234

		// Depending on the condition, code in while might not be executed at all.
		count = 5;
		while (count < 5) {// condition is false. So, code in while is not executed.
			System.out.print(count);
			count++;
		}// Nothing is printed to output

	}
}
