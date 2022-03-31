package Collections.Collections_Classes.Vector;

//https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html

/*                                      The Vector class

    implements a growable array of objects.Like an array, it contains components that can be accessed using an integer
        index. However, the size of a Vector can grow or shrink as needed to accommodate adding and removing items after
        the Vector has been created.
    The iterators returned by this class's
            iterator and listIterator methods are fail-fast:
            if the vector is structurally modified at any time after the iterator is created, in any way except through
            the iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException.Thus,
            in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary,
            non-deterministic behavior at an undetermined time in the future.
    The Enumerations returned by the elements method are not fail-fast.

                                                       NOTE

            * Allows duplicate elements
            * Insertion order is preserved
            * Accepts heterogeneous objects
            * Vector accept null value
            * Vector is thread-safe (all methods in Vector are synchronized)
            * Implements Serializable,Cloneable, RandomAccess interfaces
            * Performance is low
            * legacy class
            * Vector doubles the size of itself by default when grows.
            * iterator and listIterator methods are fail-fast
            * It can be considered as Legacy code.There is nothing about Vector which List collection cannot do.Therefore
                  Vector should be avoided. If there is a need of thread-safe operation make ArrayList synchronized as
                  discussed in the next section of this post or use CopyOnWriteArrayList which is a thread-safe variant
                  of ArrayList.

 */

import java.util.Vector;

public class Vector_ {

    Vector vector;
}
