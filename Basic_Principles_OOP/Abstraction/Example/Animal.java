package Basic_Principles_OOP.Abstraction.Example;

public abstract class Animal {
    private String name;

    public static void breath() {
        System.out.println ("This is a static method in abstract class");
    }

    public abstract void eat();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
