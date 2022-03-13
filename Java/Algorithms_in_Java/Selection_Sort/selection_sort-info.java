package Java.Algorithms_in_Java.Selection_Sort;

/*                                     Selection Sort

    The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
    from unsorted part and putting it at the beginning.
        The algorithm maintains two subarrays in a given array.

            1) The subarray which is already sorted.
            2) Remaining subarray which is unsorted.

    In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray
    is picked and moved to the sorted subarray.

    Time Complexity:

        O(n2) - Quadratic  (Bad) as there are two nested loops.

    Auxiliary Space:

        O(1) Constant  (Excellent)

    The good thing about selection sort is it never makes more than O(n) swaps and can be useful
        when memory write is a costly operation.


*/