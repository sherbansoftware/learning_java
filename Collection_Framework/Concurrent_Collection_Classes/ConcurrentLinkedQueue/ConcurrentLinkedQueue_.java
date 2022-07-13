package Collection_Framework.Concurrent_Collection_Classes.ConcurrentLinkedQueue;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html

/**
    ○ An unbounded thread-safe  Queue queue based on linked nodes.
 
                  * This queue orders elements FIFO (first-in-first-out).
 
    ○ The head of the queue is that element that has been on the queue the longest time.
 
    ○ The tail of the queue is that element that has been on the queue the shortest time.
 
    ○ New elements are 
 
                * inserted at the tail of the queue, 
 
                * and the queue retrieval operations obtain elements at the head of the queue.

    ○ A ConcurrentLinkedQueue is an appropriate choice 
       
                * when  many threads will share access to a common collection.
 
    ○ Like most other concurrent collection implementations, this class does not permit the use of  null elements.
 
    ○ This implementation employs an efficient non-blocking algorithm based

                * on one described in  http://www.cs.rochester.edu/~scott/papers/1996_PODC_queues.pdf"
 
                * Simple, Fast, and Practical Non-Blocking and Blocking Concurrent Queue  Algorithms
 
                * by Maged M. Michael and Michael L. Scott.

    ○ Iterators are weakly consistent, returning elements 
   
                * reflecting the state of the queue at some point 
 
                * at or since the creation of the iterator. 
 
    ○ They do not throw java.util.ConcurrentModificationException, and may proceed concurrently with other operations.

       Elements contained in the queue since the creation of the iterator will be returned exactly once.

   ○  Beware that, unlike in most collections, the  size method is NOT a constant-time operation.

   ○ Because of the asynchronous nature of these queues,

                 * determining the current number of elements

                 * requires a traversal of the elements,

                 * and so may report inaccurate results if this collection is modified during traversal.

    ○ Bulk operations that add, remove, or examine multiple elements, such as  #addAll,  #removeIf or  #forEach,

                 * are not guaranteed to be performed atomically.

    ○ For example,

                * a forEach traversal concurrent with an addAll operation

                * might observe only some of the added elements.

    ○ This class and its iterator implement all of the optional methods of the Queue and Iterator interfaces.

    ○ Memory consistency effects: As with other concurrentcollections, 

                  * actions in a thread prior to placing an object into a ConcurrentLinkedQueue


                                    MemoryVisibility happen-before 
 

    ○ actions subsequent to the access or removal of that element from
          the  ConcurrentLinkedQueue in another thread.
 
    ○ This class is a member of the  Java Collections Framework
 
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this queue
 */
public class ConcurrentLinkedQueue_<E> extends AbstractQueue<E> implements Queue<E>, java.io.Serializable {
    static final VarHandle ITEM;

    /*
     * This is a modification of the Michael & Scott algorithm,
     * adapted for a garbage-collected environment, with support for
     * interior node deletion (to support e.g. remove(Object)).  For
     * explanation, read the paper.
     *
     * Note that like most non-blocking algorithms in this package,
     * this implementation relies on the fact that in garbage
     * collected systems, there is no possibility of ABA problems due
     * to recycled nodes, so there is no need to use "counted
     * pointers" or related techniques seen in versions used in
     * non-GC'ed settings.
     *
     * The fundamental invariants are:
     * - There is exactly one (last) Node with a null next reference,
     *   which is CASed when enqueueing.  This last Node can be
     *   reached in O(1) time from tail, but tail is merely an
     *   optimization - it can always be reached in O(N) time from
     *   head as well.
     * - The elements contained in the queue are the non-null items in
     *   Nodes that are reachable from head.  CASing the item
     *   reference of a Node to null atomically removes it from the
     *   queue.  Reachability of all elements from head must remain
     *   true even in the case of concurrent modifications that cause
     *   head to advance.  A dequeued Node may remain in use
     *   indefinitely due to creation of an Iterator or simply a
     *   poll() that has lost its time slice.
     *
     * The above might appear to imply that all Nodes are GC-reachable
     * from a predecessor dequeued Node.  That would cause two problems:
     * - allow a rogue Iterator to cause unbounded memory retention
     * - cause cross-generational linking of old Nodes to new Nodes if
     *   a Node was tenured while live, which generational GCs have a
     *   hard time dealing with, causing repeated major collections.
     * However, only non-deleted Nodes need to be reachable from
     * dequeued Nodes, and reachability does not necessarily have to
     * be of the kind understood by the GC.  We use the trick of
     * linking a Node that has just been dequeued to itself.  Such a
     * self-link implicitly means to advance to head.
     *
     * Both head and tail are permitted to lag.  In fact, failing to
     * update them every time one could is a significant optimization
     * (fewer CASes). As with LinkedTransferQueue (see the internal
     * documentation for that class), we use a slack threshold of two;
     * that is, we update head/tail when the current pointer appears
     * to be two or more steps away from the first/last node.
     *
     * Since head and tail are updated concurrently and independently,
     * it is possible for tail to lag behind head (why not)?
     *
     * CASing a Node's item reference to null atomically removes the
     * element from the queue, leaving a "dead" node that should later
     * be unlinked (but unlinking is merely an optimization).
     * Interior element removal methods (other than Iterator.remove())
     * keep track of the predecessor node during traversal so that the
     * node can be CAS-unlinked.  Some traversal methods try to unlink
     * any deleted nodes encountered during traversal.  See comments
     * in bulkRemove.
     *
     * When constructing a Node (before enqueuing it) we avoid paying
     * for a volatile write to item.  This allows the cost of enqueue
     * to be "one-and-a-half" CASes.
     *
     * Both head and tail may or may not point to a Node with a
     * non-null item.  If the queue is empty, all items must of course
     * be null.  Upon creation, both head and tail refer to a dummy
     * Node with null item.  Both head and tail are only updated using
     * CAS, so they never regress, although again this is merely an
     * optimization.
     */
    static final VarHandle NEXT;
    private static final long serialVersionUID = 196745693267521676L;
    /**
     * Tolerate this many consecutive dead nodes before CAS-collapsing.
     * Amortized cost of clear() is (1 + 1/MAX_HOPS) CASes per element.
     */
    private static final int MAX_HOPS = 8;
    // VarHandle mechanics
    private static final VarHandle HEAD;
    private static final VarHandle TAIL;

    // Have to override just to update the javadoc

    static {
        try {
            MethodHandles.Lookup l = MethodHandles.lookup();
            HEAD = l.findVarHandle(ConcurrentLinkedQueue_.class, "head",
                    ConcurrentLinkedQueue_.Node.class);
            TAIL = l.findVarHandle(ConcurrentLinkedQueue_.class, "tail",
                    ConcurrentLinkedQueue_.Node.class);
            ITEM = l.findVarHandle(ConcurrentLinkedQueue_.Node.class, "item", Object.class);
            NEXT = l.findVarHandle(ConcurrentLinkedQueue_.Node.class, "next", ConcurrentLinkedQueue_.Node.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * A node from which the first live (non-deleted) node (if any)
     * can be reached in O(1) time.
     * Invariants:
     * - all live nodes are reachable from head via succ()
     * - head != null
     * - (tmp = head).next != tmp || tmp != head
     * Non-invariants:
     * - head.item may or may not be null.
     * - it is permitted for tail to lag behind head, that is, for tail
     *   to not be reachable from head!
     */
    transient volatile ConcurrentLinkedQueue_.Node<E> head;
    /**
     * A node from which the last node on list (that is, the unique
     * node with node.next == null) can be reached in O(1) time.
     * Invariants:
     * - the last node is always reachable from tail via succ()
     * - tail != null
     * Non-invariants:
     * - tail.item may or may not be null.
     * - it is permitted for tail to lag behind head, that is, for tail
     *   to not be reachable from head!
     * - tail.next may or may not be self-linked.
     */
    private transient volatile ConcurrentLinkedQueue_.Node<E> tail;

    /**
     * Creates a  ConcurrentLinkedQueue that is initially empty.
     */
    public ConcurrentLinkedQueue_() {
        head = tail = new ConcurrentLinkedQueue_.Node<E>();
    }

    /**
     * Creates a  ConcurrentLinkedQueue
     * initially containing the elements of the given collection,
     * added in traversal order of the collection's iterator.
     *
     * @param c the collection of elements to initially contain
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
    public ConcurrentLinkedQueue_(Collection<? extends E> c) {
        ConcurrentLinkedQueue_.Node<E> h = null, t = null;
        for (E e : c) {
            ConcurrentLinkedQueue_.Node<E> newNode = new ConcurrentLinkedQueue_.Node<E>(Objects.requireNonNull(e));
            if (h == null)
                h = t = newNode;
            else
                t.appendRelaxed(t = newNode);
        }
        if (h == null)
            h = t = new ConcurrentLinkedQueue_.Node<E>();
        head = h;
        tail = t;
    }

    /**
     * Inserts the specified element at the tail of this queue.
     * As the queue is unbounded, this method will never throw
     *  IllegalStateException or return  false.
     *
     * @return  true (as specified by  Collection#add)
     * @throws NullPointerException if the specified element is null
     */
    public boolean add(E e) {
        return offer(e);
    }

    /**
     * Tries to CAS head to p. If successful, repoint old head to itself
     * as sentinel for succ(), below.
     */
    final void updateHead(ConcurrentLinkedQueue_.Node<E> h, ConcurrentLinkedQueue_.Node<E> p) {
        // assert h != null && p != null && (h == p || h.item == null);
        if (h != p && HEAD.compareAndSet(this, h, p))
            NEXT.setRelease(h, h);
    }

    /**
     * Returns the successor of p, or the head node if p.next has been
     * linked to self, which will only be true if traversing with a
     * stale pointer that is now off the list.
     */
    final ConcurrentLinkedQueue_.Node<E> succ(ConcurrentLinkedQueue_.Node<E> p) {
        if (p == (p = p.next))
            p = head;
        return p;
    }

    /**
     * Tries to CAS pred.next (or head, if pred is null) from c to p.
     * Caller must ensure that we're not unlinking the trailing node.
     */
    private boolean tryCasSuccessor(ConcurrentLinkedQueue_.Node<E> pred, ConcurrentLinkedQueue_.Node<E> c, ConcurrentLinkedQueue_.Node<E> p) {
        // assert p != null;
        // assert c.item == null;
        // assert c != p;
        if (pred != null)
            return NEXT.compareAndSet(pred, c, p);
        if (HEAD.compareAndSet(this, c, p)) {
            NEXT.setRelease(c, c);
            return true;
        }
        return false;
    }

    /**
     * Collapse dead nodes between pred and q.
     * @param pred the last known live node, or null if none
     * @param c the first dead node
     * @param p the last dead node
     * @param q p.next: the next live node, or null if at end
     * @return either old pred or p if pred dead or CAS failed
     */
    private ConcurrentLinkedQueue_.Node<E> skipDeadNodes(ConcurrentLinkedQueue_.Node<E> pred, ConcurrentLinkedQueue_.Node<E> c, ConcurrentLinkedQueue_.Node<E> p, ConcurrentLinkedQueue_.Node<E> q) {
        // assert pred != c;
        // assert p != q;
        // assert c.item == null;
        // assert p.item == null;
        if (q == null) {
            // Never unlink trailing node.
            if (c == p) return pred;
            q = p;
        }
        return (tryCasSuccessor(pred, c, q)
                && (pred == null || ITEM.get(pred) != null))
                ? pred : p;
    }

    /**
     * Inserts the specified element at the tail of this queue.
     * As the queue is unbounded, this method will never return  false.
     *
     * @return  true (as specified by  Queue#offer})
     * @throws NullPointerException if the specified element is null
     */
    public boolean offer(E e) {
        final ConcurrentLinkedQueue_.Node<E> newNode = new ConcurrentLinkedQueue_.Node<E>(Objects.requireNonNull(e));

        for (ConcurrentLinkedQueue_.Node<E> t = tail, p = t;;) {
            ConcurrentLinkedQueue_.Node<E> q = p.next;
            if (q == null) {
                // p is last node
                if (NEXT.compareAndSet(p, null, newNode)) {
                    // Successful CAS is the linearization point
                    // for e to become an element of this queue,
                    // and for newNode to become "live".
                    if (p != t) // hop two nodes at a time; failure is OK
                        TAIL.weakCompareAndSet(this, t, newNode);
                    return true;
                }
                // Lost CAS race to another thread; re-read next
            }
            else if (p == q)
                // We have fallen off list.  If tail is unchanged, it
                // will also be off-list, in which case we need to
                // jump to head, from which all live nodes are always
                // reachable.  Else the new tail is a better bet.
                p = (t != (t = tail)) ? t : head;
            else
                // Check for tail updates after two hops.
                p = (p != t && t != (t = tail)) ? t : q;
        }
    }

    public E poll() {
        restartFromHead: for (;;) {
            for (ConcurrentLinkedQueue_.Node<E> h = head, p = h, q;; p = q) {
                final E item;
                if ((item = p.item) != null && p.casItem(item, null)) {
                    // Successful CAS is the linearization point
                    // for item to be removed from this queue.
                    if (p != h) // hop two nodes at a time
                        updateHead(h, ((q = p.next) != null) ? q : p);
                    return item;
                }
                else if ((q = p.next) == null) {
                    updateHead(h, p);
                    return null;
                }
                else if (p == q)
                    continue restartFromHead;
            }
        }
    }

    public E peek() {
        restartFromHead: for (;;) {
            for (ConcurrentLinkedQueue_.Node<E> h = head, p = h, q;; p = q) {
                final E item;
                if ((item = p.item) != null
                        || (q = p.next) == null) {
                    updateHead(h, p);
                    return item;
                }
                else if (p == q)
                    continue restartFromHead;
            }
        }
    }

    /**
     * Returns the first live (non-deleted) node on list, or null if none.
     * This is yet another variant of poll/peek; here returning the
     * first node, not element.  We could make peek() a wrapper around
     * first(), but that would cost an extra volatile read of item,
     * and the need to add a retry loop to deal with the possibility
     * of losing a race to a concurrent poll().
     */
    ConcurrentLinkedQueue_.Node<E> first() {
        restartFromHead: for (;;) {
            for (ConcurrentLinkedQueue_.Node<E> h = head, p = h, q;; p = q) {
                boolean hasItem = (p.item != null);
                if (hasItem || (q = p.next) == null) {
                    updateHead(h, p);
                    return hasItem ? p : null;
                }
                else if (p == q)
                    continue restartFromHead;
            }
        }
    }

//    public String toString() {
//        String[] a = null;
//        restartFromHead: for (;;) {
//            int charLength = 0;
//            int size = 0;
//            for (ConcurrentLinkedQueue_.Node<E> p = first(); p != null;) {
//                final E item;
//                if ((item = p.item) != null) {
//                    if (a == null)
//                        a = new String[4];
//                    else if (size == a.length)
//                        a = Arrays.copyOf(a, 2 * size);
//                    String s = item.toString();
//                    a[size++] = s;
//                    charLength += s.length();
//                }
//                if (p == (p = p.next))
//                    continue restartFromHead;
//            }
//
//            if (size == 0)
//                return "[]";
//
//            return Helpers.toString(a, size, charLength);
//        }
//    }

    /**
     * Returns  true} if this queue contains no elements.
     *
     * @return  true} if this queue contains no elements
     */
    public boolean isEmpty() {
        return first() == null;
    }

    /**
     * Returns the number of elements in this queue.  If this queue
     * contains more than  Integer.MAX_VALUE} elements, returns
     *  Integer.MAX_VALUE}.
     *
     * Beware that, unlike in most collections, this method is
     * NOT a constant-time operation. Because of the
     * asynchronous nature of these queues, determining the current
     * number of elements requires an O(n) traversal.
     * Additionally, if elements are added or removed during execution
     * of this method, the returned result may be inaccurate.  Thus,
     * this method is typically not very useful in concurrent
     * applications.
     *
     * @return the number of elements in this queue
     */
    public int size() {
        restartFromHead: for (;;) {
            int count = 0;
            for (ConcurrentLinkedQueue_.Node<E> p = first(); p != null;) {
                if (p.item != null)
                    if (++count == Integer.MAX_VALUE)
                        break;  // @see Collection.size()
                if (p == (p = p.next))
                    continue restartFromHead;
            }
            return count;
        }
    }

    /**
     * Returns  true} if this queue contains the specified element.
     * More formally, returns  true} if and only if this queue contains
     * at least one element  e} such that  o.equals(e)}.
     *
     * @param o object to be checked for containment in this queue
     * @return  true} if this queue contains the specified element
     */
    public boolean contains(Object o) {
        if (o == null) return false;
        restartFromHead: for (;;) {
            for (ConcurrentLinkedQueue_.Node<E> p = head, pred = null; p != null; ) {
                ConcurrentLinkedQueue_.Node<E> q = p.next;
                final E item;
                if ((item = p.item) != null) {
                    if (o.equals(item))
                        return true;
                    pred = p; p = q; continue;
                }
                for (ConcurrentLinkedQueue_.Node<E> c = p;; q = p.next) {
                    if (q == null || q.item != null) {
                        pred = skipDeadNodes(pred, c, p, q); p = q; break;
                    }
                    if (p == (p = q)) continue restartFromHead;
                }
            }
            return false;
        }
    }

    /**
     * Removes a single instance of the specified element from this queue,
     * if it is present.  More formally, removes an element  e} such
     * that  o.equals(e)}, if this queue contains one or more such
     * elements.
     * Returns  true} if this queue contained the specified element
     * (or equivalently, if this queue changed as a result of the call).
     *
     * @param o element to be removed from this queue, if present
     * @return  true} if this queue changed as a result of the call
     */
    public boolean remove(Object o) {
        if (o == null) return false;
        restartFromHead: for (;;) {
            for (ConcurrentLinkedQueue_.Node<E> p = head, pred = null; p != null; ) {
                ConcurrentLinkedQueue_.Node<E> q = p.next;
                final E item;
                if ((item = p.item) != null) {
                    if (o.equals(item) && p.casItem(item, null)) {
                        skipDeadNodes(pred, p, p, q);
                        return true;
                    }
                    pred = p; p = q; continue;
                }
                for (ConcurrentLinkedQueue_.Node<E> c = p;; q = p.next) {
                    if (q == null || q.item != null) {
                        pred = skipDeadNodes(pred, c, p, q); p = q; break;
                    }
                    if (p == (p = q)) continue restartFromHead;
                }
            }
            return false;
        }
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this queue, in the order that they are returned by the specified
     * collection's iterator.  Attempts to  addAll} of a queue to
     * itself result in  IllegalArgumentException}.
     *
     * @param c the elements to be inserted into this queue
     * @return  true} if this queue changed as a result of the call
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     * @throws IllegalArgumentException if the collection is this queue
     */
    public boolean addAll(Collection<? extends E> c) {
        if (c == this)
            // As historically specified in AbstractQueue#addAll
            throw new IllegalArgumentException();

        // Copy c into a private chain of Nodes
        ConcurrentLinkedQueue_.Node<E> beginningOfTheEnd = null, last = null;
        for (E e : c) {
            ConcurrentLinkedQueue_.Node<E> newNode = new ConcurrentLinkedQueue_.Node<E>(Objects.requireNonNull(e));
            if (beginningOfTheEnd == null)
                beginningOfTheEnd = last = newNode;
            else
                last.appendRelaxed(last = newNode);
        }
        if (beginningOfTheEnd == null)
            return false;

        // Atomically append the chain at the tail of this collection
        for (ConcurrentLinkedQueue_.Node<E> t = tail, p = t;;) {
            ConcurrentLinkedQueue_.Node<E> q = p.next;
            if (q == null) {
                // p is last node
                if (NEXT.compareAndSet(p, null, beginningOfTheEnd)) {
                    // Successful CAS is the linearization point
                    // for all elements to be added to this queue.
                    if (!TAIL.weakCompareAndSet(this, t, last)) {
                        // Try a little harder to update tail,
                        // since we may be adding many elements.
                        t = tail;
                        if (last.next == null)
                            TAIL.weakCompareAndSet(this, t, last);
                    }
                    return true;
                }
                // Lost CAS race to another thread; re-read next
            }
            else if (p == q)
                // We have fallen off list.  If tail is unchanged, it
                // will also be off-list, in which case we need to
                // jump to head, from which all live nodes are always
                // reachable.  Else the new tail is a better bet.
                p = (t != (t = tail)) ? t : head;
            else
                // Check for tail updates after two hops.
                p = (p != t && t != (t = tail)) ? t : q;
        }
    }

    private Object[] toArrayInternal(Object[] a) {
        Object[] x = a;
        restartFromHead: for (;;) {
            int size = 0;
            for (ConcurrentLinkedQueue_.Node<E> p = first(); p != null;) {
                final E item;
                if ((item = p.item) != null) {
                    if (x == null)
                        x = new Object[4];
                    else if (size == x.length)
                        x = Arrays.copyOf(x, 2 * (size + 4));
                    x[size++] = item;
                }
                if (p == (p = p.next))
                    continue restartFromHead;
            }
            if (x == null)
                return new Object[0];
            else if (a != null && size <= a.length) {
                if (a != x)
                    System.arraycopy(x, 0, a, 0, size);
                if (size < a.length)
                    a[size] = null;
                return a;
            }
            return (size == x.length) ? x : Arrays.copyOf(x, size);
        }
    }

    /**
     * Returns an array containing all of the elements in this queue, in
     * proper sequence.
     *
     * The returned array will be "safe" in that no references to it are
     * maintained by this queue.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this queue
     */
    public Object[] toArray() {
        return toArrayInternal(null);
    }

    /**
     * Returns an array containing all of the elements in this queue, in
     * proper sequence; the runtime type of the returned array is that of
     * the specified array.  If the queue fits in the specified array, it
     * is returned therein.  Otherwise, a new array is allocated with the
     * runtime type of the specified array and the size of this queue.
     *
     * If this queue fits in the specified array with room to spare
     * (i.e., the array has more elements than this queue), the element in
     * the array immediately following the end of the queue is set to
     *  null}.
     *
     * Like the  #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * Suppose  x} is a queue known to contain only strings.
     * The following code can be used to dump the queue into a newly
     * allocated array of  String}:
     *
     * <pre>  String[] y = x.toArray(new String[0]);}</pre>
     *
     * Note that  toArray(new Object[0])} is identical in function to
     *  toArray()}.
     *
     * @param a the array into which the elements of the queue are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose
     * @return an array containing all of the elements in this queue
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this queue
     * @throws NullPointerException if the specified array is null
     */
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        Objects.requireNonNull(a);
        return (T[]) toArrayInternal(a);
    }

    /**
     * Returns an iterator over the elements in this queue in proper sequence.
     * The elements will be returned in order from first (head) to last (tail).
     *
     * The returned iterator is
     * <a href="package-summary.html#Weakly">weakly consistent</a>.
     *
     * @return an iterator over the elements in this queue in proper sequence
     */
    public Iterator<E> iterator() {
        return new ConcurrentLinkedQueue_.Itr();
    }

    /**
     * Saves this queue to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData All of the elements (each an  E}) in
     * the proper order, followed by a null
     */
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {

        // Write out any hidden stuff
        s.defaultWriteObject();

        // Write out all elements in the proper order.
        for (ConcurrentLinkedQueue_.Node<E> p = first(); p != null; p = succ(p)) {
            final E item;
            if ((item = p.item) != null)
                s.writeObject(item);
        }

        // Use trailing null as sentinel
        s.writeObject(null);
    }

    /**
     * Reconstitutes this queue from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();

        // Read in elements until trailing null sentinel found
        ConcurrentLinkedQueue_.Node<E> h = null, t = null;
        for (Object item; (item = s.readObject()) != null; ) {
            @SuppressWarnings("unchecked")
            ConcurrentLinkedQueue_.Node<E> newNode = new ConcurrentLinkedQueue_.Node<E>((E) item);
            if (h == null)
                h = t = newNode;
            else
                t.appendRelaxed(t = newNode);
        }
        if (h == null)
            h = t = new ConcurrentLinkedQueue_.Node<E>();
        head = h;
        tail = t;
    }

    /**
     * Returns a  Spliterator} over the elements in this queue.
     *
     * The returned spliterator is
     * <a href="package-summary.html#Weakly">weakly consistent</a>.
     *
     * The  Spliterator} reports  Spliterator#CONCURRENT},
     *  Spliterator#ORDERED}, and  Spliterator#NONNULL}.
     *
     * @implNote
     * The  Spliterator} implements  trySplit} to permit limited
     * parallelism.
     *
     * @return a  Spliterator} over the elements in this queue
     * @since 1.8
     */
    @Override
    public Spliterator<E> spliterator() {
        return new ConcurrentLinkedQueue_.CLQSpliterator();
    }

    /**
     * @throws NullPointerException
     */
    public boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        return bulkRemove(filter);
    }

    /**
     * @throws NullPointerException
     */
    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        return bulkRemove(e -> c.contains(e));
    }

    /**
     * @throws NullPointerException
     */
    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        return bulkRemove(e -> !c.contains(e));
    }

    public void clear() {
        bulkRemove(e -> true);
    }

    /** Implementation of bulk remove methods. */
    private boolean bulkRemove(Predicate<? super E> filter) {
        boolean removed = false;
        restartFromHead: for (;;) {
            int hops = MAX_HOPS;
            // c will be CASed to collapse intervening dead nodes between
            // pred (or head if null) and p.
            for (ConcurrentLinkedQueue_.Node<E> p = head, c = p, pred = null, q; p != null; p = q) {
                q = p.next;
                final E item; boolean pAlive;
                if (pAlive = ((item = p.item) != null)) {
                    if (filter.test(item)) {
                        if (p.casItem(item, null))
                            removed = true;
                        pAlive = false;
                    }
                }
                if (pAlive || q == null || --hops == 0) {
                    // p might already be self-linked here, but if so:
                    // - CASing head will surely fail
                    // - CASing pred's next will be useless but harmless.
                    if ((c != p && !tryCasSuccessor(pred, c, c = p))
                            || pAlive) {
                        // if CAS failed or alive, abandon old pred
                        hops = MAX_HOPS;
                        pred = p;
                        c = q;
                    }
                } else if (p == q)
                    continue restartFromHead;
            }
            return removed;
        }
    }

    /**
     * Runs action on each element found during a traversal starting at p.
     * If p is null, the action is not run.
     */
    void forEachFrom(Consumer<? super E> action, ConcurrentLinkedQueue_.Node<E> p) {
        for (ConcurrentLinkedQueue_.Node<E> pred = null; p != null; ) {
            ConcurrentLinkedQueue_.Node<E> q = p.next;
            final E item;
            if ((item = p.item) != null) {
                action.accept(item);
                pred = p; p = q; continue;
            }
            for (ConcurrentLinkedQueue_.Node<E> c = p;; q = p.next) {
                if (q == null || q.item != null) {
                    pred = skipDeadNodes(pred, c, p, q); p = q; break;
                }
                if (p == (p = q)) { pred = null; p = head; break; }
            }
        }
    }

    /**
     * @throws NullPointerException
     */
    public void forEach(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        forEachFrom(action, head);
    }

    static final class Node<E> {
        volatile E item;
        volatile ConcurrentLinkedQueue_.Node<E> next;

        /**
         * Constructs a node holding item.  Uses relaxed write because
         * item can only be seen after piggy-backing publication via CAS.
         */
        Node(E item) {
            ITEM.set(this, item);
        }

        /** Constructs a dead dummy node. */
        Node() {}

        void appendRelaxed(ConcurrentLinkedQueue_.Node<E> next) {
            // assert next != null;
            // assert this.next == null;
            NEXT.set(this, next);
        }

        boolean casItem(E cmp, E val) {
            // assert item == cmp || item == null;
            // assert cmp != null;
            // assert val == null;
            return ITEM.compareAndSet(this, cmp, val);
        }
    }

    private class Itr implements Iterator<E> {
        /**
         * Next node to return item for.
         */
        private ConcurrentLinkedQueue_.Node<E> nextNode;

        /**
         * nextItem holds on to item fields because once we claim
         * that an element exists in hasNext(), we must return it in
         * the following next() call even if it was in the process of
         * being removed when hasNext() was called.
         */
        private E nextItem;

        /**
         * Node of the last returned item, to support remove.
         */
        private ConcurrentLinkedQueue_.Node<E> lastRet;

        Itr() {
            restartFromHead: for (;;) {
                ConcurrentLinkedQueue_.Node<E> h, p, q;
                for (p = h = head;; p = q) {
                    final E item;
                    if ((item = p.item) != null) {
                        nextNode = p;
                        nextItem = item;
                        break;
                    }
                    else if ((q = p.next) == null)
                        break;
                    else if (p == q)
                        continue restartFromHead;
                }
                updateHead(h, p);
                return;
            }
        }

        public boolean hasNext() {
            return nextItem != null;
        }

        public E next() {
            final ConcurrentLinkedQueue_.Node<E> pred = nextNode;
            if (pred == null) throw new NoSuchElementException();
            // assert nextItem != null;
            lastRet = pred;
            E item = null;

            for (ConcurrentLinkedQueue_.Node<E> p = succ(pred), q;; p = q) {
                if (p == null || (item = p.item) != null) {
                    nextNode = p;
                    E x = nextItem;
                    nextItem = item;
                    return x;
                }
                // unlink deleted nodes
                if ((q = succ(p)) != null)
                    NEXT.compareAndSet(pred, p, q);
            }
        }

        // Default implementation of forEachRemaining is "good enough".

        public void remove() {
            ConcurrentLinkedQueue_.Node<E> l = lastRet;
            if (l == null) throw new IllegalStateException();
            // rely on a future traversal to relink.
            l.item = null;
            lastRet = null;
        }
    }

    /** A customized variant of Spliterators.IteratorSpliterator */
    final class CLQSpliterator implements Spliterator<E> {
        static final int MAX_BATCH = 1 << 25;  // max batch array size;
        ConcurrentLinkedQueue_.Node<E> current;    // current node; null until initialized
        int batch;          // batch size for splits
        boolean exhausted;  // true when no more nodes

        public Spliterator<E> trySplit() {
            ConcurrentLinkedQueue_.Node<E> p, q;
            if ((p = current()) == null || (q = p.next) == null)
                return null;
            int i = 0, n = batch = Math.min(batch + 1, MAX_BATCH);
            Object[] a = null;
            do {
                final E e;
                if ((e = p.item) != null) {
                    if (a == null)
                        a = new Object[n];
                    a[i++] = e;
                }
                if (p == (p = q))
                    p = first();
            } while (p != null && (q = p.next) != null && i < n);
            setCurrent(p);
            return (i == 0) ? null :
                    Spliterators.spliterator(a, 0, i, (Spliterator.ORDERED |
                            Spliterator.NONNULL |
                            Spliterator.CONCURRENT));
        }

        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            final ConcurrentLinkedQueue_.Node<E> p;
            if ((p = current()) != null) {
                current = null;
                exhausted = true;
                forEachFrom(action, p);
            }
        }

        public boolean tryAdvance(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            ConcurrentLinkedQueue_.Node<E> p;
            if ((p = current()) != null) {
                E e;
                do {
                    e = p.item;
                    if (p == (p = p.next))
                        p = first();
                } while (e == null && p != null);
                setCurrent(p);
                if (e != null) {
                    action.accept(e);
                    return true;
                }
            }
            return false;
        }

        private void setCurrent(ConcurrentLinkedQueue_.Node<E> p) {
            if ((current = p) == null)
                exhausted = true;
        }

        private ConcurrentLinkedQueue_.Node<E> current() {
            ConcurrentLinkedQueue_.Node<E> p;
            if ((p = current) == null && !exhausted)
                setCurrent(p = first());
            return p;
        }

        public long estimateSize() { return Long.MAX_VALUE; }

        public int characteristics() {
            return (Spliterator.ORDERED |
                    Spliterator.NONNULL |
                    Spliterator.CONCURRENT);
        }
    }
}
