package Map_.miscelanous;


import java.util.*;

public class HashMap_Class {

	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

	public enum Fruits {
		APPLE, PEAR, BANANA
	}

	public static void main(String[] args) {
		Map<Integer, String> ef = new HashMap<>();

		ef.put(1, "APPLE");
		ef.put(3, "BANANA");
		ef.put(2, "PEAR");
		ef.put(4, "PEACH");
		ef.put(5, "GRAPES");
		ef.put(null, null);
		
		// ef.clear();
//		SortedMap<Integer, String> sMap = new TreeMap<>();
//		sMap.put(5, "John");
//		sMap.put(2, "Andrew");
//		sMap.put(8, "Alain");
//		sMap.put(4, "Angela");
//		
//				
//		System.out.println(sMap);		
//		for(Map.Entry<Integer, String> entry : sMap.entrySet()) {
//			System.out.println("key "+ entry.getKey() + " Values " + entry.getValue());
//			
//		}
		
		NavigableMap<Integer, String> nMap = new TreeMap<>();
		
		nMap.put(5, "John");
		nMap.put(2, "Andrew");
		nMap.put(7, "David");
		nMap.put(8, "Black");
		//nMap.clear();
		//System.out.println(nMap.ceilingKey(7));
		
//		 for (Integer i : nMap.keySet()) { 
//			 
//			 System.out.println(nMap.get(i));
//			 
//		 }
//
//		for (Map.Entry<Integer, String> i : nMap.entrySet()) {
//			
//		System.out.println(i.getKey() + " " + i.getValue());
//
//		}

		Iterator<Integer> ief = ef.keySet().iterator();

//		while (ief.hasNext()) {
//
//			System.out.println(ef.get(ief.next()));
//		}

		// java8

		// Stream.of(dataMap);
		// System.out.println(l);
	}
}
