package Basic_Principles_OOP.Inheritance.Constructor_Chainning;


/*                                           Constructor Chaining


    ○ Calling a constructor from the another constructor of same class is known as Constructor chaining.

                  * The real purpose of Constructor Chaining is that

                                - you can pass parameters through a bunch of different constructors,

                        but only have the initialization done in a single place.

                   * This allows you to maintain your initializations from a single location,

                   * while providing multiple constructors to the user.

    ○ If we don't chain, and two different constructors require a specific parameter,

                   * you will have to initialize that parameter twice,

                   * and when the initialization changes, you'll have to change it in every constructor,
                         instead of just the one.


                                              IMPORTANT:


        * As a rule, constructors with fewer arguments should call those with more

        * this() should always be the first statement in constructor otherwise you will get this error message

        * this() and super() cannot be used together because:

                      -  but both “super()” and “this()” cannot be the first statement simultaneously


 */
public class Constructor_Chaining {
}
