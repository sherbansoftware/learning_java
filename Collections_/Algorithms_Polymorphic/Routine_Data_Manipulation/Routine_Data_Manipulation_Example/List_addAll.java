package Collections_.Algorithms_Polymorphic.Routine_Data_Manipulation.Routine_Data_Manipulation_Example;

/**
 * Appends all of the elements in the specified collection to the end of this list, in the order that they are returned
 * by the specified collection's iterator (optional operation).  The behavior of this operation is undefined if the specified
 * collection is modified while  the operation is in progress.
 * (Note that this will occur if the  specified collection is this list, and it's nonempty.)
 *
 * @param c collection containing elements to be added to this list
 * @return true if this list changed as a result of the call
 * @throws UnsupportedOperationException if the addAll operation  is not supported by this list
 * @throws ClassCastException if the class of an element of the specified collection prevents it from being added to this list
 * @throws NullPointerException if the specified collection contains one or more null elements and this list does not
 * permit null elements, or if the specified collection is null
 * @throws IllegalArgumentException if some property of an element of the
 * specified collection prevents it from being added to this list
 * @see #add(Object)
 * <p>
 * boolean addAll(Collection<? extends E> c);
 */


import java.util.ArrayList;
import java.util.List;

public class List_addAll {

    public static void main(String[] args) {

        // Initializing a list of type arraylist
        List<Integer> l = new ArrayList<> ();
        l.add (10);
        l.add (15);
        l.add (20);
        System.out.println (l);

        // Initializing a collection to be appended to list
        ArrayList<Integer> arr = new ArrayList<> ();
        arr.add (100);
        arr.add (200);
        arr.add (300);
        System.out.println (arr);

        l.addAll (arr);

        System.out.println (l);
    }

}
