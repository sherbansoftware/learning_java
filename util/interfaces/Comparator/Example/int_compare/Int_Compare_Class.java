package util.interfaces.Comparator.Example.int_compare;

/**
 * Compares its two arguments for order.  Returns a negative integer,
 * zero, or a positive integer as the first argument is less than, equal
 * to, or greater than the second.<p>
 * <p>
 * In the foregoing description, the notation
 * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
 * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
 * <tt>0</tt>, or <tt>1</tt> according to whether the value of
 * <i>expression</i> is negative, zero or positive.<p>
 * <p>
 * The implementor must ensure that <tt>sgn(compare(x, y)) ==
 * -sgn(compare(y, x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
 * implies that <tt>compare(x, y)</tt> must throw an exception if and only
 * if <tt>compare(y, x)</tt> throws an exception.)<p>
 * <p>
 * The implementor must also ensure that the relation is transitive:
 * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
 * <tt>compare(x, z)&gt;0</tt>.<p>
 * <p>
 * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt>
 * implies that <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
 * <tt>z</tt>.<p>
 * <p>
 * It is generally the case, but <i>not</i> strictly required that
 * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
 * any comparator that violates this condition should clearly indicate
 * this fact.  The recommended language is "Note: this comparator
 * imposes orderings that are inconsistent with equals."
 *
 * @param_ o1 the first object to be compared.
 * @param_ o2 the second object to be compared.
 * @return a negative integer, zero, or a positive integer as the
 * first argument is less than, equal to, or greater than the
 * second.
 * @throws NullPointerException if an argument is null and this
 * comparator does not permit null arguments
 * @throws ClassCastException if the arguments' types prevent them from
 * being compared by this comparator.
 */
//    int compare(T o1, T o2);

public class Int_Compare_Class {
    // Function to compare both objects
    public static int compare(Object obj1, Object obj2) {

        // Converting the two objects to integer
        // for comparison
        int intObj1 = (int) obj1;
        int intObj2 = (int) obj2;

        // Get the difference
        int difference = intObj1 - intObj2;

        if (difference == 0) {

            // Both are equal
            return 0;
        } else if (difference < 0) {

            // obj1 < obj2
            return -1;
        } else {

            // obj1 > obj2
            return 1;
        }
    }

    // driver code
    public static void main(String args[]) {
        int a = 10;
        int b = 20;

        // as 10 less than 20,
        // Output will be a value less than zero
        System.out.println(compare(a, b));

        int x = 30;
        int y = 30;

        // as 30 equals 30,
        // Output will be zero
        System.out.println(compare(x, y));

        int w = 15;
        int z = 8;

        // as 15 is greater than 8,
        // Output will be a value greater than zero
        System.out.println(compare(w, z));
    }
}

