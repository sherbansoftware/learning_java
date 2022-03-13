package Collections_.miscelanous.Interfaces.Set_interface;

                                              //Set
/* ATest.A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.
       The Set interface contains only methods INHERITED FROM Collection and adds the restriction that duplicate
       elements are prohibited. Set also adds a stronger contract on the behavior of the equals and hashCode operations,
       allowing Set instances to be compared meaningfully even if their implementation types differ. Two Set instances are
       equal if they contain the same elements.
 The Java platform contains three general-purpose Set implementations: HashSet, TreeSet, and LinkedHashSet. HashSet,
       which stores its elements in a hash table, is the best-performing implementation
*/

//Using JDK 8 Aggregate Operations:-------------------------------------------------------------------------------------


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class FindDups {
    public static void main(String[] args) {
        // remove duplicate words List to Set--------------------------------------------------------------------------
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Mary");
        list.add("Lisa");
        list.add("Matt");
        list.add("Sean");
        list.add("Matt");
        Set<String> distinctWords = list.stream().collect(Collectors.toSet());
        System.out.println(distinctWords.size() + " distinct words: " +
                distinctWords);
    }
}