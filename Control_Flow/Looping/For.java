package Control_Flow.Looping;

/*                     The Java for loop is a control flow statement that iterates a part of
                                                the programs multiple times.


    ○  A simple for loop is the same as C/C++. We can initialize the variable,
           check condition and increment/decrement value. It consists of four parts:

    1. Initialization:

                   * It is the initial condition which is executed once when the loop starts.

            Here, we can initialize the variable, or we can use an already initialized variable.It is an optional condition.

    2. Condition:

                 * It is the second condition which is executed each time to test the condition of the loop.
                 * It continues execution until the condition is false. It must return boolean value either true or false.
                 * It is an optional condition.

    3. Increment/Decrement:

                 * It increments or decrements the variable value. It is an optional condition.

    4. Statement:

                  * The statement of the loop is executed each time until the second condition is false.


                                                           SYNTAX


    for(initialization; condition; increment/decrement){
        //statement or code to be executed
    }

                                                            When to use


    ○ If the number of iteration is fixed, it is recommended to use for loop.

 */

public class For {
	public static void main(String[] args) {


		for (int i = 1; i < 11; i++) {
			System.out.println("Count is: " + i);
		}

		                      //Any of 3 parts	in	a	for	loop	can	be	empty.

//		for (;;)	{
//			System.out.print("I	will be	looping	for	ever..");
//		}

		//Result:
		//Infinite	loop	=>	Loop	executes	until	the	program	is	terminated.

		                                         //Java Nested for Loop

		//loop of i
		for(int i=1;i<=3;i++){
        //loop of j
			for(int j=1;j<=3;j++){
				System.out.println(i+" "+j);
			}//end of i
		}//end of j

		                                           // PyramidExample

		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();//new line
		}


		for (int j = 0; j < 2; j++) {
			for (int k = 0; k < 10; k++) {
				System.out.print(j + "" + k);
				if (k == 5) {
					break; //Takes out of inner loop using k
				}
			}
		}
//		Program	Output
//		000102030405101112131415

	    // Each time the value	of	k is 5	the	break statement	is	executed.
		//Labels are used when we want to exit from outer loop
		System.out.println ();
		outer:
		for (int l	=	0;	l	<	2;	l++)	{
			for (int k	=	0;	k	<	10;	k++)	{
				System.out.print(l	+	"" +	k);
				if (k	==	5)	{
					break outer;//Takes	out	of outer loop
				}
			}
		}

//		Program	Output
//		000102030405

		// Example of a For Loop
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		// Output is 0123456789


		// There can be multiple statements in Initialization
		// or Operation seperated by commas
//		for (int i = 0, j = 0; i < 10; i++, j--) {
//			System.out.print(j);
//		}
		// Output is 0-1-2-3-4-5-6-7-8-9

		// Enhanced For Loop
//		int[] numbers = { 1, 2, 3, 4, 5 };
//		for (int number : numbers) {
//			System.out.print(number);
//		}
		// Output is 12345

		// Any of 3 parts in a for can be empty
//		for (;;) {
//			System.out.print("I will be looping for ever..");
//		}
		// Result : Infinite loop

	}
}
