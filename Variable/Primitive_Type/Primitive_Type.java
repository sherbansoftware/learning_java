package Variable.Primitive_Type;

/*                                             A variable is

         a storage location and has an associated type, sometimes called its compile-time type,
         that is either a

             • primitive type
             • reference type

         A variable's value is changed by an assignment or by a prefix or postfix ++ (increment) or -- (decrement) operator

         Compatibility of the value of a variable with its type is guaranteed by the design of the Java programming language,
             as long as a program does not give rise to compile-time unchecked warnings.
         Default values
             are compatible and all assignments to a variable are checked for assignment compatibility  usually at
             compile time, but, in a single case involving arrays, a run-time check is made.


                                             Variables of Primitive Type

          A variable of a primitive type always holds a primitive value of that exact primitive type.

*/


public class Primitive_Type {

    public static void main(String[] args) {

        byte myByte = 77;
        char myChar = 156;
        short myShort = 44;
        int myInteger = 88;
        long myLong = 5165;
        float myFloat = 12.3f;
        double myDouble = 12.3654;
        boolean myBoolean = false;


        System.out.println(myByte);
        System.out.println(myChar);
        System.out.println(myShort);
        System.out.println(myInteger);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
    }

}
