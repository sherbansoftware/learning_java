package Generics.Subtyping.Example;

import java.util.ArrayList;
import java.util.List;

/*  ○ if you want SUBTYPING, it is necessary that the type arguments to preserve the subtyping
          relationship.

    ○ It is necessary

          * between a parent and a child

          * that both have the same type argument.

*/
public class Main {
    public static void main(String[] args) {


        List<Box<Integer>> bList = new ArrayList<>();

        bList.add(new Box<Integer>(List.of(23, 55, 89)));
        bList.add(new SquareBox<Integer>(List.of(106, 889)));

        bList.forEach(e -> System.out.println(e.getList()));
    }
}
