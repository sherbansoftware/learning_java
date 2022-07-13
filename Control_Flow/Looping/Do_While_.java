package Control_Flow.Looping;

/*                                          The Java do while loop


    ○ is a control flow statement that executes a part of the programs at least once and the further execution depends upon
          the given boolean condition.


                                                      SYNTAX


         do{
            //code to be executed
        }while(condition);

                                              When to use


    ○ If the

                   * number of iteration is not fixed,

                   * and you must have to execute the loop at least once,

           it is recommended to use the do-while loop.

 */


public class Do_While_ {
    public static void main(String[] args) {
        int count = 0;
        // do while also is used when it is not clear how many times loop has to be executed.
        do {
            System.out.print(count);
            count++;
        } while (count < 5);// while this condition is true, loop is executed.
        // output is 01234

        // Code in do while is executed at least once.
        count = 5;
        do {
      //     System.out.print(count);
            count++;
        } while (count < 5);
        // output is 5


//        Scanner sc = new Scanner(System.in);
//        int input =0;
//        do {
//            System.out.println("Enter a number:");
//            input = sc.nextInt();
//        } while (input != 5);
//
//        System.out.println("Got 5");

   }
}
