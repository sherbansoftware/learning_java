package lang.classes.Throwable.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html

// https://www.geeksforgeeks.org/throwable-class-in-java-with-examples/

class Throwable_RT {
    Throwable throwable;
}

/*               public class Throwable extends Object implements Serializable

    The Throwable class is the superclass of all errors and exceptions in the Java language. Only objects that are
        instances of this class (or one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by
        the Java throw statement. Similarly, only this class or one of its subclasses can be the argument type in a
        catch clause. For the purposes of compile-time checking of exceptions, Throwable and any subclass of Throwable
        that is not also a subclass of either RuntimeException or Error are regarded as checked exceptions.
    Instances of two subclasses, Error and Exception, are conventionally used to indicate that exceptional situations
        have occurred. Typically, these instances are freshly created in the context of the exceptional situation so as
        to include relevant information (such as stack trace data).

    A throwable contains a snapshot of the execution stack of its thread at the time it was created. It can also contain
        a message string that gives more information about the error. Over time, a throwable can suppress other throwables
        from being propagated. Finally, the throwable can also contain a cause: another throwable that caused this throwable
        to be constructed. The recording of this causal information is referred to as the chained exception facility, as
        the cause can, itself, have a cause, and so on, leading to a "chain" of exceptions, each caused by another.

    One reason that a throwable may have a cause is that the class that throws it is built atop a lower layered abstraction,
        and an operation on the upper layer fails due to a failure in the lower layer. It would be bad design to let the
        throwable thrown by the lower layer propagate outward, as it is generally unrelated to the abstraction provided
        by the upper layer. Further, doing so would tie the API of the upper layer to the details of its implementation,
        assuming the lower layer's exception was a checked exception. Throwing a "wrapped exception" (i.e., an exception
        containing a cause) allows the upper layer to communicate the details of the failure to its caller without incurring
        either of these shortcomings. It preserves the flexibility to change the implementation of the upper layer without
        changing its API (in particular, the set of exceptions thrown by its methods).

    A second reason that a throwable may have a cause is that the method that throws it must conform to a general-purpose
        interface that does not permit the method to throw the cause directly. For example, suppose a persistent collection
        conforms to the Collection interface, and that its persistence is implemented atop java.io. Suppose the internals
        of the add method can throw an IOException. The implementation can communicate the details of the IOException to
        its caller while conforming to the Collection interface by wrapping the IOException in an appropriate unchecked
        exception. (The specification for the persistent collection should indicate that it is capable of throwing such
        exceptions.)

   A cause can be associated with a throwable in two ways: via a constructor that takes the cause as an argument, or
       via the initCause(Throwable) method. New throwable classes that wish to allow causes to be associated with them
       should provide constructors that take a cause and delegate (perhaps indirectly) to one of the Throwable constructors
       that takes a cause. Because the initCause method is public, it allows a cause to be associated with any throwable,
       even a "legacy throwable" whose implementation predates the addition of the exception chaining mechanism to Throwable.

    By convention, class Throwable and its subclasses have two constructors, one that takes no arguments and one that
        takes a String argument that can be used to produce a detail message. Further, those subclasses that might likely
        have a cause associated with them should have two more constructors, one that takes a Throwable (the cause),
        and one that takes a String (the detail message) and a Throwable (the cause).

    Since:
        JDK1.0

    See Also:
        Serialized Form
   See The Java™ Language Specification:
       11.2 Compile-Time Checking of Exceptions

 */ 