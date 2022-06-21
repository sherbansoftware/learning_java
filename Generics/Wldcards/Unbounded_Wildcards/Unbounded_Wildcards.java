package Generics.Wldcards.Unbounded_Wildcards;

// https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html


/*                                              Unbounded Wildcards


    ○ The unbounded wildcard type is specified using

                   * the wildcard character (?),

           for example, List<?>.
        This is called a list of unknown type.


                      There are two scenarios where an unbounded wildcard is a useful approach:


    ○ If you are writing a method that can be implemented using:

                   * functionality provided in the Object class.

    ○ When the code is using:

                   * methods in the generic class that don't depend on the type parameter.

           For example,

            List.size or List.clear.

     ○ In fact,

                   * Class<?> is so often used because most of the methods in Class<T> do not depend on T.

 */


import java.util.List;

public class Unbounded_Wildcards {
    public static void main(String[] args) {
       // Because for any concrete type A, List<A > is a subtype of List<?>,you can use printList to print a list
       // of any type:

        List<Integer> li = java.util.Arrays.asList(1, 2, 3);
        List<String> ls = java.util.Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }

    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
}
