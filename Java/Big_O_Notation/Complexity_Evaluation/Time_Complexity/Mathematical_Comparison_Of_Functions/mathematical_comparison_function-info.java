package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Mathematical_Comparison_Of_Functions;

/*                               Function comparison when N tends to Infinity

    Function by their order in descending order: -----------------------------------------------------------------------

    N!
    2?
    N�
    N * log(2)N
    N
    ?N
    log(2)N
    1

    Function as sum of function: ---------------------------------------------------------------------------------------

        T(N) = N� + 12 * N + 5

    It's so clear that each term is represented by separate function

     F1(N) = N�
     F2(N) = 12 � N
     F3(N) = 5

    In other words our function is represented by some of the functions

        T(N) = F1(N) + F2(N) + F3((N)

    Each separate function has its own order

                                              Leading Term of a function

                T(N) = 5 * N� + 9,999,999 * N + 9,999,999 * ?N

    Since every term has the different order the value of the resulting function is defined by the term with
        the biggest order.

    The term that defined the value of a function is called the:
       leading term ----------------------------------------------------------------------------------------------------

    In our case it is: 5 * N�

    We can easily find a long term using our table(on top of this page) -------------------------------------------------

                                              Function comparison when n tends to infinite

    1.Find leading terms using our top table ---------------------------------------------------------------------------

    2.Compare function represented only by leading terms ---------------------------------------------------------------

        Compare function represented only by leading term may differ:

          Orders                                    Constants

        T(N)  = 2 * N�                                T1(N) = 3* N
        T(N)   5+ N                                   T2(N) = 7 * N

            �Positions are different:
                function with lower position will take smaller value as N grows
            �Positions are the same:
                function with smaller constant will take smaller values as N grows

                                                    Formal notation of a Function Order

        T(N) = 3 * N� + N  has leading terms of 3 * N� -----------------------------------------------------------------
            pronunciation:    (T of N  equal  3 times N square plus N)

        We will print like:

        T1(N) = N� + 12 * N + 5  -> N�
        T2(N) = log(2)N + 3 * N   -> 3 * N

    ATest.A formal way to denote an order of a function.
        Big O notation -------------------------------------------------------------------------------------------------

*/