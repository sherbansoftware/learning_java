package Collection.Concurrent_Collection_Classes.CopyOnWriteArraySet.Example;


import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

    public static void main(String[] args) {
        //first constructor
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        ArrayList<String> list = new ArrayList<String>();
        list.add("Basics");
        list.add("Basics");
        list.add("Strong");
        list.add("Strong");

        //second constructor
        CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>(list);
        System.out.println(set1);


    }

}
