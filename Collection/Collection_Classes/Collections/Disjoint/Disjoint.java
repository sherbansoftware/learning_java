package Collection.Collection_Classes.Collections.Disjoint;

/*                                              Disjoint method


    ○ static boolean	disjoint(Collection<?> c1, Collection<?> c2)

                   * Returns true if the two specified collections have no elements in common.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disjoint {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        // Add elements to list1
        list1.add("Shoes");
        list1.add("Toys");
        list1.add("Horse");
        list1.add("Tiger");

        // Create list2
        List<String> list2 = new ArrayList<>();

        // Add elements to list2
        list2.add("Bat");
        list2.add("Frog");
        list2.add("Lion");

        // Check if disjoint or not
        boolean disjoint = Collections.disjoint(list1, list2);
        System.out.println(disjoint);
    }
}

