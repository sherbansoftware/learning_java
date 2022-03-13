package Java.Algorithms_in_Java.Binary_Search;


import java.util.Arrays;

class Arrays_sort {

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int result = Arrays.binarySearch (arr, key);
        if (result < 0)
            System.out.println ("Element is not found!");
        else
            System.out.println ("Element is found at index: " + result);
    }
}

   // Arrays.sor(arr)             O(n*log(n) - linearithmic

   // Quick Sort is better        O(log n)    - logarithmic
