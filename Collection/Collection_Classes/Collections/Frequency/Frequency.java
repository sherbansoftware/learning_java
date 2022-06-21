package Collection.Collection_Classes.Collections.Frequency;

/*                                     java.util.Collections.frequency()


    ○ static int	     frequency(Collection<?> c, Object o)

                  * Returns the number of elements in the specified collection equal to the specified object.

    ○ The method is a java.util.Collections class method.

                   * It counts the frequency of the specified element in the given list.

           It overrides the equals() method to perform the comparison to check

                    * if the specified Object

                    * and the Object in the list

            are equal or not.



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


