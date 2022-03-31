package Collections.Collections_Interfaces.List.Implemented_By.Stack.Example;

/**
 * Pushes an item onto the top of this stack. This has exactly the same effect as:
 * <p>
 * addElement(item)
 *
 * @param item   the item to be pushed onto this stack.
 * @return the  item  argument.
 * <p>
 * public E push(E item) {
 * addElement(item);
 * <p>
 * return item;
 * }
 */

import java.util.Stack;

public class Stack_Push {
    public static void main(String[] args) {
//creating an instance of Stack class
        Stack<Integer> stk = new Stack<>();
// pushing elements into stack
        Integer element = stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
//prints elements of the stack
        System.out.println("Elements in Stack: " + stk);
    }

}
