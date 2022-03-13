package util.interfaces.Collection.Collection_Example.Boolean_addAll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Adds all of the elements in the specified collection to this collection
 * (optional operation).  The behavior of this operation is undefined if
 * the specified collection is modified while the operation is in progress.
 * (This implies that the behavior of this call is undefined if the
 * specified collection is this collection, and this collection is
 * nonempty.)
 *
 * @param_ c collection containing elements to be added to this collection
 * @return <tt>true</tt> if this collection changed as a result of the call
 * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
 * is not supported by this collection
 * @throws ClassCastException if the class of an element of the specified
 * collection prevents it from being added to this collection
 * @throws NullPointerException if the specified collection contains a
 * null element and this collection does not permit null elements,
 * or if the specified collection is null
 * @throws IllegalArgumentException if some property of an element of the
 * specified collection prevents it from being added to this
 * collection
 * @throws IllegalStateException if not all the elements can be added at
 * this time due to insertion restrictions
 * @see_ #add(Object)
 */
//    boolean addAll(Collection<? extends E> c);

public class Boolean_addAll {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList list = new LinkedList();

        // add some elements
        list.add("Hello");
        list.add(2);
        list.add("Chocolate");
        list.add("10");

        // print the list
        System.out.println("LinkedList:" + list);


        // create a new collection and add some elements
        Collection collection = new ArrayList();
        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        // append the collection in the LinkedList
        list.addAll(collection);

        // print the new list
        System.out.println("New LinkedList:" + list);
    }
}

