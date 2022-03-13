package Classes.Classes_Types.Top_Level_Class;

/*                                                     Classes

    Class declarations define new reference types and describe how they are implemented (§8.1).

    A top level class
        is a class that is not a nested class.
    A nested class
        is any class whose declaration occurs within the body of another class or interface.

                                                         SYNTAX

class MyClass {
    // field, constructor, and
    // method declarations
}

class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}


 */

class Person {

    private String name;
    private int age;

    void speak() {
        System.out.println("My name is " + name + " and my age is " + age);
    }

    int calculateYearsToRetirement() {
        int intLeft = 65 - age;
        System.out.println("Retirement left age for " + name + " are: " + intLeft);
        return intLeft;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

}

public class Top_Level_Class {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Elon Musk");
        person1.setAge(50);
        person1.speak();
        int years = person1.calculateYearsToRetirement();


    }
}
