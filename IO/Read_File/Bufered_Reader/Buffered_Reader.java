package IO.Read_File.Bufered_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Buffered_Reader {

    public static void main(String[] args) {

        File file = new File("resources/bufferedwriter.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                counter++;
                System.out.println(counter + ": " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException ex) {
                // File was probably never opened!
            }
        }
    }
}
