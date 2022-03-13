package Map_.Util_Map_Classes.EnumMap_Example;

import Map_.miscelanous.HashMap_Class.Fruits;

import java.util.Map;

public class EnumMap_Class {
	public static void main(String[] args) {

		java.util.EnumMap<Fruits, String> ef = new java.util.EnumMap<>(Fruits.class);
		ef.put(Fruits.APPLE, "APPLE");
		ef.put(Fruits.PEAR, "PEAR");
		ef.put(Fruits.BANANA, "BANANA");
		// ef.put(null, "GRAPES"); null key is not permitted here
		for (Map.Entry<Fruits, String> f : ef.entrySet()) {
			System.out.println(f);
		}
		
//System.out.println(ef);
	}
}
