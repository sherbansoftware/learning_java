package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.Sum;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606076#search


/*                                                         sum()


    ○ One of the examples say if you have a stream of numbers and if we want to compute the sum of that stream

    ○ the reduced method accepts an operation called reduction operation.

                  * And in this case, the reduction operation would be the sum operation.


 */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sum_ {
    public static void main(String[] args) {

        // declarative way array sum

        // we use parallel() method to take advanced of parallelism without synchronization
        int[] iarr = new int[]{5, 1, 3, 7, 8, 1};
        Integer[] arrI = {5, 66, 97, 247, 0, 974};

        // Array of Integer sum ---------------------------------------------------------------------------------------
        Optional sum = Arrays.stream(arrI).parallel().reduce(Integer::sum);
        System.out.println(sum.get());

        // Array of int sum -------------------------------------------------------------------------------------------
        int sum1 = IntStream.of(iarr).sum();

        // list of Integers sum ---------------------------------------------------------------------------------------
        List<Integer> li = Arrays.asList(arrI);
        int lSum = li.stream().mapToInt(i -> i).sum();
        System.out.println("Sum of list elements: " + lSum);


        // imperative way sum
        var sum2 = 0;
        for (var e : new Integer[]{5, 1, 3, 7, 8, 1}) {
            sum2 += e;
        }
        //  System.out.println(sum1);
    }

}
