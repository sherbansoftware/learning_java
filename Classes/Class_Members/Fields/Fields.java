package Classes.Class_Members.Fields;

/*                                             Field declaration

    FieldDeclaration:
        {FieldModifier} UnannType VariableDeclaratorList ;

    VariableDeclaratorList:
        VariableDeclarator {, VariableDeclarator}

    VariableDeclarator:
       VariableDeclaratorId [= VariableInitializer]

    VariableDeclaratorId:
        Identifier [Dims]

    VariableInitializer:
        Expression
        ArrayInitializer

                                             Field Modifiers

        * public
        * protected
        * private
        * static
        * final
        * transient
        * volatile

                                              Instance Fields(Instance variable)

    Instance variable in Java is used by Objects to store their states. Variables that are defined without the STATIC
        keyword and are Outside any method declaration are Object-specific and are known as instance variables. They are
        called so because their values are instance-specific and are not shared among instances.
    If a class has an instance variable, then a new instance variable is created and initialized to a default value as
        part of the object creation of the class or subclass.

                                              Static Fields

    If a field is declared static,
        there exists exactly one incarnation of the field, no matter how many instances (possibly zero) of the class may
        eventually be created. A static field, sometimes called a class variable, is incarnated when the class is
        initialized.

                                               Final Fields

    A field can be declared final.
        Both class and instance variables (static and non-static fields) may be declared final.

    A blank final class variable must be definitely assigned by a static initializer of the class in which it is declared,
        or a compile-time error occurs.

    A blank final instance variable must be definitely assigned at the end of every constructor of the class in which it
        is declared, or a compile-time error occurs

                                                Constant fields

    A constant is a variable whose value cannot change once it has been assigned. Java doesn't have built-in support for
        constants. A constant can make our program more easily read and understood by others. In addition, a constant is
        cached by the JVM as well as our application, so using a constant can improve performance

 */

public class Fields {

                                                          //static fields

    static int x = 2;

                                                          //constant fields

    static final int NUM = 6;


    public static void main(String[] args) {


    }
}
