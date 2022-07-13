package Variable.Varargs;

import java.util.Arrays;

/*    	                            Variable Arguments or Varargs


    ○ Internally, the Varargs method is implemented by using the

                   * single dimensions arrays concept.

           Hence, in the Varargs method, we can differentiate arguments by using Index.
           A variable-length argument is specified by three periods or dots(…).

    ○ The Varargs allows the method to accept zero or multiple arguments.
           Before varargs either we use overloaded method or take an array as the method parameter, but it was not considered
           good because it leads to the maintenance problem.

      If we don't know how many argument we will have to pass in the method, varargs is the better approach.


                                          Advantage of Varargs:


    ○ We don't have to provide overloaded methods so less code.

    ○ Variable Arguments allow calling a method with different number of parameters.

           Consider the example method sum below.

            This sum method can be called with 1 int parameter or 2 int parameters or more int parameters.

             //int(type)	followed	...	(three	dot's)	is	syntax	of	a	variable	argument.


                                                  NOTE


    ○ Even a class can be used a variable argument.

    ○ inside the method a variable argument is similar to an array.

    ○ In the example below, bark method is overloaded with a
           variable argument method.

                       static void bark(Animal... animals) {
                           Arrays.stream (animals).forEach (a -> a.bark ());
                        }

     ○ Variable Argument should be always

                    * the last parameter

                    *(or only parameter) of a method

 */

public class Varargs_ {

    // int(type) followed ... (three dot's) is syntax of a variable argument.
    public int sum(int... numbers) {
        // inside the method a variable argument is similar to an array.
        // number can be treated as if it is declared as int[] numbers;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    public static void main(String[] args) {
        Varargs_ example = new Varargs_();

        // sum 0 Arguments
        System.out.println(example.sum());// 0

        // sum 3 Arguments
        System.out.println(example.sum(1, 4, 5));// 10

        // sum  4 Arguments
        System.out.println(example.sum(1, 4, 5, 20));// 30


        new Animal().bark(new Animal("Dog"), new Animal("Cat"));
    }

    // Variable Argument should be always the last parameter (or only parameter) of a method.
    // Below example gives a compilation error
    /*
     * public int sum(int... numbers, float value) {//COMPILER ERROR }
     */

    // Even a class can be used a variable argument. In the example below, bark method
    // is overloaded with a variable argument method.

    static class Animal {
        String name;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void bark() {
            System.out.println(this.name + " make noise");
        }

        static void bark(Animal... animals) {
            Arrays.stream(animals).forEach(a -> a.bark());
        }
    }
}
