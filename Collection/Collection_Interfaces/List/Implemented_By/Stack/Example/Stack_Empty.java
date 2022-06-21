package Collection.Collection_Interfaces.List.Implemented_By.Stack.Example;

import java.util.Stack;

/**
    Tests if this stack is empty.

        @return  true  if and only if this stack contains no items;
               false  otherwise.

             public boolean empty() {
                 return size() == 0;
             }
 */

public class Stack_Empty {
    public static void main(String[] args) {
//creating an instance of Stack class
        Stack<Integer> stk = new Stack<>();
// checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
// pushing elements into stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
//prints elements of the stack
        System.out.println("Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
