package Object.Notify;

// https://www.baeldung.com/java-wait-notify#1-notify

/*                                                      notify()

    For all threads waiting on this object's monitor (by using any one of the wait() methods), the method notify()
        notifies any one of them to wake up arbitrarily.

    The choice of exactly which thread to wake is nondeterministic and depends upon the implementation.

    Since notify() wakes up a single random thread, we can use it to implement mutually exclusive locking where threads
        are doing similar tasks.

    But in most cases, it would be more viable to implement notifyAll().

                                                        NOTE

*/


public class Notify {
}
