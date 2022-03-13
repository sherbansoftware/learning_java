package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Big_O_Notation;

/*                                                   Big O notation

    In computer science, big O notation is used to classify algorithms according to how their run time or space
        requirements grow as the input size grows.

            O(G(N))    - reads as  "order of G of N"

      • G(N) is an arbitrary function, for example  G(N) = N²
      • O(G(N)) is set of all T(N) function such that there exist positive constants C and N(0) with

          |T(N)| <=C * G(N) for all N >= N(0)

    Important Note: ----------------------------------------------------------------------------------------------------

        •O(G((N)) looks like O function with G(N) argument
        •However, it was agreed to denote things that way and everybody understands
             that O(G(N)) is a set of function

      Analogy: --------------------------------------------------------------------------------------------------------

      T(N) = N² + N           ? O(N²)
      T(N) = 5 * N² + 4       ? O(N²)
      T(N) = -7 * N² + ?4     ?  O(N²)


    The fact that function T(N) belongs to a set O(G(N)) is denoted :

        T(N) ? O(G(N))

    This is read as:

        T(N) is order of G((N)

    Another way

        • T(N) is O of G(N)
        • T(N)  is order at most(G(N))

                                                      Big idea Behind Big O Notation

          T(N) = N² + N           ? O(N²)
          T(N) = 5 * N² + 4       ? O(N²)
          T(N) = -7 * N² + ?4     ?  O(N²)

    Big O notation let us formally denote function's order

    We say that : -----------------------------------------------------------------------------------------------------

     T(N) = N + ?N  ? O(N)

         Function has an order of N             this function is O of N              O(N)

     T(N) = 5 * N + N!   ? O(N!)               this function is O of  N factorial    O(N!)

     T(N) =  N² + N³   ? O(N3)                   this is o of n cubic

     T(N) = 5         ? O(1)                     this  is o of 1  O(1)

                                  Compare Function Using Big O Notation

        T1(N) = N + 500  * log(2)N + 5 * 2?^N   ?O(2^N)
        T2(N) = 999 + 4 * ?N + 43 *  * log(2)N  ?O(?N)

            • Using Big O notation we denoted orders of the function
            • And this is exactly what we need to compare functions values with different orders whenN tends toward infinity

                                   Reasoning About Constants Irrelevance

    • We decided to simplify complexity evaluation
    • So we decided that any indivisible language operation executes in 1 processor  operation
    • But in real word the exact number of operations depends on a particular machine.

    Because we don't use the simplification and calculate all processor operations the result could differ from machine to machine
        We can conclude that constants do not represent precise complexity of a function.

                                       Complexity Evaluation Goal

    • The goal of complexity evaluation is to understand how algorithm scales when input data size grows
    • That is, which algorithm will consume less resources (e.g time) as an N grows.

        Only if algorithms have different orders their speed tremendously differ when N towards to infinity
        So, during complexity comparison we are looking for a function with smaller order
        And Big O show difference of orders and highest unnecessary details like constant factors which mean that to
            compare functions complexities we just need to compare their Big O representations.

                                           Constants and Complexity

   Functions that have the same big O representation could differ by a constant factor.
   Therefore to get the most efficient algorithm of all the algorithms described for example as O(N) you need to investigate
       each algorithm along with the hardware and programming language aspects
    Big O shows big picture that allows to recognize the better algorithm hiding unnecessary details like constant
        factors before moving forward.

                                            Important Notes

        1.Since logarithm base is a constant we don't specify it in terms of Bio O  notation.

            So following function are considered equal

                T1(N)=  log(2)N ? O(log N)
                T2(N)=  log(5)N ? O(log N)

        2.Function with 2 or more arguments:

            So when complexity depends on two or more arguments we need to specify leading terms for every argument

   T        (N,K) = N? + 12 * k + N + log K ? O(N² + k)

                                      Big O Arithmetic


                                      Complexity evaluation meaning

    When you are asked to evaluate algorithm complexity you need : ----------------------------------------------------

    To evaluate worst case time complexity and classify it using Big O notation

        •Describe dependency between input parameter size and number of processor operations using T function

        •Then classify function T using Big O notation.

                                      Complexity name

    Complexity            Name

     O(n!)              Factorial           Bad
     O(2?)              Exponential         Bad
     (n²)               Quadratic           Bad
     O(n * log(2)n)     Linearithmic        Fair        algorithm is good enough if it's complexity is <= O(n* log n)
     O(n)               Linear              Good
     O(?n)              Sublinear           Excelent
     O(log(2)n)         Logarithmic         Excelent
     O(1)               Constant            Excelent

    However some algorithms can not be performed faster than these and not because they're bad it's just
        because we can not implement them better.


*/