package Basic_Principles_OOP.Abstraction.SimpleExample;

class Person {
    void walk() {
        System.out.println("Can Run….");
    }
}
class Employee extends Person {
    void walk() {
        System.out.println(" Employee Running Fast…");
    }
    public static void main(String arg[]) {

        Person p = new Employee(); //upcasting
        p.walk();


    }
}
