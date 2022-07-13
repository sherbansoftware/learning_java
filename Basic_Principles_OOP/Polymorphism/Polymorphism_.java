package Basic_Principles_OOP.Polymorphism;

// https://www.mygreatlearning.com/blog/polymorphism-in-java/



/*                                           Polymorphism


    ○ is defined as "Same code" giving "Different behaviour"

    ○ is the

                   * ability of an object to take many forms.

           To simply put, polymorphism in java allows us to perform the same action in many different ways.

    ○  Any Java object that

                   * can pass more than one IS-A test is considered to be polymorphic

                   * and in java, all the java objects are polymorphic as it has passed the IS-A test

           for their own type and for the class Object.


                                     There are two types of polymorphism in java:


    ○ Compile-time polymorphism

     ○ Runtime polymorphism.


                            Compile-Time polymorphism in java is also known as Static Polymorphism.


    ○ In this process,

                   * the call to the method is resolved at compile-time.

           Compile-Time polymorphism is achieved through

                    * Method Overloading.


                                                Method Overloading


     ○ is when a

                    * class has multiple methods with the same name,

                                  - but the number,

                                  - types

                                  - and order of parameters

                                  - and the return type of the methods

                          are different.

         Java allows the user freedom to use the same name for various functions

                       * as long as it can distinguish between them by the type and number of parameters.


                             Runtime polymorphism in java is also known as Dynamic Binding
                                                 or Dynamic Method Dispatch.


    In this process, the call to an overridden method is resolved dynamically at runtime rather than at compile-time.
        Runtime polymorphism is achieved through

        Method Overriding.

                                                   Method Overriding

    ○ is done when

                       * a child or a subclass has a method with the

                                     - same name,

                                     - parameters

                                     - and return type

                as the parent or the superclass,

                        * then that function overrides the function in the superclass.

        In simpler terms, if the

                        * subclass PROVIDESits definition to a method already present in the superclass,

                        * then that function in the base class is said to be overridden.

    ○ It should be noted that runtime polymorphism can only be achieved

                        * through functions and not data members.

    ○ Overriding is done by

                         * using a reference variable of the superclass.

                 Which method to be called

                         * is determined based on the object which is being referred to by the reference variable.

                 This is also known as Upcasting.


                                                      NOTE


    * if you have a child class of some parent class,

                  - you can always use the child class anywhere

                  - where you would normally use the parent class.

*/


class Animal {
    public String shout() {
        return "Don't Know!";
    }
}

//Let’s	create	two	new	subclasses	of	Animal	overriding	the	existing shout	method	in	Animal.
class Cat extends Animal {
    public String shout() {
        return "Meow Meow";
    }
}

class Dog extends Animal {
    public String shout() {
        return "BOW	BOW";
    }

    public void run() {
    }
}

public class Polymorphism_ {
    public static void main(String[] args) {

        //An instance of Animal class is	created. shout	method	is	called.
        Animal animal1 = new Animal();
        System.out.println(animal1.shout());    //Don't	Know!

        // An instance of Dog class is created and store in a reference variable of type Animal.
         Animal animal2 = new Dog();

         //Reference variable type	    =>	Animal
         //Object referred	to	        =>	Dog
         //Dog's	bark	method	is	called.
        System.out.println( animal2.shout());    //BOW	BOW

   /*     When shout method is called on animal2, it invokes the shout method in Dog class (type of the object
        pointed to by reference variable animal2).

        Even though dog has a method run, it cannot be invoked using super

        class reference	variable.
        //animal2.run();//COMPILE	ERROR

 */

    }

}
