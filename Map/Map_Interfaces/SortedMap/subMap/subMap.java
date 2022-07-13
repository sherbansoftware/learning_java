package Map.Map_Interfaces.SortedMap.subMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class subMap {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        map.forEach((k, v) -> System.out.println(k + "  " + v));

        Map<Integer, String> subMap = map.subMap(2, map.lastKey());
        System.out.println();
        subMap.forEach((k, v) -> System.out.println(k + " " + v));

    }

}
