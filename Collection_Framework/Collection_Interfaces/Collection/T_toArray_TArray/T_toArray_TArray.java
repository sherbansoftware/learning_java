package Collection_Framework.Collection_Interfaces.Collection.T_toArray_TArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns an array containing all of the elements in this collection;
 * the runtime type of the returned array is that of the specified array.
 * If the collection fits in the specified array, it is returned therein.
 * Otherwise, a new array is allocated with the runtime type of the
 * specified array and the size of this collection.
 *
 * <p>If this collection fits in the specified array with room to spare
 * (i.e., the array has more elements than this collection), the element
 * in the array immediately following the end of the collection is set to
 * <tt>null</tt>.  (This is useful in determining the length of this
 * collection <i>only</i> if the caller knows that this collection does
 * not contain any <tt>null</tt> elements.)
 *
 * <p>If this collection makes any guarantees as to what order its elements
 * are returned by its iterator, this method must return the elements in
 * the same order.
 *
 * <p>Like the {@link_ #toArray()} method, this method acts as bridge between
 * array-based and collection-based APIs.  Further, this method allows
 * precise control over the runtime type of the output array, and may,
 * under certain circumstances, be used to save allocation costs.
 *
 * <p>Suppose <tt>x</tt> is a collection known to contain only strings.
 * The following code can be used to dump the collection into a newly
 * allocated array of <tt>String</tt>:
 *
 * <pre>
 *     String[] y = x.toArray(new String[0]);</pre>
 *
 * Note that <tt>toArray(new Object[0])</tt> is identical in function to
 * <tt>toArray()</tt>.
 *
 * @param_ <T> the runtime type of the array to contain the collection
 * @param_ a the array into which the elements of this collection are to be
 *        stored, if it is big enough; otherwise, a new array of the same
 *        runtime type is allocated for this purpose.
 * @return an array containing all of the elements in this collection
 * @throws ArrayStoreException if the runtime type of the specified array
 *         is not a supertype of the runtime type of every element in
 *         this collection
 * @throws NullPointerException if the specified array is null
 */
 // <T> T[] toArray(T[] a);

public class T_toArray_TArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");
        String[] s1 = list.toArray(new String[0]);

        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.print(contents);
        }
    }
}

