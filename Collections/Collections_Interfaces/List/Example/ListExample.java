package Collections.Collections_Interfaces.List.Example;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String args[]) {
        //Creating a List
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Lemon");
        list.add(null);
        list.add(null);
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Banana");
        list.add("Pear");
        list.add(null);
        list.add("Pear");

        // Adding element in the list at specified index

        //list.add(2, "Lemon");

        // get element at specified index

        String fruitAtIndex0 = list.get(0);
        // System.out.println(fruitAtIndex0);

        // remove an element at specified index

        // String remmovedFruit = list.remove(2);
        //System.out.println("Fruit removed at index 2: " + remmovedFruit);

        // set a new element element at specified index:
        String Orange = list.set(1, "Orange");

        //System.out.println("Element before " + Orange);

        // get a sublist

        List<String> sublist = list.subList(0, 4);
        System.out.println("Print sublist ...");
        System.out.println(sublist);

        // remove sublist

        // list.subList(0, 4).clear();


        // remove all elements
        List<String> r = new ArrayList<>();
        r.add("Pear");
        r.add("Banana");
        // r.add(null);
        //list.removeAll(r);

        //remove null elements from list
        System.out.println("Print list:");
        System.out.println(list);

        // using ListIterator
//        ListIterator itr = list.listIterator();
//        while (itr.hasNext()) {
//            if (itr.next() == null) {
//                itr.remove();
//            }
//        }

        // using while
        int counter = 0;
        while (list.remove(null)) {
            counter++;
        }
          System.out.println("Null elements removed number: " + counter);

        // list without duplicate and null values
        // List<String> withOutDuplicate = list.stream().distinct().collect(Collectors.toList());
        // System.out.println(withOutDuplicate);

        System.out.println(list);


    }
}

