package Collection_Framework.Collection_Interfaces.Collection.boolean_contains;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Returns <tt>true</tt> if this collection contains the specified element.
 * More formally, returns <tt>true</tt> if and only if this collection
 * contains at least one element <tt>e</tt> such that
 * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
 *
 * @param_ o element whose presence in this collection is to be tested
 * @return <tt>true</tt> if this collection contains the specified
 * element
 * @throws ClassCastException if the type of the specified element
 * is incompatible with this collection
 * (<a href="#optional-restrictions">optional</a>)
 * @throws NullPointerException if the specified element is null and this
 * collection does not permit null elements
 * (<a href="#optional-restrictions">optional</a>)
 */

//   boolean contains(Object o);

public class Boolean_Contains {

    public static void main(String[] args) {

        Collection<String> animals = new ArrayList<>();
        animals.add("Horse");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Cat");
        animals.add("Horse");
        animals.add(null);
        animals.add("");

        boolean isFound = animals.contains("Horse");
        System.out.println(isFound);

    }
}