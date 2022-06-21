package Generics.Generics_Inheritance.Example.Non_Generic;


/*                                           Non generic class

    ○ A generic interface can be implemented by a non-generic class  only if you define the particular class
          of interfaces as the type parameter.

    ○ Have to specify the exact type if you want a non class to implement a genetic interface

 */
interface Iinterface<T>{}

public class Non_Generic implements Iinterface<String> {


}
