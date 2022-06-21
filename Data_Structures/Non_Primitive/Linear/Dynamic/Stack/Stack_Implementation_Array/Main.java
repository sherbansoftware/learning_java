package Data_Structures.Non_Primitive.Linear.Dynamic.Stack.Stack_Implementation_Array;

import java.util.Enumeration;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        //stack.printStack();

        System.out.println(stack.peek());
        //stack.printStack();

//        System.out.println("Popped: " + stack.pop());
//        System.out.println(stack.peek());


         Stack<Integer> stack1 = new Stack<>();

        System.out.println(stack1.size());
        stack1.add(new Integer(5));
        stack1.add(new Integer(6));
        stack1.add(6);

        Enumeration en = stack1.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
