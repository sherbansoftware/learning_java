package Exceptions.Exception_Handling.Try_Catch_Block;

// https://beginnersbook.com/2013/04/try-catch-in-java/


/*                                              Try Catch in Java – Exception handling

    Try block

        The try block contains set of statements where an exception can occur. A try block is always followed by a
            catch block, which handles the exception that occurs in associated try block. A try block must be followed
            by catch blocks or finally block or both.

    Syntax of try block

            try{
                //statements that may cause an exception
            }

    Catch block

        A catch block is where you handle the exceptions, this block must follow the try block. A single try block can
            have several catch blocks associated with it. You can catch different exceptions in different catch blocks.
            When an exception occurs in try block, the corresponding catch block that handles that particular exception
            executes. For example if an arithmetic exception occurs in try block then the statements enclosed in catch
            block for arithmetic exception executes.

    Syntax of try catch in java

            try
            {
                //statements that may cause an exception
            }
            catch (exception(type) e(object))‏       {
                //error handling code
            }

 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_Exception {
    public static void main(String[] args) {

        File file = new File("resources/report.txt");
        try (FileReader fr = new FileReader(file)) {
          int data = fr.read();
          while(fr.read() != -1) {
              System.out.print((char) data);
              data = fr.read();
          }
        } catch (IOException e) {
            System.out.println("File: " + file.toString() + " not found!");
        }
        System.out.println("\nFinished.");
    }
}

