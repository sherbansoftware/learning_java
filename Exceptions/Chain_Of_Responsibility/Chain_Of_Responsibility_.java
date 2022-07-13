package Exceptions.Chain_Of_Responsibility;

// https://www.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9604676#questions


/*                                               Chain Of Responsibility


    ○ We need to avoid coupling

                      * the code which sends request

                      * to the code which handles that request

    ○ Typically the code which wants some request handled or which wants to call some method,
           it knows the exact method it needs to call, and it knows the exact object which is going to provide that
           functionality thus there is a tight coupling.

    ○ We

                     * get hold of an object,

                     * and we call a method on that.

             So now our goal is tightly coupled to that particular object.

       The Chain of Responsibility solves this problem by

                      * more than one object chance to process the request.


      ○ We CREATE objects which are CHAINED together by

                      * one object knowing reference of object which is next in chain

              We give request to first object in chain, if it can't handle that it simply passes the
                  request down the chain.

    ○ One side effect of this particular design pattern is that

                       * is no guarantee that your request will be handled OK,

               so your request would fall of at the end of chain.


                                                      UML

    ○  https://www.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9604690#questions


                                         Example of a Chain of Responsibility


    ○ Probably the best example of chain of responsibility is

                       * servlet filters.

              Each filter gets a chance to

                       * handle incoming request

                       * and passes it down the chain once its work is done.

    ○ All servlet filters implement the javax.servlet.Filter interface which defines following doFilter method

                       * public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)

    ○ Implementations will use FilterChain object to pass request to next handler in chain

                       * i.e. chain.doFilter(request, response);

    ○ In servlet filters, it’s common practice to allow other filters to handle request even if current filter takes

          some action on the request.


                                       Comparison with Command


              Chain of Responsibility                                           Command


     ○ If handler can't handle the request it will                ○ With Command there is no passing it on request
            pass it to the next handler.                                 request.Command handles the request itself

     ○ There is no guarantee that the request will                ○ With Command pattern it is assured that command
           be handled by at least one handler.                           will be executed and request will be handled.

     ○ We don't track which handler handled the                   ○ Commands are trackable.We can store command instances
           request and can't reverse the actions                         in same order as they execute, and they are
           of handler.                                                    reversible in nature.


                                                      Pitfalls


    ○ Is no guarantee provided in the design pattern that

                  * a request will be handled.

          Request can traverse whole chain and fall off at the other end without ever being processed, and we won't know it.
      So you should be aware of this limitation of this design pattern when using chain of responsibility.

    ○ It's easy to misconfigure the chain when we are connecting successors.There is nothing in the pattern that will
          let us know of any such problem.Some handlers may be left unconnected to chain.

    ○ The code which creates this chain

                   * should be reviewed,

                   * and it should be tested

           to make sure that we are

                   * not leaving
                   * or we are not making unwanted connections

           in our handler chain.

 */

public class Chain_Of_Responsibility_ {
}
