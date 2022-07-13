package Collection_Framework.Collection_Interfaces.List.subList;


/*                                    public List<E> subList(int fromIndex,  int toIndex)


    ○ Returns a view of the portion of this list

                  * between the specified fromIndex, inclusive,

                  * and toIndex, exclusive.

          (If fromIndex and toIndex are equal, the returned list is empty.)

    ○ The returned list is backed by this list,

                   * so non-structural changes in the returned list are reflected in this list, and vice-versa.

    ○ The returned list supports all of the optional list operations.

    ○ This method eliminates the need for explicit range operations (of the sort that commonly exist for arrays).

    ○ Any operation that expects a list can be used as a range operation by passing a subList view instead of a whole list.

    ○ For example, the following idiom removes a range of elements from a list:

                  * list.subList(from, to).clear();

    ○ Similar idioms may be constructed for

                   * indexOf(Object)

                   * and lastIndexOf(Object),

           and all of the algorithms in the Collections class can be applied to a subList.

    ○ The semantics of the list returned by this method become undefined if the backing list (i.e., this list)

                   * is structurally modified in any way other than via the returned list.

           (Structural modifications are those that change the size of this list,
           or otherwise perturb it in such a fashion that iterations in progress may yield incorrect results.)

Specified by:

subList in interface List<E>

Overrides:

subList in class AbstractList<E>

Parameters:

fromIndex - low endpoint (inclusive) of the subList
toIndex - high endpoint (exclusive) of the subList

Returns:

a view of the specified range within this list

Throws:
IndexOutOfBoundsException - if an endpoint index value is out of range (fromIndex < 0 || toIndex > size)
IllegalArgumentException - if the endpoint indices are out of order (fromIndex > toIndex)

 */


import java.util.ArrayList;
import java.util.List;

public class subList {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();

        li.add(4);
        li.add(64);
        li.add(321);
        li.add(741);
        li.add(2);
        li.add(-9);
        li.add(0);

        List<Integer> subList = li.subList(2, 5);

        li.retainAll(subList);

        System.out.println(li);

    }
}
