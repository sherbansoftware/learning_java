package Execution.Unloading_of_Classes_and_Interfaces;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.7

/*                                                      Unloading of Classes and Interfaces

    An implementation of the Java programming language may unload classes.

    A class or interface may be unloaded if and only if

            its defining class loader may be reclaimed by the garbage collector

        as discussed in https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.6

    Classes and interfaces loaded by the bootstrap loader may not be unloaded.

    Class unloading is an optimization that helps reduce memory use. Obviously, the semantics of a program should not
        depend on whether and how a system chooses to implement an optimization such as class unloading. To do otherwise
        would compromise the portability of programs. Consequently, whether a class or interface has been unloaded or not
        should be transparent to a program.

    However, if a class or interface C was unloaded while its defining loader was potentially reachable, then C might be
        reloaded. One could never ensure that this would not happen. Even if the class was not referenced by any other
        currently loaded class, it might be referenced by some class or interface, D, that had not yet been loaded.
        When D is loaded by C's defining loader, its execution might cause reloading of C.

    Reloading may not be transparent if, for example, the class has

                * static variables (whose state would be lost),
                * static initializers (which may have side effects),
                * or native methods (which may retain static state).

            Furthermore, the hash value of the Class object is dependent on its identity. Therefore it is, in general,
                impossible to reload a class or interface in a completely transparent manner.

    Since we can never guarantee that unloading a class or interface whose loader is potentially reachable will not cause
        reloading, and reloading is never transparent, but unloading must be transparent, it follows that one must not
        unload a class or interface while its loader is potentially reachable. A similar line of reasoning can be used
        to deduce that classes and interfaces loaded by the bootstrap loader can never be unloaded.

    One must also argue why it is safe to unload a class C if its defining class loader can be reclaimed. If the defining
        loader can be reclaimed, then there can never be any live references to it (this includes references that are not
        live, but might be resurrected by finalizers). This, in turn, can only be true if there are can never be any live
        references to any of the classes defined by that loader, including C, either from their instances or from code.

    Class unloading is an optimization that is only significant for applications that load large numbers of classes and
        that stop using most of those classes after some time.

    A prime example of such an application is a

                web browser,

         but there are others.

     A characteristic of such applications is that they manage classes through explicit use of class loaders. As a result,
         the policy outlined above works well for them.

    Strictly speaking, it is not essential that the issue of class unloading be discussed by this specification, as class
        unloading is merely an optimization. However, the issue is very subtle, and so it is mentioned here by way of
        clarification.

*/

public class Unloading_Of_Classes_And_Interfaces {
}
