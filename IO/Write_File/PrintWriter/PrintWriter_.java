package IO.Write_File.PrintWriter;

// http://tutorials.jenkov.com/java-io/printwriter.html

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class PrintWriter_ {

    public static void main(String[] args) {

        // write file using PrintWriter

        FileWriter writer = null;
        try {
            writer = new FileWriter("resources\\printwriter.txt");
        } catch (IOException e) {
            System.out.println("File " + writer.toString() + " not found!");
        }

        PrintWriter printWriter = new PrintWriter(writer, true);
        printWriter.println("This is first Line!");
        printWriter.println(true);
        printWriter.println((int) 123);
        printWriter.println((float) 123.456);
        //  printWriter.printf(Locale.UK, "Text + data: %1$", 123);

        printWriter.append("Last Line at: " + LocalTime.now());

        printWriter.close();
    }
}

       /* This example first creates a PrintWriter instance which is connected to a FileWriter. Second, the example writes
              a boolean, an int and a float to the PrintWriter. Third, the example calls the advanced printf() method of
              the PrintWriter which can insert formatted numbers into a text string.
              Finally the PrintWriter is closed.
       */


