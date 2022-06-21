package Algorithms.Recursion.Tail_Recursion;

// https://www.geeksforgeeks.org/tail-recursion/

/*                                                         Tail Recursion

        the recursive call is the last thing the method does, so there is nothing left to execute within the current function.

                                                              Note

            * Although the compiler can utilize this point to optimize memory, it should be noted that the Java compiler
                  doesn't optimize for tail-recursion for now.

            * Java compiler doesn't use tail recursion, so we can use that type of recursion in Java.




 */

public class Tail_Recursion {

    public static void main(String[] args) {
        System.out.println(tailSum(5, 2));
    }

    // head recursion

    public int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    // tail recursion from above head recursion

    public static int tailSum(int currentSum, int n) {

        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }
}
