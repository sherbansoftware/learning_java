package Array.Array_Max;

public class Array_Max {

    static int[] ints = {2, 66, 97, 456, -22, 54, 7};

    public static void main(String[] args) {
        System.out.println(maxArrayElement(ints));
    }

    private static int maxArrayElement(int[] arr) {
        int max = arr[0];

        for (int e : arr) {
            if (e >= max) {
                max =e;
            }
        }

        return max;
    }

}
