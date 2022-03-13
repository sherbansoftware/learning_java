package Collections_.Concurrent_Collections_Interfaces.BlockingDeque.WW_Doc;

/*                                            BlockingDeque

    http://tutorials.jenkov.com/java-util-concurrent/blockingdeque.html

    A BlockingDeque could be used if threads are both producing and consuming elements of the same queue. It could also
        just be used if the producing thread needs to insert at both ends of the queue, and the consuming thread needs
        to remove from both ends of the queue. Here is an illustration of that:

                                                 executorservice.png

            A BlockingDeque - threads can put and take from both ends of the deque.

            A BlockingDeque - threads can put and take from both ends of the deque.

    A thread will produce elements and insert them into either end of the queue. If the deque is currently full, the
       inserting thread will be blocked until a removing thread takes an element out of the deque. If the deque is
       currently empty, a removing thread will be blocked until an inserting thread inserts an element into the deque.

                                 BlockingDeque Extends BlockingQueue

    The BlockingDeque interface extends the BlockingQueue interface. That means that you can use a BlockingDeque as a
        BlockingQueue. If you do so, the various inserting methods will add the elements to the end of the deque, and
        the removing methods will remove the elements from the beginning of the deque. The inserting and removing
        methods of the BlockingQueue interface, that is.



                                         BlockingDeque Implementations

      LinkedBlockingDeque         http://tutorials.jenkov.com/java-util-concurrent/linkedblockingdeque.html


 */