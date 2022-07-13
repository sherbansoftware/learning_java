package Collection_Framework.Collection_Interfaces.List.remove_Index;

/*                                     E remove(int index)


    ○ Removes the element at the specified position in this list (optional operation).

     ○ Shifts any subsequent elements to the left (subtracts one from their indices).

     ○ Returns the element that was removed from the list.

    ○ Parameters:

                   * index - the index of the element to be removed

    ○ Returns:

                   *  the element previously at the specified position

    ○ Throws:

                   * UnsupportedOperationException

                                 - if the remove operation is not supported by this list

                   * IndexOutOfBoundsException

                                  - if the index is out of range (index < 0 || index >= size())



 */


import java.util.ArrayList;
import java.util.List;

public class Remove_Index {

    public static void main(String[] args) {
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

        String removedElement = list.remove(2);

        System.out.println(removedElement);
        System.out.println(list);

    }
}
