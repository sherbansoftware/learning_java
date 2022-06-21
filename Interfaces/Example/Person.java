package Interfaces.Example;

public class Person implements Info {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Person's name is: " + name);
    }
}
