package Map_.Util_Map_Classes.HashMap_Example;

import java.util.HashMap;
import java.util.Map;

public class PutAll_Method {
    public static void main(String[] args)
    {

        // Initializing a Map of type HashMap
        Map<Integer, String> map = new HashMap<> ();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        System.out.println(map);

        Map<Integer, String> mp = new HashMap<>();
        mp.put(10, "Ten");
        mp.put(30, "Thirty");
        mp.put(50, "Fifty");
        mp.put(60, "Fifty");
        mp.put(70, "Fifty");
        mp.put(80, "Fifty");
      // Copies all of the mappings from the specified map to this map (optional operation).

        mp.putAll(map);

        System.out.println(mp);
    }
}
