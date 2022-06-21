package Miscelanous.Method_References.Constructor_Method_Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

/*                                          Reference to a constructor

                  Syntax	                                                        Examples

                 Class::new                                                       	String::new
*/

public class Constructor_Method_Reference {
    public static void main(String args[]) {

        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Method Reference
        copyElements(null, ArrayList<Integer>::new);
        // Lambda expression
        copyElements(list, () -> new ArrayList<Integer>());
    }

    private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
        // Method reference to a particular instance
        list.forEach(targetCollection.get()::add);
    }
}
