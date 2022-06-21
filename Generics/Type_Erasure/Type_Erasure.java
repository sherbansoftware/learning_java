package Generics.Type_Erasure;

// https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565280#notes

// https://docs.oracle.com/javase/tutorial/java/generics/erasure.html


/*                                               TYpe erasure


    ○ Generics were introduced to the Java language to provide

                  * tighter type checks at compile time

                  * and to support generic programming.


                          To implement generics, the Java compiler applies Type Erasure to:


    ○ REPLACE ALL Type Parameters in Generic Types with:

                   * their bounds

                   * or Object

             if the type parameters are unbounded.
       The produced BYTECODE, therefore, contains only:

                    * ordinary classes,

                    * interfaces,

                    *  and methods.

    ○ Insert type casts if necessary to preserve type safety.

    ○ Generate bridge methods to preserve polymorphism in extended generic types.


   ○ Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no
        runtime overhead.


                                             NOTE

            * Type safety and type casting, both are performed at compile time only it has no use at runtime.

            *  compiler checks only for reference if is there Type parameters

 */

public class Type_Erasure {
}
