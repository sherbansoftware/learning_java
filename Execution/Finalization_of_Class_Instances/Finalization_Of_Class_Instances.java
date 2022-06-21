package Execution.Finalization_of_Class_Instances;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.6

/*                                                      Finalization of Class Instances

    The class Object has a protected method called finalize; this method can be overridden by other classes. The particular
        definition of finalize that can be invoked for an object is called the finalizer of that object. Before the storage
        for an object is reclaimed by the garbage collector, the Java Virtual Machine will invoke the finalizer of that object.

    Finalizers provide a chance to free up resources that cannot be freed automatically by an automatic storage manager.
        In such situations, simply reclaiming the memory used by an object would not guarantee that the resources it held
        would be reclaimed.

    The Java programming language does not specify how soon a finalizer will be invoked,
        except to say that it will happen before the storage for the object is reused.

    The Java programming language does not specify which thread will invoke the finalizer for any given object.

    It is important to note that many finalizer threads may be active (this is sometimes needed on large shared memory
        multiprocessors), and that if a large connected data structure becomes garbage, all of the finalize methods for
        every object in that data structure could be invoked at the same time, each finalizer invocation running in a
        different thread.

    The Java programming language imposes no ordering on finalize method calls.Finalizers may be called in any order,
        or even concurrently.

    As an example, if a circularly linked group of unfinalized objects becomes unreachable (or finalizer-reachable), then
        all the objects may become finalizable together. Eventually, the finalizers for these objects may be invoked, in
        any order, or even concurrently using multiple threads. If the automatic storage manager later finds that the
        objects are unreachable, then their storage can be reclaimed.

    It is straightforward to implement a class that will cause a set of finalizer-like methods to be invoked in a specified
        order for a set of objects when all the objects become unreachable. Defining such a class is left as an exercise
        for the reader.

    It is guaranteed that the thread that invokes the finalizer will not be holding any user-visible synchronization locks
        when the finalizer is invoked.

    If an uncaught exception is thrown during the finalization, the exception is ignored and finalization of that object
        terminates.

    The completion of an object's constructor happens-before (§17.4.5) the execution of its finalize method (in the formal
        sense of happens-before).

    The finalize method declared in class Object takes no action. The fact that class Object declares a finalize method
        means that the finalize method for any class can always invoke the finalize method for its superclass. This should
        always be done, unless it is the programmer's intent to nullify the actions of the finalizer in the superclass.
        (Unlike constructors, finalizers do not automatically invoke the finalizer for the superclass; such an invocation
        must be coded explicitly.)

    For efficiency, an implementation may keep track of classes that do not override the finalize method of class Object,
        or override it in a trivial way.

        For example:


                protected void finalize() throws Throwable {
                    super.finalize();
                }

    We encourage implementations to treat such objects as having a finalizer that is not overridden, and to finalize them
        more efficiently, as described in §12.6.1.

    A finalizer may be invoked explicitly, just like any other method.

    The package

        java.lang.ref

    describes weak references, which interact with garbage collection and finalization.As with any API that has special
        interactions with the Java programming language, implementors must be cognizant of any requirements imposed by
        the java.lang.ref API. This specification does not discuss weak references in any way. Readers are referred to
        the API documentation for details.

 */


public class Finalization_Of_Class_Instances {
}
