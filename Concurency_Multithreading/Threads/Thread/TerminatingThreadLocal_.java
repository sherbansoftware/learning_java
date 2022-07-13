package Concurency_Multithreading.Threads.Thread;


import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;

/**
 * A thread-local variable that is notified when a thread terminates and
 * it has been initialized in the terminating thread (even if it was
 * initialized with a null value).
 */
public class TerminatingThreadLocal_<T> extends ThreadLocal_<T> {

    /**
     * a per-thread registry of TerminatingThreadLocal(s) that have been registered
     * but later not unregistered in a particular thread.
     */
    public static final ThreadLocal_<Collection<TerminatingThreadLocal_ <?>>> REGISTRY =
            new ThreadLocal_<>() {
                @Override
                protected Collection<TerminatingThreadLocal_ <?>> initialValue() {
                    return Collections.newSetFromMap(new IdentityHashMap<>(4));
                }
            };

    /**
     * Invokes the TerminatingThreadLocal's {@link #threadTerminated()} method
     * on all instances registered in current thread.
     */
    public static void threadTerminated() {
        for (TerminatingThreadLocal_ <?> ttl : REGISTRY.get()) {
            ttl.threadTerminated();
        }
    }

    /**
     * Register given TerminatingThreadLocal
     *
     * @param tl the ThreadLocal to register
     */
    public static void register(TerminatingThreadLocal_ <?> tl) {
        REGISTRY.get().add(tl);
    }

    // following methods and field are implementation details and should only be
    // called from the corresponding code int Thread/ThreadLocal class.

    /**
     * Unregister given TerminatingThreadLocal
     *
     * @param tl the ThreadLocal to unregister
     */
    private static void unregister(TerminatingThreadLocal_ <?> tl) {
        REGISTRY.get().remove(tl);
    }

    @Override
    public void set(T value) {
        super.set(value);
        register(this);
    }

    @Override
    public void remove() {
        super.remove();
        unregister(this);
    }

    /**
     * Invoked by a thread when terminating and this thread-local has an associated
     * value for the terminating thread (even if that value is null), so that any
     * native resources maintained by the value can be released.
     *
     * @param value current thread's value of this thread-local variable
     *              (may be null but only if null value was explicitly initialized)
     */
    protected void threadTerminated_(T value) {
    }

    private void threadTerminated_() { threadTerminated_(get()); }
}
