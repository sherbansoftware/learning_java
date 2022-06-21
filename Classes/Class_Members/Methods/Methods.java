package Classes.Class_Members.Methods;

/*                                                   Method Declarations

    A method declares executable code that can be invoked, passing a fixed number of values as arguments.

    MethodDeclaration:
        {MethodModifier} MethodHeader MethodBody

    MethodHeader:
        Result MethodDeclarator [Throws]
        TypeParameters {Annotation} Result MethodDeclarator [Throws]

    MethodDeclarator:
        Identifier ( [FormalParameterList] ) [Dims]


                                    More generally, method declarations have six components, in order:

    1.Modifiers—such as public, private, and others you will learn about later.
    2.The return type—the data type of the value returned by the method, or void if the method does not return a value.
    3.The method name—the rules for field names apply to method names as well, but the convention is a little different.
    4.The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types,
        enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
    5.An exception list—to be discussed later.
    6.The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.

                                                    Method signature

    Two of the components of a method declaration comprise the method signature:

        * the method's name
        * parameter types.

    It is a compile-time error for the body of a class to declare as members two methods with override-equivalent
        signatures

                                                   Overloading Methods

    The Java programming language supports overloading methods, and Java can distinguish between methods with different
        method signatures. This means that methods within a class can have the same name if they have different parameter
        lists (there are some qualifications to this that will be discussed in the lesson titled "Interface_Class and Inheritance").
    Methods can have same names and same parameter types but in different order

                                                    Observations

        * static variable can be accessed from static methods and nonstatic methods
        * instance variable cannot be accessed from static methods
 */

class DataArtist {

    public void draw(String s) {
    }

    public void draw(int i) {
    }

    public void draw(double f) {
    }

    public void draw(int i, String f) {
        System.out.println("Integer first");
    }

    public void draw(String f, int i) {
        System.out.println("String first");
    }
}

public class Methods {
    public static void main(String[] args) {
        new DataArtist().draw(6, "Integer first");
        new DataArtist().draw("String first", 55);
    }
}
