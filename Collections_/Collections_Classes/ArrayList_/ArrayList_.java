package Collections_.Collections_Classes.ArrayList_;

// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

/*                                                     Java ArrayList

    Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit.
        We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in
        the java.util package.

    public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

                                                       NOTE

            * Java ArrayList class can contain duplicate elements.
            * Java ArrayList class maintains insertion order.
            * Java ArrayList class is non synchronized
            * Java ArrayList allows random access because the array works on an index basis.
            * In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs
                  to occur if any element is removed from the array list.
            * We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use
                  the required wrapper class in such cases. For example:

                      - ArrayList<int> al = ArrayList<int>(); // does not work
                      - ArrayList<Integer> al = new ArrayList<Integer>(); // works fine

            * Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according
                  to the elements getting added or removed from the list.

*/


import java.util.ArrayList;

public class ArrayList_ {
    ArrayList al;
}
