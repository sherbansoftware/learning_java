package Map_.Functional_Operations_In_Map;

import java.util.HashMap;
import java.util.Map;

public class Functional_Operations_Example {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<> ();

        map.put ("key1", "element 1");
        map.put ("key2", null);
        map.put ("key3", "element 3");
        map.put ("key4","element 4");

        //compute() ---------------------------------------------------------------------------------------------------

        //The Map compute() method takes a key object and a lambda expression as parameters. The lambda expression must
        // implement the java.util.function.BiFunction interface. Here is an example of calling the Java Map compute() method:

        map.compute ("key4", (key, value) -> value == null ? null : value.toUpperCase () + " ok");

        // IMPORTANT:
        // If the lambda expression returns null, the entry is removed. There will not be a key -> null mapping stored
        // in the Map.
        // It the lambda expression throws an exception, the entry is also removed.

//        for(Map.Entry<String,String> entry : map.entrySet ()) {
//            System.out.println ("Key " + entry.getKey () + " Value " + entry.getValue ());
//        }

        // computeIfAbsent() ------------------------------------------------------------------------------------------

        //The Map computeIfAbsent() method works similarly to the compute() method, but the lambda expression is only called
        // if no entry exists already for the given key.
        // The value returned by the lambda expression is inserted into the Map. If null is returned, no entry is inserted.
        // If an exception is thrown by the lambda expression, no entry is inserted either.

//         map.computeIfAbsent("key2", (key) -> "Insert instead of null value");
//
//        for(Map.Entry<String,String> entry : map.entrySet ()) {
//            System.out.println ("Key " + entry.getKey () + " Value " + entry.getValue ());
//        }

        // computeIfPresent() ------------------------------------------------------------------------------------------

        // The Map computeIfPresent() method works oppositely of computeIfAbsent(). It only calls the lambda expression
        // passed as parameter to it, if an entry already exists in the Map for that key. Here is an example of calling
        // the computeIfPresent() method:

//        map.computeIfPresent ("key3", (key, value) -> value == null ? null : value.toString ().toUpperCase ());
//
//        for (Map.Entry<String, String> entry : map.entrySet ()) {
//            System.out.println ("Key " + entry.getKey () + " Value " + entry.getValue ());
//        }

       // merge() ------------------------------------------------------------------------------------------------------

        //The Map merge() method takes a key, a value, and a lambda expression implementing the BiFunction interface as parameters.
        //If the Map does not have an entry for the key, or if the value for the key is null, the value passed as parameter
        //to the merge() method is inserted for the given key.If, however, an existing value is already mapped to the
        // given key, the lambda expression passed as parameter is called instead. The lambda expression thus gets a chance
        // to merge the existing value with a new value. The value returned by the lambda expression is then inserted into
        // the Map for the given key. If the lambda expression returns null, the entry for the given k

        map.merge("key4", "XYZ", (oldValue, newValue) -> newValue + "-abc");

    }
}
