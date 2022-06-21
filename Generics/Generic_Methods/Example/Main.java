package Generics.Generic_Methods.Example;

import java.util.List;

public class Main {

    private static GenericMethod gm = new GenericMethod();

    public static void main(String[] args) {
//        System.out.println(gm.concat("This is generic a method!"));
//        System.out.println(gm.concat(5669));
//        System.out.println(gm.concat(new Date()));


        List l1 = List.of("Mary", "John", "Anne");

        List l2 = List.of(12, 55, 96);

        GenericConstructor gc1 = new GenericConstructor(l1);
        GenericConstructor gc2 = new GenericConstructor(l2);

        List ul1 = gc1.getList();
        List ul2 = gc2.getList();
        System.out.println(ul2);

    }
}
