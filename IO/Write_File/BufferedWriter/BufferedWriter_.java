package IO.Write_File.BufferedWriter;

import org.junit.Test;

import java.io.*;
import java.time.LocalTime;

public class BufferedWriter_ {

    public static void main(String[] args) {

        // write file using BufferedWriter and try with resources;
        // a new file is created if not existed

        String str = "First line!\nSecond line!\nThird Line!";
        String contentRootPath = "resources/bufferedwriter.txt";
        File file = new File(contentRootPath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
            writer.newLine();
            writer.write("Latest line");
        } catch (IOException fnf) {
            System.out.println("File " + file.toString() + " not found");
        }

        // read file using BufferedReader and  try with resources

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int counter = 0;
            String line;
            while ((line = br.readLine()) != null) {
                counter++;
                System.out.println(counter + ": " + line);
            }
        } catch (IOException ioe) {
            System.out.println("File " + file.getName() + " not found!");
        }
        System.out.println();
        System.out.println("Exit...");
    }

   // We can then append a String to the existing file:

    @Test
    public void whenAppendStringUsingBufferedWritter_thenOldContentShouldExistToo() throws IOException {

        String contentRootPath = "resources/bufferedwriter.txt";
        File file = new File(contentRootPath);
        String str = "Last line added at:";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.append("\n");
        writer.append(str + " " + LocalTime.now().toString());
        writer.close();
    }

}

