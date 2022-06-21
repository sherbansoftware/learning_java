package Generics.Subtyping;

// https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565258#overview

/*                                                   Subtyping


     ○ If you want to:

                    * add SUBTYPE of elements to your LIST or to an OBJECT,

                    * which is parametrized, with the SUPERTYPE,

            you can happily add the subtype element.

    ○ if you want SUBTYPING, it is necessary that the type arguments to preserve the subtyping
           relationship.

    ○ It is necessary:

                   * between a parent and a child

                   * that both have the SAME type argument.

 */

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number>list = new ArrayList<>();

        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(11.63));
        list.add(Byte.valueOf((byte) 22));


        System.out.println(list);

    }

}
