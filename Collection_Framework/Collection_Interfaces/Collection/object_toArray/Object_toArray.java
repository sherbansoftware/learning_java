package Collection_Framework.Collection_Interfaces.Collection.object_toArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns an array containing all of the elements in this collection.
 * If this collection makes any guarantees as to what order its elements
 * are returned by its iterator, this method must return the elements in
 * the same order.
 *
 * <p>The returned array will be "safe" in that no references to it are
 * maintained by this collection.  (In other words, this method must
 * allocate a new array even if this collection is backed by an array).
 * The caller is thus free to modify the returned array.
 *
 * <p>This method acts as bridge between array-based and collection-based
 * APIs.
 *
 * @return an array containing all of the elements in this collection
 */

// Object[] toArray();

public class Object_toArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");

        Object[] s1 = list.toArray();

        for (Object obj : s1) {
            System.out.print(obj);
        }
    }
}
