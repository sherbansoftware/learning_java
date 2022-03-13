package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Object_Array;

import java.util.Arrays;
import java.util.Collections;

public class Object_Array {


    // Elements of the array are objects of a class Student------------------------------------------------------------

    public static void main(String[] args) {
        // declares an Array of integers.
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize elements of the array
        arr[0] = new Student (1, "aman");
        arr[1] = new Student (2, "vaibhav");
        arr[2] = new Student (3, "shikar");
        arr[3] = new Student (4, "dharmesh");
        arr[4] = new Student (5, "mohit");

        Arrays.sort(arr,Collections.reverseOrder ());

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println ("Element at " + i + " : " +
                    arr[i].roll_no + " " + arr[i].name);
    }
}


