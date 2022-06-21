package Reflection.Method.Execute_Method_Reflection;

//  https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21491366#overview

/*                    execute a method on a java object using reflection

    ○ We can call a method of a java object using the

                   * Object	      Method.invoke(Object instance, Object... args)

           Invokes the underlying method represented by this Method object, on the specified object with the specified parameters.

    ○ If the method we're calling is STATIC

                  * we can pass null as the instance

    ○ args

                  * arguments to the method.

          Must be of the correct type and orders as the method's  signature.


                                                   Return Value


    ○  Object	      Method.invoke(Object instance, Object... args)

    ○ if the return type of the method type VOID:

                   * invoke operation will simply return NULL

    ○  if the return type of the method is a PRIMITIVE type:

                   * invoke operation will be wrapped in an OBJECT

    ○ A boolean value is wrapped with Boolean object

    ○ Method.invoke(...) can throw:

                  * NullPointerException

                  * ExceptionInInitializerError

                  * IllegalAccessException

                  * IllegalArgumentException

                  * InvocationTargetException               -- most important exception

                            - is thrown if method we invoked throw an exception itself

                                  and it WRAPS that exception , so we can handle it

                                              - catch

                                              - or handle it

    ○ Wraps both:

                  * checked exceptions

                  * unchecked exceptions


                                Method invocation - Use Cases


    ○  When the method's

                    * names

                    * signatures

                    * return types

                    * and even classes containing

            those methods are DECOUPLED from the logic that controls the execution of those methods.

    ○ Typically the order of the execution of those methods is either

                    * not important

                    * or is unknown

            at compile time

    ○ Despite the simplicity of calling a method using reflection it is one of the most USEFUL and most
          WIDELY used features of java reflection

     ○ Can be found in many

                    * stack traces of libraries

                    * and frameworks that you use on your daily basis

    ○ There are so many use cases to invoke methods dynamically with reflection

 */

public class Execute_Method_Reflection {
}
