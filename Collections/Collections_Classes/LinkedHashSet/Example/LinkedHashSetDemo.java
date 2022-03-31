package Collections.Collections_Classes.LinkedHashSet.Example;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        //creating linkedHashSet of default capacity 16
       Set<String> lhs = new HashSet<>();


        lhs.add("John");
        lhs.add("Mary");
        lhs.add("Albert");
        lhs.add("Jeff");

        System.out.println(lhs);
        System.out.println(new LinkedHashSet<>(lhs));



        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            if(itr.next() == "Albert") {
               itr.remove();
            }
        }
        System.out.println(lhs);

        System.out.println(new LinkedHashSet<>(lhs));

        //creating linkedHasSet of specified capacity
        LinkedHashSet lhs1 = new LinkedHashSet(30);

        //creating linkedHashSet of specified capacity and specified load factor
        LinkedHashSet lhs2 = new LinkedHashSet(20, 1.00f);

        //Insertion order is preserved
        //Underlying data structure = combination of linked list and hash table.
    }

}
