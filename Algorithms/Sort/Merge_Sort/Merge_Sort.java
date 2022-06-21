package Algorithms.Sort.Merge_Sort;

// https://www.geeksforgeeks.org/merge-sort/
// https://www.programiz.com/dsa/merge-sort

/*                         Merge Sort - is a Divide and Conquer algorithm.

    Splitting phase,

            * start with the unsorted array, and we divide the array into two arrays,
                  and remember, both of the arrays will be unsorted.

            * and we call the

                      - first array, the left array

                      - and second array, the right array,

                  and we generally just divide the array down the middle.

            * Split the left and right arrays into tho array each.

            * Keep splitting until all the arrays have only one element each - these arrays are sorted

    Merging phase:

            * Merge every left/right  pair of sibling arrays into a sorted array.

            * After the first merge , we'll have a bunch of 2 - element sorted arrays

            * Then merged those sorted arrays (left/right siblings) to end up with a bunch of 4- element sorted arrays

            * Repeat until you have a single sorted array

            * Now we have to merge all these 1 - element arrays

            * We always merge siblings left/right arrays

            * We create a temporary array large enough to hold all the elements in the arrays we're merging.

            * So on the first round, our temporary arrays will be of length two

             * will compare all elements and sort it using temporary arrays


                                                Time complexity of Merge Sort is:

             O(n*Log n) linearithmic  (Fair)

                                                      NOTE

            * Merge sort is a divide and conquer algorithm
            * Usually it is using recursion
            * Two phases: Splitting and Merging
            * Splitting is a preparation phase and leads to faster sorting during the Merging phase.
            * Splitting is logical.We don't create new arrays
            * Not in place.Uses a temporary arrays
            * Stable algorithm

*/


// Java program for Merge Sort
class Merge_Sort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Interface_Class function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort (arr, l, m);
            sort (arr, m + 1, r);

            // Merge the sorted halves
            merge (arr, l, m, r);
        }
    }

    /* ATest.A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print (arr[i] + " ");
        System.out.println ();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println ("Given Array_");
        printArray (arr);

        Merge_Sort ob = new Merge_Sort();
        ob.sort (arr, 0, arr.length - 1);

        System.out.println ("\nSorted array");
        printArray (arr);
    }
}