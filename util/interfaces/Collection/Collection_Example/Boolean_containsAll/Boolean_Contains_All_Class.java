package util.interfaces.Collection.Collection_Example.Boolean_containsAll;

// https://www.javatpoint.com/java-collection-containsall-method

import java.util.ArrayDeque;
import java.util.Collection;

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param_ c collection to be checked for containment in this collection
 * @return <tt>true</tt> if this collection contains all of the elements
 * in the specified collection
 * @throws ClassCastException if the types of one or more elements
 * in the specified collection are incompatible with this
 * collection
 * (<a href="#optional-restrictions">optional</a>)
 * @throws NullPointerException if the specified collection contains one
 * or more null elements and this collection does not permit null
 * elements
 * (<a href="#optional-restrictions">optional</a>),
 * or if the specified collection is null.
 * @see_ #contains(Object)
 */
//    boolean containsAll(Collection<?> c);

public class Boolean_Contains_All_Class {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayDeque<>();
        collection.add("Himanshu");
        collection.add("Sham");
        collection.add("Rita");
        collection.add("Angela");
        Collection<String> collection1 = new ArrayDeque<>();
        collection1.add("Himanshu");
        collection1.add("Sham");
        collection1.add("Rita");
       // collection1.add("Rita");
         /*containsAll() method will return a boolean value true if
          all the elements are present in the invoked collection*/
        System.out.println(collection.containsAll(collection1));
    }
}



