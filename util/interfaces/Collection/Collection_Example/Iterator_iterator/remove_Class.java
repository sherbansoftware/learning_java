package util.interfaces.Collection.Collection_Example.Iterator_iterator;

// https://www.javatpoint.com/java-iterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class remove_Class {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        Iterator itr = fruits.iterator();
        System.out.println("Collections_ elements: ");

        // hasNext(), next(), remove() methods
        while (itr.hasNext()) {
            String fruit = (String) itr.next();
            if (fruit.matches("Banana")) {
                itr.remove();
                break;
            }
        }
        System.out.println(fruits);
    }
}
