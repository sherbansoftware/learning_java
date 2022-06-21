package Comparable_Comparator.Comparator;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html



/*                                           Comparator


    ○ This is a functional interface and can therefore be used as the assignment target for

                   * a lambda expression or method reference.

            @FunctionalInterface
            public interface Comparator<T>

    ○ A comparison function, which imposes a total ordering on some collection of objects.Comparators can be passed to a

                   * sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order.

                   * Comparators can also be used to control the order of certain data structures
                         (such as sorted sets or sorted maps),

                   * or to provide an ordering for collections of objects that don't have a natural ordering.

    ○ The ordering imposed by a comparator c on a set of elements S is said to be

           consistent with equals if and only

                   * if c.compare(e1, e2)==0 has the same boolean value as  e1.equals(e2)

          for every e1 and e2 in S.


                                                            NOTE


                * Meant for customized Sorted Order
                * Unlike Comparable, a comparator may optionally permit comparison of null arguments,while maintaining
                      the requirements for an equivalence relation.

 */

import java.util.Comparator;

public class Comparator_ {
    Comparator c;

}
