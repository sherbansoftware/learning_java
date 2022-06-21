package Functional_Programming.Streams.Collectors_.Joining;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html



/*                                             joining  (3 methods)

    ○ Joining is a predefined reductions


 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {
        String[] as = {"John","Anne","Mary"};
        CharSequence[] ai = {new StringBuilder("first"), new StringBuilder("second")};

        String concat = Arrays.stream(ai).parallel().collect(Collectors.joining(","));

        System.out.println(concat);
    }
}
