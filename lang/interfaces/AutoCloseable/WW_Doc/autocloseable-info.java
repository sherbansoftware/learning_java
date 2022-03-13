package lang.interfaces.AutoCloseable.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/AutoCloseable.html

/*                                    public interface AutoCloseable

    An object that may hold resources (such as file or socket handles) until it is closed. The close() method of an
        AutoCloseable object is called automatically when exiting a try-with-resources block for which the object has
        been declared in the resource specification header. This construction ensures prompt release, avoiding resource
        exhaustion exceptions and errors that may otherwise occur.

    API Note:
        It is possible, and in fact common, for a base class to implement AutoCloseable even though not all of its
        subclasses or instances will hold releasable resources. For code that must operate in complete generality,
        or when it is known that the AutoCloseable instance requires resource release, it is recommended to use
        try-with-resources constructions. However, when using facilities such as Stream that support both I/O-based
        and non-I/O-based forms, try-with-resources blocks are in general unnecessary when using non-I/O-based forms.

    Since:
        1.7


 */