package Arrays.Arrays_Of_Strings;

/*                                             An Array of Characters Is Not a String

    In the Java programming language, unlike C, an array of char is not a String, and neither a String nor an array of char
        is terminated by '\u0000' (the NUL character).

    A String object is immutable, that is, its contents never change, while an array of char has mutable elements.

    The method toCharArray in class String returns an array of characters containing the same character sequence as a
        String. The class StringBuffer implements useful methods on mutable arrays of characters.

 */

public class Arrays_Of_Strings {
    public static void main(String[] args) {

        String[] words = new String[]{"Hello", "to", "you"};

        for (String word : words) {
            System.out.println(word);
        }

    }
}
