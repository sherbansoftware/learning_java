package Map.Map_Classes.HashMap;

// public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

/*                                                HashMap

    Java HashMap is a hash table based implementation of Java's Map interface. A Map, as you might know, is a collection
        of key-value pairs. It maps keys to values.

    HashMap class is roughly equivalent to Hashtable, except that it is:

            * unsynchronized
            * and permits nulls.

                                              java.util.HashMap<K,V>

    Type Parameters:

            K - the type of keys maintained by this map
            V - the type of mapped values

                               An instance of HashMap has two parameters

      that affect its performance:

            * initial capacity
            * load factor.

                                                 Capacity

      is the number of buckets in the hash table, and the initial capacity is simply the capacity at the time the
          hash table is created.

                                                 load factor

    is a measure of how full the hash table is allowed to get before its capacity is automatically increased.


            load factor (lf) = n/k,

        where

             * n is the number of entries occupied in the hash table.
             * k is the number of buckets.

                                                  Collision

    A collision, or more specifically, a hash code collision in a HashMap, is a situation where two or more key objects
        produce the same final hash value and hence point to the same bucket location or array index

                                                    NOTE

            * HashMap cannot contain duplicate keys
            * Heterogeneous elements are allowed as key and values
            * Java HashMap allows null values and the null key (only once)
            * HashMap is an unordered collection. It does not guarantee any specific order of the elements.
            * Best choice for search operation because use hash technique(Hashing) to store the data
            * HashMap have strong references at key level (Dominate Garbage Collector Mechanism)
            * Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.
                   The map should be "wrapped" using the Collections_Class.synchronizedMap method. This is best done at creation
                   time, to prevent accidental unsynchronized access to the map:

                       Map m = Collections_Class.synchronizedMap(new HashMap(...));

            * HashMap()

                  Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).

             * As a general rule, the default load factor (.75) offers a good tradeoff between time and space costs.

                  Higher values decrease the space overhead but increase the lookup cost (reflected in most of the
                  operations of the HashMap class, including get and put). The expected number of entries in the map
                  and its load factor should be taken into account when setting its initial capacity, so as to minimize
                  the number of rehash operations. If the initial capacity is greater than the maximum number of
                  entries divided by the load factor, no rehash operations will ever occur.

             * using many keys with the same hashCode() is a sure way to slow down performance of any hash table. To
                   ameliorate impact, when keys are Comparable, this class may use comparison order among keys to help
                   break ties.

             * hash code of null key is 0.

             * The iterators returned by all of this class's "collection view methods" are fail-fast: if the map is structurally
                   modified at any time after the iterator is created, in any way except through the iterator's own remove
                   method, the iterator will throw a ConcurrentModificationException

             * Since Java 1.8 LinkedList in a bucket can be replaced with a Balanced Tree when the size of the linked list
                   grows beyond a threshold value

              *  Hash  https://mincong.io/2018/04/08/learning-hashmap/

                     Compute the key’s hash, which is used to calculate the index of in array (table). This is the core
                         function in the HashMap. When the key is null, the hash code is set to 0; else, it is computed
                         using key’s hash code (key.hashCode()) and spreading (XOR) higher bits of hash to lower.


                                     static final int hash(Object key) {
                                         int h;
                                     return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
                                     }

              Java XOR Operator (Exclusive OR)

             * The XOR operator is denoted by a carrot (^) symbol. It takes two values and returns true if they are different;
                   otherwise returns false. In binary, the true is represented by 1 and false is represented by 0.

             * Index Calculation

                   Map the hash code to an index in the array. In the simplest way, this could be done by performing a
                       modulo operation on hash code and length of array, such as

                               hash(key) % n.

               Why not using hash as the index directly? Because hash might be greater than the size of range, thus index
                   out of bound. Using modulo ensures that index i is always between 0 and n.

              * HashMap dominate over Garbage Collection mechanism related to clean up key without reference

*/


import java.util.HashMap;

public class HashMap_ {


    public static void main(String[] args) {
        HashMap<Object, String> capitalCities = new HashMap<>();


    }
}
