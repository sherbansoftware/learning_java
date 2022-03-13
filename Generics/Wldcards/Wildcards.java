package Generics.Wldcards;

/*                                                         Wildcards

    In generic code, the question mark (?), called the wildcard, represents an unknown type. The wildcard can be used in
        a variety of situations:

                * as the type of a parameter,
                * field,
                * or local variable;
                * sometimes as a return type (though it is better programming practice to be more specific).

        The wildcard is never used as a type argument for a generic method invocation, a generic class instance creation,
            or a supertype.

    The following sections discuss wildcards in more detail, including

            * upper bounded wildcards,
            * lower bounded wildcards,
            * and wildcard capture.

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
