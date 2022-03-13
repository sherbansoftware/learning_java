package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Complexities_Comparison;

/*                                 Algorithms Complexities Comparison

    And now we are ready to compare algorithms complexities let's say you have two algorithms that hold the same
        computational problem in two different ways.
    As a result complexities of this algorithm could describe some different functions.

        T1(N) = 2*N² + 2*N +55
        T2(N) = 999 * N + 3 + log(10)N

    In order to find which algorithm is faster we need to compare values of these two function for sum N
    Algorithm with small function  value will take less operations to complete.
        That means it will be faster or in other words its complexity will be lower in here.

    With small value of N,algorithms execute pretty fast
    However as an grows algorithm speeds start to decrease.
    In other words the greater and is the longer it takes for the algorithm to complete.
    Since we need to find worst case complexity we need to compare functions when n is as big as possible
    Therefore we need to compare T1 and T2 when n tends toward infinity as a result by comparing those two functions
        when n tends toward Infinity.

     We will compare the complexities of two algorithms as we already said we need
         to compare functions values

                                         Function Comparison When n Tends to Infinity

    To compare function when N tends to infinity we need to find:
    Starting from which N one of the functions will start taking values that are less than  the values of the
        other function.

    The function that takes smaller values as an grows describes a less complex algorithm .
    let's look into graphs of the following functions.





*/