package Collections.Collections_Interfaces.List.Implemented_By.Stack.Example;

import java.util.Stack;

/**
 * Removes the object at the top of this  stack and returns that object as the value of this function.
 *
 * @return The object at the top of this  stack (the last item of the Vector object).
 * @throws // java.util.Empty stackException  if this  stack is empty.
 * <p>
 * public synchronized E pop() {
 * E       obj;
 * int     len = size();
 * <p>
 * obj = peek();
 * removeElementAt(len - 1);
 * <p>
 * return obj;
 * }
 */

public class Stack_Pop {
    public static void main(String args[]) {
        // Creating an empty  stack
        Stack<String> stack = new Stack<String>();

        // Use add() method to add elements
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the  stack
        System.out.println("Initial  stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: " +  stack.pop());
        System.out.println("Popped element: " +  stack.pop());

        // Displaying the  stack after pop operation
        System.out.println(" stack after pop operation " + stack);
    }
}

