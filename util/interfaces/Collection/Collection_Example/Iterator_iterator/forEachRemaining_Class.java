package util.interfaces.Collection.Collection_Example.Iterator_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class forEachRemaining_Class {

    public static void main(String args[]) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();

        iterator.forEachRemaining(f -> System.out.println(f + " good"));
    }
}
