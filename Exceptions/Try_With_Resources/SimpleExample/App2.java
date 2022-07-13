package Exceptions.Try_With_Resources.SimpleExample;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("resources/text.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.getName());
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
