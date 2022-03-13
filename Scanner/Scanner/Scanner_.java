package Scanner.Scanner;

import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text:" );
        // Wait for user to enter a line
        String text = input.nextLine();
         //Display entered text
        System.out.println("Display entered text: " + text);

    }
}
