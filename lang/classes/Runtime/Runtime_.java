package lang.classes.Runtime;



// https://www.javatpoint.com/java-runtime-class

//

/*                                 Module java.base
                                    Package java.lang
                                    Class Runtime

   ○ public class Runtime extends Object

   ○ Every Java application has

                 * a single instance of class Runtime

         that allows the application to interface with the environment in which the application is running.
         The curre nt runtime can be obtained from the getRuntime method.

    ○ An application cannot create its own instance of this class.

    Since:
        JDK1.0

    See Also:
        getRuntime()

                                                   NOTE



 */

class Runtime_ {
    Runtime process = Runtime.getRuntime();


}
