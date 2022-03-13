package Java.Algorithms_in_Java.Shell_Sort;

// https://www.programiz.com/dsa/shell-sort

/*                                               Shell Sort Algorithm

    Shell sort is an algorithm that first sorts the elements far apart from each other and successively reduces the
    interval between the elements to be sorted. It is a generalized version of insertion sort.

    Shell Sort Algorithm

        shellSort(array, size)
            for interval i <- size/2n down to 1
            for each interval "i" in array
            sort all the elements at interval "i"
       end shellSort


    Complexity:

           Shell sort is an unstable sorting algorithm because this algorithm does not examine the elements lying in
           between the intervals.

    Time Complexity:

        Worst Case Complexity: less than or equal to O(n2)
        Worst case complexity for shell sort is always less than or equal to O(n2).
            According to Poonen Theorem, worst case complexity for shell sort is ?(Nlog N)2/(log log N)2) or
            ?(Nlog N)2/log log N) or ?(N(log N)2) or something in between.

       Best Case Complexity: O(n*log n)

           When the array is already sorted, the total number of comparisons for each interval (or increment) is equal
           to the size of the array.

      Average Case Complexity: O(n*log n)
          It is around O(n1.25).

     Space Complexity:  O(1)

     Shell Sort Applications

        • calling a stack is overhead. uClibc library uses this sort.
        • recursion exceeds a limit. bzip2 compressor uses it.
        • Insertion sort does not perform well when the close elements are far apart. Shell sort helps in reducing the
         distance between the close elements. Thus, there will be less number of swappings to be performed.

*/