package util.interfaces.Collection.Collection_Example.Boolean_removeAll;

// https://www.javatpoint.com/java-collection-removeall-method

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Removes all of this collection's elements that are also contained in the
 * specified collection (optional operation).  After this call returns,
 * this collection will contain no elements in common with the specified
 * collection.
 *
 * @param_ c collection containing elements to be removed from this collection
 * @return <tt>true</tt> if this collection changed as a result of the
 * call
 * @throws UnsupportedOperationException if the <tt>removeAll</tt> method
 * is not supported by this collection
 * @throws ClassCastException if the types of one or more elements
 * in this collection are incompatible with the specified
 * collection
 * (<a href="#optional-restrictions">optional</a>)
 * @throws NullPointerException if this collection contains one or more
 * null elements and the specified collection does not support
 * null elements
 * (<a href="#optional-restrictions">optional</a>),
 * or if the specified collection is null
 * @see_ #remove(Object)
 * @see_ #contains(Object)
 */
//    boolean removeAll(Collection<?> c);

public class Boolean_removeAll_Class {
    public static void main(String[] args) {
        Collection<Character> collection = new ConcurrentLinkedQueue<Character>();
        char i;
        for (i = '1'; i <= '9'; ++i) {
            collection.add(i);
        }
        System.out.println("collection : " + collection);
        List<Character> list = new ArrayList<Character>();
        list.add('2');
        list.add('4');
        list.add('6');
        list.add('8');
        list.add('M');
        System.out.println("List of even numbers : " + list);
        //removes all the elements in the collection which are present in list
        collection.removeAll(list);
        System.out.println("Odd numbers : " + collection);
    }
}
