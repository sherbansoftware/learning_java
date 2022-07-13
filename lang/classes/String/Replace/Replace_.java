package lang.classes.String.Replace;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html


/*                                               4  replace method


    ○ String  replace(char oldChar, char newChar)

                  * Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.

    ○ String  replace(CharSequence target, CharSequence replacement)

                  * Replaces each substring of this string that matches the literal target sequence with the specified
                        literal replacement sequence.

    ○ String  replaceAll(String regex, String replacement)

                  * Replaces each substring of this string that matches the given regular expression with the given replacement.

   String replaceFirst(String regex, String replacement)

                  * Replaces the first substring of this string that matches the given regular expression
                        with the given replacement.



 */

public class Replace_ {

    public static void main(String[] args) {


        // String replace(char paramChar1, char paramChar2)
        System.out.println("012301230123".

                replace('0', '4'));// 412341234123

        // String replace(CharSequence paramCharSequence1, CharSequence
        // paramCharSequence2)
        System.out.println("012301230123".
                replace("01", "45"));// 452345234523
    }
}
