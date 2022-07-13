package Collection_Framework.Polymorphic_Algorithms.Searching.Searching_Example;

/*                                                   Binary Search

    Simply put, the algorithm compares the key value with the middle element of the array; if they are unequal,
        the half in which the key cannot be part of is eliminated, and the search continues for the remaining half until it succeeds.
    Remember � the key aspect here is that the array is already sorted.
        If the search ends with the remaining half being empty, the key is not in the array.

 */
/**
 * Searches the specified list for the specified object using the binary search algorithm. The list must be sorted into
 * ascending order according to the {@linkplain Comparable natural ordering} of its elements
 * (as by the {@link #sort(List)} method) prior to making this call.If it is not sorted, the results are undefined.
 * If the list contains multiple elements equal to the specified object, there is no guarantee which one will be found.
 * <p>
 * This method runs in log(n) time for a "random access" list (which provides near-constant-time positional access).
 * If the specified list does not implement the {@link java.util.RandomAccess} interface and is large,
 * this method will do an iterator-based binary search that performs O(n) link traversals and O(log n) element comparisons.
 *
 * @param <T> the class of the objects in the list
 * @param list the list to be searched.
 * @param key the key to be searched for.
 * @return the index of the search key, if it is contained in the list otherwise, (-(<i>insertion point</i>) - 1)
 * The insertion point is defined as the point at which the key would be inserted into the list: the index of the first
 * element greater than the key, or list.size() if all elements in the list are less than the specified key.
 * Note that this guarantees that the return value will be &gt;= 0 if and only if the key is found.
 * @throws ClassCastException if the list contains elements that are not
 * <i>mutually comparable</i> (for example, strings and
 * integers), or the search key is not mutually comparable
 * with the elements of the list.
 * <p>
 * <p>
 * import java.util.List;
 * <p>
 * public static <T>
 * int binarySearch(List<? extends Comparable<? super T>> list, T key) {
 * if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
 * return Collections_.indexedBinarySearch(list, key);
 * else
 * return Collections_.iteratorBinarySearch(list, key);
 * }
 */
/*
                                  Java itself provides several ways of finding an item in a list:

    The contains method
    The indexOf method
    An ad-hoc for loop
    The Stream API
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_BinarySearch {

    public static void main(String[] args) {


        List al = new ArrayList ();

        al.add (10);
        al.add (20);
        al.add (1);
        al.add (45);
        al.add (3);
        al.add (2);
        al.add (239);
        al.add (45);
        al.add (4);

        // List must be sorted first
       // Collections.sort(al);
        System.out.println(al);
        // 2 is present at index 1.
        int index = Collections.binarySearch (al, 4);
        if (index >= 0) {
            System.out.println ("Element " + al.get (index) + " found at index:" + index);
        } else {
            System.out.println ("Element not found!");
        }
        System.out.println (index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        index = Collections.binarySearch (al, 45);
        System.out.println (index);
    }

}
