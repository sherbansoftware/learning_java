package Collection;

//  https://docs.oracle.com/javase/tutorial/Collection/index.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/doc-files/coll-index.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/package-summary.html

import java.util.*;

/*                                            Collections


    ○ A collection  sometimes called a Container is simply an Object that groups multiple elements into a single unit.
      Collection are used to:

                  * store,
                  * retrieve,
                  * manipulate,
                  * and communicate

           aggregate data.

    ○ It looks like arrays but Collection are more advanced and more flexible.

                 * An array simply stores a fixed number of objects,

                 * A collection stores objects dynamically, i.e. you can add or remove objects as you wish.


                                       Collection framework consist in three things:


                 * Interfaces
                 * Implementations of these classes
                 * Algorithms


                                             Java Collection Framework.


    ○ A collection framework is a

                   * unified architecture for representing and manipulating Collection.

       In short, Java Collection Framework is a

                   * set of reusable Data structures and Algorithms

           which are designed to free programmers from

                   * implementing data structures themselves

           so that they can focus on business logics.

    ○ The Java Collection Framework provides common data structures implementations which are enough for general-purpose
           such as :

                   * list,
                   * set,
                   * map,
                   * queue,
                   * tree, etc.

           These Collections are:

                   * high-performance,
                   * high-quality,
                   * and easy to use with very good documentation.

          In addition, the Java Collection Framework provides USEFUL and ROBUST algorithms such as:

                   * searching
                   * and sorting

          on Collection, and the interoperability between Collection and arrays.


                                               Why Use Java Collection Framework?


    ○ The Java Collection Framework is a standard API which is used extensively in Java programming. It’s the standard
        and perfect API for manipulating Collection because of the following primary benefits:

                  * REDUCE programming effort:

                        - with the reusable and useful data structures and algorithms, the programmers
                              do not have to re-invent the wheel, thus they can devote their time on developing
                              application’s business.

                  * INCREASE program SPEED and QUALITY:

                        - the concrete Collection implemented by Java Collection Framework are built for

                              high performance
                              and high quality,

                          thus programmers can take this advantage into their programs.

                 * SOFTWARE REUSE:

                        - due to the Java Collection Framework is built into the JDK, code written using Collection
                              Framework can be re-used everywhere among applications, libraries and APIs. That

                              cuts development cost
                              and increases interoperability among Java programs.


      Introduction------------------------------------------------------------------------------------------------------
         tells you what Collection are, and how they'll make your job easier and your programs better.
         You'll learn about the core elements that comprise the Collection Framework:

                 * interfaces,
                 * implementations
                 * and algorithms.

      Interface--------------------------------------------------------------------------------------------------------
         describes the core collection interfaces, which are the heart and soul of the Java Collection Framework.You'll learn
         general guidelines for effective use of these interfaces, including when to use which interface. You'll also learn
         idioms for each interface that will help you get the most out of the interfaces.

      Aggregate Operations----------------------------------------------------------------------------------------------
         iterate over Collection on your behalf, which enable you to write more concise and efficient code that process
         elements stored in Collection.

      Implementations--------------------------------------------------------------------------------------------------
         describes the JDK's general-purpose collection implementations and tells you when to use which implementation.
         You'll also learn about the wrapper implementations, which add functionality to general-purpose implementations

      Algorithms--------------------------------------------------------------------------------------------------------
         describes the polymorphic algorithms provided by the JDK to operate on Collection. With any luck you'll never
         have to write your own sort routine again!

      Custom Implementations--------------------------------------------------------------------------------------------
         tells you why you might want to write your own collection implementation (instead of using one of the general-purpose
         implementations provided by the JDK), and how you'd go about it. It's easy with the JDK's abstract collection
         implementations!

      Interoperability -------------------------------------------------------------------------------------------------
         tells you how the Collection Framework interoperates with older APIs that predate the addition of Collection to Java.
         Also, it tells you how to design new APIs so that they'll interoperate seamlessly with other new APIs.

                                                       NOTE



 */
public class Collection_ {
    public static void main(String[] args) {

        /*
         * Consider:
         * 1. what you need the collection to do
         * 2. are you using the fastest collection for your purposes
         * (think about insertion/deletion, retrieval and traversal
         */

        //////////////// LISTS ///////////////////////////////////

        // Store lists of objects
        // Duplicates are allowed
        // Objects remain in order
        // Elements are indexed via an integer
        // cf. shopping list
        // Checking for particular item in list is slow
        // Looking an item up by index is fast
        // Iterating through lists is relatively fast
        // Note: you can sort lists if you want to.

        // If you only add or remove items at end of list, use ArrayList.
        List<String> list1 = new ArrayList<String>();

        // Removing or adding items elsewhere in the list?
        List<String> list2 = new LinkedList<String>();

        ////////////////SETS ///////////////////////////////////

        // Only store unique values
        // Great for removing duplicates
        // Not indexed, unlike lists
        // Very fast to check if a particular object exists
        // If you want to use your own objects, you must implement hashCode() and equals().

        // Order is unimportant and OK if it changes?
        // HashSet is not ordered.
        Set<String> set1 = new HashSet<String>();

        // Sorted in natural order? Use TreeSet - must implement Comparable for custom types
        // (1,2,3 ..., a,b,c.... etc)
        Set<String> set2 = new TreeSet<String>();

        // Elements remain in order they were added
        Set<String> set3 = new LinkedHashSet<String>();

        ////////////////MAPS ///////////////////////////////////

        // Key value pairs.
        // Like lookup tables
        // Retrieving a value by key is fast
        // Iterating over map values is very slow
        // Maps not really optimised for iteration
        // If you want to use your own objects as keys, you must implement hashCode() and equals().

        // Keys not in any particular order, and order liable to change.
        Map<String, String> map1 = new HashMap<String, String>();

        // Keys sorted in natural order - must implement Comparable for custom types
        Map<String, String> map2 = new TreeMap<String, String>();

        // Keys remain in order added
        Map<String, String> map3 = new LinkedHashMap<String, String>();

        // There are also the SortedSet and SortedMap interfaces.
    }

}


