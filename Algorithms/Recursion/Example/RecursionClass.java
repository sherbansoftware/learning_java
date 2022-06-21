package Algorithms.Recursion.Example;

public class RecursionClass {

    public static void main(String[] args) {
        // System.out.println (sum(-4));
        //System.out.println (tailSum (4, 4));
      // System.out.println (powerOf10 (2));
        System.out.println (getFactorial (4));
    }

    // head-recursion -  means recursive call is not last thing that function execute

    public static int sum(int n) {
        if (n >= 1) {
            return sum (n - 1) + n;
        }
        return n;
    }

    // tail-recursion when the recursive call is the last thing that function executes ---------------------------------

    public static int tailSum(int currentSum, int n) {

        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum (currentSum + n, n - 1);
    }

    // Finding N-Th Power of Ten

    public static int powerOf10(int n) {
        if (n == 0) {
            return 1;
        }
        return powerOf10 (n - 1) * 10;
    }

    // n factorial head recursion

    public static int getFactorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * getFactorial (n - 1);
    }

}
