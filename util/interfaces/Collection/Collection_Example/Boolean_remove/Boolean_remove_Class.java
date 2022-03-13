package util.interfaces.Collection.Collection_Example.Boolean_remove;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).  More formally,
 * removes an element <tt>e</tt> such that
 * (o==null ? e==null: o.equals(e)) , if this collection contains one or more such elements.
 * Returns  true if this collection contained the specified element (or
 * equivalently, if this collection changed as a result of the call).
 *
 * @param_ o element to be removed from this collection, if present
 * @return <tt>true</tt> if an element was removed as a result of this call
 * @throws ClassCastException if the type of the specified element
 * is incompatible with this collection
 * (<a href="#optional-restrictions">optional</a>)
 * @throws NullPointerException if the specified element is null and this
 * collection does not permit null elements
 * (<a href="#optional-restrictions">optional</a>)
 * @throws UnsupportedOperationException if the <tt>remove</tt> operation
 * is not supported by this collection
 */

//    boolean remove(Object o);

public class Boolean_remove_Class {

    public static Collection<String> elements = new ArrayList<>();


    public static void main(String[] args) {

        Collection<String> animals = new ArrayList<>();
        animals.add("Horse");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Dog");
        animals.add(null);
        // animals.add("");
        Boolean_remove_Class.elements = animals;
        System.out.println("Initial list size: " + elements.size());
        elements.forEach(e -> System.out.println(e));
        String animal = "Dog";

        // remove only one element -------------------------------------------------------------------------------------
//        if(elements.remove(animal)) {
//            System.out.println("Element " + animal + " not removed");
//        }

        int rem = removeAllDuplicateElements(animal);
        System.out.println("Filtered animal's list:");
        elements.forEach(e -> System.out.println(e));
        System.out.println("Filtered list size: " + elements.size() +
                " and removed elements number: " + rem + " with name " + animal);

    }

    // remove all duplicate elements -----------------------------------------------------------------------------------
    public static int removeAllDuplicateElements(String animal) {
        Collection col = new ArrayList<>();
        for (String a : elements) {
            if (animal.equals(a)) {
                col.add(a);
            }
        }
        elements.removeAll(col);
        int count = col.size();
        col.clear();
        return count;
    }
}