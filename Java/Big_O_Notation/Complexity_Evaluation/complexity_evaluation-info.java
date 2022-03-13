package Java.Big_O_Notation.Complexity_Evaluation;

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

                                     Algorithm Running Time Evaluation


    Space complexity:

        The amount of memory required for the algorithm to complete
        Space complexity function is denoted as S

    All Big O notation rules for space complexity evaluation are identical to time complexity evaluation

       Complexity name

    Complexity            Name

     O(n!)              Factorial           Bad
     O(2?)              Exponential         Bad
     (n²)               Quadratic           Bad
     O(n * log(2)n)     Linearithmic        Fair        algorithm is good enough if it's complexity is <= O(n* log n)
     O(n)               Linear              Good
     O(?n)              Sublinear           Excellent
     O(log(2)n)         Logarithmic         Excellent
     O(1)               Constant            Excellent

    However some algorithms can not be performed faster than these and not because they're bad it's just
        because we can not implement them better.



*/