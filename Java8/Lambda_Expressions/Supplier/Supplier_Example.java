package Java8.Lambda_Expressions.Supplier;

import java.util.Arrays;

public class Supplier_Example {
    public static void main(String[] args) {
        int [] arr = {42,6,8,444,32};
        Supplier<Integer> si = () -> Arrays.stream (arr).max ().orElse (0);
        System.out.println (si.get ().getClass ());
    }


}
