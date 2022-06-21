package lang.classes.String.Matches;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String)


/*                                                   Matches

    ○ boolean	matches(String regex)

                  * Tells whether or not this string matches the given regular expression.


 */


public class Matches {
    public static void main(String[] args) {
        String str = "I'll go home ";

        if (str.matches("I'll go home ")) {
            System.out.println("Matched");

        }
    }


}
