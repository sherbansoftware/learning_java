package Collection_Framework.Collection_Classes.TreeSet.Example;

import java.util.Collection;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //creating treeSet
        Collection ts = new TreeSet();

        //creating treeSet by passing comparator object
        //TreeSet ts1 = new TreeSet(Comparator c);

        SortedSet s = new TreeSet();
        //equivalent treeSet of sortedSet
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();
        //equivalent treeSet of HashSet
        TreeSet ts3 = new TreeSet(hs);

        //treeSet with generics syntax implementing Comparator using lambda expressions
        TreeSet<Employee> ts4 = new TreeSet<Employee>((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

        ts4.add(new Employee("John", 30000));
        ts4.add(new Employee("Alicia", 40000));
        ts4.add(new Employee("Mulder", 20000));
        ts4.add(new Employee("Bob", 40000));
        ts4.add(null);

        ts4.forEach(emp -> System.out.println(emp.getName()));


    }

}
