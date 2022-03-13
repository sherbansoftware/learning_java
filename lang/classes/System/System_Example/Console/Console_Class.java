package lang.classes.System.System_Example.Console;

 /* static Console console(): Returns the unique Console object associated with the current Java virtual machine, if any.

        Syntax: public static Console console()
        Returns: The system console, if any, otherwise null.
        Exception: NA
*/

// https://www.baeldung.com/java-system-console-vs-system-out

// Java code illustrating console() method
import java.io.Console;

class Console_Class {
    public static void main(String args[]) throws NullPointerException {

        printConsoleObject();

//        Console c = System.console();
//        if (c != null) {
//            Currency currency = Currency.getInstance(Locale.ITALY);
//            c.printf(currency.getSymbol());
//            c.flush();
//        } else
//            System.out.println("No console attached");
    }

   static  void printConsoleObject() {
        Console console = System.console();
        console.writer().print(console);
    }
}
