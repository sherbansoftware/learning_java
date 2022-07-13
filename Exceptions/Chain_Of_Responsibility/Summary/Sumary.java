package Exceptions.Chain_Of_Responsibility.Summary;

// https://www.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9604734#questions

/*                                                 Summary

    ○ When we want to decouple sender of request from the object which handles the request, we use
          Chain of Responsibility.

    ○ We want this decoupling because we want to:

                  * give multiple objects chance to handle the request

                  * & we don’t know all objects beforehand.

    ○ A handler checks if it can handle the request.
          If it can’t then it’ll pass the request on to next handler in chain

    ○ You can pass the request down the chain even if a handler handles the request.
          Design pattern doesn’t prevent that from happening.

 */

public class Sumary {
}
