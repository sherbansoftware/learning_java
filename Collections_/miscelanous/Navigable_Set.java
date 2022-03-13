package Collections_.miscelanous;


import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable_Set {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(4555);
		ns.add(655);
		ns.add(2000);
		ns.add(2750);
		ns.add(5465);
		ns.pollFirst();
		ns.pollLast();
		// ns.lower(2000);
		// ns.higher(2000);
		// ns.ceiling(2500);
		// ns.floor(2000);
		System.out.println(ns.floor(2000));

	}

}
