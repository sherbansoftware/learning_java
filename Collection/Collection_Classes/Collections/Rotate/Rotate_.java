package Collection.Collection_Classes.Collections.Rotate;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html


/*                                          rotate method

    ○ static void	             rotate(List<?> list, int distance)

                   * Rotates the elements in the specified list by the specified distance.



 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate_ {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(21,2,66,47,58,94);
        Collections.rotate(li, 2);
        System.out.println(li);
    }
}
