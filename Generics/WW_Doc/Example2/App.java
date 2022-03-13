package Generics.WW_Doc.Example2;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{}

public class App {
    public static void main(String[] args) {

        // Brefore Java 5
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("orange");
        list.add("banana");

        String fruit =(String) list.get(1);
       // System.out.println(fruit);

        // Using generics
        ArrayList<String> strings = new ArrayList<>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");
        String animal = strings.get(1);
        System.out.println(animal);

    // there can be more than a type argument using diamond operator

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"John");

        // using my own class

    ArrayList<Animal> someList = new ArrayList<>();

    }

}
