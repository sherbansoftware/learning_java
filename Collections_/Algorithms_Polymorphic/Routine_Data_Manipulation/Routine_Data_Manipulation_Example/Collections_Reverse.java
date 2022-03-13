package Collections_.Algorithms_Polymorphic.Routine_Data_Manipulation.Routine_Data_Manipulation_Example;

/**
 * Reverses the order of the elements in the specified list.
 *
 * This method runs in linear time.
 *
 * @param  list the list whose elements are to be reversed.
 * @throws UnsupportedOperationException if the specified list or
 *         its list-iterator does not support the <tt>set</tt> operation.

@SuppressWarnings({"rawtypes", "unchecked"})
public static void reverse(List<?> list) {
        int size = list.size();
        if (size < REVERSE_THRESHOLD || list instanceof RandomAccess) {
        for (int i=0, mid=size>>1, j=size-1; i<mid; i++, j--)
        swap(list, i, j);
        } else {
        // instead of using a raw type here, it's possible to capture
        // the wildcard but it will require a call to a supplementary
        // private method
        ListIterator fwd = list.listIterator();
        ListIterator rev = list.listIterator(size);
        for (int i=0, mid=list.size()>>1; i<mid; i++) {
        lang.classes.Object tmp = fwd.next();
        fwd.set(rev.previous());
        rev.set(tmp);
        }
        }
        }
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Reverse {

    public static void main(String[] args) {
        // Let us create a list of strings
        List<String> mylist = new ArrayList<String> ();
        mylist.add ("practice");
        mylist.add ("code");
        mylist.add ("quiz");
        mylist.add ("geeksforgeeks");

        System.out.println ("Original List : " + mylist);

        // Here we are using reverse() method
        // to reverse the element order of mylist
        Collections.reverse (mylist);

        System.out.println ("Modified List: " + mylist);
    }
}
