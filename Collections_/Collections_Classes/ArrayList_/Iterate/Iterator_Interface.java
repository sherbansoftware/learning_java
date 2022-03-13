package Collections_.Collections_Classes.ArrayList_.Iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> itr = cars.iterator();

        // Print all elements
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
