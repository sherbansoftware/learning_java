package Scanner.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_Text_Files {

    public static void main(String[] args) throws FileNotFoundException {

        //String fileName = "C:\\Users\\crist\\Desktop\\FileText.txt";
        // using forward slash for path for disk
        //String fileName = "C:/Users/crist/Desktop/FileText.txt";

         // read file from project
        String fileName = "resources/text.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);
        int count = 1;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + " : " + line);
            count++;
        }
        in.close();
    }
}
