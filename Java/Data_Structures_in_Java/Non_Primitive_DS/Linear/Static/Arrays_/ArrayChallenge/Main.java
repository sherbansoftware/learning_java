package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] array = getIntegers(4);
//        sortedArray(array);
        int[] arr = new int[3];
        printArray(sortedArray(arr));

    }

    public static int[] getIntegers(int ins) {
        System.out.println("Enter " + ins + " numbers:\r");
        int[] insArray = new int[ins];
        for (int i = 0; i < insArray.length; i++) {
            insArray[i] = scanner.nextInt();
        }
        return insArray;
    }

    public static void printArray(int[] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            System.out.println("Array element " + i + " has value " + printArray[i]);
        }
    }

    public static int[] sortedArray(int[] unsortedArray) {
        //       int[] sortedArray = new int[unsortedArray.length];
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = unsortedArray[i];
//        }
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
