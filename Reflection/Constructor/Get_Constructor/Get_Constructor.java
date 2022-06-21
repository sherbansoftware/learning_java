package Reflection.Constructor.Get_Constructor;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21286154#overview


/*                                 Methods to get Constructor<?> objects


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



public class Get_Constructor {
}
