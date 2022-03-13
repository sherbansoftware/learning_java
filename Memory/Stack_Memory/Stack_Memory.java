package Memory.Stack_Memory;

/*                                           Stack Memory_Address in Java

    Stack Memory_Address in Java is used for:

            1. static memory allocation
            2. the execution of a thread.

    It contains:

            * primitive values that are specific to a method
            * and references to objects that are in a heap, referred from the method.

    Access to this memory is in Last-In-First-Out (LIFO) order.

        Whenever a new method is called, a new block on top of the stack is created which contains values specific to
            that method, like primitive variables and references to objects.

  When the method finishes execution, it’s corresponding stack frame is flushed, the flow goes back to the calling method
      and space becomes available for the next method.

                                                NOTE

            * It grows and shrinks as new methods are called and returned respectively

            * Variables inside stack exist only as long as the method that created them is running

            * It's automatically allocated and deallocated when method finishes execution

            * If this memory is full, Java throws java.lang.StackOverFlowError

            * Access to this memory is fast when compared to heap memory

            * This memory is threadsafe as each thread operates in its own stack




*/

public class Stack_Memory {
}
