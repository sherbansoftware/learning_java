package Collections_.miscelanous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
		Collection<String> elements = new ArrayList<>();
		elements.add("Gold");
		elements.add("Silver");
		elements.add("Copper");
		elements.add("Nichel");
		
		//Set<String> strings = new HashSet<>();
		//Set<String> strings = new LinkedHashSet<>();
		Set<String> strings = new TreeSet<>();
		
		strings.add("Iron");
		strings.add("Metal");
		strings.addAll(elements);
		
		//System.out.println(strings);

		getSet("HashSet", strings);
	}
	
	public static Set<String> getSet(String type,Set<String> set){
		
		System.out.println(set+" "+ type);
		
		return set;
		
	}

}
