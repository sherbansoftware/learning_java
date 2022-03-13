package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Compare_Two_Array;


/*
    Arrays can be compared using static	method	equals	defined	in	Arrays	class.
	    Two	arrays are equal only if they have the same	numbers	in all positions and have the same size.

*/
public class Compare_Array {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};

        // System.out.println (Arrays.equals (numbers1, numbers2));    //false

        int[] numbers3 = {1, 2, 3};

            //System.out.println (Arrays.equals (numbers1, numbers3));    //true

        Object[] objArr = new Object[3];

        //print methods -----------------------------------------------------------------------------------------------

               // System.out.println (Arrays.toString (objArr));

              // Arrays.stream(numbers1).forEach (e -> System.out.println (e));

           int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};

      // using deepToString method of Arrays class for multidimensional Arrays -----------------------------------------

              //System.out.println (Arrays.deepToString (matrix3));

    }

}
