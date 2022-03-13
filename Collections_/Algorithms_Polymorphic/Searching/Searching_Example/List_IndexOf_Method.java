package Collections_.Algorithms_Polymorphic.Searching.Searching_Example;

/**
 * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
 * More formally, returns the lowest index i such that (o==null ? get(i)==null : o.equals(get(i)))  or -1 if there is no such index.
 *
 * @param o element to search for
 * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
 * @throws ClassCastException if the type of the specified element is incompatible with this list
 *         (<a href="Collection.html#optional-restrictions">optional</a>)
 * @throws NullPointerException if the specified element is null and this list does not permit null elements
 *         (<a href="Collection.html#optional-restrictions">optional</a>)

int indexOf(lang.classes.Object o);
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_IndexOf_Method {

    public static void main(String[] args)
    {

        // Initializing a list of type Arraylist ----------------------------------------------------------------------
        List<Integer> al = new ArrayList<> ();
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(7);
        System.out.println(al);
        System.out.println(al.indexOf(5));

        // Initializing a list of type Linkedlist ----------------------------------------------------------------------
        List<String> l = new LinkedList<>();
        l.add("10");
        l.add("15");
        l.add("20");
        System.out.println(l);
        System.out.println(l.indexOf("20"));


    }
}
