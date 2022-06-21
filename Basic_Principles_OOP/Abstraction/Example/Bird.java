package Basic_Principles_OOP.Abstraction.Example;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is peaking");
    }

//    @Override
//    public void breath() {
//        System.out.println("Breath in, breath out, repeat");
//    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping his wings");
    }
 }
