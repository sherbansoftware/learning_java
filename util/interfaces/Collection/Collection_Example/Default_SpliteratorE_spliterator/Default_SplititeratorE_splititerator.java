package util.interfaces.Collection.Collection_Example.Default_SpliteratorE_spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
 * Creates a {@link java.util.Spliterator} over the elements in this collection.
 * <p>
 * Implementations should document characteristic values reported by the
 * spliterator.  Such characteristic values are not required to be reported
 * if the spliterator reports {@link java.util.Spliterator#SIZED} and this collection
 * contains no elements.
 *
 * <p>The default implementation should be overridden by subclasses that
 * can return a more efficient spliterator.  In order to
 * preserve expected laziness behavior for the {@link_ #stream()} and
 * {@link_ #parallelStream()}} methods, spliterators should either have the
 * characteristic of {@code IMMUTABLE} or {@code CONCURRENT}, or be
 * <em><a href="Spliterator.html#binding">late-binding</a></em>.
 * If none of these is practical, the overriding class should describe the
 * spliterator's documented policy of binding and structural interference,
 * and should override the {@link_ #stream()} and {@link_ #parallelStream()}
 * methods to create streams using a {@code Supplier} of the spliterator,
 * as in:
 * <pre>{@code
 *     Stream<E> s = StreamSupport.stream(() -> spliterator(), spliteratorCharacteristics)
 * }</pre>
 * <p>These requirements ensure that streams produced by the
 * {@link_ #stream()} and {@link_ #parallelStream()} methods will reflect the
 * contents of the collection as of initiation of the terminal stream
 * operation.
 *
 * @implSpec The default implementation creates a
 * <em><a href="Spliterator.html#binding">late-binding</a></em> spliterator
 * from the collections's {@code Iterator_Interface}.  The spliterator inherits the
 * <em>fail-fast</em> properties of the collection's iterator.
 * <p>
 * The created {@code Spliterator} reports {@link java.util.Spliterator#SIZED}.
 * @implNote The created {@code Spliterator} additionally reports
 * {@link java.util.Spliterator#SUBSIZED}.
 *
 * <p>If a spliterator covers no elements then the reporting of additional
 * characteristic values, beyond that of {@code SIZED} and {@code SUBSIZED},
 * does not aid clients to control, specialize or simplify computation.
 * However, this does enable shared use of an immutable and empty
 * spliterator instance (see {@link java.util.Spliterators#emptySpliterator()}) for
 * empty collections, and enables clients to determine if such a spliterator
 * covers no elements.
 * @return a {@code Spliterator} over the elements in this collection
 * @since 1.8
 */

/*
@Override
default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 0);
        }
*/

// https://howtodoinjava.com/java/collections/java-spliterator/
// https://www.baeldung.com/java-spliterator

public class Default_SplititeratorE_splititerator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        Spliterator<String> spliterator = list.spliterator();

//        System.out.println(spliterator.estimateSize());
//        System.out.println(spliterator.getExactSizeIfKnown());
//        spliterator.forEachRemaining(System.out::println);

//        Spliterator trySplit() example
//        Java example to split the elements to two groups and iterate independently.
        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        spliterator1.forEachRemaining(System.out::println);

        System.out.println("========");

        spliterator2.forEachRemaining(System.out::println);

    }
}
