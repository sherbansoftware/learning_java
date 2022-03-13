package lang.classes.Character.Character_Example;

import java.util.Arrays;


public class CharExample6 {

    public static void main(String[] args) {

        String str = "javatpoint";
        // break the string in the form of characters.
        char[] ch = str.toCharArray();

        System.out.println("String: " + str);
        System.out.println("char: " + Arrays.toString(ch));

    }
}
