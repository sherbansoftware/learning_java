package util.concurent.concurent_interfaces.BlockingQueue.BlockingQueue_is_Implemented_by.DelayQueue.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/DelayQueue.html

/*                                           DelayQueue

   https://www.geeksforgeeks.org/delayqueue-class-in-java-with-example/

        DelayQueue is a specialized Priority Queue that orders elements based on their delay time.It means that only
            those elements can be taken from the queue whose time has expired.
        DelayQueue head contains the element that has expired in the least time. If no delay has expired, then there is
            no head and the poll will return null. DelayQueue accepts only those elements that belong to a class of type
            Delayed or those implement java.util.concurrent.Delayed interface. The DelayQueue blocks the elements internally
            until a certain delay has expired. DelayQueue implements the getDelay(TimeUnit.NANOSECONDS) method to return
            the remaining delay time. The TimeUnit instance passed to the getDelay() method is an Enum that tells which
            time unit the delay should be returned in.
             The TimeUnit enum can take

            DAYS, HOURS, MINUTES, SECONDS, MILLISECONDS, MICROSECONDS, NANOSECONDS.

               DAYS
               HOURS
               MINUTES
               SECONDS
               MILLISECONDS
               MICROSECONDS
               NANOSECONDS

            The Delayed interface also extends the java.lang.Comparable interface, as you can see, which means that Delayed
                objects can be compared to each other.
            This is probably used internally in the DelayQueue to order the elements in the queue,
                so they are released ordered by their expiration time.




 */