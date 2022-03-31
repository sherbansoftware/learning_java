package Array.SingleDimension_Arrays.Example;

public class ArrayIntroduction {

    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;

        int[] x = new int[1000];
        System.out.println(x.getClass().getName());

        //Zero as size
        int[] y = new int[0];

        //character as size
        int[] z = new int['a'];
        //allowed data types for an int array:

        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        //negative array size is not allowed
     //   int[] p = new int[-1];

        //size of an int array cannot be more than this:214748364
        int[] q = new int[214748364];
        //214748364*4 memory required to create this array.
    }

}
