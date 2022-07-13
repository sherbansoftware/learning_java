package Map.Map_Interfaces.SortedMap.SimpleExample;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println(hashMap.getClass());
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for (Integer key : map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }

}
