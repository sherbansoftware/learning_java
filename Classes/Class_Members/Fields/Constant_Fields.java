package Classes.Class_Members.Fields;

 /*                                                                    Constant fields

                A constant is a variable whose value cannot change once it has been assigned. Java doesn't have built-in support for
                constants. A constant can make our program more easily read and understood by others. In addition, a constant is
                cached by the JVM as well as our application, so using a constant can improve performance
*/

public class Constant_Fields {
    public static final int CONST = 10;

    public static void main(String[] args) {
        System.out.println(CONST);
    }
}
