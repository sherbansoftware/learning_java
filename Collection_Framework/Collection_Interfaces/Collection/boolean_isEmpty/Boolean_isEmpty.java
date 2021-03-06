package Collection_Framework.Collection_Interfaces.Collection.boolean_isEmpty;

import java.util.Arrays;
import java.util.Collection;

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 */

public class Boolean_isEmpty {

    public static void main(String[] args) {
        Collection<String> animals = Arrays.asList();
        Collection<String> collections = Arrays.asList("Horse", "Dog", "Cat", "Bird", "Cat");
        boolean isEmptyCollections = collections.isEmpty();
        boolean isEmptyAnimals = animals.isEmpty();
        System.out.println(isEmptyCollections);
        System.out.println(isEmptyAnimals);
    }


}
