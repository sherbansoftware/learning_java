package Java8.Lambda_Expressions.Functional_Interfaces_and_Predicate.Predicate_Interface;

import java.util.function.Predicate;

public class Predicate_Example {
    public static void main(String[] args) {

        // Creating predicate using lambda expressions

        Predicate<Integer> pr = a -> (a > 18);

        // Calling Predicate method
            System.out.println (pr.test (19));

       // --------------------------------------------------------------------------------------------------------------

      // Using Predicate interface with method reference

            Predicate<Integer> predicate =  Predicate_Example::checkAge;

        // Calling Predicate method

              boolean result = predicate.test(25);
              System.out.println("Result" + result);

    }

    static Boolean checkAge(int age){
        if(age>17)
            return true;
        else return false;
    }
}
