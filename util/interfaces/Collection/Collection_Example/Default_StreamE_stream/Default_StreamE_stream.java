package util.interfaces.Collection.Collection_Example.Default_StreamE_stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Returns a sequential {@code Stream} with this collection as its source.
 *
 * <p>This method should be overridden when the {@link_ #spliterator()}
 * method cannot return a spliterator that is {@code IMMUTABLE},
 * {@code CONCURRENT}, or <em>late-binding</em>. (See {@link_ #spliterator()}
 * for details.)
 *
 * @implSpec The default implementation creates a sequential {@code Stream} from the
 * collection's {@code Spliterator}.
 * @return a sequential {@code Stream} over the elements in this collection
 * @since 1.8
 */

/*
default Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
        }
*/

// https://www.baeldung.com/java-8-streams

public class Default_StreamE_stream {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("John");
        printCollection(collection);
    }

    // We often use the empty() method upon creation to avoid returning null for streams with no element:
    public static Stream<String> streamOf(Collection<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    public static void printCollection(Collection collection) {

       streamOf(collection).forEach(e -> System.out.println(e));

    }

}

