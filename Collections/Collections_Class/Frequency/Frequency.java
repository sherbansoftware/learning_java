package Collections.Collections_Class.Frequency;

/*                                     java.util.Collections.frequency()

    The method is a java.util.Collections class method. It counts the frequency of the specified element in the given list.
       It override the equals() method to perform the comparison to check if the specified Object and the Object in the
       list are equal or not.

   public static int frequency(Collection c, Object o)

 */

import java.util.*;

public class Frequency {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("code");
        list.add("code");
        list.add("quiz");
        list.add("code");

        // count the frequency of the word "code"
        System.out.println("The frequency of the word code is: " +
                Collections.frequency(list, "code"));
    }
}


