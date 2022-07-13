package lang.classes.String.Concat;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)


/*                                                       concat method

    ○ String	concat(String str)

                  * Concatenates the specified string to the end of this string.




 */

public class Concat_ {
    public static void main(String[] args) {
        // Strings are immutable
        String str3 = "value1";
        str3.concat("value2");
        System.out.println(str3); // value1
        String concat =  str3.concat("value2");

        System.out.println(concat);

    }

}
