package lang.classes.Character.UnicodeBlock.UnicodeBlock_Example;


// Java Program illustrating the use of
// Character.UnicodeBlock class Methods.


public class CharacterUnicodeBlockDemo {

    public static void main(String[] args) {
        // Use of forName() :
        // returns Unicode Blocks, as per Unicode Standards
        System.out.println("Using UnicodeBlock.forName() : ");
        System.out.println(Character.UnicodeBlock.forName("OLDITALIC"));
        System.out.println(Character.UnicodeBlock.forName("NUMBERFORMS"));
        System.out.println(Character.UnicodeBlock.forName("MALAYALAM") + "\n");

        // Use of(char ch) :
        System.out.println("Using UnicodeBlock.of(char ch) : ");
        System.out.println(Character.UnicodeBlock.of(' '));
        System.out.println(Character.UnicodeBlock.of('\u21ac') + "\n");

        // Use of(int UCPoint) :
        System.out.println("Using UnicodeBlock.of(int UCPoint) : ");
        System.out.println(Character.UnicodeBlock.of(1609));
        System.out.println(Character.UnicodeBlock.of(1565));

    }
}

