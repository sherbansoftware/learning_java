package About_Java;

// https://en.wikipedia.org/wiki/Java_(programming_language)

/*                                     The Java programming language is

    • statically typed language,
        which means that every variable and every expression has a type that is known at compile time.

    • strongly typed language, because types limit the values that a variable (§4.12) can hold or that an expression can
        produce, limit the operations supported on those values, and determine the meaning of the operations.
        Strong static typing helps detect errors at compile time.

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class About_Java {
 Arrays i ;
    public static void main(String[] args) {
        Integer[] array = {5,2};
        List<Integer> list =  new ArrayList<> (Arrays.asList(array));
        list.add(66);
        System.out.println("The size of the array is "
                + list);

        String[] str = { "GEEKS", "FOR", "GEEKS" };
        System.out.println(str.length);
        // Here str is a string object
        String str1 = "GeeksforGeeks";
        System.out.println("The size of the String is "
                + str1.length());

    }


}
