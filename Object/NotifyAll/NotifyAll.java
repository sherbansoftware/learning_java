package Object.NotifyAll;

// https://www.baeldung.com/java-wait-notify#1-notify

/*                                                        notifyAll()

    This method simply wakes all threads that are waiting on this object's monitor.

    The awakened threads will complete in the usual manner, like any other thread.

    But before we allow their execution to continue, always define a quick check for the condition required to proceed
        with the thread.

    This is because there may be some situations where the thread got woken up without receiving a notification
        (this scenario is discussed later in an example).

 */

public class NotifyAll {
}
