package Collections.Collections_Classes.ArrayList;

// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

/*                                                     Java ArrayList

    Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit.
        We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in
        the java.util package.


                             Important differences between ArrayList and LinkedList method.

No.        Key                         ArrayList                                          LinkedList

1       Internal             ArrayList internally uses a  dynamic           LinkedList uses Doubly Linked List to
     Implementation              array to store its elements.                   store its elements.


2    Manipulation             ArrayList is slow as array                  LinkedList is faster being node based as
                               manipulation is slower.                       not much bit shifting required.

3   Implementation            ArrayList implements only List.             LinkedList implements List as well as Queue.
                                                                             It can acts as a queue as well.

4     Access              ArrayList is faster in storing                 LinkedList is faster in manipulation of data.
                              and accessing data.

5     Retrieving                 Best choice                                         Not recommended
        operation
                                                       NOTE

            * can contain duplicate elements.
            * maintains insertion order.
            * is non synchronized (thread safe)
            * it allows random access because the array works on an index basis.
            * In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs
                  to occur if any element is removed from the array list.
            * We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use
                  the required wrapper class in such cases. For example:

                      - ArrayList<int> al = ArrayList<int>(); // does not work
                      - ArrayList<Integer> al = new ArrayList<Integer>(); // works fine

            * Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according
                  to the elements getting added or removed from the list.

            * Are two methods by which we can get the synchronized version of ArrayList:

                  - using Collections.synchronizedList() method
                  - using CopyOnWriteArrayList class

            * Time complexity of the common operations at a high level:

                   - add() – takes O(1) time; however, worst-case scenario, when a new array has to be created and all
                         the elements copied to it, it's O(n)
                   - add(index, element) – on average runs in O(n) time get() – is always a constant time O(1) operation
                   - remove() – runs in linear O(n) time. We have to iterate the entire array to find the element qualifying
                         for removal.
                   - indexOf() – also runs in linear time. It iterates through the internal array and checks each element
                         one by one, so the time complexity for this operation always requires O(n) time.
                   - contains() – implementation is based on indexOf(), so it'll also run in O(n) t



*/


import java.util.ArrayList;

public class ArrayList_ {
    ArrayList al;
}
