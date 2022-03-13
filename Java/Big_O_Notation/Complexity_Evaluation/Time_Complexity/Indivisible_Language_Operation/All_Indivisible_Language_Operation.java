package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Indivisible_Language_Operation;

public class All_Indivisible_Language_Operation {

    int foo(int n) {

        int temp = n +1;       // variable initialization     -> one operation
                               // and addition                ->  one operation

        return temp / 2;    // return value                   ->  one operation
                             //   and   division              ->  one operation

      // we have a sequence of operations( 4 operation)
      // So we need the sum of them in order to get algorithm complexity.

                                   // Algorithm complexity

        //                    T(N) = 1+1+1+1 =4

        // Algorithm not depends on N
    }
}
/*
    Variable initialization
        executes in constant number of processor operations but the exact number depends on the particular machine
        could be one two three or more processor operations.
    This happens because exact number of operations depends on:
        processor RAM and some other factors.
    Same principles work for :
        addition, division and return language operations.

     Within Complexity evaluation it's considered that: ----------------------------------------------------------------
         any indivisible language operation executes in
            1 processor operation

    So these kind of error is considered acceptable the result each of these operations will be executed in one operation.



*/