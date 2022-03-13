package Java8.Method_References;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
	/*Type                   	       Syntax	            Method Reference   Lambda expression
	
	Reference to a static method	Class::staticMethod	    String::valueOf	   s -> String.valueOf(s)
	
	/*Reference to a constructor	Class::new	String::new	
	 () -> new String()*/
	public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Method reference
        list.forEach(StaticMethodReference::print);
        // Lambda expression
        list.forEach(number -> StaticMethodReference.print(number));
        // normal
        for(int number : list) {
            StaticMethodReference.print(number);
        }
    }
    public static void print(final int number) {
        System.out.println("I am printing: " + number);
    }
}