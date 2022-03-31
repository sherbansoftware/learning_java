package Map.Map_Classes.HashMap.Example;

import java.util.HashMap;
import java.util.Map;

public class forEach_Method {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<> ();
        map.put (1, "One");
        map.put (3, "Three");
        map.put (5, "Five");
        map.put (7, "Seven");
        map.put (9, "Nine");

        map.forEach ((k, v) ->  System.out.println ("Key " + k + " Value " + v));


    }
}
