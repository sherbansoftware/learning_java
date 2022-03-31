package Array.AnonimousArrays;

// https://www.tutorialspoint.com/what-is-an-anonymous-array-and-explain-with-an-example-in-java

/*                                              Anonymous array

    An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly.
        Using an anonymous array, we can pass an array with user values without the referenced variable.

    You can create an anonymous array by initializing it at the time of creation.

            * new int[] { 1254, 5452, 5743, 9984}; //int array

            * new String[] {"Java", "JavaFX", "Hadoop"}; //String array

                                                 NOTE

            * Since it doesn’t have name to refer you can use it only once in your program.
            * Generally, anonymous arrays are passed as arguments to methods.


 */
public class AnonymousArrays {

    public static void main(String[] args) {

        sum(new int[]{1, 2, 3});        //can not provide size in anonymous array
    }

    private static void sum(int[] is) {
        int total = 0;
        for (int e : is) {
            total = total + e;
        }
        System.out.println(total);

    }

    //for instant use, we use anonymous arrays.

}

