package Algorithms.Recursion;

// https://www.baeldung.com/java-recursion

/*                                                    Recursion

    In Java, the function-call mechanism supports the possibility of having a method call itself.
         This functionality is known as recursion.

    There are two main requirements of a recursive function:

         A Stop Condition (breaking condition or base case)
            • the function returns a value when a certain condition is satisfied, without a further recursive call

        The Recursive Call
            • the function calls itself with an input which is a step closer to the stop condition

        For example, suppose we want to sum the integers from 0 to some value n:

            public int sum(int n) {
                if (n >= 1) {
                    return sum(n - 1) + n;
                 }
                 return n;
             }

                                      Tail Recursion Versus Head Recursion

    Recursive function as

        tail-recursion

            when the recursive call is the last thing that function executes.

        Otherwise, it's known as head-recursion.

                                                 Recursion Versus Iteration

    Recursion can help to simplify the implementation of some complicated problems by making the code clearer and more
        readable.

    But as we've already seen the recursive approach often requires more memory as the stack memory required increases
       with each recursive call.

    As an alternative, if we can solve a problem with recursion, we can also solve it by iteration.

    In comparison to recursion, the iterative approach could potentially give better performance. That being said,
        iteration will be more complicated and harder to understand compared to recursion,

    for example: traversing a binary tree.

     Making the right choice between head recursion, tail recursion and an iterative approach all depend on the specific
         problem and situation.

                                                            NOTE

            * A subroutine which cause a subroutine

            * The iterative implementation usually runs faster, and it doesn't use as much memory  because there's overhead
                  involved with pushing method calls onto the call stack and each stack frame uses some memory but sometimes
                  the iterative way isn't as intuitive

            * Developers still use recursion because it's often the most elegant and easier to understand solution.
            * So the problem with recursion and the reason why it's not advisable to use it too much, is precisely the
                  danger of

                      StackOverflowError.

             * If you call the method from within a method too many times,

                   I don't know how many.I'm guessing tens of thousands.Then, you'll get a stack overflow error and for
                   that reason,it's better to avoid recursion.

             * But there are some situations in which it's very, very useful to use a recursive method.

             * The tail recursive functions considered better than non-tail recursive functions as tail-recursion can be
                   optimized by the compiler. Compilers usually execute recursive procedures by using a stack. This stack
                   consists of all the pertinent information, including the parameter values, for each recursive call.
                   When a procedure is called, its information is pushed onto a stack, and when the function terminates
                   the information is popped out of the stack. Thus, for the non-tail-recursive functions, the stack
                   depth (maximum amount of stack space used at any time during compilation) is more.


                                                            NOTE

            *

 */

public class Recursion {

    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println("No Factorial method result: " + iterativeFactorial(4));
    }

    // 1! = 1 * 0!
    // 2! = 2 * 1!
    // 3! = 3 * 2!
    // 4! = 4 * 3!

    // n! = n * (n-1)!

    // factorial recursive
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int iterativeFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
