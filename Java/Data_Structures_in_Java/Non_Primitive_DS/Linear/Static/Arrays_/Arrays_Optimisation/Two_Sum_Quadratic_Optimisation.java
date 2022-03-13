package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Arrays_Optimisation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_Quadratic_Optimisation {
    public static void main(String[] args) {
        int[] arr = {44, 59, 621, 777, 7, 11, 15};

       //System.out.println (Arrays.toString (getSum (arr, 22)));
       // Arrays.sort (arr);
        System.out.println (Arrays.toString(twoSum(arr, 22)));

    }

    // Brute Force
    // Time complexity o(N²) quadratic    - not optimized
    // Space complexity : O(1)

    public static int[] getSum(int[] arr, int target) {
        int[] tArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] + arr[j] == target)) {
                    tArr[0] = arr[i];
                    tArr[1] = arr[j];
                    return tArr;
                }
            }
        }
        throw new IllegalArgumentException ("No two sum solution");
    }

    // Two-pass Hash Table ---------------------------------------------------------------------------------------------

    // Complexity Analysis:

    // Time complexity :  O(n) -----------------------------------------------------------------------------------------
    // We traverse the list containing nn elements exactly twice.
    // Since the hash table reduces the look up time to O(1),the time complexity is O(n).

    // Space complexity : O(n) -----------------------------------------------------------------------------------------
    // The extra space required depends on the number of items stored in the
    // hash table, which stores exactly nn elements.


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            map.put (nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey (complement) && map.get (complement) != i) {
                return new int[]{i, map.get (complement)};
            }
        }
        throw new IllegalArgumentException ("No two sum solution");
    }

}


