package Collection_Framework.Collection_Classes.Collections.Binary_Search;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html



/*                                                binarySearch  -- 2 methods


    ○ static <T> int	      binarySearch(List<? extends Comparable<? super T>> list, T key)

                  * Searches the specified list for the specified object using the binary search algorithm.

    ○ static <T> int	      binarySearch(List<? extends T> list, T key, Comparator<? super T> c)

                  * Searches the specified list for the specified object using the binary search algorithm.


    ○ java.util.Collections.binarySearch() method returns the position of an object in a sorted list.To use this method,
           the list should be

                   * sorted in ascending order,

           otherwise, the result returned from the method will be wrong.

    ○ If the element exists in the list,

                    * the method will return the position of the element in the sorted list,

                                  – (insertion point where the element should have been present if exist)
             otherwise,

                     * the result returned by the method would be the -1.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Java Program to Demonstrate Binary Search using  Collections.binarySearch()
public class Binary_Search {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("Shoes");
        items.add("Toys");
        items.add("Horse");
        items.add("Ball");
        items.add("Grapes");

        Collections.sort(items);

        // BinarySearch on the List
        System.out.println(
                "The index of Horse is "
                        + Collections.binarySearch(items, "Horse"));

        // BinarySearch on the List
        System.out.println(
                "The index of Dog is "
                        + Collections.binarySearch(items, "Dog"));
    }
}


