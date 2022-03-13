package util.interfaces.Collection.Collection_Example.Boolean_retainAll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Retains only the elements in this collection that are contained in the
 * specified collection (optional operation).  In other words, removes from
 * this collection all of its elements that are not contained in the
 * specified collection.
 *
 * @param_ c collection containing elements to be retained in this collection
 * @return <tt>true</tt> if this collection changed as a result of the call
 * @throws UnsupportedOperationException if the <tt>retainAll</tt> operation
 * is not supported by this collection
 * @throws ClassCastException if the types of one or more elements
 * in this collection are incompatible with the specified
 * collection
 * (<a href="#optional-restrictions">optional</a>)
 * @throws NullPointerException if this collection contains one or more
 * null elements and the specified collection does not permit null
 * elements
 * (<a href="#optional-restrictions">optional</a>),
 * or if the specified collection is null
 * @see_ #remove(Object)
 * @see_ #contains(Object)
 */

//    boolean retainAll(Collection<?> c);

public class Boolean_retainAl_Class {
    // Driver code
    public static void main(String[] args) {

        // Initializing a list of type Linkedlist
        Collection<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        System.out.println(l);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(22);
        l.retainAll(arr);

        System.out.println(l);
    }
}


