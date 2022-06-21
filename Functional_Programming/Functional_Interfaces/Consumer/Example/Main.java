package Functional_Programming.Functional_Interfaces.Consumer.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*

 @FunctionalInterface
 public interface Consumer<T> {
 void accept(T t);
 }


public <T> void forEach(List<T> list, Consumer<T> c) {
 for(T t: list) {
 c.accept(t);
 }

 */


public class Main {
    public static void main(String[] args) {

        // Consumer to multiply 2 to every integer of a list -----------------------------------------------------------
        Consumer<List<Integer>> modify = list ->
        {
            int i = 0;
            while (i < 3) {
                list.set(i, 2 * list.get(i));
                i++;
            }
        };

        // Consumer to display a list of integers ----------------------------------------------------------------------
        Consumer<List<Integer>> displayList = list -> list.forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(22);
        list.add(31);
        list.add(993);

        // using addThen()
         modify.andThen(displayList).accept(list);


        Consumer<Integer> print = x -> {
            if(x >2 )
            System.out.println(x);
        };

        list.forEach(print);

    }
}
