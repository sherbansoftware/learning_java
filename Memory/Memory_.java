package Memory;

//  http://tutorials.jenkov.com/java-concurrency/java-memory-model.html#javas-logic-memory-model


/*                                     Run-Time Data Areas


    ○ The JVM defines various memory areas to execute a Java program.

                  * These are used during runtime and are known as run-time data areas.

    ○ Some of these areas

                  * are created on the

                                - JVM start-up

                                - and destroyed when the JVM exits

                  * while some are created when

                                 - a thread is created

                                 - and destroyed when a thread exits.


                            1. Method Area  - also known as permanent generation space (PermGen)


    ○ Basically, method area is analogous to the

                  * storage area for compiled code.

    ○ It stores structures such as

                  * run-time constant pool,

                  * field

                  * and method data,

                  * the code for methods

                  * and constructors

                  * as well as fully qualified class names.

          The JVM stores these structure for each and every class.

    ○ The method area, also known as permanent generation space (PermGen),

                  * is created when the JVM starts up.

          The memory for this area does not need to be contiguous.

    ○ All the JVM threads share this memory area.


                                            2. Heap Area


    ○ The JVM allocates the memory for

                  * all the class instances

                  * and arrays from this area.

    ○ Garbage Collector (GC) reclaims the heap memory for objects.

    ○ Basically, GC has three phases to reclaim memory from
        objects viz. two minor GC and one major GC.

    ○ The heap memory has three portions:

                * Eden Space

                      – it's a part of Young Generation space. When we create an object, the JVM allocates memory from
                            this space

                * Survivor Space

                       – it's also a part of Young Generation space. Survivor space contains existing objects which have
                             survived the minor GC phases of GC

                 * Tenured Space

                        – this is also known as the Old Generation space. It holds long surviving objects. Basically,
                              a threshold is set for Young Generation objects and when this threshold is met, these objects
                              are moved to tenured space.

            JVM creates heap area as soon as it starts up. All the threads of the JVM share this area. The memory for the
                heap area does not need to be contiguous.

                                                3. Stack area

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

                                                 4. PC Registers

        Each JVM thread has a separate PC Register which stores the address of the currently executing instruction.If the
            currently executing instruction is a part of the native method then this value is undefined.

                                                5. Native method stacks

        Native methods are those which are written in languages other than Java.
        JVM provides capabilities to call these native methods.
        Native method stacks are also known as:

                “C stacks”.

        They store the native method information. Whenever the native methods are compiled into machine codes, they
            usually use a native method stack to keep track of their state.

        The JVM creates these stacks whenever it creates a new thread. And thus JVM threads don't share this area.


                                                     NOTE



 */

public class Memory_ {
}
