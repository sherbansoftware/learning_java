package Exceptions.Checked_Exception;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html


/*                                         Checked Exceptions

    ○ are checked at compile time

    ○  These are exceptional conditions that

                    * a well-written application should

                                  - ANTICIPATE

                                  - and RECOVER from.

    ○  All exceptions are checked exceptions,

                    * except for those indicated by

                                  - Error,

                                  - RuntimeException,

                          and their subclasses.



    ○ When is throw a checked exceptions  have two options:

                   1.handle it

                             - surround it with try catch block

                   2. method should	declare in the definition (throws) that

                             - i'll throwing a checked exception and consequently all the method which call it must
                                   add throws or handle it.


                                               NOTE


            * checked exceptions you have to handle it


                                       some direct  Subclasses of Exception


    ○ AWTException

                 * https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/AWTException.html

    ○ ClassNotLoadedException

                 * https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jdi/com/sun/jdi/ClassNotLoadedException.html

    ○ CloneNotSupportedException

                 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/CloneNotSupportedException.html

    ○ DataFormatException

                 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/zip/DataFormatException.html

    ○ InterruptedException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/InterruptedException.html

    ○ InvalidTypeException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jdi/com/sun/jdi/InvalidTypeException.html
    ○ IOException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/IOException.html

    ○ MarshalException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/java.xml.crypto/javax/xml/crypto/MarshalException.html

    ○ ParseException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/ParseException.html

    ○ SQLException

                  * https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/SQLException.html

    ○ TimeoutException

                 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html

    ○ UnmodifiableClassException

                 * https://docs.oracle.com/en/java/javase/11/docs/api/java.instrument/java/lang/instrument/UnmodifiableClassException.html

*/

public class Checked_Exception_ {
    public static void main(String[] args) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
