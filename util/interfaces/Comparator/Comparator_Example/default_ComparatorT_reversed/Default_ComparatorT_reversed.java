package util.interfaces.Comparator.Comparator_Example.default_ComparatorT_reversed;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Returns a comparator that imposes the reverse ordering of this
 * comparator.
 *
 * @return a comparator that imposes the reverse ordering of this
 * comparator.
 * @since 1.8
 */

// https://www.geeksforgeeks.org/comparator-reversed-method-in-java-with-examples/

/*
default Comparator<T> reversed() {
        return Collections_.reverseOrder(this);
        }
*/

public class Default_ComparatorT_reversed {
    public static void main(String[] args) {

        String[] Arraystrings = {"aman", "amar", "avik"};

        System.out.println("before sort : "
                + Arrays.toString(Arraystrings));

        Comparator<String> comp = (String::compareTo);
        Arrays.sort(Arraystrings, comp.reversed());

        System.out.println("after sort : "
                + Arrays.toString(Arraystrings));
    }
}

