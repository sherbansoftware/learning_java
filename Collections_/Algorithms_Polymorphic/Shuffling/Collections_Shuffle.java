package Collections_.Algorithms_Polymorphic.Shuffling;

/**
 * Randomly permutes the specified list using a default source of
 * randomness.  All permutations occur with approximately equal
 * likelihood.
 *
 * <p>The hedge "approximately" is used in the foregoing description because
 * default source of randomness is only approximately an unbiased source
 * of independently chosen bits. If it were a perfect source of randomly
 * chosen bits, then the algorithm would choose permutations with perfect
 * uniformity.
 *
 * <p>This implementation traverses the list backwards, from the last
 * element up to the second, repeatedly swapping a randomly selected element
 * into the "current position".  Elements are randomly selected from the
 * portion of the list that runs from the first element to the current
 * position, inclusive.
 *
 * <p>This method runs in linear time.  If the specified list does not
 * implement the {@link java.util.RandomAccess} interface and is large, this
 * implementation dumps the specified list into an array before shuffling
 * it, and dumps the shuffled array back into the list.  This avoids the
 * quadratic behavior that would result from shuffling a "sequential
 * access" list in place.
 *
 * @param  list the list to be shuffled.
 * @throws UnsupportedOperationException if the specified list or
 *         its list-iterator does not support the <tt>set</tt> operation.

public static void shuffle(List<?> list) {
        Random rnd = r;
        if (rnd == null)
        r = rnd = new Random(); // harmless race.
        shuffle(list, rnd);
        }


  private static Random r;


 * Randomly permute the specified list using the specified source of
 * randomness.  All permutations occur with equal likelihood
 * assuming that the source of randomness is fair.<p>
 *
 * This implementation traverses the list backwards, from the last element
 * up to the second, repeatedly swapping a randomly selected element into
 * the "current position".  Elements are randomly selected from the
 * portion of the list that runs from the first element to the current
 * position, inclusive.<p>
 *
 * This method runs in linear time.  If the specified list does not
 * implement the {@link java.util.RandomAccess} interface and is large, this
 * implementation dumps the specified list into an array before shuffling
 * it, and dumps the shuffled array back into the list.  This avoids the
 * quadratic behavior that would result from shuffling a "sequential
 * access" list in place.
 *
 * @param  list the list to be shuffled.
 * @param  rnd the source of randomness to use to shuffle the list.
 * @throws UnsupportedOperationException if the specified list or its
 *         list-iterator does not support the <tt>set</tt> operation.

@SuppressWarnings({"rawtypes", "unchecked"})
public static void shuffle(List<?> list, Random rnd) {
        int size = list.size();
        if (size < SHUFFLE_THRESHOLD || list instanceof RandomAccess) {
        for (int i=size; i>1; i--)
        swap(list, i-1, rnd.nextInt(i));
        } else {
        lang.classes.Object[] arr = list.toArray();

        // Shuffle array
        for (int i=size; i>1; i--)
        swap(arr, i-1, rnd.nextInt(i));

        // Dump array back into list
        // instead of using a raw type here, it's possible to capture
        // the wildcard but it will require a call to a supplementary
        // private method
        ListIterator it = list.listIterator();
        for (int i=0; i<arr.length; i++) {
        it.next();
        it.set(arr[i]);
        }
        }
        }
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Collections_Shuffle {

    public static void main(String[] args) {

        // using a default source of randomness-------------------------------------------------------------------------
        ArrayList<String> mylist = new ArrayList<String> ();
        mylist.add ("code");
        mylist.add ("quiz");
        mylist.add ("geeksforgeeks");
        mylist.add ("quiz");
        mylist.add ("practice");
        mylist.add ("qa");

        System.out.println ("Original List : \n" + mylist);

        Collections.shuffle (mylist);

        System.out.println ("\nShuffled List : \n" + mylist);

        // provide a Random object to use as a source of randomness-----------------------------------------------------

        ArrayList<String> mylist1 = new ArrayList<String> ();
        mylist1.add ("code");
        mylist1.add ("quiz");
        mylist1.add ("geeksforgeeks");
        mylist1.add ("quiz");
        mylist1.add ("practice");
        mylist1.add ("qa");

        System.out.println ("Original List : \n" + mylist);

        // Here we use Random() to shuffle given list.
        Collections.shuffle (mylist, new Random ());
        System.out.println ("\nShuffled List with Random() : \n"
                + mylist);

        // Here we use Random(3) to shuffle given list.
        Collections.shuffle (mylist, new Random (3));
        System.out.println ("\nShuffled List with Random(3) : \n"
                + mylist);

        // Here we use Random(3) to shuffle given list.
        Collections.shuffle (mylist, new Random (5));
        System.out.println ("\nShuffled List with Random(5) : \n"
                + mylist);

    }
}
