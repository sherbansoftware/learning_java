package Collection_Framework.Collection_Classes.Collections.Reverse;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html


/*

    ○ static void	reverse(List<?> list)

               * Reverses the order of the elements in the specified list.


 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_ {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(21, 5, 3, 666, -5, 874);

        Collections.reverse(li);
        System.out.println(li);
    }

}
