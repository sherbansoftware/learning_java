package Exceptions.WW_Doc;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-11.html
// https://conspecte.com/programare-java/java-exceptii.html

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Exceptions_RT {
    Exception ex;
}


/*                                                 Exception

    An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
    Objects of type Throwable and its subtypes can be sent up the stack with the throw keyword and caught with
        try…catch statements.

    Order of exceptions is from specific to generic in order to avoid compilation errors.


         is the superclass of all the exceptions from which ordinary programs may wish to recover.
          RuntimeException is a direct subclass of Exception.
          RuntimeException is the superclass of all the exceptions which may be thrown for many reasons during expression
          evaluation, but from which recovery may still be possible.
          RuntimeException and all its subclasses are, collectively, the run-time exception classes.

    RuntimeException (Unchecked errors)          IOException SQLException         AWTException       InterruptedExceptions
      - ArithmeticException                          -EOFException
      - NullPointerException                         -FileNotFoundException
      - ClassCastException                           -InterruptedIOException
      - EnumConstantNotPresentException              -InvalidPropertiesFormatException
      - InterruptIOException                         -UnknownServiceException
      - IllegalStateException                        -UnsupportedDataTypeException
      - IndexOutOfBoundException                     -UnsupportedEncodingException
      -ArrayIndexOutOfBoundException
      -StringIndexOutOfBoundException
      -SecurityException


                                                           Error

         is the superclass of all the exceptions from which ordinary programs are not ordinarily expected to recover.
         Error and all its subclasses are, collectively, the error classes.

    Unchecked errors classes-------------------------------------------------------------------------------------------
        AbstractMethodError
        AssertionError
        BootstrapMethodError
        ClassCircularityError
        ClassFormatError
        Error
        ExceptionInInitializerError
        IllegalAccessError
        IncompatibleClassChangeError
        InstantiationError
        InternalError
        LinkageError
        NoClassDefFoundError
        NoSuchFieldError
        NoSuchMethodError
        OutOfMemoryError
        StackOverflowError
        ThreadDeath
        UnknownError
        UnsatisfiedLinkError
        UnsupportedClassVersionError
        VerifyError
        VirtualMachineError


                                                  Unchecked exception classes


        are the exceptions that are not checked at compile time.

                *  run-time exception classes
                *  the error classes.

                                                    Checked exception classes


        are the exceptions that are checked at compile time.

        If some code within a method throws a checked exception,
        then the method must either handle the exception or it must specify the exception using throws keyword
        are all exception classes other than the unchecked exception classes.
   Which are:
        That is, the checked exception classes are Throwable and all its subclasses other than RuntimeException and its
        subclasses and Error and its subclasses.

         https://www.benchresources.net/exception-hierarchy-in-java/

   Note that a subclass of Throwable cannot be generic -----------------------------------------------------------------


                                      What happens when a method throws an exception?

       If a method is declared with the throws keyword then any other method that wishes to call that method must either
       be prepared to catch it or declare that itself will throw an exception. It can happen, even with checked exceptions.
       And sometimes it can break logging.

                                       The differences between throw and throws in Java are

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

* */

public class Exception {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.txt");
        FileReader fr = new  FileReader(file);

    }
}