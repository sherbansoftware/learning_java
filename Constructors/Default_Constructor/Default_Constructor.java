package Constructors.Default_Constructor;

/*                                                  Default constructor

    If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on
        your behalf. This constructor is known as default constructor. You would not find it in your source code(the java file)
        as it would be inserted into the code during compilation and exists in .class file. This process is shown in the
        diagram below:

            default_constructor.png

    If you implement any constructor then you no longer receive a default constructor from Java compiler.


 */

class Machine {
}

public class Default_Constructor {
    public static void main(String[] args) {
        new Machine();

    }
}
