package Collections.miscelanous.Interfaces.Collection_Interface;


import java.util.ArrayList;
import java.util.Collection;
public class Collection_Interface {

    public static void main(String[] args) throws InterruptedException {

        // use boolean add(lang.classes.Object obj) method to add elements in the list-----------------------------------------------------------------

            //Return Value: This method returns a boolean value depicting the successfulness of the operation.
            // If the element was added, it returns true, else it returns false

        Collection<String> collection = new ArrayList<>();
        collection.add("element1");
        collection.add("element2");
        collection.add("element3");
        // printList(collection);

        // using boolean addAll(Collection c) method---------------------------------------------------------------------------------------

            //Return Value:
            // This method returns true if the collection changed as a result of the call.

        Collection<String> newColl = new ArrayList<>();
        newColl.add("last");
        newColl.add("elements");
        newColl.add("added");
        boolean added = collection.addAll(newColl);
        if (added) {
            // System.out.println("New elements added: " + newColl);
            // printList(collection);
        } else {
            System.out.println("Elements not added");
        }

        // using void clear() method ------------------------------------------------------------------------------------

//        collection.clear();
//        System.out.println(collection);
//        printList(collection);

        // using boolean contains(lang.classes.Object obj) method---------------------------------------------------------------------

        // Returns true
            // if obj is an element of the invoking collection. Otherwise, returns false.

        boolean result = collection.contains("element2");
        // printing the result
        // System.out.println("Is element2 present in the List: " + result);

        // using boolean containsAll(Collection c) method---------------------------------------------------------------

            //Return Value:
                // The method returns True if ALL ELEMENTS in the collection col are present in the
                // List otherwise it returns False.

        Collection<String> partial = new ArrayList<>();
        partial.add("element1");
        partial.add("element29");
        partial.add("element6");
 //     boolean resultAll = collection.containsAll(partial);
        // printing the result
        // System.out.println("is collection included: " + resultAll);

        //using boolean equals(lang.classes.Object obj)------------------------------------------------------------------------------

        Collection<String> partial1 = new ArrayList<>();
        partial1.add("element1");
        partial1.add("element2");
//        System.out.println(partial.equals(partial1));

        // using int hashCode()------------------------------------------------------------------------------------------

//        System.out.println("Partial hashcode: " + partial.hashCode());
//        System.out.println("Partial1 hashcode: " + partial1.hashCode());

        // using boolean isEmpty()--------------------------------------------------------------------------------------
        // collection.clear();
//        if (collection.isEmpty()) {
//            System.out.println("Collection is empty");
//        } else {
//            System.out.println("Collections_ is not empty");
//        }

        // using Iterator_Interface iterator()------------------------------------------------------------------------------------

//        Iterator_Interface<String> iterator = collection.iterator();
//        System.out.println("Collection's elements are: ");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

        // using boolean remove(lang.classes.Object obj)-----------------------------------------------------------------------------

//        if (collection.remove("element11")) {
//            System.out.println();
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Element1 was removed");
//            printList(collection);
//        } else {
//            System.out.println();
//            System.out.println("Collections_ is intact");
//            printList(collection);
//        }

        //using boolean removeAll(Collection c)-------------------------------------------------------------------------

          // Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.

//        if (collection.removeAll(partial)) {
//            System.out.println();
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Collection partial was removed");
//            printList(collection);
//        } else {
//            System.out.println();
//            System.out.println("Collections_ is intact");
//            printList(collection);
//        }

        //using boolean retainAll(Collection c)-------------------------------------------------------------------------

        // The method returns true if the list is changed at all as a result of the call else false.

//        if (collection.retainAll(partial)) {
//            System.out.println();
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Common elements of collections if any");
//            printList(collection);
//            System.out.println(collection);
//
//        } else {
//            System.out.println();
//            System.out.println("Collections_ is not changed");
//            printList(collection);
//        }

        //using int size()----------------------------------------------------------------------------------------------

//        System.out.println();
//        System.out.println("Collection's size is: " + collection.size());

        // using lang.classes.Object[] toArray()-------------------------------------------------------------------------------------

//        lang.classes.Object[] arr = collection.toArray();
//        Iterator_Interface iter = Arrays.stream(arr).iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        // lang.classes.Object[] toArray(lang.classes.Object array[])------------------------------------------------------------------------------

//        lang.classes.Object[] arrRetained = collection.toArray(partial.toArray());
//        for (lang.classes.Object arr : arrRetained) {
//            System.out.println(arr);
//        }

    }

    public static void printList(Collection<?> elements) {
        if (!elements.isEmpty()) {
            for (Object element : elements) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Collection is empty");
        }
    }

}


