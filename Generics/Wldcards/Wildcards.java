package Generics.Wldcards;

//   https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565270#overview


/*                                                         Wildcards


    ○ In generic code, the question mark (?), called the wildcard,

                  * represents an unknown type.

          The wildcard can be used in a variety of situations:

                  * as the type of parameter,
                  * field,
                  * or local variable;
                  * sometimes as a return type (though it is better programming practice to be more specific).

         The wildcard is never used:

                  * as a type argument for a generic method invocation,

                  * a generic class instance creation,

                  * or a supertype.

     ○  * you can't use the wildcard DIRECTLY just by placing a question mark instead of a future object,


    ○ The wildcards can be:

                 * UPPER bounded wildcards,

                 * LOWER bounded wildcards,

                 * and wildcard CAPTURE.


                                        Differences between Wildcard and Type Parameter


    ○  You can use wild card in many places where you cannot use Type Parameter,

                    * For example, while creating the object you can use wildcard.

                    * Type Parameter is just for

                          - generic class
                          - generic methods
                          - generic fields
                          - generic constructors

                     * Type Parameter cannot be used to create objects.

                                List<T>     -- give a compilation error

                     * You can use wildcard for

                                 limiting what types you can legally invoke a method with at compile time.

                     * you can't use the wildcard DIRECTLY just by placing a question mark here in this matter,
                           we are not used wildcard  directly.

*/

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "I'm a Machine";
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I'm a Camera";
    }
}

public class Wildcards {

    public static void main(String[] args) {

        ArrayList<Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        list2.add(new Camera());

        showList(list2);
    }

    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine val : list) {
            System.out.println(val);
        }

    }
}
