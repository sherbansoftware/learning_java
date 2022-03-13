package Java.Big_O_Notation.Complexity_Evaluation.Space_Complexity;

/*                                     Space complexity

    The amount of memory required for the algorithm to complete

    Space complexity function is denoted as S
    All Big O notation rules for space complexity evaluation are identical to time complexity evaluation

                                        Simple Function and Space Complexity


             int doubleNum(int x)  {
                 return x * 2;
             }

             int foo (int n) {       N = 4
             int result = 0;
             fot (int  i = 1; i <= n; i++) {
             result += doubleNum(i)
             }
             return result;
             }

        Space Complexity for this is:

          S(N) =1 =O(1)

    We've got this complexity: ----------------------------------------------------------------------------------------
        stack frame size doesn't depend on it.
     In other words there will be always one instance of stack frame a memory

                                           Recursive function and Space Complexity

         int foo(int n) {
         if(n == 1)
           return n +
         }


    IMPORTANT ---------------------------------------------------------------------------------------------------------

        • As soon as we call our function for n == 4 it stack frame gets created in memory and will be added
            foo(4)

        • So when we call function for n == 3  foo(3) will be created in memory and stack frame for foo(4) will remains
            as well

    Thus, space complexity of recursive function foo is:

        S(N) = N = O(N)

    This means that in order to complete function needs ---------------------------------------------------------------
         to put its stack frames and times into memory.

    his method of memory access organization is called: ----------------------------------------------------------------
        the call stack.

                                              Complex recursive Function and Space Complexity

     int foo() {
            if(n == 1) return 1;
            return foo(n - 1) + foo(n-1)
        }

    As we can see the body of the function contains only  constant operations at the result.
        Single code complexity:
            is 0(1).

    Space complexity is: ----------------------------------------------------------------------------------------------
        S(N) =  O(1) * N =O(N)

                                             String and Space Complexity

    Space Complexity of concatenating String with length N with 1 character: ------------------------------------------

        S(N) = N +1 = O(N)

    For a loop is

    S(N) = O(N²)

*/