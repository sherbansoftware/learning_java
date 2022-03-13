package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Amortized_Analysis;

/*                              ArrayList_ Implementation

    �Internally, the ArrayList_ uses an array
    �When the array is filled a new array is created 2 times bigger than the original array's size
    �The algorithm for added elements in the new Array:

         1. copy all elements from the old array
         2. add new element to the new Array

     Boundary element: ------------------------------------------------------------------------------------------------
      is an element which have index greater than size of an array and array has to double it's capacity yo insert it

                                 ArrayList_ insertion Complexity

    �Insertion complexity(in array) may vary:

      for non boundary element  complexity is -------------------------------------------------------------------------
          O(1)
      for boundary element  complexity is -----------------------------------------------------------------------------
          T(N) = N + 1 = O(N)
              � N is a number of copy operation
              � 1 is complexity of inserting element itself

    Worst case time complexity of single element insertion or in other words single function call is:

        O(N)

    But this estimation will be too pessimistic since certain calls have significant complexity and other call do not

    To get proper complexity estimation: -------------------------------------------------------------------------------

        we need to use Amortized Analysis

                                        Amortized Analysis

    Worst-case time complexity let's us evaluate complexity of a single function call

        �Amortized analysis is a complexity of a sequence of function calls.It considers both the  costly and less costly
         calls together over the whole sequence.

            There are three approaches to perform Amortized Analysis.

                1.Aggregation Method
                2.Accounting method
                3. Potential method

                                      Aggregation method   ( is easiest and most common)

    �Evaluate complexity of sequence of N calls using Big O notation.We denote this complexity as: --------------------

        Sequence Complexity

    �Calculate the amortized complexity of a single call using the following formula: ----------------------------------

        Single call amortized complexity = (Sequence Complexity) / (Sequence size)

                                     Complexity of Insertion Sequence of N Elements

    According to Amortized Analysis sequence should include costly and less costly function calls

        �Complexity of inserting sequence of N elements :

           T(N) = O(N)

        � To get Amortized complexity of a single element insertion we use  the formula:

                 Single call amortized complexity = (Sequence Complexity) / (Sequence size) = O(N)/N =O(1)

                                              Conclusion

    �The Amortized Complexity of inserting each element into ArrayList_ will be O(1) if we insert sequences of elements
    �But single element insertion complexity is not determined:

         1. In the worst case it will be O(N)
         2. In the best case it will be O(1)

     �If we use worst case approach we do not get representative estimate of algorithm complexity
     �That's why we use Amortized Analysis in these case let's look at the following

                                    Frequency of Copy Operation During Element Insertions

    We can see from the chart that the more elements are inserted the less copy operations occur.

    Again this means that we perform kind of payment is low complexity operations for high complexity once.








*/