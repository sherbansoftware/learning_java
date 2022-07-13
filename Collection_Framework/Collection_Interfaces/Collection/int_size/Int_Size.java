package Collection_Framework.Collection_Interfaces.Collection.int_size;

import java.util.ArrayList;
import java.util.Collection;

/**

    ○ Returns the NUMBER OF ELEMENTS in this collection.

    ○ If this collection contains more than Integer.MAX_VALUE elements,

                   * returns Integer.MAX_VALUE

    ○ @return the number of elements in this collection

   int size();

 */
public class Int_Size {

    public static void main(String[] args) {

        Collection<String> collections = new ArrayList<>();
        collections.add("Horse");
        collections.add("Dog");
        collections.add("Cat");
        collections.add("Bird");
        collections.add("Cat");

       System.out.println(collections.size()); // 5
    }
}
