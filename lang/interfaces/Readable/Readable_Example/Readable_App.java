package lang.interfaces.Readable.Readable_Example;

import java.io.*;
import java.nio.CharBuffer;

public class Readable_App {

    public static void main(String[] args) {
        String s = "Hello world";

        // create a new Char Buffer with capacity of 12
        CharBuffer cb = CharBuffer.allocate(12);

        // create a StringReader
        Reader reader = new StringReader(s);

        try {
            // read characters into a char buffer
            reader.read(cb);

            // flip the char buffer
            cb.flip();

            // print the char buffer
            System.out.println(cb.toString());

            // Close the stream
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


