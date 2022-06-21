package lang.classes.ThreadGroup.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/lang/ThreadGroup.html

// https://www.codejava.net/java-core/concurrency/understanding-thread-group-in-java

class ThreadGroup_RT {
    ThreadGroup threadGroups;
}

/*                      public class ThreadGroup extends Object implements Thread.UncaughtExceptionHandler

    A thread group represents a set of threads. In addition, a thread group can also include other thread groups. The
        thread groups form a tree in which every thread group except the initial thread group has a parent.
    A thread is allowed to access information about its own thread group, but not to access information about its thread
        group's parent thread group or any other thread groups.

    Since:
        JDK1.0

    RELATED

        https://www.tutorialspoint.com/java/lang/java_lang_threadgroup.htm

 */ 