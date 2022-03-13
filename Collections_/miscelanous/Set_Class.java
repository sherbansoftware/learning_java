package Collections_.miscelanous;


import java.util.Set;
import java.util.TreeSet;

public class Set_Class {

	public static void main(String[] args) {
		//Set<Integer> cos = new HashSet<>();
		Set<Integer> co = new TreeSet<>();
		//Set<Integer> co = new LinkedHashSet<>();
		co.add(5);
		co.add(69);
		co.add(597);
		co.add(0);
		co.add(654);

		System.out.println(co);
	}

}
