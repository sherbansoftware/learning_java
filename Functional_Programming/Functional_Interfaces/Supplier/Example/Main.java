package Functional_Programming.Functional_Interfaces.Supplier.Example;

import Functional_Programming.Functional_Interfaces.Supplier.Supplier;

import java.util.Arrays;

/*

            @FunctionalInterface
            public interface Supplier<T> {

                T get();

             }


*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {42, 6, 8, 444, 32};
        Supplier<Integer> si = () -> Arrays.stream(arr).max().orElse(0);
        System.out.println(si.get());
    }


}
