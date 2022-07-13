package Collection_Framework.Collection_Classes.Stack;

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

import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Vector;


/**
    ○ The  Stack class represents a last-in-first-out (LIFO) stack of objects.

                   * It extends class Vector with five operations that allow a vector to be treated as a stack.

    ○ The usual push and pop operations are provided, as well as a method to  peek at the top item on the stack,
           a method to test  for whether the stack is  empty, and a method to  search the stack for an item and 
       discover how far it is from the top.
 
    ○ When a stack is first created, it contains no items.
 
    ○ A more complete and consistent set of LIFO stack operations is provided 
       
                  * by the Deque interface and its implementations,

                  * which should be used in preference to this class.
 
    ○ For example:

                  * Deque<Integer> stack = new ArrayDeque<Integer>();
 *
 * @author  Jonathan Payne
 * @since   1.0
 */

public class Stack_<E> extends Vector<E> {
    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = 1224463164541339165L;

    /**
     * Creates an empty Stack.
     */
    public Stack_() {
    }

    /**
     * Pushes an item onto the top of this stack. This has exactly
     * the same effect as:
     * <blockquote><pre>
     * addElement(item)</pre></blockquote>
     *
     * @param   item   the item to be pushed onto this stack.
     * @return  the  item} argument.
     * @see     java.util.Vector#addElement
     */
    public E push(E item) {
        addElement(item);

        return item;
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return  The object at the top of this stack (the last item
     *          of the  Vector object).
     * @throws EmptyStackException  if this stack is empty.
     */
    public synchronized E pop() {
        E       obj;
        int     len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return  the object at the top of this stack (the last item
     *          of the  Vector} object).
     * @throws  EmptyStackException  if this stack is empty.
     */
    public synchronized E peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    /**
     * Tests if this stack is empty.
     *
     * @return   true} if and only if this stack contains
     *          no items;  false} otherwise.
     */
    public boolean empty() {
        return size() == 0;
    }

    /**
     * Returns the 1-based position where an object is on this stack.
     * If the object  o} occurs as an item in this stack, this
     * method returns the distance from the top of the stack of the
     * occurrence nearest the top of the stack; the topmost item on the
     * stack is considered to be at distance  1}. The  equals}
     * method is used to compare  o} to the
     * items in this stack.
     *
     * @param   o   the desired object.
     * @return  the 1-based position from the top of the stack where
     *          the object is located; the return value  -1}
     *          indicates that the object is not on the stack.
     */
    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }
}

