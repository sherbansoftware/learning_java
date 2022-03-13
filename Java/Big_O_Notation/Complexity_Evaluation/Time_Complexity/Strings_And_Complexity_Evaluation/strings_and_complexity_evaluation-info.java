package Java.Big_O_Notation.Complexity_Evaluation.Time_Complexity.Strings_And_Complexity_Evaluation;

/*                              Strings and Complexity evaluation

    • Compare strings:

            s1 = "abc";
            s2 = "abd"

        Which of these strings is greater?
        Internally strings are represented by arrays:.

        char[] s1 = {'a', 'b', 'c'}
        char[] s2 = {'a', 'b', 'd'}

        o(s1.length) = O(N)

        in the worst case loop iterate over the entire s1

    • String concatenation complexity:

        O(N+K)

    • Substring complexity:

        O(N-k)
                                         Important

    • If add or remove 1 character (K = 1), complexity will be equal to:

        Concatenation: O(N + 1) = O(N)
        Substring:     O(n - 1) = O(N)

        Concatenate a single character inside a loop complexity:
        T(N) = O(N²)
*/