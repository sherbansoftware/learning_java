package Generics.Wldcards.Upper_Bounded_Wildcards;

//	https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html

// // https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565270#overview


/*                                        Upper Bounded Wildcards


    ○ You can use an upper bounded wildcard to relax the restrictions on a variable.

      For example, say you want to write a method that works on:

                  * List<Integer>,

                  * List<Double>,

                  * and List<Number>;

          you can achieve this by using an upper bounded wildcard.


                                                     Note:


            * You can specify

                      - an UPPER bound for a wildcard,

                      - a LOWER bound,

                      - but you cannot specify BOTH.

*/

import java.util.ArrayList;
import java.util.Collection;

class Machine {
    @Override
    public String toString() {
        return "I'm a Machine";
    }

    public void start() {
        System.out.println("Machine starting");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I'm a Camera";
    }
}

class Phone extends Camera {
    public String toString() {
        return "I'm a Phone";
    }

    public void snap() {
        System.out.println("Take a shot");
    }
}

public class Upper_Bounded_Wildcards {
    public static void main(String[] args) {
        ArrayList<Machine> cs = new ArrayList<>();
        cs.add(new Machine());
        cs.add(new Camera());
        cs.add(new Camera());
        cs.add(new Phone());

        printCollection(cs);
    }

    private static void printCollection(Collection<? extends Machine> cs) {
        for (Machine mac : cs) {
            System.out.println(mac);
            mac.start();

        }
    }
}