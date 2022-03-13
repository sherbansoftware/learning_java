package Java8.Method_References;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParticularInstanceMethodReference {
	
        /*Type                	       Syntax	            Method Reference       Lambda expression
	
	
Reference to an instance
method of a particular object      	instance::instanceMethod	s:toString	    () -> “string”.toString()*/
	
	public static void main(String args[]) {
        final List<Integer> list = Arrays.asList(5, 8, 55, 56, 5, 622, 7, 8, 9, 10);
        final MyComparator myComparator = new MyComparator();
        // Method reference
        Collections.sort(list, myComparator::compare);
        System.out.println(list);
        // Lambda expression
        Collections.sort(list, (a,b) -> myComparator.compare(a,b));
    }
    private static class MyComparator {
        public int compare(final Integer a, final Integer b) {
            return a.compareTo(b);
        }
    }
}