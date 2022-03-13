package Map_.Map_Iteration_Method;

import java.util.HashMap;
import java.util.Map;

public class Map_Iteration {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<> ();

        map.put ("one", "firstValue");
        map.put ("two", "secondValue");
        map.put ("three", "thirdValue");

        // Using a Key Stream -----------------------------------------------------------------------------------------

        // Stream<String> stream = map.keySet ().stream ();

            map.keySet ().forEach ((key) -> {
                System.out.println ("Key " + key + "Value " + map.get (key));
            });

          // Using a Value Stream --------------------------------------------------------------------------------------

//                    map.values().forEach((value) -> {
//                        System.out.println(value);
//                    });

          //Using a keySet For-Each Loop -------------------------------------------------------------------------------

//            for (String key : map.keySet ()) {
//                System.out.println ("Key :" + key + " Value: " + map.get (key));
//            }

                                  // Using a Value For-Each Loop

//                             for(String value : map.values()){
//                                  System.out.println(value);
//                              }


              // Using an Entry For-Each Loop of a Java Map -------------------------------------------------------------

//                                for(Map.Entry<String,String> entry : map.entrySet ()) {
//                                    System.out.println ("Key " + entry.getKey ());
//                                    System.out.println ("Value" + entry.getValue ());
//                                }


    }
}
