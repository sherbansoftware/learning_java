package Memory.Memory_Consistency_Errors;

// https://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html


/*                                      Memory consistency errors


    ○ occur when

                  * different threads

                  * have inconsistent views

          of what should be the same data.

    ○  Fortunately, the programmer does not need a detailed understanding of these causes.

    ○ All that is needed is a strategy for avoiding them.

    ○ The key to avoiding memory consistency errors

                  * is understanding the happens-before relationship


                                             Happens-before relationship


    ○ This relationship is simply

                  * a guarantee that

                                - memory writes by one specific statement

                                - are visible to another specific statement.

    ○ To see this, consider the following example. Suppose a simple int field is defined and initialized:

                   int counter = 0;

       The counter field is shared between two threads, A and B. Suppose thread A increments counter:

                   counter++;

      Then, shortly afterwards, thread B prints out counter:

                   System.out.println(counter);

    ○ If the two statements

                   * had been executed in the same thread,

                   * it would be safe to assume that the value printed out would be "1".

            But if the two statements are executed

                   * in separate threads,

                              - the value printed out might well be "0",

            because there's no guarantee that

                   *  thread A's change to counter

                   * will be visible to thread B

            unless the programmer has established a happens-before relationship between these two statements.

    ○ There are several actions that create happens-before relationships.

    ○ One of them is synchronization


 */


public class Memory_Consistency_Errors {
}
