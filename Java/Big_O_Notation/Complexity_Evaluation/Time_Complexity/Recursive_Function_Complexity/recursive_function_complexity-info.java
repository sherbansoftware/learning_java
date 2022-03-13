package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Recursive_Function_Complexity;

/*                                Recursive function Complexity

    To calculate recursive function complexity we need to:

        1.Calculate complexity of a single call
        2.Express number of recursive calls through input parameters
        3.And finally multiply the number of recursive calls by a single call complexity.

    Factorial recursion   - one single call ---------------------------------------------------------------------------
        public static int getFactorial(int n) {
            if (n < 2) {
                return 1;
            }
            return n * getFactorial (n - 1);
        }

    •Single call complexity:  O(1)
    •Number of recursive calls is N
    •Complexity:
        T(N) =  0(1) * N = O(N) linear complexity

    Example with - two calls ------------------------------------------------------------------------------------------

        int foo() {
            if(n == 1) return 1;
            return foo(n - 1) + foo(n-1)
        }

        •Single call complexity is O(1)
            because body of the function doesn't have operation which depends on N
        •Number of recursive calls: number of nodes in the tree  2^0 + 2^1 +2^2 + ... + 2^L = 2^L - 1
        •Complexity: T(N) = O(1) * (Number of the tree nodes)

        T(N) = O(1) * (2^L - 1) = O(2^L) =O(2^N)
        T(N) = O(2^N)

    Let's try the formula that we'll be able to help us with almost any recursive function:

        •The complexity of a function expressed with  L is

            T(N) = O(1) * O(2^L) where O(1)  is a single call complexity and O(2^N) is node's number in the tree

         •The complexity of a recursive function is:

           T(N) = O(single call complexity) * O(2 ^ levels number)   where 2 is the number of the child nodes
               in the call tree( number of calls)

          • In general the complexity of recursive function is: --------------------------------------------------------

          O(single call complexity) * O((calls number)^ levels number)


    Limitation of this formula:

        •the calls number must be strictly greater than 1
        •If calls number is equal to 1 the recursion builds a chain of calls
        •if recursion occurs in the loop the number of calls depends on each specific case.

                                       Formula usage example

        •Single call complexity
        •The numbers of recursive calls
        •Level numbers in the call tree

        int foo() {
            if(n == 1) return 1;
            return foo(n - 1) + foo(n-1)
        }

    Our example:

        1.Single call complexity:  O(N)  because body function contains only constant operations
        2.The number of recursive calls : 2
        3. The numbers of levels in a tree
            which is determined by:
               •initial value of parameters 2 in our case
               •recursive step size: -1
               •recursion base case(the condition when we exit recursion): 1     (n == 1)

         Recursive calls are invoked from N to 1 with -1 step, in other words number of call tree level is equal to N

      Using formula:

        O(single call complexity) * O((calls number)^ levels number)

            T(N) = O(1) * O(2^N) = O(2^N)



*/