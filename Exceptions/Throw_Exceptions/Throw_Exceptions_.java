package Exceptions.Throw_Exceptions;

// https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html

/*                                             throw exceptions


    ○ can throw

                   *  a unchecked exception:

                                - throw new RuntimeException(message) method which call a unchecked method
                                      don't have to do anything related to it

                   * checked exceptions:

                                 - throw new Exception(message)


                                                   The throw Statement


    ○ All methods use the throw statement to throw an exception.

                   * The throw statement requires a single argument: a throwable object.

                   * Throwable objects are

                                 - instances of any subclass of the Throwable class.


                                                    How to Throw Exceptions


    ○ Before

                   * you can catch an exception,

                   * some code somewhere must throw one.

            Any code can throw an exception:

                    * your code,

                     * code from a package written by someone else such as the packages that come with the Java platform,

                     * or the Java Runtime Environment.

             Regardless of what throws the exception,

                     * it's always thrown with the throw statement.

    ○ As you have probably noticed, the Java platform provides numerous exception classes. All the classes are descendants
          of the Throwable class, and all allow programs to differentiate among the various types of exceptions that can
           occur during the execution of a program.

    ○ You can also create

                    * your own exception classes

            to represent problems that can occur within the classes you write.

      In fact, if you are a package developer,

                    * you might have to create your own set of exception classes

                    * to allow users to differentiate

                                  - an error that can occur in your package

                                  - from errors that occur in the Java platform

                                  - or other packages.

     ○ You can also create

                     * chained exceptions. For more information, see the Chained Exceptions section.


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


3.	Syntax        of throw keyword includes the instance of              Syntax of throws keyword includes the class names
                      the Exception to be thrown. Syntax wise throw        of the Exceptions to be thrown.Syntax wise throws
                      keyword is followed by the instance variable         keyword is followed by exception class names.

4.	Propagation   throw keyword cannot propagate checked exceptions.    throws keyword is used to propagate the checked
    of                It is only used to propagate the unchecked            Exceptions only.
    Exceptions        that are not checked using the throws
                      keyword.



*/


public class Throw_Exceptions_ {
    public static void main(String[] args)
    {
        // Use of unchecked Exception
        try {
             //double x=3/0;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
