package Algorithms.Recursion.Head_Recursion;



  /*                               A NON-tail-recursive function

    The function is not tail recursive because the value  returned by fact(n-1) is used in fact(n) and call to fact(n-1)
        is not the last thing done by fact(n)

                                           NOTE

   */


public class Head_recursion {

    //  factorial of n

    static int fact(int n) {
        if (n == 0)
          return 1;

        return n * fact(n - 1);
    }

    //   sum of n head-recursion -means recursive call is not last thing that function execute

    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    // Finding N-Th Power of Ten

    public static int powerOf10(int n) {
        if (n == 0) {
            return 1;
        }
        return powerOf10 (n - 1) * 10;
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println("Factorial of: " + value + " = " + fact(5));
        System.out.println("Sum of: " + value + " = " + sum(5));
        System.out.println("N-th Power of 10 for: " + value + " = " + powerOf10(5));

    }
}

