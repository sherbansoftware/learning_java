package Collection.Collection_Classes.Stack;

// https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

// All Implemented Interfaces:
//Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess

/*                                                  The stack

    is a linear, dynamic data structure that is used to store the collection of objects.It is based on Last-In-First-Out (LIFO).
        Java collection framework provides many interfaces and classes to store the collection of objects.
    It extends class Vector with five operations that allow a vector to be treated as a stack

boolean        - empty()

              Tests if this stack is empty.

E	           - peek()

              Looks at the object at the top of this stack without removing it from the stack.

E	           - pop()

              Removes the object at the top of this stack and returns that object as the value of this function.

E	           - push(E item)

              Pushes an item onto the top of this stack.It is not synchronized

int	           - search(Object o)

              Returns the 1-based position where an object is on this stack.

                                                      NOTE

            * implements Stack data structure
            * Allows duplicate elements
            * Insertion order is preserved
            * Accepts heterogeneous elements
            * Stack class allows null elements, but it is usually not recommended to insert nulls.
            * A more complete and consistent set of LIFO stack operations is provided by the

                        Deque interface and its implementations,

               which should be used in preference to this class. For example:

                        Deque<Integer> stack = new ArrayDeque<Integer>();

 */

import java.util.Stack;

public class Stack_ {

    Stack stack;
}
