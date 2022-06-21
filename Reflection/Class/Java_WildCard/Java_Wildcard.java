package Reflection.Class.Java_WildCard;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/18832708#overview



 /*                                    Class<?>   -Java Wildcards


    ○ This is very useful when the compiler cannot know the exact generic type at compile time
           like in the case where we use the forName() method to get a class object of a type provided
           to us as a string:

                  * Class<?> carClass = Class.forName("vehicles.Car");

    ○ Using Class<?> we can describe a Class object of any parameter type

                   * Class<?> is a super type to Class<T> of any type T

    ○ Restrict to only type that extend/implement a class or interface , here  Collection

                   * public List<String> findAllMethods(Class<? extends Collection> clazz)

*/

public class Java_Wildcard {
}
