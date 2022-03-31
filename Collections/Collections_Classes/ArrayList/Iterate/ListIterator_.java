package Collections.Collections_Classes.ArrayList.Iterate;

/*                                            ListIteratorDemo

     is one of the four java cursors. It is a java iterator which is used to traverse all types of lists including:

        * ArrayList,
        * Vector,
        * LinkedList,
        * Stack etc.

     It is available since Java 1.2. It extends the iterator interface.

                                                NOTE

            * It is useful for list implemented classes.
            * Available since java 1.2.
            * It supports bi-directional traversal. i.e both forward and backward direction.
            * It supports all the four CRUD operations(Create, Read, Update, Delete) operations.
            * There is no current element in ListIteratorDemo. Its cursor always lies between the previous and next elements.
                  The previous() will return to the previous elements and the next() will return to the next element.
                  Therefore, for a list of n length, there are n+1 possible cursors.
            * hasNext(): This method returns true when the list has more elements to traverse while traversing in the
                  forward direction
            * next(): This method returns the next element of the list and advances the position of the cursor.
            * nextIndex(): This method returns the index of the element that would be returned on calling the next() function.

 */


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_ {
    public static void main(String[] args) {
        // create a list of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Welcome");
        names.add("To");
        names.add("Gfg");

        // Getting ListIteratorDemo
        ListIterator<String> namesIterator = names.listIterator();

        // Traversing elements
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());

        }
        while (namesIterator.hasPrevious()) {
            System.out.println(namesIterator.previous());
        }
        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }

}
