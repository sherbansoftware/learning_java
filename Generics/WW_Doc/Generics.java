package Generics.WW_Doc;

// https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
// https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.1.2

/*                                              Generics classes


    So, a generic class is a class that can work with other objects, and you specify what type of object it can work with
       when you, instantiate a class, when you create objects from the class.

    A class is generic if it declares one or more type variables.
    Generics add stability to your code by making more of your bugs detectable at compile time

    Type variables
        are known as the type parameters of the class. The type parameter section follows the class name and is delimited
        by angle brackets.

                                                Why Use Generics

    In a nutshell, generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and
        methods. Much like the more familiar formal parameters used in method declarations, type parameters provide a way
        for you to re-use the same code with different inputs. The difference is that the inputs to formal parameters are
        values, while the inputs to type parameters are types.

    Code that uses generics has many benefits over non-generic code:

        * Stronger type checks at compile time.
            A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety.
            Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

        * Elimination of casts.
            The following code snippet without generics requires casting:

                List list = new ArrayList_();
                list.add("hello");
                String s = (String) list.get(0);

             When re-written to use generics, the code does not require casting:

                 List<String> list = new ArrayList_<String>();
                 list.add("hello");
                 String s = list.get(0);   // no cast

         * Enabling programmers to implement generic algorithms.
             By using generics, programmers can implement generic algorithms that work on collections of different types,
             can be customized, and are type safe and easier to read.


 */

public class Generics {

}
