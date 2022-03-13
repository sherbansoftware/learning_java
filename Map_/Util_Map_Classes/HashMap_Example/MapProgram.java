package Map_.Util_Map_Classes.HashMap_Example;

import java.util.HashMap;
import java.util.Map;


public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        // boolean containsValue(lang.classes.Object value)-------------------------------------------------------------------------

        // boolean containsKey(lang.classes.Object key)------------------------------------------------------------------------------

        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        // V put(K key, V value)----------------------------------------------------------------------------------------

            // return old value of this pair

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "first Algol");
        languages.put("Scala", null);
        languages.put(null, "Not null value");
        languages.put("Not null key", null);
        System.out.println(languages.put("Algol", "last Algol"));
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        // void putAll(Map<? extends K, ? extends V> m)-----------------------------------------------------------------



        // int size()--------------------------------------------------------------------------------------------------

            // Returns the number of key-value mappings in this map. If the map contains more than Integer.MAX_VALUE
            // elements, returns Integer.MAX_VALUE
        System.out.println("languages size =" + languages.size());

        // boolean isEmpty()--------------------------------------------------------------------------------------------

        //Returns true if this map contains no key-value mappings.

        // V get(lang.classes.Object key)-------------------------------------------------------------------------------------------

        //Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key.
        // return null if key doesn't exist
        System.out.println("Get null=== " + languages.get("Java"));

        // V remove(lang.classes.Object key) removes the mapping for a key from this map if it is presents --------------------------

        // return null if key not exist
        // return removed value of key
        // System.out.println("BEfore removed" + languages.size());
        System.out.println("removed ------ " + languages.remove("Algol"));
        System.out.println(languages.containsKey("Algol"));
        System.out.println(languages.size());

        // default boolean remove(lang.classes.Object key, lang.classes.Object value)-------------------------------------------------------------
            //true if the value was removed
            //return false if key or value not foud

//        if (languages.remove("Algol", "last Algol")) {
//            System.out.println("Algol removed");
//        } else {
//            System.out.println("Algol not removed, key/value pair not found");
//        }

        // V get(lang.classes.Object key)-------------------------------------------------------------------------------------------

            //Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key
            // return null if key doesn't exist
               // System.out.println("Get null=== " + languages.get("Zuza"));

        //replace elements from map-------------------------------------------------------------------------------------

        // return true if the value was replaced
        //throws NullPointerException if a specified key or newValue is null and this map does not permit null keys or values
        String strep = languages.replace("BASIC", "New basic");
        System.out.println("Replaced ----" + strep);
        if (languages.replace("Lisp", "Therein lies madness", "a functonal program language with imperative features")) {
            System.out.println("Lisp was replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

         // void clear()------------------------------------------------------------------------------------------------

           // languages.clear();

         // Set<K> keySet() ---------------------------------------------------------------------------------------------

            //Returns a  Set view of the keys contained in this map.The set is backed by the map, so changes to the map are
            //reflected in the set, and vice-versa.
            // print values

        // Collection<V> values() --------------------------------------------------------------------------------------
//            Collection<String> langValues = languages.values();
//
//            for (String value : langValues) {
//                System.out.println(value);
//            }

//        Set<String> languagesSet = languages.keySet();
//        Iterator_Interface<String> its = languages.keySet().iterator();
//        while(its.hasNext()) {
//            System.out.println(languages.get(its.next()));
//        }
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        if (languages.keySet().contains("Java") || !languages.isEmpty()) {
//            for (String key : languages.keySet()) {
//                System.out.println(key + " : " + languages.get(key));
//            }
//        } else {
//            System.out.println("Map is empty");
//        }
   }
}
