package Comparable_Comparator.Comparator.Example;

import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {

        //TreeSet<Integer> data = new TreeSet<Integer>();

        // Comparator using lambda reverse order
        //TreeSet<Integer> data = new TreeSet<Integer>((o1,o2) -> -Integer.compare(o1,o2));

        //Comparator using Comparator implementation in class My Sorting
        TreeSet<Integer> data = new TreeSet<>(new MySorting());
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);

    }

}

