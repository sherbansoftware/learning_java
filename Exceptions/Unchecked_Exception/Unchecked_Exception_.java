package Exceptions.Unchecked_Exception;

// https://www.geeksforgeeks.org/java-program-to-handle-runtime-exceptions/

// https://docs.oracle.com/javase/specs/jls/se11/html/jls-11.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html


/*                                         RuntimeException


    ○ is the superclass of all classes that exceptions are thrown during the normal operation of the Java VM (Virtual Machine).
          The RuntimeException and its subclasses are unchecked exceptions.


                                      The most common unchecked exceptions are:


    ○ ArithmeticException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ArithmeticException.html

    ○ ClassCastException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassCastException.html

    ○ ConcurrentModificationException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ConcurrentModificationException.html

    ○ DateTimeException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/DateTimeException.html

    ○ EmptyStackException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/EmptyStackException.html

    ○ IllegalArgumentException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalArgumentException.html

    ○ IndexOutOfBoundsException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IndexOutOfBoundsException.html

    ○ NoSuchElementException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/NoSuchElementException.html

    ○ NullPointerException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/NullPointerException.html

    ○ SecurityException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/SecurityException.html

    ○ UnknownEntityException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/java.compiler/javax/lang/model/UnknownEntityException.html

    ○ UnsupportedOperationException

                   * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/UnsupportedOperationException.html


        is the exception thrown by the JVM when the program tries to call a method on the null object or perform other
        operations on a null object. A user should not attempt to handle this kind of exception because it will only patch
        the problem and not completely fix it.

    ArrayIndexOutOfBoundsException is the exception that is automatically thrown by the JRE(Java Runtime Environment)

        when a program incorrectly tries to access a certain location in a set that is non-existent. This often happens
        when the array index requested is negative, or more than or equal to the array’s size. The arrays of Java use
        the zero-based indexing; thus, the first element of that array has a zero index, the last element comes with an
        index of size 1, and the nth element comes with an index n-1.

    InvalidArgumentException

        is an exception raised when an invalid parameter is passed to a certain method on the server’s referenced connection.

    IllegalArgumentException

        is thrown in order to indicate that a method has been passed an illegal argument. This exception extends the
            RuntimeException class and thus, belongs to those exceptions that can be thrown during the operation of the
            Java Virtual Machine

                                          throw unchecked exceptions


    if throw a unchecked exception    - throw new RuntimeException(message)
        method which call a unchecked method don't have to do anything related to it


                                                    NOTE


            * don't force you to handle it(don't have to put try-catch there)
            * RuntimeExceptions are things that are really serious basic fundamental errors in your program.
            * So if you've got a RuntimeException,it's something that your program is unlikely to be able to recover from,
                and for that reason it doesn't even force you to catch it.
            * If your program is throwing RuntimeExceptions, then there's something really seriously wrong with it, which
                you should have addressed.
            * you can still check RuntimeExceptions if you want to but usually you don't want to because usually what
                you're gonna want to do, probably.Most of the time is you're gonna want to fix the underline problem.

*/

public class Unchecked_Exception_ {
    public static void main(String[] args) {

        // ArithmeticException

//        int value = 7;
//        value = value/0;

        // NullPointerException

        //  kind of tend to loose track of
        //the difference between a reference and an actually, having an actually object there.

//        String text = null;
//        System.out.println(text.length());

        // ArrayIndexOutOfBoundsException

        String[] texts = {"one", "two", "three"};
        try {
            System.out.println(texts[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}
