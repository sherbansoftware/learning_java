package Miscelanous.Method_References.Static_Method_Reference;

import java.util.Arrays;
import java.util.List;

/*                              Reference to a static method

                   Syntax                                                    Example

	       ContainingClass::staticMethodName	                     Person::compareByAge
                                                                  MethodReferencesExamples::appendStrings

 */

public class Static_Method_Reference {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Method reference
        list.forEach(Static_Method_Reference::print);

        // Lambda expression
        list.forEach(number -> Static_Method_Reference.print(number));
        // normal

        for (int number : list) {
            Static_Method_Reference.print(number);
        }
    }

    public static void print(final int number) {
        System.out.println("I am printing: " + number);
    }
}