package Exceptions.Multiple_Exceptions;

// http://tutorials.jenkov.com/java-exception-handling/catching-multiple-exceptions.html

/*                                     Multiple exceptions

       a single catch block can handle more than one type of exception. This feature can reduce code duplication


       try {
                     ...
          } catch( IOException | SQLException ex ) {
                      ...
          }

        IOExceptions or SQLException


                                             NOTE


  */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Multiple_Exceptions {
    public static void main(String[] args)  {
        Test test = new Test();

        // Multiple catch blocks
        try {
            test.run();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }

        // Try multi-catch (Java 7+ only)
        try {
            test.run();
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Using polymorphism to catch the parent of all exceptions
        try {
            test.run();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Important to catch exceptions in the right order!
        // IOException cannot come first, because it's the parent
        // of FileNotFoundException, so would catch both exceptions
        // in this case.
        try {
            test.input();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
