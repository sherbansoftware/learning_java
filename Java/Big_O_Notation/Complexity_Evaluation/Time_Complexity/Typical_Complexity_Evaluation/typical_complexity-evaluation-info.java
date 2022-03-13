package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Typical_Complexity_Evaluation;

/*                               Typical Complexity Evaluation

    • During complexity evaluation, we will often encounter the same expression,that you need to know
    • The results of these expressions can be calculated precisely or approximated.

                                  Sum of Arithmetic Series

            1+2+3+...+ N = (N² + N)/2  = O(N²)  O Exponential

                                  Sum of Geometric of Series

            2^0 + 2^1 + 2^2 +2^3 + ... + 2^N = 2^(N + 1) - 1 = O(2^N) O Quadratic

                                  Change of Logarithm Base

    • There is a formula that allows you to change the base of the logarithm from a to b, where a >1, b >1, N > 0

                log(a)N = log(a)b * log(b)N

    • Since a and b are constants, log(a)b is a is a constant too.

    • We do not consider constants in Big O notation therefore:

            log(a)N = O(log N)
            log(b)N = O(log N)

                                     Factorial

    • Factorial N in the product all positive integers less than or equal to N
    • Factorial is denoted as N!
    • The value of 0! is always equal with 1;    0! = 1 =1!

                                     Permutations

    The number of permutations from N unique elementsis:

            P(N) = N!








*/