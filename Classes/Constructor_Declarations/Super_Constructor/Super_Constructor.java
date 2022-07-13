package Classes.Constructor_Declarations.Super_Constructor;

/*                        How do you	call a Super Class Constructor from	a Constructor?


    ○  A constructor can call the constructor of a super class

                    * using the super() method call.

            Only constraint is  that it should be the

                     * FIRST statement i on constructor

    ○ Both example constructors below can replace the no argument "public Animal() " constructor in Example

                     // here is calling Object's constructor
                     public Animal()	{
                         super();
                         this.name	= "Default	Name";
                    }

    ○ Will	this code Compile?

                    public Animal()	{
                        this.name = "Default Name";
                        super();
                    }

     Answer	is	NO.

                     * super should be always called on the FIRST line of the constructor.


           Is a super class constructor called even when there is no explicit call from a child class constructor?


    ○ If a super class constructor

                     * is not explicitly called from a sub class constructor,

                     * super class (no argument) constructor is automatically INVOKED,

                                   - but this would work only if u have NOT defined any parameterized constructor in the
                                     superclass. Doing Otherwise would lead to an error.


                     * (as first line) from a sub class constructor


*/
public class Super_Constructor {

    private String name;

    public Super_Constructor() {
        // Call to 'super()' must be first statement in constructor body
        super();
        this.name = "Default Name";
    }
}
// automatically invoked super constructor even when there is no explicit call from a child class constructor

class Animal {

    String type;

    public Animal() {
        System.out.println("Default constructor");
    }

    public Animal(String type) {
        this.type = type;
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    String color;

    public Dog(String color) {
        super("Patruped");
        this.color = color;
        System.out.println("Dog	Constructor -- type: " + type + " color: " + color);
    }
}

class Labrador extends Dog {
    String size;

    public Labrador(String size) {
        super("brown");
        this.size = size;
        System.out.println("Labrador Constructor -- type: " + type + " color: " + color + " height: " + size);
    }
}

class ConstructorExamples {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Labrador labrador = new Labrador("Small");
    }
}

