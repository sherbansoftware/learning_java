package Map_.Util_Map_Classes.HashMap_Example;

import java.util.HashMap;

public class replaceAll_Method {
    public static void main(String[] args)
    {

        // create a HashMap having some entries
        HashMap<String, Integer>
                map1 = new HashMap<>();
        map1.put("key1", 1);
        map1.put("key2", 2);
        map1.put("key3", 3);
        map1.put("key4", 4);

        // print map details
        System.out.println("HashMap1: "
                + map1.toString());

        // replace oldValue with square of oldValue
        // using replaceAll method
        map1.replaceAll((key, oldValue)
                -> oldValue * oldValue);

        // print new mapping
        System.out.println("New HashMap: "
                + map1);
    }
}

