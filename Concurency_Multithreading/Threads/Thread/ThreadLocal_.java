package Concurency_Multithreading.Threads.Thread;


import java.lang.ref.*;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * This class provides Thread-local variables.These variables differ from
 * their normal counterparts in that each Thread that accesses one (via its
 * {@code get} or {@code set} method) has its own, independently initialized
 * copy of the variable.  {@code Thread_Local} instances are typically private
 * static fields in classes that wish to associate state with a Thread_ (e.g.,
 * a user ID or Transaction ID).
 *
 * <p>For example, the class below generates unique identifiers local to each
 * Thread_.
 * A Thread_'s id is assigned the first time it invokes {@code Thread_Id.get()}
 * and remains unchanged on subsequent calls.
 * <pre>
 * import java.util.concurrent.atomic.AtomicInteger;
 *
 * public class Thread_Id {
 *     // Atomic integer containing the next Thread_ ID to be assigned
 *     private static final AtomicInteger nextId = new AtomicInteger(0);
 *
 *     // Thread_ local variable containing each Thread_'s ID
 *     private static final Thread_Local&lt;Integer&gt; Thread_Id =
 *         new Thread_Local&lt;Integer&gt;() {
 *             &#64;Override protected Integer initialValue() {
 *                 return nextId.getAndIncrement();
 *         }
 *     };
 *
 *     // Returns the current Thread_'s unique ID, assigning it if necessary
 *     public static int get() {
 *         return Thread_Id.get();
 *     }
 * }
 * </pre>
 * <p>Each Thread_ holds an implicit reference to its copy of a Thread_-local
 * variable as long as the Thread_ is alive and the {@code Thread_Local}
 * instance is accessible; after a Thread_ goes away, all of its copies of
 * Thread_-local instances are subject to garbage collection (unless other
 * references to these copies exist).
 *
 * @author  Josh Bloch and Doug Lea
 * @since   1.2
 */
public class ThreadLocal_<T> {
    /**
     * The difference between successively generated hash codes - turns
     * implicit sequential Thread_-local IDs into near-optimally spread
     * multiplicative hash values for power-of-two-sized tables.
     */
    private static final int HASH_INCREMENT = 0x61c88647;
    /**
     * The next hash code to be given out. Updated atomically. Starts at
     * zero.
     */
    private static AtomicInteger nextHashCode =
            new AtomicInteger();
    /**
     * Thread_Locals rely on per-Thread_ linear-probe hash maps attached
     * to each Thread_ (Thread_.Thread_Locals and
     * inheritableThread_Locals).  The Thread_Local objects act as keys,
     * searched via Thread_LocalHashCode.  This is a custom hash code
     * (useful only within ThreadLocalMap_s) that eliminates collisions
     * in the common case where consecutively constructed Thread_Locals
     * are used by the same Thread_s, while remaining well-behaved in
     * less common cases.
     */
    private final int ThreadLocalHashCode = nextHashCode();

    /**
     * Creates a Thread_ local variable.
     * @see #withInitial(Supplier)
     */
    public ThreadLocal_() {
    }

    /**
     * Returns the next hash code.
     */
    private static int nextHashCode() {
        return nextHashCode.getAndAdd(HASH_INCREMENT);
    }

    /**
     * Creates a Thread_ local variable. The initial value of the variable is
     * determined by invoking the {@code get} method on the {@code Supplier}.
     *
     * @param <S> the type of the Thread_ local's value
     * @param supplier the supplier to be used to determine the initial value
     * @return a new Thread_ local variable
     * @throws NullPointerException if the specified supplier is null
     * @since 1.8
     */
    public static <S> ThreadLocal_ <S> withInitial(Supplier<? extends S> supplier) {
        return new ThreadLocal_.SuppliedThreadLocal<>(supplier);
    }

    /**
     * Factory method to create map of inherited Thread_ locals.
     * Designed to be called only from Thread_ constructor.
     *
     * @param  parentMap the map associated with parent Thread_
     * @return a map containing the parent's inheritable bindings
     */
    static ThreadLocal_.ThreadLocalMap_ createInheritedMap(ThreadLocal_.ThreadLocalMap_ parentMap) {
        return new ThreadLocal_ .ThreadLocalMap_(parentMap);
    }

    /**
     * Returns the current Thread_'s "initial value" for this
     * Thread_-local variable.  This method will be invoked the first
     * time a Thread_ accesses the variable with the {@link #get}
     * method, unless the Thread_ previously invoked the {@link #set}
     * method, in which case the {@code initialValue} method will not
     * be invoked for the Thread_.  Normally, this method is invoked at
     * most once per Thread_, but it may be invoked again in case of
     * subsequent invocations of {@link #remove} followed by {@link #get}.
     *
     * <p>This implementation simply returns {@code null}; if the
     * programmer desires Thread_-local variables to have an initial
     * value other than {@code null}, {@code Thread_Local} must be
     * subclassed, and this method overridden.  Typically, an
     * anonymous inner class will be used.
     *
     * @return the initial value for this Thread_-local
     */
    protected T initialValue() {
        return null;
    }

    /**
     * Returns the value in the current Thread_'s copy of this
     * Thread_-local variable.  If the variable has no value for the
     * current Thread_, it is first initialized to the value returned
     * by an invocation of the {@link #initialValue} method.
     *
     * @return the current Thread_'s value of this Thread_-local
     */
    public T get() {
        Thread_ t = Thread_.currentThread();
        ThreadLocal_.ThreadLocalMap_ map = getMap(t);
        if (map != null) {
            ThreadLocal_ .ThreadLocalMap_.Entry e = map.getEntry(this);
            if (e != null) {
                @SuppressWarnings("unchecked")
                T result = (T)e.value;
                return result;
            }
        }
        return setInitialValue();
    }

    /**
     * Returns {@code true} if there is a value in the current Thread_'s copy of
     * this Thread_-local variable, even if that values is {@code null}.
     *
     * @return {@code true} if current Thread_ has associated value in this
     *         Thread_-local variable; {@code false} if not
     */
    boolean isPresent() {
        Thread_ t = Thread_.currentThread();
        ThreadLocal_ .ThreadLocalMap_ map = getMap(t);
        return map != null && map.getEntry(this) != null;
    }

    /**
     * Variant of set() to establish initialValue. Used instead
     * of set() in case user has overridden the set() method.
     *
     * @return the initial value
     */
    private T setInitialValue() {
        T value = initialValue();
        Thread_ t = Thread_.currentThread();
        ThreadLocal_ .ThreadLocalMap_ map = getMap(t);
        if (map != null) {
            map.set(this, value);
        } else {
            createMap(t, value);
        }
        if (this instanceof TerminatingThreadLocal_ ) {
            TerminatingThreadLocal_ .register((TerminatingThreadLocal_ <?>) this);
        }
        return value;
    }

    /**
     * Sets the current Thread_'s copy of this Thread_-local variable
     * to the specified value.  Most subclasses will have no need to
     * override this method, relying solely on the {@link #initialValue}
     * method to set the values of Thread_-locals.
     *
     * @param value the value to be stored in the current Thread_'s copy of
     *        this Thread_-local.
     */
    public void set(T value) {
        Thread_ t = Thread_.currentThread();
        ThreadLocal_ .ThreadLocalMap_ map = getMap(t);
        if (map != null) {
            map.set(this, value);
        } else {
            createMap(t, value);
        }
    }

    /**
     * Removes the current Thread_'s value for this Thread_-local
     * variable.  If this Thread_-local variable is subsequently
     * {@linkplain #get read} by the current Thread_, its value will be
     * reinitialized by invoking its {@link #initialValue} method,
     * unless its value is {@linkplain #set set} by the current Thread_
     * in the interim.  This may result in multiple invocations of the
     * {@code initialValue} method in the current Thread_.
     *
     * @since 1.5
     */
    public void remove() {
        ThreadLocal_ .ThreadLocalMap_ m = getMap(Thread_.currentThread());
        if (m != null) {
            m.remove(this);
        }
    }

    /**
     * Get the map associated with a Thread_Local. Overridden in
     * InheritableThread_Local.
     *
     * @param  t the current Thread_
     * @return the map
     */
    ThreadLocal_.ThreadLocalMap_ getMap(Thread_ t) {
        return t.ThreadLocals;
    }

    /**
     * Create the map associated with a Thread_Local. Overridden in
     * InheritableThread_Local.
     *
     * @param t the current Thread_
     * @param firstValue value for the initial entry of the map
     */
    void createMap(Thread_ t, T firstValue) {
        t.ThreadLocals = new ThreadLocal_ .ThreadLocalMap_(this, firstValue);
    }

    /**
     * Method childValue is visibly defined in subclass
     * InheritableThread_Local, but is internally defined here for the
     * sake of providing createInheritedMap factory method without
     * needing to subclass the map class in InheritableThread_Local.
     * This technique is preferable to the alternative of embedding
     * instanceof tests in methods.
     */
    T childValue(T parentValue) {
        throw new UnsupportedOperationException();
    }

    /**
     * An extension of Thread_Local that obtains its initial value from
     * the specified {@code Supplier}.
     */
    static final class SuppliedThreadLocal<T> extends ThreadLocal_ <T> {

        private final Supplier<? extends T> supplier;

        SuppliedThreadLocal(Supplier<? extends T> supplier) {
            this.supplier = Objects.requireNonNull(supplier);
        }

        @Override
        protected T initialValue() {
            return supplier.get();
        }
    }

    /**
     * ThreadLocalMap_ is a customized hash map suitable only for
     * maintaining Thread_ local values. No operations are exported
     * outside of the Thread_Local class. The class is package private to
     * allow declaration of fields in class Thread_.  To help deal with
     * very large and long-lived usages, the hash table entries use
     * WeakReferences for keys. However, since reference queues are not
     * used, stale entries are guaranteed to be removed only when
     * the table starts running out of space.
     */
    static class ThreadLocalMap_ {

        /**
         * The initial capacity -- MUST be a power of two.
         */
        private static final int INITIAL_CAPACITY = 16;
        /**
         * The table, resized as necessary.
         * table.length MUST always be a power of two.
         */
        private ThreadLocal_ .ThreadLocalMap_.Entry[] table;
        /**
         * The number of entries in the table.
         */
        private int size = 0;
        /**
         * The next size value at which to resize.
         */
        private int threshold; // Default to 0

        /**
         * Construct a new map initially containing (firstKey, firstValue).
         * ThreadLocalMap_s are constructed lazily, so we only create
         * one when we have at least one entry to put in it.
         */
        ThreadLocalMap_(ThreadLocal_ <?> firstKey, Object firstValue) {
            table = new ThreadLocal_.ThreadLocalMap_.Entry[INITIAL_CAPACITY];
            int i = firstKey.ThreadLocalHashCode & (INITIAL_CAPACITY - 1);
            table[i] = new ThreadLocal_.ThreadLocalMap_.Entry(firstKey, firstValue);
            size = 1;
            setThreshold(INITIAL_CAPACITY);
        }

        /**
         * Construct a new map including all Inheritable Thread_Locals
         * from given parent map. Called only by createInheritedMap.
         *
         * @param parentMap the map associated with parent Thread_.
         */
        private ThreadLocalMap_(ThreadLocal_.ThreadLocalMap_ parentMap) {
            ThreadLocal_.ThreadLocalMap_.Entry[] parentTable = parentMap.table;
            int len = parentTable.length;
            setThreshold(len);
            table = new ThreadLocal_.ThreadLocalMap_.Entry[len];

            for (ThreadLocal_.ThreadLocalMap_.Entry e : parentTable) {
                if (e != null) {
                    @SuppressWarnings("unchecked")
                    ThreadLocal_ <Object> key = (ThreadLocal_ <Object>) e.get();
                    if (key != null) {
                        Object value = key.childValue(e.value);
                        ThreadLocal_.ThreadLocalMap_.Entry c = new ThreadLocal_ .ThreadLocalMap_.Entry(key, value);
                        int h = key.ThreadLocalHashCode & (len - 1);
                        while (table[h] != null)
                            h = nextIndex(h, len);
                        table[h] = c;
                        size++;
                    }
                }
            }
        }

        /**
         * Increment i modulo len.
         */
        private static int nextIndex(int i, int len) {
            return ((i + 1 < len) ? i + 1 : 0);
        }

        /**
         * Decrement i modulo len.
         */
        private static int prevIndex(int i, int len) {
            return ((i - 1 >= 0) ? i - 1 : len - 1);
        }

        /**
         * Set the resize threshold to maintain at worst a 2/3 load factor.
         */
        private void setThreshold(int len) {
            threshold = len * 2 / 3;
        }

        /**
         * Get the entry associated with key.  This method
         * itself handles only the fast path: a direct hit of existing
         * key. It otherwise relays to getEntryAfterMiss.  This is
         * designed to maximize performance for direct hits, in part
         * by making this method readily inlinable.
         *
         * @param  key the Thread_ local object
         * @return the entry associated with key, or null if no such
         */
        private ThreadLocal_ .ThreadLocalMap_.Entry getEntry(ThreadLocal_ <?> key) {
            int i = key.ThreadLocalHashCode & (table.length - 1);
            ThreadLocal_ .ThreadLocalMap_.Entry e = table[i];
            if (e != null && e.get() == key)
                return e;
            else
                return getEntryAfterMiss(key, i, e);
        }

        /**
         * Version of getEntry method for use when key is not found in
         * its direct hash slot.
         *
         * @param  key the Thread_ local object
         * @param  i the table index for key's hash code
         * @param  e the entry at table[i]
         * @return the entry associated with key, or null if no such
         */
        private ThreadLocal_.ThreadLocalMap_.Entry getEntryAfterMiss(ThreadLocal_ <?> key, int i, ThreadLocal_ .ThreadLocalMap_.Entry e) {
            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;

            while (e != null) {
                ThreadLocal_ <?> k = e.get();
                if (k == key)
                    return e;
                if (k == null)
                    expungeStaleEntry(i);
                else
                    i = nextIndex(i, len);
                e = tab[i];
            }
            return null;
        }

        /**
         * Set the value associated with key.
         *
         * @param key the Thread_ local object
         * @param value the value to be set
         */
        private void set(ThreadLocal_ <?> key, Object value) {

            // We don't use a fast path as with get() because it is at
            // least as common to use set() to create new entries as
            // it is to replace existing ones, in which case, a fast
            // path would fail more often than not.

            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;
            int i = key.ThreadLocalHashCode & (len-1);

            for (ThreadLocal_ .ThreadLocalMap_.Entry e = tab[i];
                 e != null;
                 e = tab[i = nextIndex(i, len)]) {
                ThreadLocal_ <?> k = e.get();

                if (k == key) {
                    e.value = value;
                    return;
                }

                if (k == null) {
                    replaceStaleEntry(key, value, i);
                    return;
                }
            }

            tab[i] = new ThreadLocal_ .ThreadLocalMap_.Entry(key, value);
            int sz = ++size;
            if (!cleanSomeSlots(i, sz) && sz >= threshold)
                rehash();
        }

        /**
         * Remove the entry for key.
         */
        private void remove(ThreadLocal_ <?> key) {
            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;
            int i = key.ThreadLocalHashCode & (len-1);
            for (ThreadLocal_ .ThreadLocalMap_.Entry e = tab[i];
                 e != null;
                 e = tab[i = nextIndex(i, len)]) {
                if (e.get() == key) {
                    e.clear();
                    expungeStaleEntry(i);
                    return;
                }
            }
        }

        /**
         * Replace a stale entry encountered during a set operation
         * with an entry for the specified key.  The value passed in
         * the value parameter is stored in the entry, whether or not
         * an entry already exists for the specified key.
         *
         * As a side effect, this method expunges all stale entries in the
         * "run" containing the stale entry.  (A run is a sequence of entries
         * between two null slots.)
         *
         * @param  key the key
         * @param  value the value to be associated with key
         * @param  staleSlot index of the first stale entry encountered while
         *         searching for key.
         */
        private void replaceStaleEntry(ThreadLocal_ <?> key, Object value,
                                       int staleSlot) {
            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;
            ThreadLocal_ .ThreadLocalMap_.Entry e;

            // Back up to check for prior stale entry in current run.
            // We clean out whole runs at a time to avoid continual
            // incremental rehashing due to garbage collector freeing
            // up refs in bunches (i.e., whenever the collector runs).
            int slotToExpunge = staleSlot;
            for (int i = prevIndex(staleSlot, len);
                 (e = tab[i]) != null;
                 i = prevIndex(i, len))
                if (e.get() == null)
                    slotToExpunge = i;

            // Find either the key or trailing null slot of run, whichever
            // occurs first
            for (int i = nextIndex(staleSlot, len);
                 (e = tab[i]) != null;
                 i = nextIndex(i, len)) {
                ThreadLocal_ <?> k = e.get();

                // If we find key, then we need to swap it
                // with the stale entry to maintain hash table order.
                // The newly stale slot, or any other stale slot
                // encountered above it, can then be sent to expungeStaleEntry
                // to remove or rehash all of the other entries in run.
                if (k == key) {
                    e.value = value;

                    tab[i] = tab[staleSlot];
                    tab[staleSlot] = e;

                    // Start expunge at preceding stale entry if it exists
                    if (slotToExpunge == staleSlot)
                        slotToExpunge = i;
                    cleanSomeSlots(expungeStaleEntry(slotToExpunge), len);
                    return;
                }

                // If we didn't find stale entry on backward scan, the
                // first stale entry seen while scanning for key is the
                // first still present in the run.
                if (k == null && slotToExpunge == staleSlot)
                    slotToExpunge = i;
            }

            // If key not found, put new entry in stale slot
            tab[staleSlot].value = null;
            tab[staleSlot] = new ThreadLocal_ .ThreadLocalMap_.Entry(key, value);

            // If there are any other stale entries in run, expunge them
            if (slotToExpunge != staleSlot)
                cleanSomeSlots(expungeStaleEntry(slotToExpunge), len);
        }

        /**
         * Expunge a stale entry by rehashing any possibly colliding entries
         * lying between staleSlot and the next null slot.  This also expunges
         * any other stale entries encountered before the trailing null.  See
         * Knuth, Section 6.4
         *
         * @param staleSlot index of slot known to have null key
         * @return the index of the next null slot after staleSlot
         * (all between staleSlot and this slot will have been checked
         * for expunging).
         */
        private int expungeStaleEntry(int staleSlot) {
            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;

            // expunge entry at staleSlot
            tab[staleSlot].value = null;
            tab[staleSlot] = null;
            size--;

            // Rehash until we encounter null
            ThreadLocal_ .ThreadLocalMap_.Entry e;
            int i;
            for (i = nextIndex(staleSlot, len);
                 (e = tab[i]) != null;
                 i = nextIndex(i, len)) {
                ThreadLocal_ <?> k = e.get();
                if (k == null) {
                    e.value = null;
                    tab[i] = null;
                    size--;
                } else {
                    int h = k.ThreadLocalHashCode & (len - 1);
                    if (h != i) {
                        tab[i] = null;

                        // Unlike Knuth 6.4 Algorithm R, we must scan until
                        // null because multiple entries could have been stale.
                        while (tab[h] != null)
                            h = nextIndex(h, len);
                        tab[h] = e;
                    }
                }
            }
            return i;
        }

        /**
         * Heuristically scan some cells looking for stale entries.
         * This is invoked when either a new element is added, or
         * another stale one has been expunged. It performs a
         * logarithmic number of scans, as a balance between no
         * scanning (fast but retains garbage) and a number of scans
         * proportional to number of elements, that would find all
         * garbage but would cause some insertions to take O(n) time.
         *
         * @param i a position known NOT to hold a stale entry. The
         * scan starts at the element after i.
         *
         * @param n scan control: {@code log2(n)} cells are scanned,
         * unless a stale entry is found, in which case
         * {@code log2(table.length)-1} additional cells are scanned.
         * When called from insertions, this parameter is the number
         * of elements, but when from replaceStaleEntry, it is the
         * table length. (Note: all this could be changed to be either
         * more or less aggressive by weighting n instead of just
         * using straight log n. But this version is simple, fast, and
         * seems to work well.)
         *
         * @return true if any stale entries have been removed.
         */
        private boolean cleanSomeSlots(int i, int n) {
            boolean removed = false;
            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;
            do {
                i = nextIndex(i, len);
                ThreadLocal_ .ThreadLocalMap_.Entry e = tab[i];
                if (e != null && e.get() == null) {
                    n = len;
                    removed = true;
                    i = expungeStaleEntry(i);
                }
            } while ( (n >>>= 1) != 0);
            return removed;
        }

        /**
         * Re-pack and/or re-size the table. First scan the entire
         * table removing stale entries. If this doesn't sufficiently
         * shrink the size of the table, double the table size.
         */
        private void rehash() {
            expungeStaleEntries();

            // Use lower threshold for doubling to avoid hysteresis
            if (size >= threshold - threshold / 4)
                resize();
        }

        /**
         * Double the capacity of the table.
         */
        private void resize() {
            ThreadLocal_ .ThreadLocalMap_.Entry[] oldTab = table;
            int oldLen = oldTab.length;
            int newLen = oldLen * 2;
            ThreadLocal_ .ThreadLocalMap_.Entry[] newTab = new ThreadLocal_ .ThreadLocalMap_.Entry[newLen];
            int count = 0;

            for (ThreadLocal_ .ThreadLocalMap_.Entry e : oldTab) {
                if (e != null) {
                    ThreadLocal_ <?> k = e.get();
                    if (k == null) {
                        e.value = null; // Help the GC
                    } else {
                        int h = k.ThreadLocalHashCode & (newLen - 1);
                        while (newTab[h] != null)
                            h = nextIndex(h, newLen);
                        newTab[h] = e;
                        count++;
                    }
                }
            }

            setThreshold(newLen);
            size = count;
            table = newTab;
        }

        /**
         * Expunge all stale entries in the table.
         */
        private void expungeStaleEntries() {
            ThreadLocal_ .ThreadLocalMap_.Entry[] tab = table;
            int len = tab.length;
            for (int j = 0; j < len; j++) {
                ThreadLocal_ .ThreadLocalMap_.Entry e = tab[j];
                if (e != null && e.get() == null)
                    expungeStaleEntry(j);
            }
        }

        /**
         * The entries in this hash map extend WeakReference, using
         * its main ref field as the key (which is always a
         * Thread_Local object).  Note that null keys (i.e. entry.get()
         * == null) mean that the key is no longer referenced, so the
         * entry can be expunged from table.  Such entries are referred to
         * as "stale entries" in the code that follows.
         */
        static class Entry extends WeakReference<ThreadLocal_ <?>> {
            /** The value associated with this Thread_Local. */
            Object value;

            Entry(ThreadLocal_ <?> k, Object v) {
                super(k);
                value = v;
            }
        }
    }
}
