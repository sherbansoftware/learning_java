package Data_Structures.Non_Primitive.Linear.Dynamic.Stack;

import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Vector;

// https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

/**
                                                  A Stack

     Abstract data type

             - dictate what operations can do on the items
             - does not care how data is stored

     Stack can be backed with any data structure but LinkedList is ideal and Array if we know the size of the stack.

     Linear data structure that follows the LIFO (Last-In-First-Out) principle. Stack has one end, whereas the
          Queue has two ends (front and rear). It contains only one pointer top pointer pointing to the topmost element
          of the stack. Whenever an element is added in the stack, it is added on the top of the stack, and the element
          can be deleted only from the stack. In other words, a stack can be defined as a container in which insertion
          and deletion can be done from the one end known as the top of the stack.

      Some key points related to stack:

          It is called as stack because it behaves like a real-world stack, piles of books, etc.
          A Stack is an abstract data type with a pre-defined capacity, which means that it can store the elements of
          a limited size.
          It is a data structure that follows some order to insert and delete the elements, and that order can be
          LIFO or FILO.

                                                 Standard Stack Operations

          push():

              When we insert an element in a stack then the operation is known as a push.
              If the stack is full then the

                  overflow condition occurs.

          pop():
               When we delete an element from the stack, the operation is known as a pop. If the stack is empty means
               that no element exists in the stack, this state is known as an

                  underflow state.

          isEmpty():

                It determines whether the stack is empty or not.

          isFull():

                It determines whether the stack is full or not.'

           peek():
                 It returns the element at the given position.

           count():
                 It returns the total number of elements available in a stack.

           change():

                 It changes the element at the given position.

           display():

                  It prints all the elements available in the stack.

           Create a stack:

                 Stack<String> stack = new Stack<String>();
                 stack.push("1");

                                                 Time Complexity

    if we are using a linked list, the

                push, pop, and peek

        operations are  going to be O(1)

    if we were to use an array,

               then push could

        be O(n) linear time  because if the array is full, we'd have to resize the array, and we'd have to copy all the
            existing elements on the stack over to the new array.

                                                       NOTE


             * The Stack class represents a last-in-first-out (LIFO) stack of objects. It extends class Vector with five
                   operations that allow a vector to be treated as a stack.

             * The usual push and pop operations are provided, as well as a  method to peek at the top item on the stack,
                   a method to test  for whether the stack is empty, and a method to search the stack for an item and
                   discover how far it is from the top.

             * When a stack is first created, it contains no items.

             * A more complete and consistent set of LIFO stack operations is  provided by the {@link Deque} interface
                   and its implementations, which should be used in preference to this class.

             * For example:

                          Deque<Integer> stack = new ArrayDeque<Integer>()

 * @author  Jonathan Payne
 * @since   JDK1.0
 */
public class Stack_<E> extends Vector<E> {
    /**
     * Creates an empty Stack.
     */
    public Stack_() {
    }

    /**
     * Pushes an item onto the top of this stack. This has exactly the same effect as:
     * <blockquote><pre>
     * addElement(item)</pre></blockquote>
     *
     * @param   item   the item to be pushed onto this stack.
     * @return  the item argument.
     * @see     Vector#addElement
     */
    public E push(E item) {
        addElement(item);

        return item;
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return  The object at the top of this stack (the last item
     *          of the Vector object).
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
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return  the object at the top of this stack (the last item
     *          of the Vector object).
     * @throws  EmptyStackException  if this stack is empty.
     */
    public synchronized E peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    /**
     * Tests if this stack is empty.
     *
     * @return  true if and only if this stack contains
     *          no items; false otherwise.
     */
    public boolean empty() {
        return size() == 0;
    }

    /**
     * Returns the 1-based position where an object is on this stack.
     * If the object o occurs as an item in this stack, this
     * method returns the distance from the top of the stack of the
     * occurrence nearest the top of the stack; the topmost item on the
     * stack is considered to be at distance 1. The equals
     * method is used to compare o to the
     * items in this stack.
     *
     * @param   o   the desired object.
     * @return  the 1-based position from the top of the stack where
     *          the object is located; the return value -1
     *          indicates that the object is not on the stack.
     */
    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = 1224463164541339165L;
}
