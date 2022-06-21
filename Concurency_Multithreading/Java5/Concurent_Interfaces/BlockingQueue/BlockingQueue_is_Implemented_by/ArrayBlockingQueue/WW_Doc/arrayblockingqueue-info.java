package Concurency_Multithreading.Java5.Concurent_Interfaces.BlockingQueue.BlockingQueue_is_Implemented_by.ArrayBlockingQueue.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ArrayBlockingQueue.html


/*                        ArrayBlockingQueue

    https://www.geeksforgeeks.org/arrayblockingqueue-class-in-java/

                     Differences between ArrayBlockingQueue and LinkedBlockingQueue

    https://www.geeksforgeeks.org/difference-between-arrayblockingqueue-and-linkedblockingqueue/


    ArrayBlockingQueue and LinkedBlockingQueue in Java Collection are the common implementations of the BlockingQueue
        interface.

        • ArrayBlockingQueue:
             ArrayBlockingQueue class and its iterator implement all the optional methods of the Collection and Iterator_Interface
                 interfaces.
             ArrayBlockingQueue is a bounded BlockingQueue --backed by an array.
             Here, bounded means the size of the Queue is finite and fixed.
             Once created, we cannot grow or shrink the size of the Queue. If we try to insert an element into a full
             Queue then it will result in the operation blocking. Similarly, if we try to take an element from an empty
             Queue, then also the operation will be blocked. ArrayBlockingQueue stores the elements in the Queue internally
             in the FIFO (first-in-first-out) order. The element at the head or front of the Queue is the oldest element
             of all the elements present in this queue. The element at the tail of this queue is the newest element of
             all the elements of this queue. The new elements are always inserted at the end or tail of the queue and
             the retrieval operations obtain elements at the head of the queue.

       LinkedBlockingQueue:
         • LinkedBlockingQueue is an optionally-bounded BlockingQueue --backed by linked nodes. Here, optionally-bounded
             means the capacity given to LinkedBlockingQueue is bounded, otherwise, it will be unbounded.
             The capacity can be given as a parameter to the constructor of LinkedBlockingQueue.
             The capacity, if unspecified, is equal to Integer.MAX_VALUE. LinkedBlockingQueue class and its iterator
             implement all the optional methods of the Collection and Iterator_Interface interfaces. LinkedBlockingQueue stores
             the elements in the Queue internally in the FIFO (first-in-first-out) order. The element at the head or
             front of the Queue is the oldest element of all the elements present in this queue. The element at the
             tail of this queue is the newest element of all the elements of this queue. The new elements are always
             inserted at the end or tail of the queue and the retrieval operations obtain elements at the head of the
             queue. Linked queues typically have higher throughput than array-based queues but less predictable
             performance in most concurrent applications.




 */