package Reflection.Constructor;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21286154#questions/15936422


// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Constructor.html


/*                                        java.lang.reflect.Constructor<?>

    ○ In Java reflection a constructor of a class is represented by an INSTANCE of a

                   * Constructor<?>

    ○ The Constructor object contains all the information about a class's constructor including but not limited:

                   * Number of parameters

                   * Types of parameters


                                           Methods to get Constructor<?> objects


    ○ Class.getDeclaredConstructor()

                  * Returns all declared constructors within the class

                  * Includes all the public and non-public constructors


    ○ Class.getConstructor()

                 * Return only public constructors

    ○ If you know the particular constructor parameter types we call:

                 * Class.getConstructor(Class<?>... parameterTypes)

                 * or  Class.getDeclaredConstructor(Class<?>... parameterTypes)

                             - Returns a particular constructor based on the parameter types

                             - Throws NoSuchMethodExceptions if no matching constructor is found

    ○ Getting The default Constructor   - no constructor is declared in the class

                  *  Class.getDeclaredConstructor()  return default constructor

                   *  Class.getDeclaredConstructor()  return default constructor

*/


public class Constructor {
}
