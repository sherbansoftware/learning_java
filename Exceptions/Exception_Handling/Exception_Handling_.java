package Exceptions.Exception_Handling;

// https://beginnersbook.com/2013/04/java-exception-handling/


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html


/*                                              Exception handling


    ○ is one of the most important feature of java programming that allows us to

                   * handle the runtime errors caused by exceptions

    ○ If an exception occurs, which has not been handled by programmer

                    * then program execution gets terminated

                    * and a system generated error message is shown to the user.

    ○ This message

                    * is not user friendly so a user will not be able to understand what went wrong.

            In order to let them know the reason in simple language,

                    * we handle exceptions.

             We handle

                    * such conditions

                    * and then prints a user friendly warning message to user,

                    * which lets them correct the error

                    * as most of the time exception occurs due to bad data provided by user.


                                    Advantage of Exception Handling


    ○ Exception handling ensures that the flow of the program

                   * does not break when an exception occurs.

    ○  For example, if a program has bunch of statements and an exception occurs mid way after executing certain statements
            then the

                   * statements after the exception

                   * will not execute and the program will terminate abruptly.

     ○  By handling we make sure that

                   * all the statements execute

                   * and the flow of program does not break.

    ○ A friendly message to the User
    
                   * When something goes wrong and an exception occurs,

                                 - it would be great to let the user know that something went wrong and tech support has
                                       been notified.

   ○ Give the user

                   * a unique exception IDENTIFIER

                   * and information on how to reach the tech support.

    ○ Enough Information for the Support Team/Support Developer to debug the problem :

                   *  When writing code,

                                  - always think about what information would I need to debug a problem in this piece of
                                        code.

                                   - Make sure that information is made available,

                                                  • mostly in the logs,

                                                  • if there are exceptions.

                    * It would be great to tie the information with the unique exception identifier given to the user



                                    Few Exception Handling Best Practices


    ○ Never Hide Exceptions

                   * At the least log them.

                   * PrintStackTrace method prints the entire stack tracewhen anexception occurs.

           If you handle anexception,it isalways a good practice to log the trace.

    ○ Do not use exception handling for

                   * flow control in a program.

          They have a significant performance impact.

    ○ Think about the User.

                  * What does the user want to see if there is an exception?

    ○ Think about the support developer.

                * What does the support developerneed todebug the exception?

    ○ Think about the calling method.

                * Can the callingmethod do something about the exception being thrown?

           If not, create unchecked exceptions.

    ○ For example, Spring Framework chooses to make most of the jdbc exceptions asunchecked exceptions

                 * because,in most cases,there is nothing that a caller of the method can do about a jdbc exception.

    ○ Have global exception handling.

*/
public class Exception_Handling_ {
}
