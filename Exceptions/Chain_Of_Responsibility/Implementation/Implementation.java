package Exceptions.Chain_Of_Responsibility.Implementation;

// https://www.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9604682#questions


/*                                        Implementation Steps


    ○ We start by DEFINING handler interface/class abstract/concrete type

                  * Handler must define a method to accept incoming request

                            - request can be an object of a class or a primitive data type

                  * Handler CAN (it's not mandatory) define method to access successor in chain.If it is a abstract
                        class we can even implement this functionality of calling the successor in emerging in the
                        abstract class itself.

    ○ Next, we IMPLEMENT handler

                  * in one or more concrete handlers

          which should check if they can handle the request.If not, then they should pass on the request to the next
          object in the chain.

    ○ We have to create our CHAIN of OBJECTS next.We can do it in Client.
          Typically, in real world this job will be done by:

                   * some framework(or servlet filter)

                   * or initialisation code

           written by you.

    ○ So there will be a SEPARATE code that:

                  * creates these objects,

                  * change them together,

                  * and then it hands the first object to the client.

    ○ The client needs to know about

                   * the FIRST OBJECT ONLY,

                   * and it will pass the request to that FIRST OBJECT.


                                         Implementation


    ○ https://www.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9604704#questions

    ○ Prefer defining handler as interface as it allows you to implement Chain of Responsibility without worrying
          about single inheritance rule of Java.
       If you have your handler defined as an interface than

                       * any class in your application can implement that interface and act as a handler.

    ○ Handlers can allow the request to propagate even if they handle the request.
          Servlet filters chains allow request to flow to next filter even if they perform some action on request.

    ○ Chain can be DESCRIBED using:

                      * XML

                      * JSON

              which provides with a great flexibility that allows to:

                      * add & remove handlers from chain

              without modifying code


                                          Design Consideration


    ○ Sometimes you can think of using

                      * existing connections or chains in objects.

              For example if you are using Composite pattern you already have a chain which can be used to implement
                  this behaviour.


 */


public class Implementation {
}
