package Functional_Programming.Functional_Interfaces.Predicate.SimpleExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 88, 2, 974, 32);
        List<String> ls = Arrays.asList("John", "Li", "Xi", "Anna", "Ellis");
        List<Double> lInt = Arrays.asList(66.2, 87.0, 4.0, 3d, 654d);

        Predicate<Integer> oUnder = x -> x < 67;
        Predicate<Double> prime = x -> (x > 4.0 && x < 100d);

        Predicate<String> contains = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s == "Li";
            }
        };

        // passing Predicate object using lambdas
        boolean isFound =(getElement("John", x -> ls.contains("John")));

        if(isFound) {
            System.out.println("John is there!");
        }

//      System.out.println(filterCriteria(list, oUnder));
//      System.out.println(filterCriteria(ls, contains));
//      System.out.println(filterCriteria(lInt,prime));

    }

    // generic method
    public static <T> List<T> filterCriteria(List<T> list, Predicate<T> criteria) {
        return list.stream().filter(criteria).collect(Collectors.toList());
    }

    public static <T> boolean getElement(T e, Predicate<T> predicate) {
        return predicate.test(e);
    }

}

