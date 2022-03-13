package Java8.Method_References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodReference {
	 public static void main(String args[]) {

		 /*Type                   Syntax	         Method Reference              Lambda expression
		 
Reference to a constructor    	Class::new            	String::new	             () -> new String()*/	
		 
	        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        // Method Reference
	        copyElements(null, ArrayList<Integer>::new);
	        // Lambda expression
	        copyElements(list, () -> new ArrayList<Integer>());
	    }
	    private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
	        // Method reference to a particular instance
	        list.forEach(targetCollection.get()::add);
	    }
	}
