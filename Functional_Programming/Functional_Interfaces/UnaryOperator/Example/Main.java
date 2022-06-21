package Functional_Programming.Functional_Interfaces.UnaryOperator.Example;


import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<Integer> func2 = x -> x * 2;

        Integer result2 = func2.apply(2);

        System.out.println(result2);

    }
}