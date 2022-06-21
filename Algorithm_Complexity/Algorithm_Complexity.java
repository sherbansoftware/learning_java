package Algorithm_Complexity;

/*                                     Time complexity of an Algorithm

    number of steps that it takes to execute an algorithm.

                                          Space Complexity

    is the amount of memory it takes to run an algorithm.
    All Big O notation rules for space complexity evaluation are identical to time complexity evaluation
    Now these days, because memory is so cheap, memory complexity isn't such an issue.So these days we mainly concern
        ourselves with time complexity.

                                         When run an algorithm we are looking at:

    The worst case scenarios

        is very important

    The best case scenarios

         doesn't help us because you're rarely gonna have the best case.

    The average case

        but that's not gonna tell us the absolute worst time complexity.

    So it's helpful to compare the worst case scenario for one algorithm against the worst case scenario for the other
        algorithm.

/*                                        Complexity Evaluation

    In computer science, the analysis of algorithms is the process of finding the
        computational complexity (amount of resources required to run it)
        of algorithms

     – the amount of time, storage, or other resources needed to execute them

                                          Asymptotic Analysis

    is the evaluation of the performance of an algorithm in terms of just the input size (N), where N is very large.
    It gives you an idea of the limiting behavior of an application, and hence is very important to measure
    the performance of your code.

    Time complexity:

        Time complexity in the amount of time required for the algorithm to complete.
        Time complexity is a function that represents dependency between:

           • input data size
           • and number of processor operations required for the algorithm to complete

                              T(N) = dependency_formula         where N is size of input data

 Constant time complexity:

            * If the number of elements is equal to n and the steps to accomplish the task never changes.



    Complexity            Name

     O(n!)               Factorial          Bad
     O(2?)               Exponential        Bad
     (n²)                Quadratic          Bad
     O(n * log(2)n)     Linearithmic        Fair        algorithm is good enough if it's complexity is <= O(n* log n)
     O(n)               Linear              Good
     O(?n)              Sublinear           Excellent
     O(log(2)n)         Logarithmic         Excellent
     O(1)               Constant            Excellent

                                                   NOTE

            * Some algorithm will scale really well and others not so well.
            * Some algorithms can not be performed faster than these and not because they're bad it's just
                  because we can not implement them better.




*/


public class Algorithm_Complexity {
}
