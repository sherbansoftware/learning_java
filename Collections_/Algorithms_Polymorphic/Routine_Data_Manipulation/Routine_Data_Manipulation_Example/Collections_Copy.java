package Collections_.Algorithms_Polymorphic.Routine_Data_Manipulation.Routine_Data_Manipulation_Example;

/**
 * Copies all of the elements from one list into another. After the operation, the index of each copied element in the
 * destination list  will be identical to its index in the source list.  The destination list must be at least as long
 * as the source list. If it is longer, the remaining elements in the destination list are unaffected.
 *
 * This method runs in linear time.
 *
 * @param  <T> the class of the objects in the lists
 * @param  dest The destination list.
 * @param  src The source list.
 * @throws IndexOutOfBoundsException if the destination list is too small to contain the entire source List.
 * @throws UnsupportedOperationException if the destination list's
 *         list-iterator does not support the <tt>set</tt> operation.

public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        int srcSize = src.size();
        if (srcSize > dest.size())
        throw new IndexOutOfBoundsException("Source does not fit in dest");

        if (srcSize < COPY_THRESHOLD ||
        (src instanceof RandomAccess && dest instanceof RandomAccess)) {
        for (int i=0; i<srcSize; i++)
        dest.set(i, src.get(i));
        } else {
        ListIterator<? super T> di=dest.listIterator();
        ListIterator<? extends T> si=src.listIterator();
        for (int i=0; i<srcSize; i++) {
        di.next();
        di.set(si.next());
        }
        }
        }
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Copy {
    public static void main(String[] args)
            throws Exception {
        try {

            // creating object of Source list and destination List
            List<String> srclst = new ArrayList<String> (3);
            List<String> destlst = new ArrayList<String> (3);

            // Adding element to srclst
            srclst.add ("Ram");
            srclst.add ("Gopal");
            srclst.add ("Verma");

            // Adding element to destlst
            destlst.add ("1");
            destlst.add ("2");
            destlst.add ("3");

            // printing the srclst
            System.out.println ("Value of source list: " + srclst);

            // printing the destlst
            System.out.println ("Value of destination list: " + destlst);

            System.out.println ("\nAfter copying:\n");

            // copy element into destlst
            Collections.copy (srclst, destlst);

            // printing the srclst
            System.out.println ("Value of source list: " + srclst);

            // printing the destlst
            System.out.println ("Value of destination list: " + destlst);
        } catch (IllegalArgumentException e) {
            System.out.println ("Exception thrown : " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println ("Exception thrown : " + e);
        }
    }
}
