package Functional_Programming.Functional_Interfaces.Function_.SimpleExample;


import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        String words = "Borrow";
        // passing lambda expression like instance of this function
        Function<String, String> len = word -> word.substring(2);

        Function<String, String> upper = s -> s.toUpperCase();
        String transform = len.andThen(upper).apply(words);

        System.out.println(transform);


    }

    public static Integer getStringLength(String s, Function<String, Integer> function) {
        return function.apply(s);
    }

    public static String upperCase(String s, Function<String, String> function) {

        return function.apply(s);
    }
}