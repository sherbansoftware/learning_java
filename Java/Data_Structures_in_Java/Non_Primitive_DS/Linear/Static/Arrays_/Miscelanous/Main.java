package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Miscelanous;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] avgArray = getInteger(3);

        // double myInteger = getAverageArray(avgArray);
        System.out.println(getMinElement(avgArray));
    }

    public static int[] getInteger(int insert) {
        int[] ins = new int[insert];
        System.out.println("Enter " + insert + " numbers:\r");
        for (int i = 0; i < ins.length; i++) {
            ins[i] = scanner.nextInt();
        }
        return ins;
    }

    public static double getAverageArray(int[] avgArray) {
        double avg = 0;
        int sum = 0;

        for (int i = 0; i < avgArray.length; i++) {
            sum += avgArray[i];
        }
        if (sum > 0) {
            avg = (double) sum / avgArray.length;
        } else {
            System.out.println("Array sum must be greater than 0");
        }

        return avg;
    }

    public static int getMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }

        return min;
    }

}
