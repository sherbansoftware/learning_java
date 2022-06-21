package Algorithms.Sort.Shell_Sort;


// https://en.wikipedia.org/wiki/Shellsort

/*                                               Shell Sort Algorithm

    Variation of InsertionSort
    Insertion sort choosing which element to sort using a gap of 1
    Shell sort starts out using a larger gap value
    As the algorithm runs,the gap is reduced
    Goal is to reduce the amount of shifting required
    As the algorithm progresses, the gap value is reduced.
    The last gap value is always 1
    A gap value of 1 is equivalent with a insertion point
    So, the algorithm does some preliminary work(using gap values that are greater than 1) and then becomes
        insertion sort
     By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required

            Knuth Sequence   a way to calculate the gap we will not use here just for knowing

                * Gap is calculated using (3 ^ k - 1)/2
                * We set k based on the length of the array
                * We want the gap to be as close as possible to the length of the array we want to sort, without being
                      greater than the length

    We' ll base our gap on the array's length  this we will use for our example ---------------------------------------

        • We'll initialize the gap(or interval) to array.length/2
        • On each iteration, we'll divide the gap value by 2 to get the next gap value
        • For our array ,the gap will be initialized to 3
        • On the next iteration, it will be - insertion sort


                                                       NOTE

            * In place algorithm
            * Difficult to nail down the time complexity because it will depend on the gap.Worst case:O(n²quadratic) ,
                  but it can perform much better than that
            * Doesn't require as much shifting as insertion sort, so usually perform better
            * Unstable algorithm
*/

// Shell sort in Java programming
import java.util.Arrays;

// Shell sort
class Shell_Sort {

    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    void shellSort(int array[], int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }

    // Driver code
    public static void main(String args[]) {
        int[] data = {9, 8, 3, 7, 5, 6, 4, 1};
        int size = data.length;
        Shell_Sort ss = new Shell_Sort ();
        ss.shellSort (data, size);
        System.out.println ("Sorted Array_ in Ascending Order: ");
        System.out.println (Arrays.toString (data));
    }
}
