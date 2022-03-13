package Arrays.WW_Doc;

/*                                                                Arrays

    In the Java programming language, arrays are

        objects,
        are dynamically created,
        and may be assigned to variables of type Object.

    All methods of class Object may be invoked on an array.

    An array object contains a number of variables. The number of variables may be zero, in which case the array is said
        to be empty. The variables contained in an array have no names; instead they are referenced by array access
        expressions that use non-negative integer index values. These variables are called the components of the array.
        If an array has n components, we say n is the length of the array; the components of the array are referenced
        using integer indices from 0 to n - 1, inclusive.

    All the components of an array have the same type, called the component type of the array. If the component type of
        an array is T, then the type of the array itself is written T[].

    The value of an array component of type float is always an element of the float value set (§4.2.3); similarly, the value
        of an array component of type double is always an element of the double value set. It is not permitted for the value
        of an array component of type float to be an element of the float-extended-exponent value set that is not also an
        element of the float value set, nor for the value of an array component of type double to be an element of the
        double-extended-exponent value set that is not also an element of the double value set.

    The component type of an array may itself be an array type.
        The components of such an array may contain references to subarrays. If, starting from any array type, one considers
        its component type, and then (if that is also an array type) the component type of that type, and so on, eventually
        one must reach a component type that is not an array type; this is called the element type of the original array,
        and the components at this level of the data structure are called the elements of the original array.

    There are some situations in which an element of an array can be an array: if the element type is Object or Cloneable
        or java.io.Serializable, then some or all of the elements may be arrays, because any array object can be assigned
        to any variable of these types.

                                                       10.1. Array Types




10.2. Array Variables
10.3. Array Creation
10.4. Array Access
10.5. Array Store Exception
10.6. Array Initializers
10.7. Array Members
10.8. Class Objects for Arrays
10.9. An Array of Characters Is Not a String

 */

public class Arrays {
    public static void main(String[] args) {

        //Declare an array

        //method 1
        int[] values = new int[]{10, 20, 30};

        //method2
        int[] values1 = {55,87,66};

        //method 3
        int[] values3 = new int[3];
         values3[0] = 77;
         values3[1] = 94;
         values3[0] = 34;


        // iterate through an array using for loop
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        // iterate through an array using for-each loop
        for (int c : values) {
            System.out.println(c);
        }

    }
}
