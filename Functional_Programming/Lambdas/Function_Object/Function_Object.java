package Functional_Programming.Lambdas.Function_Object;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26605820#overview


/*                               Lambdas as  Function Object


    ? Lambda that we are passing, it's called as a Function Object.

                   * And the target for a function object is a

                                - Functional Interface.

                        It's also referred to as a function typ

    ? Example of function object:

                 Arrays.sort(recommendedItems.items, (o1, o2) ->
			Integer.compare(o1.getTitle().length(), o2.getTitle().length())
		);

    ? Function Object has two main properties:

                 * One is the method parameters of the method that it exposes

                           - uses other objects.  (o1, o2)

                 * The second property of function object as it

                           - has only one method.

    ? Function Object

                 * Ideally, it has one line

                 * or it shouldn't be beyond three lines.

    ? Lambdas should be used for Function Objects, but if you have to work with

                  * a non-functional interface

                  * or something like an abstract class,

          then you can use your Anonymous Classes.


 */


public class Function_Object {
}
