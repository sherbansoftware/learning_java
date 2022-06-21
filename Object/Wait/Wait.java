package Object.Wait;

//  https://www.baeldung.com/java-wait-notify

/*                                                        The wait() Method

    Simply put, calling wait() forces the current thread to wait until some other thread invokes notify() or notifyAll()
        on the same object.

    For this, the current thread must own the object's monitor. According to Javadocs, this can happen in the following ways:

            * when we've executed synchronized instance method for the given object
            * when we've executed the body of a synchronized block on the given object
            * by executing synchronized static methods for objects of type Class

        Note that only one active thread can own an object's monitor at a time.

    This wait() method comes with three overloaded signatures. Let's have a look at these.

                                                   3.1. wait()

    The wait() method causes the current thread to wait indefinitely until another thread either invokes notify() for this
        object or notifyAll().

                                                 3.2. wait(long timeout)

    Using this method, we can specify a timeout after which a thread will be woken up automatically. A thread can be woken
        up before reaching the timeout using notify() or notifyAll().

        Note that calling wait(0) is the same as calling wait().


                                                3.3. wait(long timeout, int nanos)

    This is yet another signature providing the same functionality. The only difference here is that we can provide higher
        precision.

    The total timeout period (in nanoseconds) is calculated as 1_000_000*timeout + nanos.

                                                            NOTE


 */



public class Wait {
}
