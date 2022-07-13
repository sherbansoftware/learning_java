package Control_Flow.Looping;

/*                                                  Java for-each Loop

    The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because
        we don't need to increment value and use subscript notation.
    It works on the basis of elements and not the index. It returns element one by one in the defined variable.

                                                     SYNTAX

        for(data_type variable : array_name){
            //code to be executed
        }


 */

public class For_each {
    public static void main(String[] args) {
        //Declaring an array
        int arr[] = {12, 23, 44, 56, 78};
        //Printing array using for-each loop
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
