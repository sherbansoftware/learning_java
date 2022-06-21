package Memory.Stack_Memory;



/*                                           Stack Memory in Java

   Stack area

            Stores data as frames and each frame stores local variables, partial results and nested method calls.
                JVM creates the stack area whenever it creates a new thread. This area is private for each thread.
            Each entry in the stack is called

                Stack Frame or Activation record.

            Each frame contains three parts:

                    * Local Variable Array_
                          – contains all the local variables and parameters of the method

                    * Operand Stack
                          – used as a workspace for storing intermediate calculation's result

                    * Frame Data
                          – used to store partial results, return values for methods, and reference to the Exception
                               table which provides corresponding catch block information in case of exceptions

            The memory for the JVM stack does not need to be contiguous.

    Stack Memory in Java is used for:

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
