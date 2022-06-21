package Collection.Algorithms_Polymorphic.Routine_Data_Manipulation.Routine_Data_Manipulation_Example;

/**
 * Swaps the elements at the specified positions in the specified list.
 * (If the specified positions are equal, invoking this method leaves the list unchanged.)
 *
 * @param list The list in which to swap elements.
 * @param i the index of one element to be swapped.
 * @param j the index of the other element to be swapped.
 * @throws IndexOutOfBoundsException if either <tt>i</tt> or <tt>j</tt>
 *         is out of range (i &lt; 0 || i &gt;= list.size()
 *         || j &lt; 0 || j &gt;= list.size()).
 * @since 1.4

@SuppressWarnings({"rawtypes", "unchecked"})
public static void swap(List<?> list, int i, int j) {
// instead of using a raw type here, it's possible to capture
// the wildcard but it will require a call to a supplementary
// private method
final List l = list;
        l.set(i, l.set(j, l.get(i)));
        }
*/

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Swap {

    public static void main(String[] args) {
        // Let us create a list with 4 items
        ArrayList<String> mylist = new ArrayList<String> ();
        mylist.add ("code");
        mylist.add ("practice");
        mylist.add ("quiz");
        mylist.add ("geeksforgeeks");

        System.out.println ("Original List : \n" + mylist);

        // Swap items at indexes 1 and 2
        Collections.swap (mylist, 1, 2);

        System.out.println ("\nAfter swap(mylist, 1, 2) : \n"
                + mylist);

//        // Swap items at indexes 1 and 3
//        Collections_.swap (mylist, 3, 1);
//
//        System.out.println ("\nAfter swap(mylist, 3, 1) : \n"
//                + mylist);
    }
}
