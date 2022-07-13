package Collection_Framework.Collection_Interfaces.List.Implemented_By.Stack.Example;

import java.util.Stack;

/**
    Looks at the object at the top of this  stack without removing it from the  stack.
 
     @return the object at the top of this  stack (the last item  of the Vector object).
     @throws  java.util.EmptyStackException  if this  stack is empty.

  public synchronized E peek() {
  int len = size();

  if (len == 0)
  throw new Empty stackException();
  return elementAt(len - 1);
  }
 **/

public class Stack_Peek {
    public static void main(String args[]) {
        // Creating an empty  stack
        Stack<String> stack = new Stack<String>();

        // Use push() to add elements into the  stack
        stack.push("Welcome");
        stack.push("Welcome");
        stack.push(null);
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the  stack
        System.out.println("Initial  stack: " + stack);

        // Fetching the element at the head of the  stack
        System.out.println("The element at the top of the stack is: " + stack.peek());

        // Displaying the  stack after the Operation
        System.out.println("Final  stack: " + stack);
    }
}
