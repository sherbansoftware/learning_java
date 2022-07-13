package Concurency_Multithreading.Threads.Thread;

import java.io.PrintStream;
import java.util.Arrays;




/**
    ○ A Thread group represents a set of Threads.
 
    ○ In addition, a Thread group can also include other Thread groups.
 
    ○ The Thread groups
 
                   * form a tree in which 
 
                                 - every Thread group except the initial Thread group
 
                                 - has a parent.

    ○ A Thread is allowed to
 
                   * access information about its own Thread group, 
 
                   * but not to access information about its Thread group's parent Thread group or any other Thread groups.
 *
 * @author  unascribed
 * @since   1.0
 */
/* The locking strategy for this code is to try to lock only one level of the
 * tree wherever possible, but otherwise to lock from the bottom up.
 * That is, from child Thread_ groups to parents.
 * This has the advantage of limiting the number of locks that need to be held
 * and in particular avoids having to grab the lock for the root Thread_ group,
 * (or a global lock) which would be a source of contention on a
 * multi-processor system with many Thread_ groups.
 * This policy often leads to taking a snapshot of the state of a Thread_ group
 * and working off of that snapshot, rather than holding the Thread_ group locked
 * while we work on the children.
 */
public
class ThreadGroup_ implements Thread_.UncaughtExceptionHandler {
    private final ThreadGroup_ parent;
    String name;
    int maxPriority;
    boolean destroyed;
    boolean daemon;

    int nUnstartedThreads = 0;
    int nThreads;
    Thread_ Threads[];

    int ngroups;
    ThreadGroup_ groups[];

    /**
     * Creates an empty Thread group that is not in any Thread group.
     * This method is used to create the system Thread_ group.
     */
    private ThreadGroup_() {   // called from C code
        this.name = "system";
        this.maxPriority = Thread_.MAX_PRIORITY;
        this.parent = null;
    }

 /**
    ○ Constructs a new Thread group.
     
                  * The parent of this new group is
  
                                - the Thread group of the currently running Thread.
 
     * The  checkAccess method of the parent Thread_ group is
     * called with no arguments; this may result in a security exception.
     *
     * @param   name   the name of the new Thread_ group.
     * @throws  SecurityException  if the current Thread_ cannot create a
     *               Thread_ in the specified Thread_ group.
     * @see     java.lang.ThreadGroup#checkAccess()
     * @since   1.0
     */
    public ThreadGroup_(String name) {
        this(Thread_.currentThread().getThreadGroup(), name);
    }

    /**
     * Creates a new Thread_ group. The parent of this new group is the
     * specified Thread_ group.
     * <p>
     * The  checkAccess method of the parent Thread_ group is
     * called with no arguments; this may result in a security exception.
     *
     * @param     parent   the parent Thread_ group.
     * @param     name     the name of the new Thread_ group.
     * @throws    NullPointerException  if the Thread_ group argument is
     *                null.
     * @throws    SecurityException  if the current Thread_ cannot create a
     *               Thread_ in the specified Thread_ group.
     * @see     java.lang.SecurityException
     * @see     java.lang.ThreadGroup#checkAccess()
     * @since   1.0
     */
    public ThreadGroup_(ThreadGroup_ parent, String name) {
        this(checkParentAccess(parent), parent, name);
    }

    private ThreadGroup_(Void unused, ThreadGroup_ parent, String name) {
        this.name = name;
        this.maxPriority = parent.maxPriority;
        this.daemon = parent.daemon;
        this.parent = parent;
        parent.add(this);
    }

    /*
     * @throws  NullPointerException  if the parent argument is  null}
     * @throws  SecurityException     if the current Thread_ cannot create a
     *                                Thread_ in the specified Thread_ group.
     */
    private static Void checkParentAccess(ThreadGroup_ parent) {
        parent.checkAccess();
        return null;
    }

    /**
     * Returns the name of this Thread_ group.
     *
     * @return  the name of this Thread_ group.
     * @since   1.0
     */
    public final String getName() {
        return name;
    }

    /**
     * Returns the parent of this Thread_ group.
     * <p>
     * First, if the parent is not  null, the
     *  checkAccess method of the parent Thread_ group is
     * called with no arguments; this may result in a security exception.
     *
     * @return  the parent of this Thread_ group. The top-level Thread_ group
     *          is the only Thread_ group whose parent is  null.
     * @throws  SecurityException  if the current Thread_ cannot modify
     *               this Thread_ group.
     * @see        java.lang.ThreadGroup#checkAccess()
     * @see        java.lang.SecurityException
     * @see        java.lang.RuntimePermission
     * @since   1.0
     */
    public final ThreadGroup_ getParent() {
        if (parent != null)
            parent.checkAccess();
        return parent;
    }

    /**
     * Returns the maximum priority of this Thread_ group. Threads that are
     * part of this group cannot have a higher priority than the maximum
     * priority.
     *
     * @return  the maximum priority that a Thread_ in this Thread_ group
     *          can have.
     * @see     #setMaxPriority
     * @since   1.0
     */
    public final int getMaxPriority() {
        return maxPriority;
    }

    /**
     * Sets the maximum priority of the group. Threads in the Thread_
     * group that already have a higher priority are not affected.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     * <p>
     * If the  pri argument is less than
     *  Thread_#MIN_PRIORITY or greater than
     *  Thread_#MAX_PRIORITY, the maximum priority of the group
     * remains unchanged.
     * <p>
     * Otherwise, the priority of this ThreadGroup object is set to the
     * smaller of the specified  pri and the maximum permitted
     * priority of the parent of this Thread_ group. (If this Thread_ group
     * is the system Thread_ group, which has no parent, then its maximum
     * priority is simply set to  pri.) Then this method is
     * called recursively, with  pri as its argument, for
     * every Thread_ group that belongs to this Thread_ group.
     *
     * @param      pri   the new priority of the Thread_ group.
     * @throws     SecurityException  if the current Thread_ cannot modify
     *               this Thread_ group.
     * @see        #getMaxPriority
     * @see        java.lang.SecurityException
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.0
     */
    public final void setMaxPriority(int pri) {
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            checkAccess();
            if (pri < Thread_.MIN_PRIORITY || pri > Thread_.MAX_PRIORITY) {
                return;
            }
            maxPriority = (parent != null) ? Math.min(pri, parent.maxPriority) : pri;
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i++) {
            groupsSnapshot[i].setMaxPriority(pri);
        }
    }

    /**
     * Tests if this Thread_ group is a daemon Thread_ group. A
     * daemon Thread_ group is automatically destroyed when its last
     * Thread_ is stopped or its last Thread_ group is destroyed.
     *
     * @return   true if this Thread_ group is a daemon Thread_ group;
     *           false otherwise.
     * @since   1.0
     */
    public final boolean isDaemon() {
        return daemon;
    }

    /**
     * Changes the daemon status of this Thread_ group.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     * <p>
     * A daemon Thread_ group is automatically destroyed when its last
     * Thread_ is stopped or its last Thread_ group is destroyed.
     *
     * @param      daemon   if  true, marks this Thread_ group as
     *                      a daemon Thread_ group; otherwise, marks this
     *                      Thread_ group as normal.
     * @throws     SecurityException  if the current Thread_ cannot modify
     *               this Thread_ group.
     * @see        java.lang.SecurityException
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.0
     */
    public final void setDaemon(boolean daemon) {
        checkAccess();
        this.daemon = daemon;
    }

    /**
     * Tests if this Thread_ group has been destroyed.
     *
     * @return  true if this object is destroyed
     * @since   1.1
     */
    public synchronized boolean isDestroyed() {
        return destroyed;
    }

    /**
     * Tests if this Thread_ group is either the Thread_ group
     * argument or one of its ancestor Thread_ groups.
     *
     * @param   g   a Thread_ group.
     * @return   true if this Thread_ group is the Thread_ group
     *          argument or one of its ancestor Thread_ groups;
     *           false otherwise.
     * @since   1.0
     */
    public final boolean parentOf(ThreadGroup_ g) {
        for (; g != null ; g = g.parent) {
            if (g == this) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determines if the currently running Thread_ has permission to
     * modify this Thread_ group.
     * <p>
     * If there is a security manager, its  checkAccess method
     * is called with this Thread_ group as its argument. This may result
     * in throwing a  SecurityException.
     *
     * @throws     SecurityException  if the current Thread_ is not allowed to
     *               access this Thread_ group.
     * @see        java.lang.SecurityManager#checkAccess(java.lang.ThreadGroup)
     * @since      1.0
     */
    public final void checkAccess() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
          //  security.checkAccess(this);
        }
    }

    /**
     * Returns an estimate of the number of active Threads in this Thread_
     * group and its subgroups. Recursively iterates over all subgroups in
     * this Thread_ group.
     *
     * <p> The value returned is only an estimate because the number of
     * Threads may change dynamically while this method traverses internal
     * data structures, and might be affected by the presence of certain
     * system Threads. This method is intended primarily for debugging
     * and monitoring purposes.
     *
     * @return  an estimate of the number of active Threads in this Thread_
     *          group and in any other Thread_ group that has this Thread_
     *          group as an ancestor
     *
     * @since   1.0
     */
    public int activeCount() {
        int result;
        // Snapshot sub-group data so we don't hold this lock
        // while our children are computing.
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            if (destroyed) {
                return 0;
            }
            result = nThreads;
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i++) {
            result += groupsSnapshot[i].activeCount();
        }
        return result;
    }

    /**
     * Copies into the specified array every active Thread_ in this
     * Thread_ group and its subgroups.
     *
     * <p> An invocation of this method behaves in exactly the same
     * way as the invocation
     *
     * <blockquote>
     * plain #enumerate(Thread_[], boolean) enumerate (list, true)
     * </blockquote>
     *
     * @param  list
     *         an array into which to put the list of Threads
     *
     * @return  the number of Threads put into the array
     *
     * @throws  SecurityException
     *          if plain #checkAccess checkAccess determines that
     *          the current Thread_ cannot access this Thread_ group
     *
     * @since   1.0
     */
    public int enumerate(Thread_ list[]) {
        checkAccess();
        return enumerate(list, 0, true);
    }

    /**
     * Copies into the specified array every active Thread_ in this
     * Thread_ group. If  recurse is  true,
     * this method recursively enumerates all subgroups of this
     * Thread_ group and references to every active Thread_ in these
     * subgroups are also included. If the array is too short to
     * hold all the Threads, the extra Threads are silently ignored.
     *
     * <p> An application might use the plain #activeCount activeCount
     * method to get an estimate of how big the array should be, however
     * <i>if the array is too short to hold all the Threads, the extra Threads
     * are silently ignored.</i>  If it is critical to obtain every active
     * Thread_ in this Thread_ group, the caller should verify that the returned
     * int value is strictly less than the length of  list.
     *
     * <p> Due to the inherent race condition in this method, it is recommended
     * that the method only be used for debugging and monitoring purposes.
     *
     * @param  list
     *         an array into which to put the list of Threads
     *
     * @param  recurse
     *         if  true, recursively enumerate all subgroups of this
     *         Thread_ group
     *
     * @return  the number of Threads put into the array
     *
     * @throws  SecurityException
     *          if plain #checkAccess checkAccess determines that
     *          the current Thread_ cannot access this Thread_ group
     *
     * @since   1.0
     */
    public int enumerate(Thread_ list[], boolean recurse) {
        checkAccess();
        return enumerate(list, 0, recurse);
    }

    private int enumerate(Thread_ list[], int n, boolean recurse) {
        int ngroupsSnapshot = 0;
        ThreadGroup_[] groupsSnapshot = null;
        synchronized (this) {
            if (destroyed) {
                return 0;
            }
            int nt = nThreads;
            if (nt > list.length - n) {
                nt = list.length - n;
            }
            for (int i = 0; i < nt; i++) {
                if (Threads[i].isAlive()) {
                    list[n++] = Threads[i];
                }
            }
            if (recurse) {
                ngroupsSnapshot = ngroups;
                if (groups != null) {
                    groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
                } else {
                    groupsSnapshot = null;
                }
            }
        }
        if (recurse) {
            for (int i = 0 ; i < ngroupsSnapshot ; i++) {
             //   n = groupsSnapshot[i].enumerate(list, n, true);
            }
        }
        return n;
    }

    /**
     * Returns an estimate of the number of active groups in this
     * Thread_ group and its subgroups. Recursively iterates over
     * all subgroups in this Thread_ group.
     *
     * <p> The value returned is only an estimate because the number of
     * Thread_ groups may change dynamically while this method traverses
     * internal data structures. This method is intended primarily for
     * debugging and monitoring purposes.
     *
     * @return  the number of active Thread_ groups with this Thread_ group as
     *          an ancestor
     *
     * @since   1.0
     */
    public int activeGroupCount() {
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            if (destroyed) {
                return 0;
            }
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
        }
        int n = ngroupsSnapshot;
        for (int i = 0 ; i < ngroupsSnapshot ; i++) {
            n += groupsSnapshot[i].activeGroupCount();
        }
        return n;
    }

    /**
     * Copies into the specified array references to every active
     * subgroup in this Thread_ group and its subgroups.
     *
     * <p> An invocation of this method behaves in exactly the same
     * way as the invocation
     *
     * <blockquote>
     * plain #enumerate(ThreadGroup_[], boolean) enumerate} (list, true)}
     * </blockquote>
     *
     * @param  list
     *         an array into which to put the list of Thread_ groups
     *
     * @return  the number of Thread_ groups put into the array
     *
     * @throws  SecurityException
     *          if plain #checkAccess checkAccess} determines that
     *          the current Thread_ cannot access this Thread_ group
     *
     * @since   1.0
     */
    public int enumerate(ThreadGroup_ list[]) {
        checkAccess();
        return enumerate(list, 0, true);
    }

    /**
     * Copies into the specified array references to every active
     * subgroup in this Thread_ group. If  recurse} is
     *  true}, this method recursively enumerates all subgroups of this
     * Thread_ group and references to every active Thread_ group in these
     * subgroups are also included.
     *
     * <p> An application might use the
     * plain #activeGroupCount activeGroupCount method to
     * get an estimate of how big the array should be, however <i>if the
     * array is too short to hold all the Thread_ groups, the extra Thread_
     * groups are silently ignored.</i>  If it is critical to obtain every
     * active subgroup in this Thread_ group, the caller should verify that
     * the returned int value is strictly less than the length of
     *  list.
     *
     * <p> Due to the inherent race condition in this method, it is recommended
     * that the method only be used for debugging and monitoring purposes.
     *
     * @param  list
     *         an array into which to put the list of Thread_ groups
     *
     * @param  recurse
     *         if  true, recursively enumerate all subgroups
     *
     * @return  the number of Thread_ groups put into the array
     *
     * @throws  SecurityException
     *          if plain #checkAccess checkAccess determines that
     *          the current Thread_ cannot access this Thread_ group
     *
     * @since   1.0
     */
    public int enumerate(ThreadGroup_ list[], boolean recurse) {
        checkAccess();
        return enumerate(list, 0, recurse);
    }

    private int enumerate(ThreadGroup_ list[], int n, boolean recurse) {
        int ngroupsSnapshot = 0;
        ThreadGroup_[] groupsSnapshot = null;
        synchronized (this) {
            if (destroyed) {
                return 0;
            }
            int ng = ngroups;
            if (ng > list.length - n) {
                ng = list.length - n;
            }
            if (ng > 0) {
                System.arraycopy(groups, 0, list, n, ng);
                n += ng;
            }
            if (recurse) {
                ngroupsSnapshot = ngroups;
                if (groups != null) {
                    groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
                } else {
                    groupsSnapshot = null;
                }
            }
        }
        if (recurse) {
            for (int i = 0 ; i < ngroupsSnapshot ; i++) {
                n = groupsSnapshot[i].enumerate(list, n, true);
            }
        }
        return n;
    }

    /**
     * Stops all Threads in this Thread_ group.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     * <p>
     * This method then calls the  stop method on all the
     * Threads in this Thread_ group and in all of its subgroups.
     *
     * @throws     SecurityException  if the current Thread_ is not allowed
     *               to access this Thread_ group or any of the Threads in
     *               the Thread_ group.
     * @see        java.lang.SecurityException
     * @see        Thread_#stop()
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.0
     * @deprecated    This method is inherently unsafe.  See
     *      Thread_#stop for details.
     */
    @Deprecated(since="1.2")
    public final void stop() {
        if (stopOrSuspend_(false))
            Thread_.currentThread().stop();
    }

    /**
     * Interrupts all Threads in this Thread_ group.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     * <p>
     * This method then calls the  interrupt method on all the
     * Threads in this Thread_ group and in all of its subgroups.
     *
     * @throws     SecurityException  if the current Thread_ is not allowed
     *               to access this Thread_ group or any of the Threads in
     *               the Thread_ group.
     * @see        Thread_#interrupt()
     * @see        java.lang.SecurityException
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.2
     */
    public final void interrupt() {
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            checkAccess();
            for (int i = 0 ; i < nThreads ; i++) {
                Threads[i].interrupt();
            }
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i++) {
            groupsSnapshot[i].interrupt();
        }
    }

    /**
     * Suspends all Threads in this Thread_ group.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     * <p>
     * This method then calls the  suspend method on all the
     * Threads in this Thread_ group and in all of its subgroups.
     *
     * @throws     SecurityException  if the current Thread_ is not allowed
     *               to access this Thread_ group or any of the Threads in
     *               the Thread_ group.
     * @see        Thread_#suspend()
     * @see        java.lang.SecurityException
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.0
     * @deprecated    This method is inherently deadlock-prone.  See
     *      Thread_#suspend for details.
     */
    @Deprecated(since="1.2")
    @SuppressWarnings("deprecation")
    public final void suspend() {
        if (stopOrSuspend_(true))
            Thread_.currentThread().suspend();
    }

    /**
     * Helper method: recursively stops or suspends (as directed by the
     * boolean argument) all of the Threads in this Thread_ group and its
     * subgroups, except the current Thread_.  This method returns true
     * if (and only if) the current Thread_ is found to be in this Thread_
     * group or one of its subgroups.
     */
    @SuppressWarnings("deprecation")
    private boolean stopOrSuspend_(boolean suspend) {
        boolean suicide = false;
        Thread_ us = Thread_.currentThread();
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot = null;
        synchronized (this) {
            checkAccess();
            for (int i = 0 ; i < nThreads; i++) {
                if (Threads[i]==us)
                    suicide = true;
                else if (suspend)
                    Threads[i].suspend();
                else
                    Threads[i].stop();
            }

            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i++)
            suicide = groupsSnapshot[i].stopOrSuspend_(suspend) || suicide;

        return suicide;
    }

    /**
     * Resumes all Threads in this Thread_ group.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     * <p>
     * This method then calls the  resume method on all the
     * Threads in this Thread_ group and in all of its sub groups.
     *
     * @throws     SecurityException  if the current Thread_ is not allowed to
     *               access this Thread_ group or any of the Threads in the
     *               Thread_ group.
     * @see        java.lang.SecurityException
     * @see        Thread_#resume()
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.0
     * @deprecated    This method is used solely in conjunction with
     *        Thread_.suspend and  ThreadGroup.suspend,
     *       both of which have been deprecated, as they are inherently
     *       deadlock-prone.  See  Thread_#suspend for details.
     */
    @Deprecated(since="1.2")
    @SuppressWarnings("deprecation")
    public final void resume() {
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            checkAccess();
            for (int i = 0 ; i < nThreads ; i++) {
                Threads[i].resume();
            }
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i++) {
            groupsSnapshot[i].resume();
        }
    }

    /**
     * Destroys this Thread_ group and all of its subgroups. This Thread_
     * group must be empty, indicating that all Threads that had been in
     * this Thread_ group have since stopped.
     * <p>
     * First, the  checkAccess method of this Thread_ group is
     * called with no arguments; this may result in a security exception.
     *
     * @throws      java.lang.IllegalThreadStateException  if the Thread group is not
     *               empty or if the Thread_ group has already been destroyed.
     * @throws     SecurityException  if the current Thread_ cannot modify this
     *               Thread_ group.
     * @see        java.lang.ThreadGroup#checkAccess()
     * @since      1.0
     */
    public final void destroy() {
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            checkAccess();
            if (destroyed || (nThreads > 0)) {
                throw new java.lang.IllegalThreadStateException();
            }
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
            if (parent != null) {
                destroyed = true;
                ngroups = 0;
                groups = null;
                nThreads = 0;
                Threads = null;
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i += 1) {
            groupsSnapshot[i].destroy();
        }
        if (parent != null) {
            parent.remove(this);
        }
    }

    /**
     * Adds the specified Thread_ group to this group.
     * @param g the specified Thread_ group to be added
     * @throws  java.lang.IllegalThreadStateException If the Thread_ group has been destroyed.
     */
    private final void add(ThreadGroup_ g){
        synchronized (this) {
            if (destroyed) {
                throw new java.lang.IllegalThreadStateException();
            }
            if (groups == null) {
                groups = new ThreadGroup_[4];
            } else if (ngroups == groups.length) {
                groups = Arrays.copyOf(groups, ngroups * 2);
            }
            groups[ngroups] = g;

            // This is done last so it doesn't matter in case the
            // Thread_ is killed
            ngroups++;
        }
    }

    /**
     * Removes the specified Thread_ group from this group.
     * @param g the Thread_ group to be removed
     * @return if this Thread_ has already been destroyed.
     */
    private void remove(ThreadGroup_ g) {
        synchronized (this) {
            if (destroyed) {
                return;
            }
            for (int i = 0 ; i < ngroups ; i++) {
                if (groups[i] == g) {
                    ngroups -= 1;
                    System.arraycopy(groups, i + 1, groups, i, ngroups - i);
                    // Zap dangling reference to the dead group so that
                    // the garbage collector will collect it.
                    groups[ngroups] = null;
                    break;
                }
            }
            if (nThreads == 0) {
                notifyAll();
            }
            if (daemon && (nThreads == 0) &&
                    (nUnstartedThreads == 0) && (ngroups == 0))
            {
                destroy();
            }
        }
    }


    /**
     * Increments the count of unstarted Threads in the Thread_ group.
     * Unstarted Threads are not added to the Thread_ group so that they
     * can be collected if they are never started, but they must be
     * counted so that daemon Thread_ groups with unstarted Threads in
     * them are not destroyed.
     */
    void addUnstarted() {
        synchronized(this) {
            if (destroyed) {
                throw new java.lang.IllegalThreadStateException();
            }
            nUnstartedThreads++;
        }
    }

    /**
     * Adds the specified Thread_ to this Thread_ group.
     *
     * <p> Note: This method is called from both library code
     * and the Virtual Machine. It is called from VM to add
     * certain system Threads to the system Thread_ group.
     *
     * @param  t
     *         the Thread_ to be added
     *
     * @throws java.lang.IllegalThreadStateException
     *          if the Thread_ group has been destroyed
     */
    void add(Thread_ t) {
        synchronized (this) {
            if (destroyed) {
                throw new java.lang.IllegalThreadStateException();
            }
            if (Threads == null) {
                Threads = new Thread_[4];
            } else if (nThreads == Threads.length) {
                Threads = Arrays.copyOf(Threads, nThreads * 2);
            }
            Threads[nThreads] = t;

            // This is done last so it doesn't matter in case the
            // Thread_ is killed
            nThreads++;

            // The Thread_ is now a fully fledged member of the group, even
            // though it may, or may not, have been started yet. It will prevent
            // the group from being destroyed so the unstarted Threads count is
            // decremented.
            nUnstartedThreads--;
        }
    }

    /**
     * Notifies the group that the Thread t has failed
     * an attempt to start.
     *
     * <p> The state of this Thread_ group is rolled back as if the
     * attempt to start the Thread_ has never occurred. The Thread_ is again
     * considered an unstarted member of the Thread_ group, and a subsequent
     * attempt to start the Thread_ is permitted.
     *
     * @param  t
     *         the Thread_ whose start method was invoked
     */
    void threadStartFailed(Thread_ t) {
        synchronized(this) {
            remove(t);
            nUnstartedThreads++;
        }
    }

    /**
     * Notifies the group that the Thread_  t} has terminated.
     *
     * <p> Destroy the group if all of the following conditions are
     * true: this is a daemon Thread_ group; there are no more alive
     * or unstarted Threads in the group; there are no subgroups in
     * this Thread_ group.
     *
     * @param  t
     *         the Thread_ that has terminated
     */
    void threadTerminated(Thread_ t) {
        synchronized (this) {
            remove(t);

            if (nThreads == 0) {
                notifyAll();
            }
            if (daemon && (nThreads == 0) &&
                    (nUnstartedThreads == 0) && (ngroups == 0))
            {
                destroy();
            }
        }
    }

    /**
     * Removes the specified Thread_ from this group. Invoking this method
     * on a Thread_ group that has been destroyed has no effect.
     *
     * @param  t
     *         the Thread_ to be removed
     */
    private void remove(Thread_ t) {
        synchronized (this) {
            if (destroyed) {
                return;
            }
            for (int i = 0 ; i < nThreads ; i++) {
                if (Threads[i] == t) {
                    System.arraycopy(Threads, i + 1, Threads, i, --nThreads - i);
                    // Zap dangling reference to the dead Thread_ so that
                    // the garbage collector will collect it.
                    Threads[nThreads] = null;
                    break;
                }
            }
        }
    }

    /**
     * Prints information about this Thread group to the standard
     * output. This method is useful only for debugging.
     *
     * @since   1.0
     */
    public void list() {
        list(System.out, 0);
    }
    void list(PrintStream out, int indent) {
        int ngroupsSnapshot;
        ThreadGroup_[] groupsSnapshot;
        synchronized (this) {
            for (int j = 0 ; j < indent ; j++) {
                out.print(" ");
            }
            out.println(this);
            indent += 4;
            for (int i = 0 ; i < nThreads ; i++) {
                for (int j = 0 ; j < indent ; j++) {
                    out.print(" ");
                }
                out.println(Threads[i]);
            }
            ngroupsSnapshot = ngroups;
            if (groups != null) {
                groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
            } else {
                groupsSnapshot = null;
            }
        }
        for (int i = 0 ; i < ngroupsSnapshot ; i++) {
            groupsSnapshot[i].list(out, indent);
        }
    }

    /**
     * Called by the Java Virtual Machine when a Thread_ in this
     * Thread_ group stops because of an uncaught exception, and the Thread_
     * does not have a specific  Thread_.UncaughtExceptionHandler
     * installed.
     * <p>
     * The  uncaughtException method of
     *  ThreadGroup does the following:
     * <ul>
     * <li>If this Thread_ group has a parent Thread_ group, the
     *      uncaughtException method of that parent is called
     *     with the same two arguments.
     * <li>Otherwise, this method checks to see if there is a
     *     plain Thread_#getDefaultUncaughtExceptionHandler default
     *     uncaught exception handler installed, and if so, its
     *      uncaughtException method is called with the same
     *     two arguments.
     * <li>Otherwise, this method determines if the  Throwable
     *     argument is an instance of  ThreadDeath. If so, nothing
     *     special is done. Otherwise, a message containing the
     *     Thread_'s name, as returned from the Thread_'s
     *     Thread_#getName getName method, and a stack backtrace,
     *     using the  Throwable's
     *     Throwable#printStackTrace printStackTrace method, is
     *     printed to the plain System#err standard error stream.
     * </ul>
     * <p>
     * Applications can override this method in subclasses of
     *  ThreadGroup to provide alternative handling of
     * uncaught exceptions.
     *
     * @param   t   the Thread_ that is about to exit.
     * @param   e   the uncaught exception.
     * @since   1.0
     */
    public void uncaughtException(Thread_ t, Throwable e) {
        if (parent != null) {
            parent.uncaughtException(t, e);
        } else {
            Thread_.UncaughtExceptionHandler ueh =
                    Thread_.getDefaultUncaughtExceptionHandler();
            if (ueh != null) {
                ueh.uncaughtException(t, e);
            } else if (!(e instanceof ThreadDeath)) {
                System.err.print("Exception in Thread_ \""
                        + t.getName() + "\" ");
                e.printStackTrace(System.err);
            }
        }
    }

    /**
     * Used by VM to control lowmem implicit suspension.
     *
     * @param b boolean to allow or disallow suspension
     * @return true on success
     * @since   1.1
     * @deprecated The definition of this call depends on  #suspend,
     *             which is deprecated.  Further, the behavior of this call
     *             was never specified.
     */
    @Deprecated(since="1.2")
    public boolean allowThreadsuspension(boolean b) {
        return true;
    }

    /**
     * Returns a string representation of this Thread_ group.
     *
     * @return  a string representation of this Thread_ group.
     * @since   1.0
     */
    public String toString() {
        return getClass().getName() + "[name=" + getName() + ",maxpri=" + maxPriority + "]";
    }
}
