package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.Average;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html


/*                                                  average


    ○ OptionalDouble average()

                  * Returns an OptionalDouble describing the arithmetic mean of elements of this stream,

                  * or an empty optional if this stream is empty.

          This is a special case of a reduction.
          This is a terminal operation.




 */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average_ {

    public static void main(String[] args) {
        int[] arr = {54, 96, 447, 647};

        // OptionalDouble avg = IntStream.of(arr).average();

        // Average of an Array ----------------------------------------------------------------------------------------
        OptionalDouble avg = Arrays.stream(arr).average();
        System.out.println(avg.getAsDouble());

        // Average of a list ------------------------------------------------------------------------------------------
        List<Integer> li = List.of(55, 68, 947, 12223, 4, 0, 774);
        double avgL = li.stream().mapToDouble(e -> e).average().orElse(0d);

        System.out.printf("\nThis is average double: %.2f", avgL);


    }

}
