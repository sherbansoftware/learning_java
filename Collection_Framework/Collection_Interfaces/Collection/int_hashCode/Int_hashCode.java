package Collection_Framework.Collection_Interfaces.Collection.int_hashCode;

import java.util.ArrayList;
import java.util.Collection;

/**
    ○ Returns the hash code value for this collection.

    ○ While the Collection interface adds no stipulations to the general contract for the Object.hashCode method,
          programmers should take note that

                  * any class that overrides the Object.equals  method

                  * must also override the Object.hashCode method

           in order to satisfy the general contract for the Object.hashCode method.

     ○ In particular, c1.equals(c2) implies that  c1.hashCode()==c2.hashCode().

 * @return the hash code value for this collection
 *
 * @see Object#hashCode()
 * @see Object#equals(Object)

   int hashCode();
 */
public class Int_hashCode {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("John");
        c.add('A');
        c.add(22);

        int hashcode = c.hashCode();

        System.out.println(hashcode);

    }
}
