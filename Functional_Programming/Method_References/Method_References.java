package Functional_Programming.Method_References;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606016#overview


/*                                                  Method References


    ○  as the name implies, is simply

                   * a reference to methods

                   * and are assigned to Functional Interface

           just like the object references, where we have references to objects, and we know that object references
               can be passed as method arguments.

    ○ since Java eight onwards, we can also pass method references,

                   * so we can pass References to Methods as arguments to methods.

           So we are able to pass behavior.

    ○  In case of lambdas, we were defining the behavior as part of the lambdas body itself.

        Now, if you have the same logic encapsulated in a method, you can as well use a method reference.

         So it's an ALTERNATIVE, like an alternative, and it may be more readable to now in certain cases,

    ○ is also used for:

                   * passing around functionality, just like in the case of lambdas

                   * and the target  type format, that references are also Functional Interfaces,

           just like in the case of lambdas and if not will get compilation error.


                                                  Are 3 kind of Method References


    1. ClassName::staticMethod

                  * Don't have to use any parameters

                            - because parameters is implicit in the method name itself.

    2.  objectRef::instanceMethod

                  * We are invoking method on object reference,

                             - it's an instance method.

    3. ClassName::instanceMethod

                  * example : when we use Bifunction


    ○ Method Reference has to correspond to the abstract method in the functional interface.

                  * if the target type is not right, then you get a compilation error.



 */

public class Method_References {
}
