package Concepts.Reference.Strong_References;

// https://www.baeldung.com/java-weakhashmap#1-strong-references


/*                                               Strong References


    ○ The strong reference is the most common type of Reference that we use in our day to day programming:

                   * Integer prime = 1;

           The variable prime has a

                   * STRONG reference to an Integer object with value 1.

           Any object which has a strong reference pointing to it

                   * is not eligible for GC.




 */


public class Strong_References {

    public static void main(String[] args) {
        Integer prime = 1;
    }

}
