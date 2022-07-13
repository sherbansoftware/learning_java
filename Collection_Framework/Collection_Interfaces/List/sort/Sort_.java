package Collection_Framework.Collection_Interfaces.List.sort;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html


/*                                 default void sort(Comparator<? super E> c)


    ○ Sorts this list according to the order induced by the specified Comparator.

                   * The sort is stable: this method must not reorder equal elements.

    ○ All elements in this list must be

                   * mutually comparable using the specified comparator

                   * (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the list).

    ○ If the specified comparator is null

                   * then all elements in this list must implement

                                 - the Comparable interface and the elements' natural ordering should be used.

    ○ This list must be modifiable, but need not be resizable.


                                      Implementation Requirements:


    ○ The default implementation obtains an array containing all elements in this list,

                   * sorts the array,

                   * and iterates over this list resetting each element from the corresponding position in the array.

            (This avoids the n2 log(n) performance that would result from attempting to sort a linked list in place.)


                                                      Implementation Note:


    ○ This implementation is

                   * a stable,

                   * adaptive,

                   * iterative mergesort that requires far fewer than n lg(n) comparisons

                   * when the input array is partially sorted, while offering the performance of a traditional mergesort
                         when the input array is randomly ordered.

       If the input array is nearly sorted, the implementation requires approximately n comparisons.
       Temporary storage requirements vary from a small constant for nearly sorted input arrays to n/2 object references
       for randomly ordered input arrays.

    ○ The implementation takes

                   * equal advantage of ascending and descending order in its input array,

                   * and can take advantage of ascending and descending order in different parts of the same input array.

           It is well-suited to merging two or more sorted arrays:

                   *  simply concatenate the arrays and sort the resulting array.

    ○ The implementation was adapted from Tim Peters's list sort for Python ( TimSort).
      It uses techniques

                   * from Peter McIlroy's "Optimistic Sorting and Information Theoretic Complexity",

                   * in Proceedings of the Fourth Annual ACM-SIAM Symposium on Discrete Algorithms, pp 467-474, January 1993.

    ○ Parameters:

                   * c

                                 - the Comparator used to compare list elements.

                                 - A null value indicates that the elements' natural ordering should be used

    ○ Throws:

                   * ClassCastException

                                 - if the list contains elements that are not mutually comparable using the specified comparator

                    * UnsupportedOperationException

                                   - if the list's list-iterator does not support the set operation

                     * IllegalArgumentException

                                     - (optional) if the comparator is found to violate the Comparator contract


Since:
1.8




 */

import java.util.ArrayList;
import java.util.List;

public class Sort_ {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //Adding elements in the List
        list.add("Mango");
        list.add("Lemon");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Banana");
        list.add("Pear");
        list.add("Pear");


        // using null is referred to natural order, comparator or comparable is implemented
        list.sort(null);

        // using lambdas
        //list.sort((s1, s2) -> s1.compareTo(s2));

        // using natural order
       // list.sort(Comparator.naturalOrder());

        // reverse order
      //  list.sort(Comparator.reverseOrder());

         System.out.println(list);

    }
}
