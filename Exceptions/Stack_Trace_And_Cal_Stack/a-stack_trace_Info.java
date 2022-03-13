package Exceptions.Stack_Trace_And_Cal_Stack;

/*
*   ---------------------------------------call stack-------------------------------------------------------------------

         prints a stack trace which is showing the call stack

    call stack---------------------------------------------------------------------------------------------------------

        is a list of all the methods calls at any particular point in a program's execution
        it's all the method calls at the point where the program crashed.

    each thread of execution has its own call stack---------------------------------------------------------------------

        and the thread is shown as the first line of the stack trace and here its our main thread
        so every time a new method is called it's actually placed onto the stack and when a exception happened
        Access to this memory is in Last-In-First-Out (LIFO) order
        eventually if nothing handles the exception in the the main Java entry
        point just prints the stack trace and the Java Runtime terminates

        the subclasses exists to provide more granularity so that code can check the different types of errors by
        catching the subclasses


 */