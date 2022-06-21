package Generics.Multiple_Type_Parameter;

// https://www.udemy.com/course/collections-and-concurrent-collection-video-lectures-and-tutorials/learn/lecture/24565252#overview

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.5



/*                                        Multiple Type Parameter


    ○ A class or interface type of the form C<T1,...,Tn>, where C is the name of a generic type and <T1,...,Tn> is a
          list of type arguments that denote a particular parameterization of the generic type.


                                                  NOTE


            * It is a compile-time error if a parameterized type is not well-formed.

            * Given the generic types in the examples  here are some well-formed parameterized types:

                          Seq<String>

                          Seq<Seq<String>>

                          Seq<String>.Zipper<Integer>

                         Pair<String,Integer>

            * Here are some incorrect parameterization of those generic types:


                         Seq<int>                             -- is illegal, as primitive types cannot be type arguments.

                         Pair<String>                         -- is illegal, as there are not enough type arguments.

                         Pair<String,String,String>           -- is illegal, as there are too many type arguments.



 */

public class Multiple_Type_Parameter {
}
