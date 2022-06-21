package Algorithms.Sort.Selection_Sort;

/*                                              Selection Sort

    The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
        from unsorted part and putting it at the beginning.

    The algorithm maintains two subarray in a given array.

            1) The subarray which is already sorted.
            2) Remaining subarray which is unsorted.

    In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray
        is picked and moved to the sorted subarray.

                                                           NOTE

            * In place Algorithm

            * O(n�) - Quadratic  (Bad) as there are two nested loops.

            * so that means that it will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps
                  to sort 1,000 items.

            * The good thing about selection sort is it never makes more than O(n) swaps and can be useful
                  when memory write is a costly operation.

            * Unstable algorithm


*/

// Java program for implementation of Selection Sort
class Selection_Sort {
    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        Selection_Sort ob = new Selection_Sort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra*/
