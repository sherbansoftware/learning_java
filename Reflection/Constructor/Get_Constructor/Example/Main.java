package Reflection.Constructor.Get_Constructor.Example;
/**
 * Constructors
 * https://www.udemy.com/course/java-reflection-master-class
 */


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        //Constructor<Address> constructor = Address.class.getConstructor(String.class, int.class);
        // Class<?>[] arr =  {Address.class, Person.class};
        printConstructorsData(Address.class, Person.class);


    }

    // get constructors for array of Classes objects
    public static void printConstructorsData(Class<?>... clazzs) {

        for (Class clazz : clazzs) {
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println();
            System.out.println(String.format("class %s has %d declared constructors", clazz.getSimpleName(), constructors.length));
            System.out.println();
            for (int i = 0; i < constructors.length; i++) {
                Class<?>[] parameterTypes = constructors[i].getParameterTypes();
                List<String> parameterTypeNames = Arrays.stream(parameterTypes)
                        .map(type -> type.getSimpleName())
                        .collect(Collectors.toList());
                System.out.println(parameterTypeNames);
            }
        }
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
}
