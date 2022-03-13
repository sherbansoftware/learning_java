package Map_.miscelanous;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap_Class {
	public static void main(String[] args) {
		Map<Integer, String> ef = new IdentityHashMap<>();

		ef.put(3, "BANANA");
		ef.put(1, "APPLE");
		ef.put(2, "PEAR");
		ef.put(null, null);

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
