package Basic_Principles_OOP.Abstraction.Example;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that,can i go to swim instead?");
    }
}
