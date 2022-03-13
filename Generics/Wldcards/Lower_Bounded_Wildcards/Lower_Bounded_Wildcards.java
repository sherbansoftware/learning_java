package Generics.Wldcards.Lower_Bounded_Wildcards;

import java.util.ArrayList;
import java.util.Collection;

// https://docs.oracle.com/javase/tutorial/java/generics/lowerBounded.html

/*                                        Lower Bounded Wildcards

    a lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.

    A lower bounded wildcard is expressed using the wildcard character ('?'), following by the super keyword,
        followed by its lower bound: <? super A>.

                                                     Note:

    You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.

*/


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

public class Lower_Bounded_Wildcards {

    public static void main(String[] args) {
        Collection<Machine> cs = new ArrayList<>();
        cs.add(new Machine());
        cs.add(new Machine());
        Collection<Machine> cs1 = new ArrayList<>();
        cs.add(new Camera());
        cs.add(new Camera());

        printCollection(cs);
        printCollection(cs1);

    }

    private static void printCollection(Collection<? super Camera> cs) {
        for (Object mac : cs) {
            System.out.println(mac);
        }
    }

}
