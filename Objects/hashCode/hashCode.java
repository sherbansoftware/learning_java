package Objects.hashCode;

// https://www.baeldung.com/java-equals-hashcode-contracts

/**
  * Returns a hash code value for the object. This method is supported for the benefit of hash tables such as those provided by
 * {@link java.util.HashMap}.

 * The general contract of {@code hashCode} is:

 *     Whenever it is invoked on the same object more than once during
 *         an execution of a Java application, the {@code hashCode} method
 *         must consistently return the same integer, provided no information
 *         used in {@code equals} comparisons on the object is modified.
 *     This integer need not remain consistent from one execution of an
 *         application to another execution of the same application.
 *
 *     If two objects are equal
 *         according to the {@code equals(Object)} method, then calling the {@code hashCode} method
 *         on each of the two objects must produce the same integer result.
 *
 *     It is not required that if two objects are unequal
 *         according to the {@link java.lang.Object#equals(java.lang.Object)}
 *         method, then calling the {@code hashCode} method on each of the
 *         two objects must produce distinct integer results.  However, the
 *         programmer should be aware that producing distinct integer results
 *         for unequal objects may improve the performance of hash tables.
 *
 *     As much as is reasonably practical, the hashCode method defined by
 *         class {@code Object} does return distinct integers for distinct
 *         objects. (This is typically implemented by converting the internal
 *         address of the object into an integer, but this implementation
 *         technique is not required by the Java&trade; programming language.)
 *
 * @return  a hash code value for this object.
 * @see     java.lang.Object#equals(java.lang.Object)
 * @see     java.lang.System#identityHashCode
 */

// public native int hashCode();

public class hashCode {
}
