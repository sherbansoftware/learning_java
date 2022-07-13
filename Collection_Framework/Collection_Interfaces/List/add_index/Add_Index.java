package Collection_Framework.Collection_Interfaces.List.add_index;


/*                                         public void add(int index, E element)


    ○ Inserts the specified element at the specified position in this list. Shifts the element currently at that position
           (if any) and any subsequent elements to the right (adds one to their indices).

    ○ Specified by:

                   * add in interface List<E>

     ○ Overrides:

                   * add in class AbstractList<E>


    ○ Parameters:

                   * index

                                 - index at which the specified element is to be inserted

                    * element

                                 - element to be inserted

    ○ Throws:

                    * IndexOutOfBoundsException

                                   - if the index is out of range (index < 0 || index > size())




 */

import java.util.ArrayList;
import java.util.List;

public class Add_Index {

    public static void main(String args[]) {
        //Creating a List
        List<String> list = new ArrayList<String>();

        //Adding elements in the List
        list.add("Mango");
        list.add("Lemon");
        list.add(null);
        list.add(null);
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Banana");
        list.add("Pear");
        list.add(null);
        list.add("Pear");

        // Adding element in the list at specified index

        list.add(2, "Lemon");

       // list.forEach(System.out:: println);
    }
}