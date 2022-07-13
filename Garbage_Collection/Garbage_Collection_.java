package Garbage_Collection;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/System.html


/*                                 What	is	Garbage	Collection?


    ○ Garbage Collection is a name given to

                  * automatic memory management in Java.

    ○ Aim of Garbage Collection is

                  * to Keep as much of heap available (free) for the program as possible.

    ○ JVM REMOVES objects on the heap

                  * which no longer have references from the heap.  -------------------------------------------------


                            Can	you	explain	Garbage	Collection with	an example?


    ○ Let’s say the below method is called from a function.

                   void method(){
				             Calendar	calendar	=	new GregorianCalendar(2000,10,30);
				              System.out.println(calendar);
                     }

    ○ An object of the class GregorianCalendar

                  * is created on the heap by the first line of the function with one reference variable calendar.

                  * After the function ends execution,

                                - the reference variable calendar is no longer valid.

                        Hence, there are no references to the object created in the method.

    ○ JVM recognizes this and

                    * REMOVES the object from the heap.

             This is called Garbage Collection.


                                      When is Garbage Collection run?


    ○ Garbage Collection runs at

                    * the whims and fancies of the JVM (it isn't as bad as that).

    ○ Possible situations when Garbage Collection might run are:

                    * when available memory on the heap is low

                    * when cpu is free


                         GC works in two simple steps, known as Mark and Sweep:


    ○ Mark

                   * this is where the garbage collector identifies

                                 - which pieces of memory are in use

                                 -  and which aren't.

     ○ Sweep

                   * this step removes objects identified during the “mark” phase.

     ○ Advantages:

                   * No manual memory allocation/deallocation handling because unused memory space is automatically handled by GC

                   * No overhead of handling Dangling Pointer

                   * Automatic Memory Leak management (GC on its own can't guarantee the full proof solution to memory leaking;
                     however, it takes care of a good portion of it)

     ○ Disadvantages:

                   * Since JVM has to keep track of object reference creation/deletion,

                   * this activity requires more CPU power than the original application.

           It may affect the performance of requests which require large memory.

                  * Programmers have no control over the scheduling of CPU time dedicated to freeing objects that are
                        no longer needed.

                  * Using some GC implementations might result in the application stopping unpredictably.

                  * Automatized memory management

                                - won't be as efficient

                                - as the proper manual memory allocation/deallocation.


                                                 GC Implementations


    ○ https://www.baeldung.com/jvm-garbage-collectors#gc-implementations

    ○ JVM has five types of GC implementations:

                  * Serial Garbage Collector

                  * Parallel Garbage Collector

                  * CMS Garbage Collector

                  * G1 Garbage Collector

                  * Z Garbage Collector


                                          GC cycle


    ○ is a repeatable process that involves a set of GC operations.

    ○These operations process all or parts of the Java heap.

                  * When operating on the whole of the Java heap,

                                - the cycle is referred to as a global GC cycle;

                  * When operating on part of the heap,

                                 - the cycle is referred to as a partial GC cycle.


                                    What are best practices on Garbage Collection?


    ○ Programmatically,

                   * we can request (remember it’s just a request - Not an order) JVM to run Garbage Collection
                         by calling System.gc() method.

    ○ JVM

                   * might throw an OutOfMemoryException when memory is full

                   * and no objects on the heap are eligible for garbage collection.

     ○ finalize() method on the objected

                   * is run before the object is removed from the heap from the garbage collector.

           We recommend not to write any code in finalize();


 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Garbage_Collection_ {

    System sys;

    public static void main(String[] args) {
        method();
    }

    static void method() {
        Calendar calendar = new GregorianCalendar(2020, 10, 30);
        System.out.println(calendar);
    }
}
