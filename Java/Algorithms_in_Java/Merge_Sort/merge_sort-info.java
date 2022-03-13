package Java.Algorithms_in_Java.Merge_Sort;

// https://www.geeksforgeeks.org/merge-sort/
// https://www.programiz.com/dsa/merge-sort

/*                                        Merge Sort

    is a Divide and Conquer algorithm.
       It divides the input array into two halves, calls itself for the two halves, and
       then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r)
       is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one


    Time complexity of Merge Sort is:

          O(n*Log n) linearithmic  (Fair)

          in all the 3 cases (worst, average and best)

*/