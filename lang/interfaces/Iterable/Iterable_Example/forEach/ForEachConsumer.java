package lang.interfaces.Iterable.Iterable_Example.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*

    forEach and Consumer

        Review the forEach method signature, it accepts a functional interface Consumer.

    Iterable.java

            public interface Iterable<T> {

                default void forEach(Consumer<? super T> action) {
                    Objects.requireNonNull(action);
                    for (T t : this) {
                    action.accept(t);
                    }
                 }
                    //..
              }

    Stream.java


           Stream.java

          public interface Stream<T> extends BaseStream<T, Stream<T>> {

              void forEach(Consumer<? super T> action);
              //...
         }
*/

public class ForEachConsumer {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "java", "python");
        Stream<String> stream = Stream.of("abc", "java", "python");

        // convert a String to a Hex
        Consumer<String> printTextInHexConsumer = (String x) -> {
            StringBuilder sb = new StringBuilder();
            for (char c : x.toCharArray()) {
                String hex = Integer.toHexString(c);
                sb.append(hex);
            }
            System.out.print(String.format("%n%-10s:%s", x, sb.toString()));
        };

        // pass a Consumer
        list.forEach(printTextInHexConsumer);

        stream.forEach(printTextInHexConsumer);

    }

}
