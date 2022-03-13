package util.interfaces.Collection.Collection_Example.Void_Clear;

import java.util.Collection;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Removes all of the elements from this collection (optional operation).
 * The collection will be empty after this method returns.
 *
 * @throws UnsupportedOperationException if the <tt>clear</tt> operation
 *         is not supported by this collection
 */

//    void clear();

public class Void_Clear_Class {
    public static void main(String[] args) {
        Collection<Integer> collection = new LinkedBlockingDeque<Integer>();
        collection.add(23);
        collection.add(123);
        collection.add(56);
        System.out.println("Collection : "+collection);
        System.out.println("After applying clear() method :  ");
        // clear() method will erase the whole collection
        collection.clear();
        System.out.println("Collection : "+collection);
    }
}
