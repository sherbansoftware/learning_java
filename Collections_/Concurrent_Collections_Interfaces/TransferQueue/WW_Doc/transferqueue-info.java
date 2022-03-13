package Collections_.Concurrent_Collections_Interfaces.TransferQueue.WW_Doc;


/*                                          TransferQueue

    https://www.geeksforgeeks.org/transferqueue-interface-in-java/

    The TransferQueue is a BlockingQueue in which a sending thread(producer) may wait for the receiving thread(consumers)
        to receive elements. TransferQueue is used in message-passing applications. There are two aspects in which the
        message will be passed from Producer thread to Consumer thread.

        • put(E e): This method is used if the producer wants to enqueue elements without waiting for a consumer.
            However, it waits till the space becomes available if the queue is full.

       • transfer(E e): This method is generally used to transfer an element to a thread that is waiting to receive it, i
        f there is no thread waiting then it will wait till a thread comes to the waiting state as soon as the waiting
        thread arrives element will be transferred into it.

                                        Implementing Classes

    The TransferQueue has one Implementing class which is:

         • LinkedTransferQueue.

     The LinkedTransferQueue is an unbounded implementation of TransferQueue interface based on linked nodes.


 */