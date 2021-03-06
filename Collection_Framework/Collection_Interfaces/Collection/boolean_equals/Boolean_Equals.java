package Collection_Framework.Collection_Interfaces.Collection.boolean_equals;

// Comparison and hashing

/**
 * Compares the specified object with this collection for equality. <p>
 *
 * While the <tt>Collection</tt> interface adds no stipulations to the
 * general contract for the <tt>Object.equals</tt>, programmers who
 * implement the <tt>Collection</tt> interface "directly" (in other words,
 * create a class that is a <tt>Collection</tt> but is not a <tt>Set</tt>
 * or a <tt>List</tt>) must exercise care if they choose to override the
 * <tt>Object.equals</tt>.  It is not necessary to do so, and the simplest
 * course of action is to rely on <tt>Object</tt>'s implementation, but
 * the implementor may wish to implement a "value comparison" in place of
 * the default "reference comparison."  (The <tt>List</tt> and
 * <tt>Set</tt> interfaces mandate such value comparisons.)<p>
 *
 * The general contract for the <tt>Object.equals</tt> method states that
 * equals must be symmetric (in other words, <tt>a.equals(b)</tt> if and
 * only if <tt>b.equals(a)</tt>).  The contracts for <tt>List.equals</tt>
 * and <tt>Set.equals</tt> state that lists are only equal to other lists,
 * and sets to other sets.  Thus, a custom <tt>equals</tt> method for a
 * collection class that implements neither the <tt>List</tt> nor
 * <tt>Set</tt> interface must return <tt>false</tt> when this collection
 * is compared to any list or set.  (By the same logic, it is not possible
 * to write a class that correctly implements both the <tt>Set</tt> and
 * <tt>List</tt> interfaces.)
 *
 * @param_ o object to be compared for equality with this collection
 * @return <tt>true</tt> if the specified object is equal to this
 * collection
 *
 * @see Object#equals(Object)
 * @see java.util.Set#equals(Object)
 * @see java.util.List#equals(Object)
 */

// boolean equals(Object o);


public class Boolean_Equals {
}
