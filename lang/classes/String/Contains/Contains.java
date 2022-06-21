package lang.classes.String.Contains;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#contains(java.lang.CharSequence)

/*                           public boolean contains (CharSequence s)


    Returns true if and only if this string contains the specified sequence of char values.

                Parameters:

                        s - the sequence to search for

                Returns:

                       true if this string contains s, false otherwise



 */


public class Contains {
    public static void main(String[] args) {

        String str = "I'm  going to take a break";

        boolean contains = str.contains("ak");
        System.out.println(contains);
    }
}
