package Exceptions.Try_With_Resource;

// https://www.baeldung.com/java-try-with-resources
// https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html

/*                                               try-with-resources

    The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that
        must be closed after the program is finished with it. The try-with-resources statement ensures that each resource
        is closed at the end of the statement.
    Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable,
        can be used as a resource.

                                                 Syntax

       try (MyResource res = new MyResource()) {
               // use resource here
       } catch (Exception e) {
       // some sol or printstacktrace
       }

                                                IMPORTANT

    To construct a custom resource that will be correctly handled by a try-with-resources block,
        the class should implement

             * the Closeable
             * or AutoCloseable interfaces,

         and override the close method:

   public class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
            System.out.println("Closed MyResource");
        }
    }

                                                  NOTE

    * allows us to declare resources to be used in a try block with the assurance that the resources will be closed
          after the execution of that block.
    * Resources has to have implemented

              - Closeable
              - or AutoCloseable interface.


 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Try_With_Resource {
    public static void main(String[] args) {

        //To be auto-closed, a resource must be both declared and initialized inside the try, as shown below:

        try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Start writing: ");
            writer.println(scanner.nextLine());

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        // A typical try-catch-finally block

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("resources/test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // Using an equivalent try-with-resources block:

        try (Scanner scanner1 = new Scanner(new File("resources/test.txt"))) {
            while (scanner1.hasNext()) {
                System.out.println(scanner1.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


    }
}