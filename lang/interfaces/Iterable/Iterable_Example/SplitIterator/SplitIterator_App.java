package lang.interfaces.Iterable.Iterable_Example.SplitIterator;

// https://howtodoinjava.com/java/collections/java-spliterator/

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator_App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Dog");
        list.add("wolf");
        list.add("Horse");
        list.add("cat");

        //  Spliterator Syntax
        Spliterator<String> spliterator = list.spliterator();


        int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;

        System.out.println(spliterator.characteristics() == expected);  //true

        if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }

        if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }

        if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }

        if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }

        if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }

        if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }

        if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.getExactSizeIfKnown());

/*
    The Java collection classes provide default stream() and parallelStream() methods which internally use the Spliterator
        through the call to the spliterator().
        It helps in processing the collection data in parallel.

                Collection.java
                default Stream<E> stream() {
                    return StreamSupport.stream(spliterator(), false);
                }

               default Stream<E> parallelStream() {
                   return StreamSupport.stream(spliterator(), true);
               }
*/


    }
}
