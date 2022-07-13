package Collection_Framework.Collection_Interfaces.Collection.boolean_removeIf;

import java.util.ArrayList;
import java.util.Collection;

// https://www.geeksforgeeks.org/arraylist-removeif-method-in-java/

/**
 * Removes all of the elements of this collection that satisfy the given
 * predicate.  Errors or runtime exceptions thrown during iteration or by
 * the predicate are relayed to the caller.
 *
 * @implSpec The default implementation traverses all elements of the collection using
 * its {@link_ #iterator}.  Each matching element is removed using
 * {@link java.util.Iterator#remove()}.  If the collection's iterator does not
 * support removal then an {@code UnsupportedOperationException} will be
 * thrown on the first matching element.
 * @param_ filter a predicate which returns {@code true} for elements to be
 * removed
 * @return {@code true} if any elements were removed
 * @throws NullPointerException if the specified filter is null
 * @throws UnsupportedOperationException if elements cannot be removed
 * from this collection.  Implementations may throw this exception if a
 * matching element cannot be removed or if, in general, removal is not
 * supported.
 * @since 1.8
 */
/*
default boolean removeIf(Predicate<? super E>filter){
        Objects.requireNonNull(filter);
        boolean removed=false;
final Iterator_Interface<E> each=iterator();
        while(each.hasNext()){
        if(filter.test(each.next())){
        each.remove();
        removed=true;
        }
        }
        return removed;
        }

*/

public class Boolean_RemoveIf {
    public static void main(String[] args) {

        // create an ArrayList_ which going to
        // contains a list of Numbers
        Collection<Integer> Numbers = new ArrayList<Integer>();

        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));

        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }
    }
}
