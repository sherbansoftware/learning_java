package Map_.miscelanous;


import java.util.Hashtable;
import java.util.Map;

public class HashTable_Class {

	public static void main(String[] args) {
		Map<Integer, String> ef = new Hashtable<>();
		ef.put(0, "APPLE");
		ef.put(1, "PEAR");
		ef.put(2, "BANANA");
		//ef.put(null,"GRAPES");//null is not permitted
		// key set
		/*for (Integer i : ef.keySet()) {
			System.out.println(ef.get(i));
		}*/
		for (Map.Entry<Integer,String> i : ef.entrySet()) {
			System.out.println(i);
		}

	}

}
