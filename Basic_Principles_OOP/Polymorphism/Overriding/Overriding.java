package Basic_Principles_OOP.Polymorphism.Overriding;

/*                          Runtime polymorphism in java is also known as Dynamic Binding
                                        or Dynamic Method Dispatch.

    In this process, the call to an overridden method is resolved dynamically at runtime rather than at compile-time.
        Runtime polymorphism is achieved through Method Overriding.

                                                   Method Overriding

    is done when a child or a subclass has a method with the same name, parameters and return type as the parent or the
        superclass, then that function overrides the function in the superclass. In simpler terms, if the subclass provides
        its definition to a method already present in the superclass, then that function in the base class is said to
        be overridden.

    It should be noted that runtime polymorphism can only be achieved through functions and not data members.

    Overriding is done by using a reference variable of the superclass. Which method to be called is determined based
        on the object which is being referred to by the reference variable. This is also known as Upcasting.

 */


public class Overriding {

    public static void main(String[] args) {
       // Animal animal1 = new Animal ();
        //System.out.println(animal1.shout()); // Don't Know!


//        List<Animal> animals = Arrays.asList (new Dog (), new Cat ());
//
//        animals.forEach (animal -> System.out.println (animal.shout ()));

        Animal animal1 = new Dog();
        System.out.println (animal1.shout ());
        // Reference variable type => Animal
        // lang.classes.Object referred to => Dog
        // Dog's bark method is called.
        //System.out.println(animal2.shout()); // BOW BOW

        // Even though dog has a method run,it cannot be
        // invoked using super class reference variable
        // animal2.run();//COMPILE ERROR
    }
}