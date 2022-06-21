package Algorithms.Search.Binary_Search;

// https://www.upgrad.com/blog/binary-search-algorithm/#:~:text=The%20time%20complexity%20of%20the,values%20not%20in%20the%20list.


/*                                                  Binary Search Algorithm

    works on the idea of neglecting half of the list on every iteration.It keeps on splitting the list until it finds
        the value it is looking for in a given list. A binary search algorithm is a quick upgrade to a simple linear
        search algorithm.

                * A binary search algorithm always works on a sorted list
                * Binary search runs in logarithmic time in the worst case, making  O(log n) for ordered list
                * Must added O (log N)  if arr is not sorted (Quick Sort algorithm)

    	                                      Variations of Binary Search

        1. Uniform binary search
        2. Exponential search
        3. Interpolation search
        4. Fractional cascading
        5. Generalization to graphs
        6. Noisy binary search
        7.Quantum binary search


        Complexity                        O(log n)     - logarithmic

            and for array to be sorted     O(log n)     - logarithmic (Quick sort)

 */

class BinarySearch {

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println ("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println ("Element is not found!");
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int last = arr.length - 1;
        binarySearch (arr, 0, last, key);
    }
}
