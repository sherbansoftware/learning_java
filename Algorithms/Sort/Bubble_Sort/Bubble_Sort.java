package Algorithms.Sort.Bubble_Sort;

import java.util.Arrays;

/*                                              Bubble Sort

    is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

                                             Time Complexity:

          O(n²)            - Quadratic (Bad)  even the array is sorted

                                                   NOTE

            * In place algorithm  means:

                  We don't have to create another array in order to perform this sort and so when it comes to memory,
                      this is an in-place algorithm.

            *  O(n²) time complexity               - Quadratic (Bad)  even the array is sorted

            * so that means that it will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps
                  to sort 1,000 items.

            * So as you can see this algorithm really degrades quickly.

            * Not a stable algorithm


*/


public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {24, 4, 7, 64, 19, 22, 22, 44, 78, 55, 3};
        bubbleSort (arr);
        System.out.println (Arrays.toString (arr));

    }

    // bubble sort algorithm

    // The above function always runs O(n²) quadratic time even if the array is sorted.
    // It can be optimized by stopping the algorithm if inner loop didn't cause any swap.

    // An optimized version of Bubble Sort

        static void bubbleSort(int arr[]) {
         int n = arr.length;
          for (int i = 0; i < n - 1; i++) {
            int temp = 0;
         boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

   // brute force paradigm
//    static void bubbleSort(int[] intArray) {
//
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = i + 1; j < intArray.length; j++) {
//
//                if (intArray[i] > intArray[j]) {
//                    //swap elements if not in order
//                    int temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//
//                }
//            }
//        }
//    }
}
