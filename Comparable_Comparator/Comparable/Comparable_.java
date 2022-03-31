package Comparable_Comparator.Comparable;
// https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html

/*                                         public interface Comparable<T>

    This interface imposes a total ordering on the objects of each class that implements it. This ordering is referred
        to as the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.
    Contains only one method :

                      -  public int compareTo(T o);
    Compares this object with the specified object for order.
    Returns:

                a negative integer,
                zero,
                or a positive integer

        as this object is less than, equal to, or greater than the specified object.

                                                     NOTE

            * Compare existing object with object to be inserted
            * Present in java.lang package
            * this is meant for Default Natural Sorting order
            * It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member
                  only. For example, it may be rollno, name, age or anything else.

 */

public class Comparable_ {
    Comparable c;
}
