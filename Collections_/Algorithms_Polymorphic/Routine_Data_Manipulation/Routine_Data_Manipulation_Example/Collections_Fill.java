package Collections_.Algorithms_Polymorphic.Routine_Data_Manipulation.Routine_Data_Manipulation_Example;

/**
 * Replaces all of the elements of the specified list with the specified element.
 *
 * This method runs in linear time.
 *
 * @param  <T> the class of the objects in the list
 * @param  list the list to be filled with the specified element.
 * @param  obj The element with which to fill the specified list.
 * @throws UnsupportedOperationException if the specified list or its
 *         list-iterator does not support the <tt>set</tt> operation.

public static <T> void fill(List<? super T> list, T obj) {
        int size = list.size();

        if (size < FILL_THRESHOLD || list instanceof RandomAccess) {
        for (int i=0; i<size; i++)
        list.set(i, obj);
        } else {
        ListIterator<? super T> itr = list.listIterator();
        for (int i=0; i<size; i++) {
        itr.next();
        itr.set(obj);
        }
        }
        }
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Fill {

    public static void main(String[] argv) throws Exception {
        // creating object of List<Integer>
        List<String> arrlist = new ArrayList<String> ();

        // Adding element to srclst
        arrlist.add ("ATest.A");
        arrlist.add ("ATest.B");
        arrlist.add ("C");

        // print the elements
        System.out.println ("List elements before fill: "
                + arrlist);

        // fill the list
        Collections.fill (arrlist, "TAJMAHAL");

        // print the elements
        System.out.println ("\nList elements after fill: "
                + arrlist);
    }
}
