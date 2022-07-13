package lang.classes.String.Substring;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html



/*                                              2 methods substring


    ○ String	         substring(int beginIndex)

                   * Returns a string that is a substring of this string.

    ○ String	        substring(int beginIndex, int endIndex)

                    * Returns a string that is a substring of this string.


    ○ StringIndexOutOfBoundsException

                     * if is not of range


 */


public class Substring_ {

    public static void main(String[] args) {
        String str = "I'm the best programmer";

        // // All characters from index paramInt
        String substring1 = str.substring(2); // include index

        System.out.println(substring1);

        // All characters from index 3 to 6
        String substring2 = str.substring(3, 7);
        System.out.println(substring2);

    }

}
