package Array.Reflection_Array;

//  https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21336404#questions/15936422

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/package-summary.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Array.html

/*


 */

import java.lang.reflect.Array;

public class Reflection_Array {
    static String[] str = {"John", "Bob", "Mary"};
    static int[][] ints = {{2, 3, 4}, {3, 5, 8}};

    public static void main(String[] args) {
        int[][] ints = {{2, 3}, {3, 5, 8}};
        Class<?> clazz = str.getClass();
        String firstElement = (String) Array.get(str, 0);
        // System.out.println(firstElement);

        printArray(ints);

    }

    public static void printArray(Object arrayObject) {
        int arrayLength = Array.getLength(arrayObject);

        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            Object element = Array.get(arrayObject, i);

            if (element.getClass().isArray()) {
                printArray(element);
            } else {
                System.out.print(element);
            }

            if (i != arrayLength - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print("]");
    }
}

