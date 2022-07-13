package Generics;

// https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html

// https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.2


/*                                              Generic classes


    ○ A class is generic if:

                   * it declares one or more type variables

                                  - https://docs.oracle.com/javase/specs/jls/se11/html/jls-4.html#jls-4.4

    ○ These type variables are known as

                  * the type parameters of the class.

          The type parameter section follows the class name and is delimited by angle brackets.

    ○ Type checking at compile time

    ○ So, a generic class is a class that can work with other objects, and you specify what type of object it can work with
          when you, instantiate a class, when you create objects from the class.


                                                Why Use Generics


     ○ We can REUSE the code.

     ○ Generics ENABLE types (classes and interfaces)

                    * to be parameters when defining

                                  - classes,

                                  - interfaces

                                  - and methods.

     ○ Much like the more familiar formal parameters used in method declarations, type parameters

                    * provide a way to re-use the same code with different inputs.

            The difference is that:

                    * the inputs to formal parameters are values,

                    * while the inputs to type parameters are types.

      ○ Stronger type CHECKS at compile time.

                   * A Java compiler applies strong type checking to generic code

                                 - and issues errors if the code violates type safety.

                   * Fixing compile-time errors is easier than

                   * fixing runtime errors,

            which can be difficult to find.

      ○ Elimination of CASTS:

                    * The following code snippet without generics requires casting:

                              List list = new ArrayList_();
                              list.add("hello");
                              String s = (String) list.get(0);

       ○ When re-written to use generics, the code does not require casting:

                              List<String> list = new ArrayList_<String>();
                              list.add("hello");
                              String s = list.get(0);   // no cast

        ○ Enabling programmers to IMPLEMENT GENERIC ALGORITHMS:

                    * By using generics, programmers can implement generic algorithms that work

                              - on collections of different types,

                              - can be customized,

                               - and are type safe and easier to read.


                                             NOTE


    ○ A generic class can be used like a Raw Type class

    ○ It is a compile-time error if

                  * a generic class is a direct or indirect subclass of Throwable

 */

public class Generics_ {

}
