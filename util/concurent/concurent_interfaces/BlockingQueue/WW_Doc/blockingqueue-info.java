package util.concurent.concurent_interfaces.BlockingQueue.WW_Doc;

// java.util.concurrent.BlockingQueue
// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html

/*                                     BlockingQueue

    http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html

        The Java BlockingQueue interface, java.util.concurrent.BlockingQueue, represents a queue which is thread safe
            to put elements into, and take elements out of from. In other words, multiple threads can be inserting and
            taking elements concurrently from a Java BlockingQueue, without any concurrency issues arising.

        The term blocking queue comes from the fact that the Java BlockingQueue is capable of blocking the threads that
            try to insert or take elements from the queue.
        For instance, if a thread tries to take an element and there are none left in the queue, the thread can be blocked
        until there is an element to take.

        Whether or not the calling thread is blocked depends on what methods you call on the BlockingQueue.
        The different methods are explained in more detail later.

                                     BlockingQueue Implementations

    Since BlockingQueue is an interface, you need to use one of its implementations to use it. T
        he java.util.concurrent package has the following implementations of the BlockingQueue interface:

                • ArrayBlockingQueue

    http://tutorials.jenkov.com/java-util-concurrent/arrayblockingqueue.html

                • DelayQueue

    http://tutorials.jenkov.com/java-util-concurrent/delayqueue.html

                • LinkedBlockingQueue

    http://tutorials.jenkov.com/java-util-concurrent/linkedblockingqueue.html

                • LinkedBlockingDeque

    http://tutorials.jenkov.com/java-util-concurrent/linkedblockingdeque.html

                • LinkedTransferQueue

    https://tutorialspoint.dev/language/java/linkedtransferqueue-in-java-with-examples

               • PriorityBlockingQueue

    http://tutorials.jenkov.com/java-util-concurrent/priorityblockingqueue.html

               • SynchronousQueue

    http://tutorials.jenkov.com/java-util-concurrent/synchronousqueue.html

*/