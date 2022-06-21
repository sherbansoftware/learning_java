package Exceptions.Stack_Trace_And_Cal_Stack;

/*
*   ---------------------------------------call stack-------------------------------------------------------------------
         prints a stack trace which is showing the call stack

    call stack---------------------------------------------------------------------------------------------------------

        is a list of all the methods calls at any particular point in a program's execution
        it's all the method calls at the point where the program crashed.

    each thread of execution--------------------------------------------------------------------------------------------
        has its own call stack and the thread is shown as the first line of the stack trace and here its our main thread
        so every time a new method is called it's actually placed onto the stack and when a exception happened
        Access to this memory is in Last-In-First-Out (LIFO) order
 */

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}
