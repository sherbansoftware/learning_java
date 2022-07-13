package Exceptions.Exception_Handling.Finally_Block;


/*                                          The finally Block


    ○ The finally block always executes when the try block exits.

                   * This ensures that the finally block is executed even if an unexpected exception occurs.

                   * But finally is useful for more than just exception handling

                                 — it allows the programmer to avoid having cleanup code accidentally bypassed by

                                               • a return,

                                               • continue,

                                               • or break.

                  *  Putting cleanup code in a finally block is always a good practice,

                                 - even when no exceptions are anticipated.
                                 

                                 In what scenarios finally block is not executed?


    1. If exception is thrown in finally.

    2. If JVM Crashes in between (for example, System.exit())


                                                    IMPORTANT:


    ○ Use a

                   * try-with-resources statement

                   * instead of a finally block

                                 - when closing a file or otherwise recovering resources.

    ○ The following example uses a try-with-resources statement to

                   * clean up

                   * and close the PrintWriter and FileWriter

           for the writeList method:



 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Finally_Block_ {


    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(2, 5, 99, 67, 5);

        writeList(list);
    }

    public static void writeList(List<Integer> list) throws IOException {
        try (FileWriter f = new FileWriter("resources/OutFile.txt");
             PrintWriter out = new PrintWriter(f)) {
            for (int i = 0; i < list.size(); i++) {
                out.println("Value at: " + i + " = " + list.get(i));
                System.out.println("Value at: " + i + " = " + list.get(i));
            }
        }
    }
}
