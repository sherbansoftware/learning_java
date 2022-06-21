package Generics.Bounded;

// https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565266#overview



/*                                              Bounded Type Parameter


    ○ Whenever you want to restrict the type parameter of a particular class you can use the bounded type parameter


                                                   Multiple Bounds


    ○ The preceding example illustrates the use of a type parameter with a single bound, but a type parameter can have
          multiple bounds:

                  *  <T extends B1 & B2 & B3>

    ○ A type variable with multiple bounds is a subtype of all the types listed in the bound.

    ○ If one of the bounds is a CLASS not an interface:

                  * it must be specified FIRST.

          For example:


                     class A { }

                     interface B {  }

                     interface C {  }


                      class D <T extends A & B & C> { }

     If bound A is not specified FIRST, you get a compile-time error.

                     class D <T extends B & A & C> {  }  // compile-time error

 */



public class Bounded {


     // Upper Bounded
    // class Sample <T extends Number>


   // lower bounded
    // class Sample <T super String>

}
