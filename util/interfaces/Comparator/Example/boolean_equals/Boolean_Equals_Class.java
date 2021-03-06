package util.interfaces.Comparator.Example.boolean_equals;

/**
 * Indicates whether some other object is &quot;equal to&quot; this
 * comparator.  This method must obey the general contract of
 * {@link Object#equals(Object)}.  Additionally, this method can return
 * <tt>true</tt> <i>only</i> if the specified object is also a comparator
 * and it imposes the same ordering as this comparator.  Thus,
 * <code>comp1.equals(comp2)</code> implies that <tt>sgn(comp1.compare(o1,
 * o2))==sgn(comp2.compare(o1, o2))</tt> for every object reference
 * <tt>o1</tt> and <tt>o2</tt>.<p>
 *
 * Note that it is <i>always</i> safe <i>not</i> to override
 * <tt>Object.equals(Object)</tt>.  However, overriding this method may,
 * in some cases, improve performance by allowing programs to determine
 * that two distinct comparators impose the same order.
 *
 * @param   obj   the reference object with which to compare.
 * @return  <code>true</code> only if the specified object is also
 *          a comparator and it imposes the same ordering as this
 *          comparator.
 * @see Object#equals(Object)
 * @see Object#hashCode()
 */

//    boolean equals(Object obj);

public class Boolean_Equals_Class {
}
