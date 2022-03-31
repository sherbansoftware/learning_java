package Collections.Collections_Interfaces.SortedSet.Example;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {
        //assigning treeSet object to SortedSet reference
        SortedSet s = new TreeSet();
        s.add(5);
        s.add(10);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(7);
        System.out.println(s);

        //Methods in SortedSet Interface TreeSet Collection Integer

        //Object first()
        System.out.println("First elament: " + s.first());

        //Object last()
        System.out.println("Last element: " + s.last());

        //SortedSet headSet(Object o)
        System.out.println("Head set: " + s.headSet(3));

        //SortedSet tailSet(Object 0)
        System.out.println("Tail set:" + s.tailSet(3));

        //SortedSet subSet(Object o,Object p)
        System.out.println("Subset " + s.subSet(3, 7));

        //Comaparator comparator()
        // for natural sorted order  return null
        System.out.println(s.comparator());

    }

}

