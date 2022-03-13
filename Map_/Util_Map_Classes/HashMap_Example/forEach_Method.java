package Map_.Util_Map_Classes.HashMap_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEach_Method {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<> ();
        map.put (1, "One");
        map.put (3, "Three");
        map.put (5, "Five");
        map.put (7, "Seven");
        map.put (9, "Nine");

        List<String> listValues = new ArrayList<> ();

        map.forEach ((k, v) ->  System.out.println ("Key " + k + " Value " + v));


    }
}
