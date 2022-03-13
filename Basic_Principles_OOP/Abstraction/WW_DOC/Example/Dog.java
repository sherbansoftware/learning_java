package Basic_Principles_OOP.Abstraction.WW_DOC.Example;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
