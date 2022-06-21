package Functional_Programming.Lambdas.Capturing_Variables;


// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26605856#overview


/*                               Capturing Variables from Lambdas Closures


    ? Accessing  a local variable in the enclosed scope:

                   * is called CAPTURING of the variables.

       We refer to a

                   * lambda that is doing this (or an Anonymous class)

                   * like a Closure


                                               Closures are like


    ? code fragments or code blocks that can be used without being a method or a class.
       It means that Closures can

                   * access variables not defined in its parameter list

                   * and also assign it to a variable.


    ? When working with lambda expressions

                  * we would like to ACCESS VARIABLES from the ENCLOSED scope.

          That is the scope in which the lambda expression has been defined.

      The SCOPE can be a

                  * LOCAL METHOD in which the lambda expression has been defined,

                                - here are defined:

                                     � LOCAL VARIABLES

                  * CLASS on which we have the lambda expression.

                                - here are defined:

                                      � INSTANCE VARIABLE

                                      � STATIC VARIABLES


    ? LOCAL VARIABLES constraint:

              * the variable has to be effectively FINAL, which means that the value should not change.

    ? Local variable CANNOT BE SHADOWED in a Nested Block


    ?  Local variable CAN BE SHADOWED in:

                    * ANONYMOUS class

                    * LOCAL Class

 */

public class Capturing_Variables {
}
