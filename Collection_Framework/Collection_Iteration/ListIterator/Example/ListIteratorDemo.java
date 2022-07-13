package Collection_Framework.Collection_Iteration.ListIterator.Example;

// java program to show the usage of listIterator

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        // create a list of names
        List<String> names = new ArrayList<>();
        names.add("Welcome");
        names.add(null);
        names.add("To");
        names.add("Gfg");
        names.add(null);
        System.out.println(names);

        // Getting ListIterator object
        ListIterator<String> namesIterator = names.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (namesIterator.hasNext()) {
            String value = (String) namesIterator.next();
            if (value == "Welcome") {
//                namesIterator.set("Another");
//                namesIterator.add("new");
//                namesIterator.remove();

            }

        }
        System.out.println(names);
        // Traversing elements, the iterator is at the end
        // at this point
//        System.out.println("Backward Direction Iteration:");
//        while (namesIterator.hasPrevious()) {
//            System.out.println(namesIterator.previous());
//        }


        //       System.out.println(names);

//        System.out.println("________________________________");
        // for-each loop creates Internal Iterator here.
        // add or remove create an exception: Exception in thread "main" java.util.ConcurrentModificationException

        // must use CopyOnWriteArrayList to avoid Fail safe exception
//        for (String s : names) {
//            if (s == "Welcome") {
//                names.remove(s);
//            }
//
//    }  System.out.println(names);
    }
}





