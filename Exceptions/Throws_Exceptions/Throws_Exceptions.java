package Exceptions.Throws_Exceptions;
// https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws


/*                                                Java throws keyword

    The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may
        occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal
        flow of the program can be maintained.

    Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as
        NullPointerException, it is programmers' fault that he is not checking the code before it being used.

                                           Which exception should be declared?

    Ans: Checked exception only, because:

    * unchecked exception:
            under our control so we can correct our code.
    * error:
            beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or
            StackOverflowError.

                                    The differences between throw and throws in Java are:

   Key                            throw                                                      throws
   Difference

1.	Point of      The throw keyword is used inside a function.       The throws keyword is used in the function signature
    Usage         It is used when it is required to throw an         It is used when the function has some statements that
                      Exception logically.                               can lead to exceptions.


2.	Exceptions    The throw keyword is used to throw an exception      The throws keyword can be used to declare multiple
    Thrown            explicitly.                                          exceptions, separated by a comma. Whichever exception
                  It can throw only one exception at a time.               occurs, if matched with the declared ones, is
                                                                           thrown automatically then.


3.	Syntax        Syntax of throw keyword includes the instance of     Syntax of throws keyword includes the class names
                      the Exception to be thrown. Syntax wise throw        of the Exceptions to be thrown.Syntax wise throws
                      keyword is followed by the instance variable         keyword is followed by exception class names.

4.	Propagation   throw keyword cannot propagate checked exceptions.    throws keyword is used to propagate the checked
    of                It is only used to propagate the unchecked            Exceptions only.
    Exceptions        Exceptions that are not checked using the throws
                      keyword.


                                                      Note

            * so don't let your application produce a stack trace if you intend it to be distributed and used by other
                people.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Exceptions {
    public static void main(String[] args)   {

        // exceptions must be handled somewhere
        // this exceptions is catches  further up the stock
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("Could not found or open the file");
        }
    }

    public static void openFile() throws FileNotFoundException {

        File file = new File("resources/test.txt");
        FileReader fr = new FileReader(file);
    }

}
