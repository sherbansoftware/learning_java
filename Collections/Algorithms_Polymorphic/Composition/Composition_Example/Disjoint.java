package Collections.Algorithms_Polymorphic.Composition.Composition_Example;
/*

     * Returns {@code true} if the two specified collections have no elements in common.
     *
     * Care must be exercised if this method is used on collections that do not comply with the general contract for
     {@code Collection}
     * Implementations may elect to iterate over either collection and test
     * for containment in the other collection (or to perform any equivalent
     * computation).  If either collection uses a nonstandard equality test
     * (as does a {@link SortedSet} whose ordering is not <em>compatible with
     * equals</em>, or the key set of an {@link IdentityHashMap}), both
     * collections must use the same nonstandard equality test, or the
     * result of this method is undefined.
     *
     * <p>Care must also be exercised when using collections that have
     * restrictions on the elements that they may contain. Collection
     * implementations are allowed to throw exceptions for any operation
     * involving elements they deem ineligible. For absolute safety the
     * specified collections should contain only elements which are
     * eligible elements for both collections.
     *
     * <p>Note that it is permissible to pass the same collection in both
     * parameters, in which case the method will return {@code true} if and
     * only if the collection is empty.
     *
     * @param c1 a collection
     * @param c2 a collection
     * @return {@code true} if the two specified collections have no
     * elements in common.
     * @throws NullPointerException if either collection is {@code null}.
     * @throws NullPointerException if one collection contains a {@code null}
     * element and {@code null} is not an eligible element for the other collection.
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws ClassCastException if one collection contains an element that is
     * of a type which is ineligible for the other collection.
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @since 1.5

public static boolean disjoint(Collection<?> c1, Collection<?> c2) {
        // The collection to be used for contains(). Preference is given to
        // the collection who's contains() has lower O() complexity.
        Collection<?> contains = c2;
        // The collection to be iterated. If the collections' contains() impl
        // are of different O() complexity, the collection with slower
        // contains() will be used for iteration. For collections who's
        // contains() are of the same complexity then best performance is
        // achieved by iterating the smaller collection.
        Collection<?> iterate = c1;

        // Performance optimization cases. The heuristics:
        //   1. Generally iterate over c1.
        //   2. If c1 is a Set then iterate over c2.
        //   3. If either collection is empty then result is always true.
        //   4. Iterate over the smaller Collection.
        if (c1 instanceof Set) {
        // Use c1 for contains as a Set's contains() is expected to perform
        // better than O(N/2)
        iterate = c2;
        contains = c1;
        } else if (!(c2 instanceof Set)) {
        // Both are mere Collections_. Iterate over smaller collection.
        // Example: If c1 contains 3 elements and c2 contains 50 elements and
        // assuming contains() requires ceiling(N/2) comparisons then
        // checking for all c1 elements in c2 would require 75 comparisons
        // (3 * ceiling(50/2)) vs. checking all c2 elements in c1 requiring
        // 100 comparisons (50 * ceiling(3/2)).
        int c1size = c1.size();
        int c2size = c2.size();
        if (c1size == 0 || c2size == 0) {
        // At least one collection is empty. Nothing will match.
        return true;
        }

        if (c1size > c2size) {
        iterate = c2;
        contains = c1;
        }
        }

        for (lang.classes.Object e : iterate) {
        if (contains.contains(e)) {
        // Found a common element. Collections_ are not disjoint.
        return false;
        }
        }

        // No common elements were found.
        return true;
        }

*/


import java.util.*;

public class Disjoint {
    public static void main(String[] args) {

        // Let us create array list of strings
        List<String> mylist1 = new ArrayList<String> ();
        mylist1.add ("practice");
        mylist1.add ("code");
        mylist1.add ("quiz");
        mylist1.add ("geeksforgeeks");

        // Let us create vector of strings
        List<String> mylist2 = new Vector<String> ();
        mylist2.add ("geeks");
        mylist2.add ("geek");
        mylist2.add ("for");
        mylist2.add ("coder");

        // Let us create a vector
        List mylist3 = new Vector ();

        mylist3.add (1);
        mylist3.add ("practice");

        // Let us create a Set of strings
        Set<String> mylist4 = new HashSet<String> ();
        mylist4.add ("practice");
        mylist4.add ("code");
        mylist4.add ("quiz");
        mylist4.add ("geeksforgeeks");


        // Here we are using disjoint() method to check
        // whether two collections are disjoint or not
        System.out.println ("is mylist1 disjoint to mylist2 : " +
                Collections.disjoint (mylist1, mylist2));

        System.out.println ("is mylist1 disjoint to mylist3 : " +
                Collections.disjoint (mylist1, mylist3));

        System.out.println ("is mylist1 disjoint to mylist4 : " +
                Collections.disjoint (mylist1, mylist4));

    }

}
