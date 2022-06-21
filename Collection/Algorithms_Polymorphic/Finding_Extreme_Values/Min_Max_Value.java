package Collection.Algorithms_Polymorphic.Finding_Extreme_Values;

/**
 * Returns the minimum element of the given collection, according to the natural ordering of its elements.  All elements
 * in the collection must implement the Comparable interface.
 * Furthermore, all elements in the collection must be mutually comparable (that is, <tt>e1.compareTo(e2)</tt> must not throw a
 * ClassCastException for any elements e1 and e2 in the collection).
 *
 * This method iterates over the entire collection, hence it requires time proportional to the size of the collection.
 *
 * @param  <T> the class of the objects in the collection
 * @param  coll the collection whose minimum element is to be determined.
 * @return the minimum element of the given collection, according
 *         to the <i>natural ordering</i> of its elements.
 * @throws ClassCastException if the collection contains elements that are
 *         not <i>mutually comparable</i> (for example, strings and
 *         integers).
 * @throws java.util.NoSuchElementException if the collection is empty.
 * @see Comparable

public static <T extends lang.classes.Object & Comparable<? super T>> T min(Collection<? extends T> coll) {
        Iterator_Interface<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
        T next = i.next();
        if (next.compareTo(candidate) < 0)
        candidate = next;
        }
        return candidate;
        }
 ======================================================================================================================

 * Returns the minimum element of the given collection, according to the
 * order induced by the specified comparator.  All elements in the
 * collection must be <i>mutually comparable</i> by the specified
 * comparator (that is, <tt>comp.compare(e1, e2)</tt> must not throw a
 * <tt>ClassCastException</tt> for any elements <tt>e1</tt> and
 * <tt>e2</tt> in the collection).<p>
 *
 * This method iterates over the entire collection, hence it requires
 * time proportional to the size of the collection.
 *
 * @param  <T> the class of the objects in the collection
 * @param  coll the collection whose minimum element is to be determined.
 * @param  comp the comparator with which to determine the minimum element.
 *         ATest.A <tt>null</tt> value indicates that the elements' <i>natural
 *         ordering</i> should be used.
 * @return the minimum element of the given collection, according
 *         to the specified comparator.
 * @throws ClassCastException if the collection contains elements that are
 *         not <i>mutually comparable</i> using the specified comparator.
 * @throws java.util.NoSuchElementException if the collection is empty.
 * @see Comparable

@SuppressWarnings({"unchecked", "rawtypes"})
public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) {
        if (comp==null)
        return (T)min((Collection) coll);

        Iterator_Interface<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
        T next = i.next();
        if (comp.compare(next, candidate) < 0)
        candidate = next;
        }
        return candidate;
        }

        */


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Min_Max_Value {

    public static void main(String[] argv) throws Exception
    {

        try {

            // create link list object
            List<Integer> list = new LinkedList<Integer> ();

            // populate the list
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            // printing the List
            System.out.println("List: " + list);

            // getting minimum value
            // using min() and max() method
            int min = Collections.min(list);
            int max = Collections.max(list);
            // printing the min value
            System.out.println("Minimum value is: " + min);
            System.out.println("Maximum value is: " + max);
        }

        catch (NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
