package Collections.Collections_Interfaces.List.Implemented_By.ArrayList.Example;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {


        // Constructors
        ArrayList al = new ArrayList();

        ArrayList aList = new ArrayList(30);

        // ArrayList aList1 = new ArrayList(Collection c);

        // add elements

        al.add("John");
        al.add(true);
        al.add(10);
        System.out.println(al);
        al.remove(1);
        al.remove(new Integer(10));
        System.out.println(al);
        System.out.println(al.get(0));

        ArrayList<String> list = new ArrayList<String>();//Creating arraylist

        //Adding object in arraylist
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");


        //Adding object at s
        System.out.println(list.hashCode());
        list.sort((s1, s2) -> s1.compareTo(s2));

        //Printing the arraylist object
       // System.out.println(list);

    }
}
