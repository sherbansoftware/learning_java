package Generics.Behaviour;

// https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565278#overview


/*                                      Behaviour in generic and non-generic area


    ○  The behavior of an object depends on the location in which the object is present.

    ○ If it is GENERIC AREA:

                  * you can only be able to add elements which are of PARAMETRIZED TYPE.

    ○ And if it is NOT GENERIC AREA:

                  * you can add ANY TYPE of elements to that object.

    ○ In example below we can see that if we call  method() will be added Raw Type elements although ArrayList<String> l
           was meant only for String.

    ○ Reverse is also true if you have a Raw Type ArrayList here.

 */

import java.util.ArrayList;

public class Behaviour {

    public static void main(String[] args) {


        // adding raw type
        ArrayList<String> l = new ArrayList<>();
        l.add("Basics");
        l.add("Advanced");
        l.add("Middle");
//        method(l);
//        System.out.println(l);

        //Adding parametrized type to a raw type ArrayList

        ArrayList rl = new ArrayList();
        rl.add(10);
        rl.add("See this");
        rl.add(true);
        methodPT(rl);
        System.out.println(rl);

    }

    public static void method(ArrayList l) {

        l.add(10);
        l.add("See this");
        l.add(true);
    }

    public static void methodPT(ArrayList<String> l) {
        l.add("Basics");
        l.add("Advanced");
        l.add("Middle");
    }
}
