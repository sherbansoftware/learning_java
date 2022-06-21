package Variable.Varargs.Example;

public class Array_Argument {

    int ife;

    public int sum(int... xs) {
        int sum = 0;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] == 9) {
                System.out.println("Index of " + xs[i] + " is " + i);
                ife = i;
                break;
            }
            sum += xs[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Array_Argument ar = new Array_Argument();
        int[] arr = {6, 8, 2, 554, 9, 64, 47};
        int sum = ar.sum(arr);
        System.out.println("Sum of first " + ar.ife + " elements is: " + sum);


    }
}
