package Concurency_Multithreading.Threads.Thread;

import jdk.internal.HotSpotIntrinsicCandidate;
import sun.nio.ch.Interruptible;
import sun.security.util.SecurityConstants;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html




/**
    ○ A thread is a thread of execution in a program.
 
    ○ The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.
 
    ○ Every thread has a priority. 
  
    ○ Threads with higher priority 
       
                  * are executed in preference to threads with lower priority.
 
    ○ Each thread 
 
                  * may or may not also be marked as a daemon.
  
    ○ When code running in some thread creates a new Thread object,
 
                  * the new thread has its priority initially set equal 
 
                  * to the priority of the creating thread
 
                  *  and is a daemon thread if and only if the creating thread is a daemon.
 
    ○ When a Java Virtual Machine starts up, 
 
                  * there is usually a single non-daemon thread 
 
                  * (which typically calls the method named  main of some designated class.
 
    ○ The Java Virtual Machine continues to execute threads until either of the following occurs:

                   * The EXIT method of class  Runtime has been called

                                  - and the security manager has permitted the exit operation to take place.

                   * All threads that are not daemon threads have DIED

                                  - either by returning from the call to the  run method

                                  - or by throwing an exception that propagates beyond the run method.

     ○ There are two ways to create a new thread of execution.

                  * One is to declare a class to be a subclass of Thread.

           This subclass should override the run method of class Thread.

                  * An instance of the subclass can then be allocated and started.

     ○ For example, a thread that computes primes larger than a stated value could be written as follows:

                   * class PrimeThread extends Thread {
                   * long minPrime;
                   * PrimeThread(long minPrime) {
                   *    this.minPrime = minPrime;
                   *  }

                   *  public void run() {
                   *     // compute primes larger than minPrime
                   *  }
                   * }


    ○ The following code would then create a thread and start it running:

                  * PrimeThread p = new PrimeThread(143);
                  * p.start();

    ○ The other way to create a thread is to declare a class that implements the Runnable interface.

                  * That class then implements the run method.

   ○ An instance of the class can then be allocated,

                  * passed as an argument when creating Thread, and started.

   ○ The same example in this other style looks like the following:

                   * class PrimeRun implements Runnable {
                   * long minPrime;
                   * PrimeRun(long minPrime) {
                   *     this.minPrime = minPrime;
                   *     }
                    *  public void run() {
                   * / compute primes larger than minPrime
                   *  }
                   * }

    ○ The following code would then create a thread and start it running:

                    *  PrimeRun p = new PrimeRun(143);
                    *  new Thread(p).start();

    ○ Every thread has a name for identification purposes.

                   * More than one thread may have the same name.

                   * If a name is not specified when a thread is created,

                                 - a new name is generated for it.

    ○ Unless otherwise noted, passing a null argument to a constructor or method in this class

                   * will cause a  NullPointerException to be thrown.


 * @author  unascribed
 * @see     Runnable
 * @see     Runtime#exit(int)
 * @see     #run()
 * @see     #stop()
 * @since   1.0
 */
public
class Thread_ implements Runnable {
    /**
     * The minimum priority that a thread can have.
     */
    public static final int MIN_PRIORITY = 1;
    /**
     * The default priority that is assigned to a thread.
     */
    public static final int NORM_PRIORITY = 5;
    /**
     * The maximum priority that a thread can have.
     */
    public static final int MAX_PRIORITY = 10;
    private static final StackTraceElement[] EMPTY_STACK_TRACE
            = new StackTraceElement[0];
    /* For autonumbering anonymous threads. */
    private static int threadInitNumber;
    /* For generating thread ID */
    private static long threadSeqNumber;
    // null unless explicitly set
    private static volatile Thread_.UncaughtExceptionHandler defaultUncaughtExceptionHandler;

    static {
        registerNatives();
    }

    /*
     * The requested stack size for this thread, or 0 if the creator did
     * not specify a stack size.  It is up to the VM to do whatever it
     * likes with this number; some VMs will ignore it.
     */
    private final long stackSize;
    /*
     * Thread ID
     */
    private final long tid;
    private final Object blockerLock = new Object();
    /* ThreadLocal_  values pertaining to this thread. This map is maintained
     * by the ThreadLocal_  class. */
    ThreadLocal_.ThreadLocalMap_ ThreadLocals = null;
    /*
     * InheritableThreadLocal_  values pertaining to this thread. This map is
     * maintained by the InheritableThreadLocal_  class.
     */
    ThreadLocal_.ThreadLocalMap_ inheritableThreadLocals = null;
    /**
     * The argument supplied to the current call to
     * java.util.concurrent.locks.LockSupport.park.
     * Set by (private) java.util.concurrent.locks.LockSupport.setBlocker
     * Accessed using java.util.concurrent.locks.LockSupport.getBlocker
     */
    volatile Object parkBlocker;
    /** The current seed for a ThreadLocalRandom */
    @jdk.internal.vm.annotation.Contended("tlr")
    long threadLocalRandomSeed;
    /** Probe hash value; nonzero if threadLocalRandomSeed initialized */
    @jdk.internal.vm.annotation.Contended("tlr")
    int threadLocalRandomProbe;
    /** Secondary seed isolated from public ThreadLocalRandom sequence */
    @jdk.internal.vm.annotation.Contended("tlr")
    int threadLocalRandomSecondarySeed;
    private volatile String name;
    private int priority;
    /* Whether or not the thread is a daemon thread. */
    private boolean daemon = false;
    /* Fields reserved for exclusive use by the JVM */
    private boolean stillborn = false;
    private long eetop;
    /* What will be run. */
    private Runnable target;
    /* The group of this thread */
    private ThreadGroup_ group;
    /* The context ClassLoader for this thread */
    private ClassLoader contextClassLoader;
    /* The inherited AccessControlContext of this thread */
    private AccessControlContext inheritedAccessControlContext;
    /*
     * Java thread status for tools, default indicates thread 'not yet started'
     */
    private volatile int threadStatus;
    /* The object in which this thread is blocked in an interruptible I/O
     * operation, if any.  The blocker's interrupt method should be invoked
     * after setting this thread's interrupt status.
     */
    private volatile Interruptible blocker;
    // null unless explicitly set
    private volatile Thread_.UncaughtExceptionHandler uncaughtExceptionHandler;

    /**
     * Initializes a Thread.
     *
     * @param g the Thread group
     * @param target the object whose run() method gets called
     * @param name the name of the new Thread
     * @param stackSize the desired stack size for the new thread, or
     *        zero to indicate that this parameter is to be ignored.
     * @param acc the AccessControlContext to inherit, or
     *            AccessController.getContext() if null
     * @param inheritThreadLocals if    true}, inherit initial values for
     *            inheritable thread-locals from the constructing thread
     */
    private Thread_(ThreadGroup_ g, Runnable target, String name,
                   long stackSize, AccessControlContext acc,
                   boolean inheritThreadLocals) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }

        this.name = name;

        Thread_ parent = currentThread();
        SecurityManager security = System.getSecurityManager();
        if (g == null) {
            /* Determine if it's an applet or not */

            /* If there is a security manager, ask the security manager
               what to do. */
            if (security != null) {
                //g = security.getThreadGroup();
            }

            /* If the security manager doesn't have a strong opinion
               on the matter, use the parent thread group. */
            if (g == null) {
                g = parent.getThreadGroup();
            }
        }

        /* checkAccess regardless of whether or not ThreadGroup_ is
           explicitly passed in. */
        g.checkAccess();

        /*
         * Do we have the required permissions?
         */
        if (security != null) {
            if (isCCLOverridden(getClass())) {
                security.checkPermission(
                        SecurityConstants.SUBCLASS_IMPLEMENTATION_PERMISSION);
            }
        }

        g.addUnstarted();

        this.group = g;
        this.daemon = parent.isDaemon();
        this.priority = parent.getPriority();
        if (security == null || isCCLOverridden(parent.getClass()))
            this.contextClassLoader = parent.getContextClassLoader();
        else
            this.contextClassLoader = parent.contextClassLoader;
        this.inheritedAccessControlContext =
                acc != null ? acc : AccessController.getContext();
        this.target = target;
        setPriority(priority);
        if (inheritThreadLocals && parent.inheritableThreadLocals != null)
            this.inheritableThreadLocals =
                    ThreadLocal_.createInheritedMap(parent.inheritableThreadLocals);
        /* Stash the specified stack size in case the VM cares */
        this.stackSize = stackSize;

        /* Set thread ID */
        this.tid = nextThreadID();
    }

    /**
     * Allocates a new    Thread} object. This constructor has the same
     * effect as  #Thread_(ThreadGroup_,Runnable,String) Thread}
     *    (null, null, gname)}, where    gname} is a newly generated
     * name. Automatically generated names are of the form
     *    "Thread-"+}  n  , where   n   is an integer.
     */
    public Thread_() {
        this(null, null, "Thread-" + nextThreadNum(), 0);
    }

    /**
     * Allocates a new    Thread} object. This constructor has the same
     * effect as  #Thread_(ThreadGroup_,Runnable,String) Thread}
     *    (null, target, gname)}, where    gname} is a newly generated
     * name. Automatically generated names are of the form
     *    "Thread-"+}  n  , where   n   is an integer.
     *
     * @param  target
     *         the object whose    run} method is invoked when this thread
     *         is started. If    null}, this classes    run} method does
     *         nothing.
     */
    public Thread_(Runnable target) {
        this(null, target, "Thread-" + nextThreadNum(), 0);
    }

    /**
     * Creates a new Thread that inherits the given AccessControlContext
     * but thread-local variables are not inherited.
     * This is not a public constructor.
     */
    Thread_(Runnable target, AccessControlContext acc) {
        this(null, target, "Thread-" + nextThreadNum(), 0, acc, false);
    }

    /**
     * Allocates a new    Thread} object. This constructor has the same
     * effect as  #Thread(ThreadGroup_,Runnable,String) Thread}
     *    (group, target, gname)} ,where    gname} is a newly generated
     * name. Automatically generated names are of the form
     *    "Thread-"+}  n  , where   n   is an integer.
     *
     * @param  group
     *         the thread group. If    null} and there is a security
     *         manager, the group is determined by
     *         SecurityManager#getThreadGroup__ SecurityManager.getThreadGroup__()}.
     *         If there is not a security manager or
     *         SecurityManager.getThreadGroup__()} returns    null}, the group
     *         is set to the current thread's thread group.
     *
     * @param  target
     *         the object whose    run} method is invoked when this thread
     *         is started. If    null}, this thread's run method is invoked.
     *
     * @throws  SecurityException
     *          if the current thread cannot create a thread in the specified
     *          thread group
     */
    public Thread_(ThreadGroup_ group, Runnable target) {
        this(group, target, "Thread-" + nextThreadNum(), 0);
    }

    /**
     * Allocates a new    Thread} object. This constructor has the same
     * effect as  #Thread(ThreadGroup_,Runnable,String) Thread}
     *    (null, null, name)}.
     *
     * @param   name
     *          the name of the new thread
     */
    public Thread_(String name) {
        this(null, null, name, 0);
    }

    /**
     * Allocates a new    Thread} object. This constructor has the same
     * effect as  #Thread(ThreadGroup_,Runnable,String) Thread}
     *    (group, null, name)}.
     *
     * @param  group
     *         the thread group. If    null} and there is a security
     *         manager, the group is determined by
     *         SecurityManager#getThreadGroup__ SecurityManager.getThreadGroup__()}.
     *         If there is not a security manager or
     *         SecurityManager.getThreadGroup__()} returns    null}, the group
     *         is set to the current thread's thread group.
     *
     * @param  name
     *         the name of the new thread
     *
     * @throws  SecurityException
     *          if the current thread cannot create a thread in the specified
     *          thread group
     */
    public Thread_(ThreadGroup_ group, String name) {
        this(group, null, name, 0);
    }

    /**
     * Allocates a new    Thread} object. This constructor has the same
     * effect as  #Thread(ThreadGroup_,Runnable,String) Thread}
     *    (null, target, name)}.
     *
     * @param  target
     *         the object whose    run} method is invoked when this thread
     *         is started. If    null}, this thread's run method is invoked.
     *
     * @param  name
     *         the name of the new thread
     */
    public Thread_(Runnable target, String name) {
        this(null, target, name, 0);
    }

    /**
     * Allocates a new    Thread} object so that it has    target}
     * as its run object, has the specified    name} as its name,
     * and belongs to the thread group referred to by    group}.
     *
     * If there is a security manager, its
     *  SecurityManager#checkAccess(ThreadGroup_) checkAccess}
     * method is invoked with the ThreadGroup_ as its argument.
     *
     * In addition, its    checkPermission} method is invoked with
     * the    RuntimePermission("enableContextClassLoaderOverride")}
     * permission when invoked directly or indirectly by the constructor
     * of a subclass which overrides the    getContextClassLoader}
     * or    setContextClassLoader} methods.
     *
     * The priority of the newly created thread is set equal to the
     * priority of the thread creating it, that is, the currently running
     * thread. The method  #setPriority setPriority} may be
     * used to change the priority to a new value.
     *
     * The newly created thread is initially marked as being a daemon
     * thread if and only if the thread creating it is currently marked
     * as a daemon thread. The method  #setDaemon setDaemon}
     * may be used to change whether or not a thread is a daemon.
     *
     * @param  group
     *         the thread group. If    null} and there is a security
     *         manager, the group is determined by
     *         SecurityManager#getThreadGroup__ SecurityManager.getThreadGroup__()}.
     *         If there is not a security manager or
     *         SecurityManager.getThreadGroup__()} returns    null}, the group
     *         is set to the current thread's thread group.
     *
     * @param  target
     *         the object whose    run} method is invoked when this thread
     *         is started. If    null}, this thread's run method is invoked.
     *
     * @param  name
     *         the name of the new thread
     *
     * @throws  SecurityException
     *          if the current thread cannot create a thread in the specified
     *          thread group or cannot override the context class loader methods.
     */
    public Thread_(ThreadGroup_ group, Runnable target, String name) {
        this(group, target, name, 0);
    }

    /**
     * Allocates a new    Thread} object so that it has    target}
     * as its run object, has the specified    name} as its name,
     * and belongs to the thread group referred to by    group}, and has
     * the specified   stack size  .
     *
     * This constructor is identical to
     * Thread(ThreadGroup_,Runnable,String)} with the exception of the fact
     * that it allows the thread stack size to be specified.  The stack size
     * is the approximate number of bytes of address space that the virtual
     * machine is to allocate for this thread's stack.  <b>The effect of the
     *    stackSize} parameter, if any, is highly platform dependent.</b>
     *
     * On some platforms, specifying a higher value for the
     *    stackSize} parameter may allow a thread to achieve greater
     * recursion depth before throwing a  StackOverflowError}.
     * Similarly, specifying a lower value may allow a greater number of
     * threads to exist concurrently without throwing an
     * OutOfMemoryError} (or other internal error).  The details of
     * the relationship between the value of the    stackSize} parameter
     * and the maximum recursion depth and concurrency level are
     * platform-dependent.  <b>On some platforms, the value of the
     *    stackSize} parameter may have no effect whatsoever.</b>
     *
     * The virtual machine is free to treat the    stackSize}
     * parameter as a suggestion.  If the specified value is unreasonably low
     * for the platform, the virtual machine may instead use some
     * platform-specific minimum value; if the specified value is unreasonably
     * high, the virtual machine may instead use some platform-specific
     * maximum.  Likewise, the virtual machine is free to round the specified
     * value up or down as it sees fit (or to ignore it completely).
     *
     * Specifying a value of zero for the    stackSize} parameter will
     * cause this constructor to behave exactly like the
     *    Thread(ThreadGroup_, Runnable, String)} constructor.
     *
     *   Due to the platform-dependent nature of the behavior of this
     * constructor, extreme care should be exercised in its use.
     * The thread stack size necessary to perform a given computation will
     * likely vary from one JRE implementation to another.  In light of this
     * variation, careful tuning of the stack size parameter may be required,
     * and the tuning may need to be repeated for each JRE implementation on
     * which an application is to run.
     *
     * Implementation note: Java platform implementers are encouraged to
     * document their implementation's behavior with respect to the
     *    stackSize} parameter.
     *
     *
     * @param  group
     *         the thread group. If    null} and there is a security
     *         manager, the group is determined by
     *         SecurityManager#getThreadGroup__ SecurityManager.getThreadGroup__()}.
     *         If there is not a security manager or
     *         SecurityManager.getThreadGroup__()} returns    null}, the group
     *         is set to the current thread's thread group.
     *
     * @param  target
     *         the object whose    run} method is invoked when this thread
     *         is started. If    null}, this thread's run method is invoked.
     *
     * @param  name
     *         the name of the new thread
     *
     * @param  stackSize
     *         the desired stack size for the new thread, or zero to indicate
     *         that this parameter is to be ignored.
     *
     * @throws  SecurityException
     *          if the current thread cannot create a thread in the specified
     *          thread group
     *
     * @since 1.4
     */
    public Thread_(ThreadGroup_ group, Runnable target, String name,
                  long stackSize) {
        this(group, target, name, stackSize, null, true);
    }

    /**
     * Allocates a new    Thread} object so that it has    target}
     * as its run object, has the specified    name} as its name,
     * belongs to the thread group referred to by    group}, has
     * the specified    stackSize}, and inherits initial values for
     *  InheritableThreadLocal_  inheritable thread-local} variables
     * if    inheritThreadLocal_ s} is    true}.
     *
     *  This constructor is identical to
     * Thread(ThreadGroup_,Runnable,String,long)} with the added ability to
     * suppress, or not, the inheriting of initial values for inheritable
     * thread-local variables from the constructing thread. This allows for
     * finer grain control over inheritable thread-locals. Care must be taken
     * when passing a value of    false} for    inheritThreadLocal_ s},
     * as it may lead to unexpected behavior if the new thread executes code
     * that expects a specific thread-local value to be inherited.
     *
     *  Specifying a value of    true} for the    inheritThreadLocal_ s}
     * parameter will cause this constructor to behave exactly like the
     *    Thread(ThreadGroup_, Runnable, String, long)} constructor.
     *
     * @param  group
     *         the thread group. If    null} and there is a security
     *         manager, the group is determined by
     *         SecurityManager#getThreadGroup__ SecurityManager.getThreadGroup__()}.
     *         If there is not a security manager or
     *         SecurityManager.getThreadGroup__()} returns    null}, the group
     *         is set to the current thread's thread group.
     *
     * @param  target
     *         the object whose    run} method is invoked when this thread
     *         is started. If    null}, this thread's run method is invoked.
     *
     * @param  name
     *         the name of the new thread
     *
     * @param  stackSize
     *         the desired stack size for the new thread, or zero to indicate
     *         that this parameter is to be ignored
     *
     * @param  inheritThreadLocals
     *         if    true}, inherit initial values for inheritable
     *         thread-locals from the constructing thread, otherwise no initial
     *         values are inherited
     *
     * @throws  SecurityException
     *          if the current thread cannot create a thread in the specified
     *          thread group
     *
     * @since 9
     */
    public Thread_(ThreadGroup_ group, Runnable target, String name,
                  long stackSize, boolean inheritThreadLocals) {
        this(group, target, name, stackSize, null, inheritThreadLocals);
    }

    /* Make sure registerNatives is the first thing <clinit> does. */
    private static native void registerNatives();

    private static synchronized int nextThreadNum() {
        return threadInitNumber++;
    }

    private static synchronized long nextThreadID() {
        return ++threadSeqNumber;
    }

    /* Set the blocker field; invoked via jdk.internal.misc.SharedSecrets
     * from java.nio code
     */
    static void blockedOn(Interruptible b) {
        Thread_ me = Thread_.currentThread();
        synchronized (me.blockerLock) {
            me.blocker = b;
        }
    }

    /**
     * Returns a reference to the currently executing thread object.
     *
     * @return  the currently executing thread.
     */
    @HotSpotIntrinsicCandidate
    public static native Thread_ currentThread();

    /**
    ○ A hint to the scheduler that the current thread is willing to yield its current use of a processor.

                   * The state of the thread is changed from RUNNING to RUNNABLE

                   * The scheduler is free to ignore this hint.

     ○ Yield is a heuristic attempt to improve relative progression between threads that would otherwise over-utilise a CPU.

                   * Its use should be combined with

                                  - detailed profiling

                                                • A Java Profiler is a tool that monitors Java bytecode constructs and operations
                                                      at the JVM level. These code constructs and operations include object
                                                      creation, iterative executions (including recursive calls),
                                                      method executions, thread executions, and garbage collections.

                                                • https://www.baeldung.com/java-profilers#jprofiler   (JProfiler)

                                  - and benchmarking

                                                • Java application monitoring tool is a type of tool that helps you to measure
                                                      performance and detect problems that might affect your end users'
                                                      experiences.

                                                • https://sematext.com/guides/java-monitoring/

           to ensure that it actually has the desired effect.

     ○  It is rarely appropriate to use this method. It may be useful

                   * for debugging

                   * or testing purposes,

                   * where it may help to reproduce bugs due to race conditions.

     ○  It may also be useful

                   * when designing concurrency control constructs such

                                  - as the ones in the java.util.concurrent.locks package.
     */
    public static native void yield();

    /**
         ○ Causes the currently executing thread to sleep (temporarily cease execution)

                        * for the specified number of milliseconds,

                         * subject to the precision and accuracy of system timers and schedulers.

         ○ The thread does not lose ownership of any monitors.

     * @param  millis
     *         the length of time to sleep in milliseconds
     *
     * @throws  IllegalArgumentException
     *          if the value of    millis} is negative
     *
     * @throws  InterruptedException
     *          if any thread has interrupted the current thread. The
     *            interrupted status   of the current thread is
     *          cleared when this exception is thrown.
     */
    public static native void sleep(long millis) throws InterruptedException;

    /**
         ○ Causes the currently executing thread to sleep (temporarily cease  execution)

                       * for the specified number of milliseconds

                       * plus the specified number of nanoseconds,

                subject to the precision and accuracy of system timers and schedulers.

         ○ The thread does not lose ownership of any monitors.
     *
     * @param  millis
     *         the length of time to sleep in milliseconds
     *
     * @param  nanos
     *            0-999999} additional nanoseconds to sleep
     *
     * @throws  IllegalArgumentException
     *          if the value of    millis} is negative, or the value of
     *             nanos} is not in the range    0-999999}
     *
     * @throws  InterruptedException
     *          if any thread has interrupted the current thread. The
     *            interrupted status   of the current thread is
     *          cleared when this exception is thrown.
     */
    public static void sleep(long millis, int nanos)
            throws InterruptedException {
        if (millis < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                    "nanosecond timeout value out of range");
        }

        if (nanos >= 500000 || (nanos != 0 && millis == 0)) {
            millis++;
        }

        sleep(millis);
    }

    /**
     * Indicates that the caller is momentarily unable to progress, until the
     * occurrence of one or more actions on the part of other activities. By
     * invoking this method within each iteration of a spin-wait loop construct,
     * the calling thread indicates to the runtime that it is busy-waiting.
     * The runtime may take action to improve the performance of invoking
     * spin-wait loop constructions.
     *
     * @apiNote
     * As an example consider a method in a class that spins in a loop until
     * some flag is set outside of that method. A call to the    onSpinWait}
     * method should be placed inside the spin loop.

     *     class EventHandler {
     *         volatile boolean eventNotificationNotReceived;
     *         void waitForEventAndHandleIt() {
     *             while ( eventNotificationNotReceived ) {
     *                 Thread_   .onSpinWait();
     *             }
     *             readAndProcessEvent();
     *         }
     *
     *         void readAndProcessEvent() {
     *             // Read event from some source and process it
     *              . . .
     *         }
     *     }

     * 
     * The code above would remain correct even if the    onSpinWait}
     * method was not called at all. However on some architectures the Java
     * Virtual Machine may issue the processor instructions to address such
     * code patterns in a more beneficial way.
     *
     * @since 9
     */
    @HotSpotIntrinsicCandidate
    public static void onSpinWait() {}

    /**
     * Tests whether the current thread has been interrupted.  The
     *   interrupted status   of the thread is cleared by this method.  In
     * other words, if this method were to be called twice in succession, the
     * second call would return false (unless the current thread were
     * interrupted again, after the first call had cleared its interrupted
     * status and before the second call had examined it).
     *
     * A thread interruption ignored because a thread was not alive
     * at the time of the interrupt will be reflected by this method
     * returning false.
     *
     * @return     true} if the current thread has been interrupted;
     *             false} otherwise.
     * @see #isInterrupted()
     * @revised 6.0
     */
    public static boolean interrupted() {
        return currentThread().isInterrupted(true);
    }

    /**
     * Returns an estimate of the number of active threads in the current
     * thread's  ThreadGroup thread group and its subgroups.
     * Recursively iterates over all subgroups in the current
     * thread's thread group.
     *
     *  The value returned is only an estimate because the number of
     * threads may change dynamically while this method traverses internal
     * data structures, and might be affected by the presence of certain
     * system threads. This method is intended primarily for debugging
     * and monitoring purposes.
     *
     * @return  an estimate of the number of active threads in the current
     *          thread's thread group and in any other thread group that
     *          has the current thread's thread group as an ancestor
     */
    public static int activeCount() {
        return currentThread().getThreadGroup().activeCount();
    }

    /**
     * Copies into the specified array every active thread in the current
     * thread's thread group and its subgroups. This method simply
     * invokes the  ThreadGroup#enumerate(Thread[])
     * method of the current thread's thread group.
     *
     *  An application might use the  #activeCount activeCount}
     * method to get an estimate of how big the array should be, however
     *   if the array is too short to hold all the threads, the extra threads
     * are silently ignored.    If it is critical to obtain every active
     * thread in the current thread's thread group and its subgroups, the
     * invoker should verify that the returned int value is strictly less
     * than the length of    tarray}.
     *
     *  Due to the inherent race condition in this method, it is recommended
     * that the method only be used for debugging and monitoring purposes.
     *
     * @param  tarray
     *         an array into which to put the list of threads
     *
     * @return  the number of threads put into the array
     *
     * @throws  SecurityException
     *          if  Thread_   Group#checkAccess} determines that
     *          the current thread cannot access its thread group
     */
    public static int enumerate(Thread_ tarray[]) {
        return currentThread().getThreadGroup().enumerate(tarray);
    }

    /**
     * Prints a stack trace of the current thread to the standard error stream.
     * This method is used only for debugging.
     */
    public static void dumpStack() {
        new Exception("Stack trace").printStackTrace();
    }

    /**
     * Returns true if and only if the current thread holds the
     * monitor lock on the specified object.
     *
     * This method is designed to allow a program to assert that
     * the current thread already holds a specified lock:
     * <pre>
     *     assert Thread.holdsLock(obj);
     * </pre>
     *
     * @param  obj the object on which to test lock ownership
     * @throws NullPointerException if obj is    null}
     * @return    true} if the current thread holds the monitor lock on
     *         the specified object.
     * @since 1.4
     */
    public static native boolean holdsLock(Object obj);

    /**
     * Returns a map of stack traces for all live threads.
     * The map keys are threads and each map value is an array of
     *    StackTraceElement} that represents the stack dump
     * of the corresponding    Thread}.
     * The returned stack traces are in the format specified for
     * the  #getStackTrace getStackTrace} method.
     *
     * The threads may be executing while this method is called.
     * The stack trace of each thread only represents a snapshot and
     * each stack trace may be obtained at different time.  A zero-length
     * array will be returned in the map value if the virtual machine has
     * no stack trace information about a thread.
     *
     * If there is a security manager, then the security manager's
     *    checkPermission} method is called with a
     *    RuntimePermission("getStackTrace")} permission as well as
     *    RuntimePermission("modifyThreadGroup_")} permission
     * to see if it is ok to get the stack trace of all threads.
     *
     * @return a    Map} from    Thread} to an array of
     *    StackTraceElement} that represents the stack trace of
     * the corresponding thread.
     *
     * @throws SecurityException
     *        if a security manager exists and its
     *           checkPermission} method doesn't allow
     *        getting the stack trace of thread.
     * @see #getStackTrace
     * @see SecurityManager#checkPermission
     * @see RuntimePermission
     * @see Throwable#getStackTrace
     *
     * @since 1.5
     */
    public static Map<Thread_   , StackTraceElement[]> getAllStackTraces() {
        // check for getStackTrace permission
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkPermission(
                    SecurityConstants.GET_STACK_TRACE_PERMISSION);
            security.checkPermission(
                    SecurityConstants.MODIFY_THREADGROUP_PERMISSION);
        }

        // Get a snapshot of the list of all threads
        Thread_   [] threads = getThreads();
        StackTraceElement[][] traces = dumpThreads(threads);
        Map<Thread_   , StackTraceElement[]> m = new HashMap<>(threads.length);
        for (int i = 0; i < threads.length; i++) {
            StackTraceElement[] stackTrace = traces[i];
            if (stackTrace != null) {
                m.put(threads[i], stackTrace);
            }
            // else terminated so we don't put it in the map
        }
        return m;
    }

    /**
     * Verifies that this (possibly subclass) instance can be constructed
     * without violating security constraints: the subclass must not override
     * security-sensitive non-final methods, or else the
     * "enableContextClassLoaderOverride" RuntimePermission is checked.
     */
    private static boolean isCCLOverridden(Class<?> cl) {
        if (cl == Thread_   .class)
            return false;

        processQueue(Thread_   .Caches.subclassAuditsQueue, Thread_   .Caches.subclassAudits);
        Thread_   .WeakClassKey key = new Thread_   .WeakClassKey(cl, Thread_   .Caches.subclassAuditsQueue);
        Boolean result = Thread_   .Caches.subclassAudits.get(key);
        if (result == null) {
            result = Boolean.valueOf(auditSubclass(cl));
            Thread_   .Caches.subclassAudits.putIfAbsent(key, result);
        }

        return result.booleanValue();
    }

    /**
     * Performs reflective checks on given subclass to verify that it doesn't
     * override security-sensitive non-final methods.  Returns true if the
     * subclass overrides any of the methods, false otherwise.
     */
    private static boolean auditSubclass(final Class<?> subcl) {
        Boolean result = AccessController.doPrivileged(
                new PrivilegedAction<>() {
                    public Boolean run() {
                        for (Class<?> cl = subcl;
                             cl != Thread_   .class;
                             cl = cl.getSuperclass())
                        {
                            try {
                                cl.getDeclaredMethod("getContextClassLoader", new Class<?>[0]);
                                return Boolean.TRUE;
                            } catch (NoSuchMethodException ex) {
                            }
                            try {
                                Class<?>[] params = {ClassLoader.class};
                                cl.getDeclaredMethod("setContextClassLoader", params);
                                return Boolean.TRUE;
                            } catch (NoSuchMethodException ex) {
                            }
                        }
                        return Boolean.FALSE;
                    }
                }
                                                      );
        return result.booleanValue();
    }

    private static native StackTraceElement[][] dumpThreads(Thread_[] threads);

    private static native Thread_[] getThreads();

    /**
     * Returns the default handler invoked when a thread abruptly terminates
     * due to an uncaught exception. If the returned value is    null},
     * there is no default.
     * @since 1.5
     * @see #setDefaultUncaughtExceptionHandler
     * @return the default uncaught exception handler for all threads
     */
    public static Thread_.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler(){
        return defaultUncaughtExceptionHandler;
    }

    /**
     * Set the default handler invoked when a thread abruptly terminates
     * due to an uncaught exception, and no other handler has been defined
     * for that thread.
     *
     * Uncaught exception handling is controlled first by the thread, then
     * by the thread's  ThreadGroup_} object and finally by the default
     * uncaught exception handler. If the thread does not have an explicit
     * uncaught exception handler set, and the thread's thread group
     * (including parent thread groups)  does not specialize its
     *    uncaughtException} method, then the default handler's
     *    uncaughtException} method will be invoked.
     * By setting the default uncaught exception handler, an application
     * can change the way in which uncaught exceptions are handled (such as
     * logging to a specific device, or file) for those threads that would
     * already accept whatever &quot;default&quot; behavior the system
     * provided.
     *
     * Note that the default uncaught exception handler should not usually
     * defer to the thread's    ThreadGroup_} object, as that could cause
     * infinite recursion.
     *
     * @param eh the object to use as the default uncaught exception handler.
     * If    null} then there is no default handler.
     *
     * @throws SecurityException if a security manager is present and it denies
     *          RuntimePermission}   ("setDefaultUncaughtExceptionHandler")}
     *
     * @see #setUncaughtExceptionHandler
     * @see #getUncaughtExceptionHandler
     * @see ThreadGroup_#uncaughtException
     * @since 1.5
     */
    public static void setDefaultUncaughtExceptionHandler(Thread_.UncaughtExceptionHandler eh) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(
                    new RuntimePermission("setDefaultUncaughtExceptionHandler")
                              );
        }

        defaultUncaughtExceptionHandler = eh;
    }

    /**
     * Removes from the specified map any keys that have been enqueued
     * on the specified reference queue.
     */
    static void processQueue(ReferenceQueue<Class<?>> queue,
                             ConcurrentMap<? extends
                                     WeakReference<Class<?>>, ?> map)
    {
        Reference<? extends Class<?>> ref;
        while((ref = queue.poll()) != null) {
            map.remove(ref);
        }
    }

    /**
     * Throws CloneNotSupportedException as a Thread can not be meaningfully
     * cloned. Construct a new Thread instead.
     *
     * @throws  CloneNotSupportedException
     *          always
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /**
     * Causes this thread to begin execution; the Java Virtual Machine
     * calls the    run} method of this thread.
     * 
     * The result is that two threads are running concurrently: the
     * current thread (which returns from the call to the
     *    start} method) and the other thread (which executes its
     *    run} method).
     * 
     * It is never legal to start a thread more than once.
     * In particular, a thread may not be restarted once it has completed
     * execution.
     *
     * @throws     IllegalThreadStateException  if the thread was already started.
     * @see        #run()
     * @see        #stop()
     */
    public synchronized void start() {
        /**
         * This method is not invoked for the main method thread or "system"
         * group threads created/set up by the VM. Any new functionality added
         * to this method in the future may have to also be added to the VM.
         *
         * A zero status value corresponds to state "NEW".
         */
        if (threadStatus != 0)
            throw new IllegalThreadStateException();

        /* Notify the group that this thread is about to be started
         * so that it can be added to the group's list of threads
         * and the group's unstarted count can be decremented. */
        group.add(this);

        boolean started = false;
        try {
            start0();
            started = true;
        } finally {
            try {
                if (!started) {
                    group.threadStartFailed(this);
                }
            } catch (Throwable ignore) {
                /* do nothing. If start0 threw a Throwable then
                  it will be passed up the call stack */
            }
        }
    }

    private native void start0();

    /**
     * If this thread was constructed using a separate
     *    Runnable run object, then that Runnable object's run method is called;
     * otherwise, this method does nothing and returns.
  
     * Subclasses of Thread should override this method.
     *
     * @see     #start()
     * @see     #stop()
     * @see     #Thread_(ThreadGroup_, Runnable, String)
     */
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    /**
     * This method is called by the system to give a Thread
     * a chance to clean up before it actually exits.
     */
    private void exit() {
        if (ThreadLocals != null && TerminatingThreadLocal_.REGISTRY.isPresent()) {
            TerminatingThreadLocal_ .threadTerminated();
        }
        if (group != null) {
            group.threadTerminated(this);
            group = null;
        }
        /* Aggressively null out all reference fields: see bug 4006245 */
        target = null;
        /* Speed the release of some of these resources */
        ThreadLocal_ s = null;
        inheritableThreadLocals = null;
        inheritedAccessControlContext = null;
        blocker = null;
        uncaughtExceptionHandler = null;
    }

    /**
     * Forces the thread to stop executing.
     * 
     * If there is a security manager installed, its checkAccess
     * method is called with    this
     * as its argument. This may result in a
     *    SecurityException being raised (in the current thread).
     * 
     * If this thread is different from the current thread (that is, the current
     * thread is trying to stop a thread other than itself), the
     * security manager's    checkPermission} method (with a
     *    RuntimePermission("stopThread")} argument) is called in
     * addition.
     * Again, this may result in throwing a
     *    SecurityException} (in the current thread).
     * 
     * The thread represented by this thread is forced to stop whatever
     * it is doing abnormally and to throw a newly created
     *    ThreadDeath} object as an exception.
     * 
     * It is permitted to stop a thread that has not yet been started.
     * If the thread is eventually started, it immediately terminates.
     * 
     * An application should not normally try to catch
     *    ThreadDeath} unless it must do some extraordinary
     * cleanup operation (note that the throwing of
     *    ThreadDeath} causes    finally} clauses of
     *    try} statements to be executed before the thread
     * officially dies).  If a    catch} clause catches a
     *    ThreadDeath} object, it is important to rethrow the
     * object so that the thread actually dies.
     * 
     * The top-level error handler that reacts to otherwise uncaught
     * exceptions does not print out a message or otherwise notify the
     * application if the uncaught exception is an instance of
     *    ThreadDeath}.
     *
     * @throws     SecurityException  if the current thread cannot
     *             modify this thread.
     * @see        #interrupt()
     * @see        #checkAccess()
     * @see        #run()
     * @see        #start()
     * @see        ThreadDeath
     * @see        ThreadGroup_#uncaughtException(Thread_ ,Throwable)
     * @see        SecurityManager checkAccess(Thread_)
     * @see        SecurityManager#checkPermission
     * @deprecated This method is inherently unsafe.  Stopping a thread with
     *       Thread.stop causes it to unlock all of the monitors that it
     *       has locked (as a natural consequence of the unchecked
     *          ThreadDeath} exception propagating up the stack).  If
     *       any of the objects previously protected by these monitors were in
     *       an inconsistent state, the damaged objects become visible to
     *       other threads, potentially resulting in arbitrary behavior.  Many
     *       uses of    stop} should be replaced by code that simply
     *       modifies some variable to indicate that the target thread should
     *       stop running.  The target thread should check this variable
     *       regularly, and return from its run method in an orderly fashion
     *       if the variable indicates that it is to stop running.  If the
     *       target thread waits for long periods (on a condition variable,
     *       for example), the    interrupt} method should be used to
     *       interrupt the wait.
     *       For more information, see
     *       <a href="{@docRoot}/java.base/java/lang/doc-files/threadPrimitiveDeprecation.html">Why
     *       are Thread.stop, Thread.suspend and Thread.resume Deprecated?</a>.
     */
    @Deprecated(since="1.2")
    public final void stop() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            checkAccess();
            if (this != Thread_   .currentThread()) {
                security.checkPermission(SecurityConstants.STOP_THREAD_PERMISSION);
            }
        }
        // A zero status value corresponds to "NEW", it can't change to
        // not-NEW because we hold the lock.
        if (threadStatus != 0) {
            resume(); // Wake up thread if it was suspended; no-op otherwise
        }

        // The VM can handle all thread states
        stop0(new ThreadDeath());
    }

    /**
     * Interrupts this thread.

     *  Unless the current thread is interrupting itself, which is
     * always permitted, the  #checkAccess() checkAccess method
     * of this thread is invoked, which may cause a
     * SecurityException to be thrown.
     *
     *  If this thread is blocked in an invocation of the
     * Object#wait() wait(),  Object#wait(long) wait(long)}, or
     * Object#wait(long, int) wait(long, int) methods of the  Object
     * class, or of the  #join()},  #join(long)},
     * #join(long, int),  #sleep(long)}, or  #sleep(long, int)},
     * methods of this class, then its interrupt status will be cleared and it
     * will receive an  InterruptedException}.
     *
     *  If this thread is blocked in an I/O operation upon an
     * java.nio.channels.InterruptibleChannel InterruptibleChannel}
     * then the channel will be closed, the thread's interrupt
     * status will be set, and the thread will receive a
     * java.nio.channels.ClosedByInterruptException.
     *
     *  If this thread is blocked in a  java.nio.channels.Selector}
     * then the thread's interrupt status will be set and it will return
     * immediately from the selection operation, possibly with a non-zero
     * value, just as if the selector's
     * java.nio.channels.Selector#wakeup wakeup} method were invoked.
     *
     *  If none of the previous conditions hold then this thread's interrupt
     * status will be set. </p>
     *
     *  Interrupting a thread that is not alive need not have any effect.
     *
     * @throws  SecurityException
     *          if the current thread cannot modify this thread
     *
     * @revised 6.0
     * @spec JSR-51
     */
    public void interrupt() {
        if (this != Thread_.currentThread()) {
            checkAccess();

            // thread may be blocked in an I/O operation
            synchronized (blockerLock) {
                Interruptible b = blocker;
                if (b != null) {
                    interrupt0();  // set interrupt status
                    b.interrupt(Thread.currentThread());
                    return;
                }
            }
        }

        // set interrupt status
        interrupt0();
    }

    /**
     * Tests whether this thread has been interrupted.  The   interrupted
     * status   of the thread is unaffected by this method.
     *
     * A thread interruption ignored because a thread was not alive
     * at the time of the interrupt will be reflected by this method
     * returning false.
     *
     * @return     true} if this thread has been interrupted;
     *             false} otherwise.
     * @see     #interrupted()
     * @revised 6.0
     */
    public boolean isInterrupted() {
        return isInterrupted(false);
    }

    /**
     * Tests if some Thread has been interrupted.  The interrupted state
     * is reset or not based on the value of ClearInterrupted that is
     * passed.
     */
    @HotSpotIntrinsicCandidate
    private native boolean isInterrupted(boolean ClearInterrupted);

    /**
     * Tests if this thread is alive. A thread is alive if it has
     * been started and has not yet died.
     *
     * @return     true if this thread is alive;
     *             false otherwise.
     */
    public final native boolean isAlive();

    /**
     * Suspends this thread.
     * 
     * First, the    checkAccess} method of this thread is called
     * with no arguments. This may result in throwing a
     *    SecurityException }(in the current thread).
     * 
     * If the thread is alive, it is suspended and makes no further
     * progress unless and until it is resumed.
     *
     * @throws     SecurityException  if the current thread cannot modify
     *             this thread.
     * @see #checkAccess
     * @deprecated   This method has been deprecated, as it is
     *   inherently deadlock-prone.  If the target thread holds a lock on the
     *   monitor protecting a critical system resource when it is suspended, no
     *   thread can access this resource until the target thread is resumed. If
     *   the thread that would resume the target thread attempts to lock this
     *   monitor prior to calling    resume}, deadlock results.  Such
     *   deadlocks typically manifest themselves as "frozen" processes.
     *   For more information, see
     *   <a href="{@docRoot}/java.base/java/lang/doc-files/threadPrimitiveDeprecation.html">Why
     *   are Thread.stop, Thread.suspend and Thread.resume Deprecated?</a>.
     */
    @Deprecated(since="1.2")
    public final void suspend() {
        checkAccess();
        suspend0();
    }

    /**
     * Resumes a suspended thread.
     * 
     * First, the    checkAccess} method of this thread is called
     * with no arguments. This may result in throwing a
     *    SecurityException} (in the current thread).
     * 
     * If the thread is alive but suspended, it is resumed and is
     * permitted to make progress in its execution.
     *
     * @throws     SecurityException  if the current thread cannot modify this
     *             thread.
     * @see        #checkAccess
     * @see        #suspend()
     * @deprecated This method exists solely for use with  #suspend},
     *     which has been deprecated because it is deadlock-prone.
     *     For more information, see
     *     <a href="{@docRoot}/java.base/java/lang/doc-files/threadPrimitiveDeprecation.html">Why
     *     are Thread.stop, Thread.suspend and Thread.resume Deprecated?</a>.
     */
    @Deprecated(since="1.2")
    public final void resume() {
        checkAccess();
        resume0();
    }

    /**
     * Returns this thread's priority.
     *
     * @return  this thread's priority.
     * @see     #setPriority
     */
    public final int getPriority() {
        return priority;
    }

    /**
     * Changes the priority of this thread.
     * 
     * First the    checkAccess} method of this thread is called
     * with no arguments. This may result in throwing a    SecurityException}.
     * 
     * Otherwise, the priority of this thread is set to the smaller of
     * the specified    newPriority} and the maximum permitted
     * priority of the thread's thread group.
     *
     * @param newPriority priority to set this thread to
     * @throws     IllegalArgumentException  If the priority is not in the
     *               range    MIN_PRIORITY} to
     *                  MAX_PRIORITY}.
     * @throws     SecurityException  if the current thread cannot modify
     *               this thread.
     * @see        #getPriority
     * @see        #checkAccess()
     * @see        #getThreadGroup()
     * @see        #MAX_PRIORITY
     * @see        #MIN_PRIORITY
     * @see        ThreadGroup_#getMaxPriority()
     */
    public final void setPriority(int newPriority) {
        ThreadGroup_ g;
        checkAccess();
        if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
            throw new IllegalArgumentException();
        }
        if((g = getThreadGroup()) != null) {
            if (newPriority > g.getMaxPriority()) {
                newPriority = g.getMaxPriority();
            }
            setPriority0(priority = newPriority);
        }
    }

    /**
     * Returns this thread's name.
     *
     * @return  this thread's name.
     * @see     #setName(String)
     */
    public final String getName() {
        return name;
    }

    /**
     * Changes the name of this thread to be equal to the argument    name}.
     * 
     * First the    checkAccess} method of this thread is called
     * with no arguments. This may result in throwing a
     *    SecurityException}.
     *
     * @param      name   the new name for this thread.
     * @throws     SecurityException  if the current thread cannot modify this
     *             thread.
     * @see        #getName
     * @see        #checkAccess()
     */
    public final synchronized void setName(String name) {
        checkAccess();
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }

        this.name = name;
        if (threadStatus != 0) {
            setNativeName(name);
        }
    }

    /**
     * Returns the thread group to which this thread belongs.
     * This method returns null if this thread has died
     * (been stopped).
     *
     * @return  this thread's thread group.
     */
    public final ThreadGroup_ getThreadGroup() {
        return group;
    }

    /**
     * Counts the number of stack frames in this thread. The thread must
     * be suspended.
     *
     * @return     the number of stack frames in this thread.
     * @throws     IllegalThreadStateException  if this thread is not
     *             suspended.
     * @deprecated The definition of this call depends on  #suspend},
     *             which is deprecated.  Further, the results of this call
     *             were never well-defined.
     *             This method is subject to removal in a future version of Java SE.
     * @see        StackWalker
     */
    @Deprecated(since="1.2", forRemoval=true)
    public native int countStackFrames();

    /**
     * Waits at most  millis milliseconds for this thread to
     * die. A timeout of 0 means to wait forever.
     *
     *  This implementation uses a loop of  this.wait calls
     * conditioned on this.isAlive.As a thread terminates the
     *  this.notifyAll method is invoked. It is recommended that
     * applications not use  wait, notify, or  notifyAll on Thread instances.
     *
     * @param  millis
     *         the time to wait in milliseconds
     *
     * @throws  IllegalArgumentException
     *          if the value of    millis} is negative
     *
     * @throws  InterruptedException
     *          if any thread has interrupted the current thread. The
     *            interrupted status   of the current thread is
     *          cleared when this exception is thrown.
     */
    public final synchronized void join(long millis)
            throws InterruptedException {
        long base = System.currentTimeMillis();
        long now = 0;

        if (millis < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (millis == 0) {
            while (isAlive()) {
                wait(0);
            }
        } else {
            while (isAlive()) {
                long delay = millis - now;
                if (delay <= 0) {
                    break;
                }
                wait(delay);
                now = System.currentTimeMillis() - base;
            }
        }
    }

    /**
     * Waits at most  millis milliseconds plus
     *    nanos nanoseconds for this thread to die.
     * If both arguments are 0, it means to wait forever.
     *
     *  This implementation uses a loop of this.wait calls
     * conditioned on    this.isAlive}. As a thread terminates the
     *    this.notifyAll} method is invoked. It is recommended that
     * applications not use    wait},    notify}, or
     *    notifyAll} on    Thread} instances.
     *
     * @param  millis
     *         the time to wait in milliseconds
     *
     * @param  nanos
     *            0-999999} additional nanoseconds to wait
     *
     * @throws  IllegalArgumentException
     *          if the value of    millis} is negative, or the value
     *          of    nanos} is not in the range    0-999999}
     *
     * @throws  InterruptedException
     *          if any thread has interrupted the current thread. The
     *            interrupted status   of the current thread is
     *          cleared when this exception is thrown.
     */
    public final synchronized void join(long millis, int nanos)
            throws InterruptedException {

        if (millis < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                    "nanosecond timeout value out of range");
        }

        if (nanos >= 500000 || (nanos != 0 && millis == 0)) {
            millis++;
        }

        join(millis);
    }

    /**
     * Waits for this thread to die.
     * An invocation of this method behaves in exactly the same way as the invocation
    
     *  #join(long) join(0)
  
     * @throws  InterruptedException
     *          if any thread has interrupted the current thread. The
     *          interrupted status of the current thread is
     *          cleared when this exception is thrown.
     */
    public final void join() throws InterruptedException {
        join(0);
    }

    /**
     * Tests if this thread is a daemon thread.
     *
     * @return     true} if this thread is a daemon thread;
     *             false} otherwise.
     * @see     #setDaemon(boolean)
     */
    public final boolean isDaemon() {
        return daemon;
    }

    /**
    ○  Marks this thread as either a  #isDaemon daemon thread or a user thread.

                   * The Java Virtual Machine exits

                                 - when the only threads running are all daemon threads.

     ○ This method must be invoked before the thread is started.
     *
     * @param  on
     *         if    true}, marks this thread as a daemon thread
     *
     * @throws  IllegalThreadStateException
     *          if this thread is  #isAlive alive}
     *
     * @throws  SecurityException
     *          if  #checkAccess} determines that the current
     *          thread cannot modify this thread
     */
    public final void setDaemon(boolean on) {
        checkAccess();
        if (isAlive()) {
            throw new IllegalThreadStateException();
        }
        daemon = on;
    }

    /**
     * Determines if the currently running thread has permission to
     * modify this thread.
     * 
     * If there is a security manager, its    checkAccess} method
     * is called with this thread as its argument. This may result in
     * throwing a    SecurityException}.
     *
     * @throws  SecurityException  if the current thread is not allowed to
     *          access this thread.
     * @see        SecurityManager#checkAccess(Thread)
     */
    public final void checkAccess() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkAccess(Thread.currentThread());
        }
    }

    // Added in JSR-166

    /**
     * Returns a string representation of this thread, including the
     * thread's name, priority, and thread group.
     *
     * @return  a string representation of this thread.
     */
    public String toString() {
        ThreadGroup_ group = getThreadGroup();
        if (group != null) {
            return "Thread[" + getName() + "," + getPriority() + "," +
                    group.getName() + "]";
        } else {
            return "Thread[" + getName() + "," + getPriority() + "," +
                    "" + "]";
        }
    }

    /**
     * Returns the context    ClassLoader} for this thread. The context
     *    ClassLoader} is provided by the creator of the thread for use
     * by code running in this thread when loading classes and resources.
     * If not  #setContextClassLoader set}, the default is the
     *    ClassLoader} context of the parent thread. The context
     *    ClassLoader} of the
     * primordial thread is typically set to the class loader used to load the
     * application.
     *
     *
     * @return  the context    ClassLoader} for this thread, or    null}
     *          indicating the system class loader (or, failing that, the
     *          bootstrap class loader)
     *
     * @throws  SecurityException
     *          if a security manager is present, and the caller's class loader
     *          is not    null} and is not the same as or an ancestor of the
     *          context class loader, and the caller does not have the
     *           RuntimePermission}   ("getClassLoader")}
     *
     * @since 1.2
     */
  //  @CallerSensitive
    public ClassLoader getContextClassLoader() {
        if (contextClassLoader == null)
            return null;
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
        //    ClassLoader.checkClassLoaderPermission(contextClassLoader, Reflection.getCallerClass());
        }
        return contextClassLoader;
    }

    /**
     * Sets the context ClassLoader for this Thread. The context
     * ClassLoader can be set when a thread is created, and allows
     * the creator of the thread to provide the appropriate class loader,
     * through    getContextClassLoader}, to code running in the thread
     * when loading classes and resources.
     *
     * If a security manager is present, its
     * SecurityManager#checkPermission(java.security.Permission) checkPermission}
     * method is invoked with a  RuntimePermission RuntimePermission}
     * ("setContextClassLoader")} permission to see if setting the context
     * ClassLoader is permitted.
     *
     * @param  cl
     *         the context ClassLoader for this Thread, or null  indicating the
     *         system class loader (or, failing that, the bootstrap class loader)
     *
     * @throws  SecurityException
     *          if the current thread cannot set the context ClassLoader
     *
     * @since 1.2
     */
    public void setContextClassLoader(ClassLoader cl) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new RuntimePermission("setContextClassLoader"));
        }
        contextClassLoader = cl;
    }

    /**
     * Returns an array of stack trace elements representing the stack dump
     * of this thread.  This method will return a zero-length array if
     * this thread has not started, has started but has not yet been
     * scheduled to run by the system, or has terminated.
     * If the returned array is of non-zero length then the first element of
     * the array represents the top of the stack, which is the most recent
     * method invocation in the sequence.  The last element of the array
     * represents the bottom of the stack, which is the least recent method
     * invocation in the sequence.
     *
     * If there is a security manager, and this thread is not
     * the current thread, then the security manager's
     *    checkPermission} method is called with a
     *    RuntimePermission("getStackTrace")} permission
     * to see if it's ok to get the stack trace.
     *
     * Some virtual machines may, under some circumstances, omit one
     * or more stack frames from the stack trace.  In the extreme case,
     * a virtual machine that has no stack trace information concerning
     * this thread is permitted to return a zero-length array from this
     * method.
     *
     * @return an array of    StackTraceElement},
     * each represents one stack frame.
     *
     * @throws SecurityException
     *        if a security manager exists and its
     *           checkPermission} method doesn't allow
     *        getting the stack trace of thread.
     * @see SecurityManager#checkPermission
     * @see RuntimePermission
     * @see Throwable#getStackTrace
     *
     * @since 1.5
     */
    public StackTraceElement[] getStackTrace() {
        if (this != Thread_   .currentThread()) {
            // check for getStackTrace permission
            SecurityManager security = System.getSecurityManager();
            if (security != null) {
                security.checkPermission(
                        SecurityConstants.GET_STACK_TRACE_PERMISSION);
            }
            // optimization so we do not call into the vm for threads that
            // have not yet started or have terminated
            if (!isAlive()) {
                return EMPTY_STACK_TRACE;
            }
            StackTraceElement[][] stackTraceArray = dumpThreads(new Thread_   [] {this});
            StackTraceElement[] stackTrace = stackTraceArray[0];
            // a thread that was alive during the previous isAlive call may have
            // since terminated, therefore not having a stacktrace.
            if (stackTrace == null) {
                stackTrace = EMPTY_STACK_TRACE;
            }
            return stackTrace;
        } else {
            return (new Exception()).getStackTrace();
        }
    }

    /**
     * Returns the identifier of this Thread.  The thread ID is a positive
     *    long} number generated when this thread was created.
     * The thread ID is unique and remains unchanged during its lifetime.
     * When a thread is terminated, this thread ID may be reused.
     *
     * @return this thread's ID.
     * @since 1.5
     */
    public long getId() {
        return tid;
    }

    /**
     * Returns the state of this thread.
     * This method is designed for use in monitoring of the system state,
     * not for synchronization control.
     *
     * @return this thread's state.
     * @since 1.5
     */
    public Thread.State getState() {
        // get current thread state
        return jdk.internal.misc.VM.toThreadState(threadStatus);
    }

    /**
     * Returns the handler invoked when this thread abruptly terminates
     * due to an uncaught exception. If this thread has not had an
     * uncaught exception handler explicitly set then this thread's
     *    ThreadGroup_} object is returned, unless this thread
     * has terminated, in which case    null} is returned.
     * @since 1.5
     * @return the uncaught exception handler for this thread
     */
    public Thread_   .UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return uncaughtExceptionHandler != null ?
                uncaughtExceptionHandler : group;
    }

    /**
     * Set the handler invoked when this thread abruptly terminates
     * due to an uncaught exception.
     * A thread can take full control of how it responds to uncaught
     * exceptions by having its uncaught exception handler explicitly set.
     * If no such handler is set then the thread's    ThreadGroup_}
     * object acts as its handler.
     * @param eh the object to use as this thread's uncaught exception
     * handler. If    null} then this thread has no explicit handler.
     * @throws  SecurityException  if the current thread is not allowed to
     *          modify this thread.
     * @see #setDefaultUncaughtExceptionHandler
     * @see ThreadGroup_#uncaughtException
     * @since 1.5
     */
    public void setUncaughtExceptionHandler(Thread_.UncaughtExceptionHandler eh) {
        checkAccess();
        uncaughtExceptionHandler = eh;
    }

    /**
     * Dispatch an uncaught exception to the handler. This method is
     * intended to be called only by the JVM.
     */
    private void dispatchUncaughtException(Throwable e) {
        getUncaughtExceptionHandler().uncaughtException(this, e);
    }

    /* Some private helper methods */
    private native void setPriority0(int newPriority);


    // The following three initially uninitialized fields are exclusively
    // managed by class java.util.concurrent.ThreadLocal_ Random. These
    // fields are used to build the high-performance PRNGs in the
    // concurrent code, and we can not risk accidental false sharing.
    // Hence, the fields are isolated with @Contended.

    private native void stop0(Object o);

    private native void suspend0();

    private native void resume0();

    private native void interrupt0();

    private native void setNativeName(String name);
    /**
     * A thread state.  A thread can be in one of the following states:
     * <ul>
     * <li> #NEW}<br>
     *     A thread that has not yet started is in this state.
     *     </li>
     * <li> #RUNNABLE}<br>
     *     A thread executing in the Java virtual machine is in this state.
     *     </li>
     * <li> #BLOCKED}<br>
     *     A thread that is blocked waiting for a monitor lock
     *     is in this state.
     *     </li>
     * <li> #WAITING}<br>
     *     A thread that is waiting indefinitely for another thread to
     *     perform a particular action is in this state.
     *     </li>
     * <li> #TIMED_WAITING}<br>
     *     A thread that is waiting for another thread to perform an action
     *     for up to a specified waiting time is in this state.
     *     </li>
     * <li> #TERMINATED}<br>
     *     A thread that has exited is in this state.
     *     </li>
     * </ul>
     *
     * 
     * A thread can be in only one state at a given point in time.
     * These states are virtual machine states which do not reflect
     * any operating system thread states.
     *
     * @since   1.5
     * @see #getState
     */
    public enum State {
        /**
         * Thread state for a thread which has not yet started.
         */
        NEW,

        /**
         * Thread state for a runnable thread.  A thread in the runnable
         * state is executing in the Java virtual machine but it may
         * be waiting for other resources from the operating system
         * such as processor.
         */
        RUNNABLE,

        /**
         * Thread state for a thread blocked waiting for a monitor lock.
         * A thread in the blocked state is waiting for a monitor lock
         * to enter a synchronized block/method or
         * reenter a synchronized block/method after calling
         *  Object#wait() Object.wait}.
         */
        BLOCKED,

        /**
         * Thread state for a waiting thread.
         * A thread is in the waiting state due to calling one of the
         * following methods:
         * <ul>
         *   <li> Object#wait() Object.wait} with no timeout</li>
         *   <li> #join() Thread.join} with no timeout</li>
         *   <li> LockSupport#park() LockSupport.park}</li>
         * </ul>
         *
         * A thread in the waiting state is waiting for another thread to
         * perform a particular action.
         *
         * For example, a thread that has called    Object.wait()}
         * on an object is waiting for another thread to call
         *    Object.notify()} or    Object.notifyAll()} on
         * that object. A thread that has called    Thread.join()}
         * is waiting for a specified thread to terminate.
         */
        WAITING,

        /**
         * Thread state for a waiting thread with a specified waiting time.
         * A thread is in the timed waiting state due to calling one of
         * the following methods with a specified positive waiting time:
         * <ul>
         *   <li> #sleep Thread.sleep}</li>
         *   <li> Object#wait(long) Object.wait} with timeout</li>
         *   <li> #join(long) Thread.join} with timeout</li>
         *   <li> LockSupport#parkNanos LockSupport.parkNanos}</li>
         *   <li> LockSupport#parkUntil LockSupport.parkUntil}</li>
         * </ul>
         */
        TIMED_WAITING,

        /**
         * Thread state for a terminated thread.
         * The thread has completed execution.
         */
        TERMINATED;
    }
    /**
     * Interface for handlers invoked when a    Thread} abruptly
     * terminates due to an uncaught exception.
     * When a thread is about to terminate due to an uncaught exception
     * the Java Virtual Machine will query the thread for its
     *    UncaughtExceptionHandler} using
     *  #getUncaughtExceptionHandler} and will invoke the handler's
     *    uncaughtException} method, passing the thread and the
     * exception as arguments.
     * If a thread has not had its    UncaughtExceptionHandler}
     * explicitly set, then its    ThreadGroup_} object acts as its
     *    UncaughtExceptionHandler}. If the    ThreadGroup_} object
     * has no
     * special requirements for dealing with the exception, it can forward
     * the invocation to the  #getDefaultUncaughtExceptionHandler
     * default uncaught exception handler}.
     *
     * @see #setDefaultUncaughtExceptionHandler
     * @see #setUncaughtExceptionHandler
     * @see ThreadGroup_#uncaughtException
     * @since 1.5
     */
    @FunctionalInterface
    public interface UncaughtExceptionHandler {
        /**
         * Method invoked when the given thread terminates due to the
         * given uncaught exception.
         * Any exception thrown by this method will be ignored by the
         * Java Virtual Machine.
         * @param t the thread
         * @param e the exception
         */
        void uncaughtException(Thread_ t, Throwable e);
    }

    /** cache of subclass security audit results */
    /* Replace with ConcurrentReferenceHashMap when/if it appears in a future
     * release */
    private static class Caches {
        /** cache of subclass security audit results */
        static final ConcurrentMap<Thread_   .WeakClassKey,Boolean> subclassAudits =
                new ConcurrentHashMap<>();

        /** queue for WeakReferences to audited subclasses */
        static final ReferenceQueue<Class<?>> subclassAuditsQueue =
                new ReferenceQueue<>();
    }

    /**
     *  Weak key for Class objects.
     **/
    static class WeakClassKey extends WeakReference<Class<?>> {
        /**
         * saved value of the referent's identity hash code, to maintain
         * a consistent hash code after the referent has been cleared
         */
        private final int hash;

        /**
         * Create a new WeakClassKey to the given object, registered
         * with a queue.
         */
        WeakClassKey(Class<?> cl, ReferenceQueue<Class<?>> refQueue) {
            super(cl, refQueue);
            hash = System.identityHashCode(cl);
        }

        /**
         * Returns the identity hash code of the original referent.
         */
        @Override
        public int hashCode() {
            return hash;
        }

        /**
         * Returns true if the given object is this identical
         * WeakClassKey instance, or, if this object's referent has not
         * been cleared, if the given object is another WeakClassKey
         * instance with the identical non-null referent as this one.
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == this)
                return true;

            if (obj instanceof Thread_.WeakClassKey) {
                Object referent = get();
                return (referent != null) &&
                        (referent == ((Thread_.WeakClassKey) obj).get());
            } else {
                return false;
            }
        }
    }
}
