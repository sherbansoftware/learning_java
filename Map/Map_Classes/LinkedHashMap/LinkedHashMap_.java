package Map.Map_Classes.LinkedHashMap;
import java.util.*;

// https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html

 /*


                                                           NOTE

            * insertion order is preserved
            * enhanced hashmap
            * used for developing cache based applications
            * What is cache based application?

                  Based on the application needs, the caching layers would include a session cache for storing a user's
                      session data, a Content Delivery Network for serving static content, and a database cache for
                      frequently accessed data such as the customer's 10 most recent purchases.

  */


public class  LinkedHashMap_<K,V> extends HashMap<K,V>  implements Map<K,V>
{
	LinkedHashMap lhm;

}


