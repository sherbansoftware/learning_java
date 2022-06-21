package Collection.Collection_Classes.Collections.ReverseOrder;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html


/*                                           Collections.reverseOrder()   -- 2 methods


    ○ static <T> Comparator<T>	          reverseOrder()

                  * Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that
                        implement the Comparable interface.


    ○ static <T> Comparator<T>	          reverseOrder(Comparator<T> cmp)

                  * Returns a comparator that imposes the reverse ordering of the specified comparator.



 */


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseOrder_ {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(21, 44, 2, 3, 667, -5);

        Collections.sort(li, Collections.reverseOrder());

        System.out.println(li);
    }

}
