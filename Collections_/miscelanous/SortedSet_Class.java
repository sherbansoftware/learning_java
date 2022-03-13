package Collections_.miscelanous;


import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Class {

	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		set.add(244);
		set.add(9);
		set.add(55);
		set.add(59);
		set.add(620);
		set.add(2);

		Set<Integer> headSet=set.headSet(55);
		// set.subSet(55,244);
		// set.tailSet(55);
		Integer first= set.first();
		// set.last();
		System.out.println(first);
		
	    
	}

}
