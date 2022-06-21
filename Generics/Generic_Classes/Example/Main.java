package Generics.Generic_Classes.Example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Data<List<String>> d1 = new Data<>(List.of("John","Anne"));

        System.out.println(d1);

        Data<String> d2 = new Data<>("This is a String Type");

        System.out.println(d2);
    }
}
