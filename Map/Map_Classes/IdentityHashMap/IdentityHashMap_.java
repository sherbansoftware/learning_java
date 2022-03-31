package Map.Map_Classes.IdentityHashMap;

// https://docs.oracle.com/javase/8/docs/api/java/util/IdentityHashMap.html

/*

    This class implements the Map interface with a hash table, using reference-equality in place of object-equality when
        comparing keys (and values). In other words, in an IdentityHashMap, two keys k1 and k2 are considered equal if
        and only if (k1==k2). (In normal Map implementations (like HashMap) two keys k1 and k2 are considered equal if
        and only if (k1==null ? k2==null : k1.equals(k2)).)

                                                               NOTE

            * This class is not a general-purpose Map implementation! While this class implements the Map interface,it
                  intentionally violates Map's general contract, which mandates the use of the equals method when comparing
                  objects. This class is designed for use only in the rare cases wherein reference-equality semantics are required.

 */

import java.util.IdentityHashMap;

public class IdentityHashMap_ {
    IdentityHashMap ihm;
}
