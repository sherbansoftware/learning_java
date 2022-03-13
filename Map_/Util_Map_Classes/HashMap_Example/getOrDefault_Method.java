package Map_.Util_Map_Classes.HashMap_Example;

import java.util.HashMap;
import java.util.Map;

public class getOrDefault_Method {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<> ();
        map.put (1, "One");
        map.put (3, "Three");
        map.put (5, "Five");
        map.put (7, "Seven");
        map.put (9, "Nine");

        System.out.println (map.getOrDefault (9, "Ten"));

    }
}
