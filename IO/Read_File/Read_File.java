package IO.Read_File;

 // https://www.baeldung.com/reading-file-in-java


import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class Read_File {

                          // using the new Files class:
    @Test
    public void whenReadSmallFileJava7_thenCorrect()
            throws IOException {
        String expected_value = "Hello, world!";

        Path path = Paths.get("resources/test.txt");

        String read = Files.readAllLines(path).get(0);
        System.out.println(read);
        assertEquals(expected_value, read);
    }

                             //Using BufferedReader.

    @Test
    public void whenReadLargeFileJava7_thenCorrect()
            throws IOException {
        String expected_value = "Hello, world!";

        Path path = Paths.get("resources/test.txt");

        BufferedReader reader = Files.newBufferedReader(path);
        String line = reader.readLine();
        System.out.println(line);
        assertEquals(expected_value, line);
    }

                                         // Reading with Scanner

//    @Test
//    public void whenReadWithScanner_thenCorrect()
//            throws IOException {
//        String file = "resources/test.txt";
//        Scanner scanner = new Scanner(new File(file));
//        scanner.useDelimiter(" ");
//
//        assertTrue(scanner.hasNext());
//        assertEquals("Hello,", scanner.next());
//        assertEquals("world!", scanner.next());
//
//        scanner.close();
//    }


                                       // Reading with BufferedReader

    @Test
    public void whenReadWithBufferedReader_thenCorrect()
            throws IOException {
        String expected_value = "Hello, world!";
        String file ="resources/test.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();

        assertEquals(expected_value, currentLine);
    }
}
