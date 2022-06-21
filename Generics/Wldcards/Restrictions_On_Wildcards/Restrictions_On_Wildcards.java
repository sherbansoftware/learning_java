package Generics.Wldcards.Restrictions_On_Wildcards;

// https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565274#overview


/*                                            Restrictions On Wildcards


    ○ We cannot use Wildcards as a Type Parameter in class level

                  * in the header of the reference type declaration,    -- class Type Parameters

    ○  Unlike Type Parameters,

                  * Wildcard does not support MULTIPLE bounds.

    ○ We just can perform READ operations.If we try to perform

                  * WRITE operations add(E) in a wildcard List<?> we CANNOT DO

          because we don't know what type it may have.

      That is why we are restricted to perform any write operation.

    ○ In case of Lower Bound  we can write because t

                 * It supposes the list is Parent Class Type

    ○ The same cases are applicable when we

                * instantiate object using wild cards.

    ○ One more thing about object instantiation with Wildcards is that we cannot use

               * this Wildcard or this unknown type at the right hand side with this object.

 */


import java.util.ArrayList;
import java.util.List;

public class Restrictions_On_Wildcards {
    public static void main(String[] args) {
        List<? extends Number> len = new ArrayList<>(); // we cannot write ---add elements
        List<?> ul = new ArrayList<>(); // we cannot write ---add elements

        // we can add elements but cannot add Number
        List<? super Integer> list = new ArrayList<>();

        Number n =55;
       // list.add(n); compilation error

        list.add(56);
        list.add(7756);
        list.add(6);
        list.add(0);



        System.out.println(list);
    }

}
