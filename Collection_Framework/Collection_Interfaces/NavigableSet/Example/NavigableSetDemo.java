package Collection_Framework.Collection_Interfaces.NavigableSet.Example;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {

        //assigning treeSet object to navigableSet reference
        NavigableSet<Integer> data = new TreeSet<Integer>();

        //adding elements
        data.add(1000);
        data.add(3000);
        data.add(1200);
        data.add(13000);
        data.add(40000);
        data.add(54000);
        System.out.println("---- Tree Set ----");
        System.out.println(data);
        System.out.println("-----------------------------------------");

        //Methods

        Iterator descendingIterator = data.descendingIterator();

        // descendingIterator
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }



        System.out.println("floor() " + data.floor(13550));  // 1300

        System.out.println("lower " + data.lower(14000));    // 1300

        System.out.println("ceiling " + data.ceiling(2500));  //3000

        System.out.println("higher " + data.higher(4000));    // 13000

        System.out.println("pollFirst() " + data.pollFirst());    // 1000

        System.out.println("pollLast() " + data.pollLast());      // 54000

        NavigableSet<Integer> ns = data.descendingSet();

        System.out.println("descendingSet() " + data.descendingSet()); // [40000, 13000, 3000, 1200]
    }
}

