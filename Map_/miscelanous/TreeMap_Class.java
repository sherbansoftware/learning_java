package Map_.miscelanous;


import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Class {

	public static void main(String[] args) {
		Map<Integer, String> ef = new TreeMap<>();

		ef.put(3, "BANANA");
		ef.put(1, "APPLE");
		ef.put(2, "PEAR");
		// ef.put(null, null);

		// ef.put(null, "GRAPES");

		// System.out.println(ef.get(0));
		// key set
		/*
		 * for (Integer i : ef.keySet()) { System.out.println(ef.get(i)); }
		 */
		for (Map.Entry<Integer, String> i : ef.entrySet()) {
			int size = ef.size();
			System.out.println(i.getKey() + " " + i.getValue());

		}

		// java8

		// Stream.of(dataMap);
		// System.out.println(l);

	}

}
