package Reflection.Constructor.Create_Instance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21286154#questions/15936422

public class Main {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        Address address = createInstanceWithArguments(Address.class, "First Street", 10);
        System.out.println(address);
        Person person = createInstanceWithArguments(Person.class, address, "John", 20);
        System.out.println(person);


    }

    public static <T> T createInstanceWithArguments(Class<T> clazz, Object... args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length == args.length) {
                return (T) constructor.newInstance(args);
            }
        }
        System.out.println("An appropriate constructor was not found");
        return null;
    }

    public static class Person {
        private final Address address;
        private final String name;
        private final int age;

        public Person() {
            this.name = "anonymous";
            this.age = 0;
            this.address = null;
        }

        public Person(String name) {
            this.name = name;
            this.age = 0;
            this.address = null;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            this.address = null;
        }

        public Person(Address address, String name, int age) {
            this.address = address;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "address=" + address +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class Address {
        private String street;
        private int number;

        public Address(String street, int number) {
            this.street = street;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", number=" + number +
                    '}';
        }
    }

    class Block {
        int s;

//        public Block() {
//        }

        public Block(int se, String s) {
            this.s = se;
            System.out.println("Second constructor");
        }
    }
}
