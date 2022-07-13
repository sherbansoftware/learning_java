package Basic_Principles_OOP.Inheritance.Example;

/*                                                Inheritance

     is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important
     part of OOPs (lang.classes.Object Oriented programming system).


 */

public class Inheritance {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
        dog.getSize();
        System.out.println();
        System.out.println("=================================================================================");

        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        Car.isMachine();
        car1.start();
        car1.wideWindShield();
        car1.showInfo();
        car1.stop();
    }
}
