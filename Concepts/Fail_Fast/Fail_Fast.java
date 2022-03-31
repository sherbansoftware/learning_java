package Concepts.Fail_Fast;

// https://www.javatpoint.com/fail-fast-and-fail-safe-iterator-in-java#:~:text=much%20as%20possible.-,Fail%20Fast%20Iterator,structural%20modification%20of%20the%20collection.

/*                                                Fail-Fast systems

        abort operation as-fast-as-possible exposing failures immediately and stopping the whole operation.

                                              Fail-Fast Iterators

    The Fail Fast iterators immediately throw ConcurrentModificationException in case of structural modification of the
        collection.

                                             Structural modification means:

            * adding,
            * removing,
            * updating

        the value of an element in a data collection while another thread is iterating over that collection.
    Some examples of Fail Fast iterator are iterator on:

            * ArrayList,
            * HashMap
            * Vector
            * HashSet

                                                   How it Works

    The Fail Fast iterator uses an internal flag called modCount to know the status of the collection, whether the collection
        is structurally modified or not. The modCount flag is updated each time a collection is modified; it checks the
        next value; if it finds, then the modCount will be modified after this iterator has been created.
        It will throw ConcurrentModificationException.


                                                           NOTE

            * The Fail Fast iterator throws a ConcurrentModificationException if a collection is modified while iterating
                  over it.
            * The Fail Fast iterator uses an original collection to traverse over the collection's elements.
            * They are memory savers, don't require extra memory.
            * The Fail Fast iterators returned by

                  - ArrayList,
                  - HashMap,
                  - Vector
                  - HashSet

*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Fail_Fast {
    public static void main(String[] args) {

        Map<String, String> empName = new HashMap<String, String>();
        empName.put("Sam Hanks", "New york");
        empName.put("Will Smith", "LA");
        empName.put("Scarlett", "Chicago");
        Iterator iterator = empName.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(empName.get(iterator.next()));
            // adding an element to Map
            // exception will be thrown on next call
            // of next() method.
            empName.put("Istanbul", "Turkey");
        }
    }
}
