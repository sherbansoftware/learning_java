package Reflection.Method.Get_Methods;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21454170#questions

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Method.html

/*                                                  Get Method(s)


    ○ All the class methods are represented as objects of type Method

    ○ There are a few standard ways to discover and obtain method/all the methods of a class

                  * Class.getDeclaredMethods()

                             - returns an array of method objects representing all the DECLARED methods in a given class

                  * Class.getDeclaredMethods()

                              - returns all the PUBLIC methods which includes the methods inherited from super classes

                 * 	getMethod.(String name, Class<?>... parameterTypes)

                               - Returns a Method object that reflects the specified public member method of the class
                                     or interface represented by this Class object.
                               - will look for a public method with that signature in the current and all
                                     superclasses until one is found

                  * Class.getDeclaredMethodString name, Class<?>... parameterTypes)

                               - Returns a Method object that reflects the specified declared method of the class or
                                     interface represented by this Class object.
                                 
                               - if a method with that name and the exact parameter types in the right order is not found
                                     NoSuchMethodException is thrown.


                                                Method's Properties


    ○ Method.getName()

                   * returns a String representing a method's name

    ○ Method.getReturnType()

                   * returns a Class<?> representing the return type

    ○  Method.getParameterTypes()

                    * returns an array of method parameter types in the order of their appearance

    ○ Method.getParameterCount()

                     * returns the number of parameters

    ○ Method.getExceptionTypes()

                     * returns an array of exceptions types declared with the method


                                                  Method Parameter Names


    ○ just like the parameter names of a constructor

                   * the parameter names of a method are ERASED after compilation

           so if we inspect the RESULT of calling the getParameters() method on the Method object we will get additional
               information about the parameters however

                    * the names of those parameters will be REPLACED with

                                   - arg 0,

                                   - arg1

                           and so on depending on the number of parameters of the method.

 */

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Get_Methods {
    public static void main(String[] args) throws NoSuchMethodException {

        Type[] exceptions = getExceptions("addMethod");

        System.out.println(Arrays.toString(exceptions));

    }


    public static Type[] getExceptions(String methodName) throws NoSuchMethodException {


        // get method by method name and parameterType
        Method method = Get_Methods.class.getDeclaredMethod(methodName, int.class);

        // get method exceptions
        Type[] exceptions = method.getExceptionTypes();

        return exceptions;
    }

    public int addMethod(int i) throws RuntimeException, Exception {
        return i + 5;
    }

}
