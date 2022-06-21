package Reflection.Class.Example.Challenge1;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21811356#questions/15936422

/*                              Solution - Reflection, Interfaces and Recurion

    Recursion occurs when a something is defined in terms of itself.

    For example the famous Fibonacci sequence is defined recursively like this:

        F(n) = F(n-1) + F(n-2)

        where:

        F(0) = 0, F(1) = 1.

    Recursion is a very useful way to solve problems in computer science and write algorithms in a compact and elegant way.

    In this exercise we will use Recursion  and Java Reflection to solve the problem of

        "Finding all Implemented Interfaces of a class".



*/


import java.util.*;

public class Exercise {

    /**
     * Returns all the interfaces that the current input class implements
     * Note: If the input is an interface, the method returns all the interfaces the
     * input interfaces extends
     */
    public static Set<Class<?>> findAllImplementedInterfaces(Class<?> input) {
        Set<Class<?>> allImplementedInterfaces = new HashSet<>();

        Class<?>[] inputInterfaces = input.getInterfaces();
        for (Class<?> currentInterface : inputInterfaces) {
            allImplementedInterfaces.add(currentInterface);
            allImplementedInterfaces.addAll(findAllImplementedInterfaces(currentInterface));
        }
        return allImplementedInterfaces;
    }

    public static void main(String[] args) {
        Set<Class<?>> si = findAllImplementedInterfaces(String.class);
        si.forEach(System.out::println);
    }
}
