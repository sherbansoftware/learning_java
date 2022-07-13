package Classes.Nested_Class.Anonymous_Class;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.9.5

/*                                               Anonymous classes


    ○ Are inner classes with no name. Since they have no name,

                  * we can't use them in order to create instances of anonymous classes.

           As a result, we have to declare and instantiate anonymous classes in a single expression at the point of use.


                                                   We may either:


    ○ Extend an existing class

    ○ Implement an interface


                                               Extend an existing class:


        new Book("Design Patterns") {
        @Override
        public String description() {
                return "Famous GoF book.";
        }
    }


                                             Implement a interface:


     new Runnable() {
        @Override
        public void run() {
        ...
       }
    }


                                                    Anonymous Constructors


    ○ An anonymous class cannot have an explicitly declared constructor. Instead, an anonymous constructor is implicitly
        declared for an anonymous class.


                                                            NOTE


            * An anonymous class declaration is automatically derived from a class instance creation expression by the
                Java compiler.

            * An anonymous class is never abstract (§8.1.1.1).

            * An anonymous class is always implicitly final (§8.1.1.2).

            * An anonymous class is always an inner class (§8.1.3); it is never static (§8.1.1, §8.5.1).

            * you can just do it  ONE TIME, as a one shot thing.Which is, which is often quite useful.

            * It has to be 10 lines or fewer


                                       Anonymous Classes vs Lambdas


             Anonymous class                                               Lambdas

     ○  Has associated object + verbose                        ○ No associated object(invoke-dynamic)
        Objects are created on every use                             + compact representation
        unless they are declared as Singletons                    Is not associated object as it is implemented
          using static final phase.                               differently, and it is based on the bytecode instruction
                                                                   called in dynamic,
                                                                  Lambdas memory is allocated only once, photometric
                                                                  has very little memory footprint as used.

     ○ In performance benchmarks Lambdas are more efficient than using anonymous objects.

*/


import java.util.Arrays;
import java.util.Comparator;

class Animal {
    void bark() {
        System.out.println("Animal Bark from superclass");
    }
    void print(){
        System.out.println("Print");
    };
};

public class Anonymous_Class_ {

    private static String[] reverseSort(String[] array) {

        Comparator<String> comparator = new Comparator<String>() {
            /* Anonymous Class by implementing Comparator interface*/
            @Override
            public int compare(String string1, String string2) {
                return string1.compareTo(string2);
            }

        };

        Comparator<String> reversedComparator = new Comparator<String>() {
            /* Anonymous Class by implementing Comparator interface*/
            @Override
            public int compare(String string1, String string2) {
                return -string1.compareTo(string2);
            }

        };

        // using anonymous class
        Arrays.sort(array, comparator.reversed());
        // using lambdas
       // Arrays.sort(array, (s1, s2) -> s2.compareTo(s1));

        return array;
    }

    public static void main(String[] args) {

        String[] array = {"Apple", "Cat", "Boy"};
        System.out.println("Reversed order: " + Arrays.toString(reverseSort(array)));// [Cat, Boy, Apple]

        /* Second Anonymous Class - SubClass of Animal */
        Animal animal = new Animal() {
            void print() {
                System.out.println("Extended anonymous clas -- animal is printed");
            }
            void bark() {
                System.out.println("Animal bark from anonymous class");
            }
        };

        Animal animal1 = new Animal() {
            void bark() {
                System.out.println("Extended anonymous clas --animal 1 bark");
            }
        };

        animal.print();//
        animal.bark();
        animal1.bark();// Subclass bark
    }
}