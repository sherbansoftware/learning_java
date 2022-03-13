package util.interfaces.Collection.Collection_Example.Int_Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Returns the number of elements in this collection.  If this collection
 * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
 * <tt>Integer.MAX_VALUE</tt>.
 *
 * @return the number of elements in this collection
 */

 //   int size();

public class Int_Size_Class {

    public static void main(String[] args) {
        Collection<String> animals = Arrays.asList();

        String[] original = {"Horse", "Dog", "Cat", "Bird", "Cat","Swan"};

        //This is a immutable collection
        Collection<String> collection = Arrays.asList(original);

        Collection<String> collections = new ArrayList<>();
        collections.add("Horse");
        collections.add("Dog");
        collections.add("Cat");
        collections.add("Bird");
        collections.add("Cat");

        System.out.println(animals.size());
        System.out.println(collection.size());
        System.out.println(collections.size());
    }
}
