package Collections.Algorithms_Polymorphic.Searching.Searching_Example;

/**
 * Returns true if this collection contains the specified element.More formally, returns true if and only if this collection
 * contains at least one element e such that (o==null ? e==null : o.equals(e)).
 *
 * @param o element whose presence in this collection is to be tested
 * @return  true if this collection contains the specified
 *         element
 * @throws ClassCastException if the type of the specified element
 *         is incompatible with this collection
 *         (<a href="#optional-restrictions">optional</a>)
 * @throws NullPointerException if the specified element is null and this
 *         collection does not permit null elements
 *         (<a href="#optional-restrictions">optional</a>)

boolean contains(lang.classes.Object o);
*/

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Collection_Contains_Method {

    public static void main(String args[]) {

        // Using ArrayList_ ---------------------------------------------------------------------------------------------
        Collection<Integer> arrlist = new ArrayList<Integer> (5);

        // use add() method to add elements in the list
        arrlist.add (15);
        arrlist.add (20);
        arrlist.add (25);

        // Output the present list
        System.out.println ("ArrayList_: " + arrlist);

        // Checking the presence of 20
        // using contains() method
        boolean result = arrlist.contains (20);

        // printing the result
        System.out.println ("Is 20 present in the ArrayList_: "
                + result);

        // using LinkedList --------------------------------------------------------------------------------------------
        Collection<String> list = new LinkedList<String> ();

        // use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // Output the present list
        System.out.println("The list is: " + list);

        // Checking the presence of Geeks
        // using contains() method
        boolean result1 = list.contains("Geeks");

        // printing the result
        System.out.println("Is Geeks present in the List: "
                + result1);

        // Using ArrayDeque --------------------------------------------------------------------------------------------
        Collection<String> de_que = new ArrayDeque<String> ();

        // Use add() method to add elements into the Deque
        de_que.add("Welcome");
        de_que.add("To");
        de_que.add("Geeks");
        de_que.add("4");
        de_que.add("Geeks");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + de_que);

        // Checking the presence of Geeks
        // using contains() method
        boolean result2 = de_que.contains("Geeks");

        // printing the result
        System.out.println("Is Geeks present in the ArrayDeque: "
                + result2);

    }
}
