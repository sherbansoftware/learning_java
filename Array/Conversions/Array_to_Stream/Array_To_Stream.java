package Array.Conversions.Array_to_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array_To_Stream {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer[] arr = {55, 98, 554, 1, 99, 77};

        // Array to stream
        Stream<Integer> streamArr = Arrays.stream(arr);

        List<Integer> sorted = streamArr.sorted().collect(Collectors.toList());

        System.out.println("Sorted list: " + sorted);

    }
}

