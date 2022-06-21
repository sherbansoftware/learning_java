package Array.Array_Sum;

public class Array_Sum {
    static int[] ints = {2, 66, -66};

    public static void main(String[] args) {
        System.out.println(sumArray(ints));


    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }
}
