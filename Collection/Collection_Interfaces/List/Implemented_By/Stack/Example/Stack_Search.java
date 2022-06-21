package Collection.Collection_Interfaces.List.Implemented_By.Stack.Example;

import java.util.Stack;

/**
    Returns the 1-based position where an object is on this stack.If the object o occurs as an item in this stack, this
        method returns the distance from the top of the stack of the occurrence nearest the top of the stack; the topmost
        item on the stack is considered to be at distance 1.The equals method is used to compare o to the items in this stack.

  @param  // o   the desired object.
  @return  the 1-based position from the top of the stack where the object is located; the return value  -1
           indicates that the object is not on the stack.

public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
        return size() - i;
        }
        return -1;
        }

 */

public class Stack_Search {
    public static void main(String[] args) {


    // Creating an empty Stack
    Stack<String> STACK = new Stack<String>();

    // Stacking strings
        STACK.push("Geeks");
        STACK.push("4");
        STACK.push("Geeks");
        STACK.push("Welcomes");
        STACK.push("You");
        STACK.push("Last");

    // Displaying the Stack
        System.out.println("The stack is: " + STACK);

    // Checking for the element "4"
        System.out.println("Does the stack contains '4'? " + STACK.search("4"));

    // Checking for the element "Hello"
        System.out.println("Does the stack contains 'Hello'? " + STACK.search("Hello"));

    // Checking for the element "Geeks"
        System.out.println("Does the stack contains 'Geeks'? "  + STACK.search("Geeks"));
}
}



