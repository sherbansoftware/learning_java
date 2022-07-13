package Collection_Framework.Collection_Interfaces.Collection.Iterator_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Returns an iterator over the elements in this collection.  There are no
 * guarantees concerning the order in which the elements are returned
 * (unless this collection is an instance of some class that provides a
 * guarantee).
 *
 * @return an <tt>Iterator_Interface</tt> over the elements in this collection
 */
//    Iterator_Interface<E> iterator();


public class Iterator_Iterator_Class {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
