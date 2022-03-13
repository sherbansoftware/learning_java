package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Complexity_Evaluation;

public class Complexity_Evaluation_Example {


    int foo(int n) {

        int x = 0;   // variable x initialisation = 1 operation

        for (int i = 0; i < n; i++)                        // int i = 0   -> 1 operation
                                                           // i <= n      -> N comparison operation
                                                           // i++         -> N increment operation(inside for )
            i++;                                           // i++         -> 1 operation N times (N * 1)
                                                           // return x    -> 1 operation
         return  x;

                                            // Algorithm complexity

       //  T(N) =  1+ 1+ 1 + N +N+ N*1 = 3 + 3N

       // Algorithm depends on N

                                          //Loop Evaluation Simplification

   //     for (int i = 0; i < n; i++) {                        // int i = 1      -> 1 operation
   //                                                          // i <= n      -> N comparison operation
            //loop body                                        // i++         -> N increment operation
    //}                                                        //loop body      is executed N times

            // T(N) = 1 + N + N + N+(loop body operation count)


        //Loop complexity formula ------------------------------------------------------------------------------------

            // N * (number of body body operation inside the loop) where N is number of iterations


    }
}
