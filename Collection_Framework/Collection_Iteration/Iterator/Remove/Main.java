package Collection_Framework.Collection_Iteration.Iterator.Remove;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        // "Old" way of iterating through lists (except that generics didn't exist pre Java 5). This way is still an
        // integral part of Java; it allows you to remove items from the list and also
        // supports the "for each" syntax behind the scenes.

        Iterator<String> it = animals.iterator();

        while (it.hasNext()) {
            String value = it.next();

            if(value.contains("o"))
                it.remove();

//            if (value.equals("cat")) {
//                it.remove();
//           }


        }

        System.out.println(animals);

        /*
         * If you want to add items to a list while iterating through
         * it, get a ListIteratorDemo using the .listIterator() method.
         * ListIteratorDemo also has a previous() method, allowing you to
         * "rewind" the iterator so that you can add items before
         * the current item.
         */

        // / Modern iteration, Java 5 and later; "for each" loop

        for (String animal : animals) {
            //System.out.println(animal);

            // animals.remove( 2); // Throws ConcurrentModificationException  Fail Fast

        }
    }


}
