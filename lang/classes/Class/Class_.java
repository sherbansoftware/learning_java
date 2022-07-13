package lang.classes.Class;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html

class Class_RT {
    Class classLoader;
}

/*                                               java.lang.lang.classes.Object java.lang.Class<T>

    https://www.geeksforgeeks.org/classes-objects-java/
    https://www.geeksforgeeks.org/java-lang-class-class-java-set-1/

    Type Parameters:

        T - the type of the class modeled by this Class object. For example, the type of String.class is Class<String>.
        Use Class<?> if the class being modeled is unknown.

    All Implemented Interface_Class:

        Serializable, AnnotatedElement, GenericDeclaration, Type

    public final class Class<T> extends lang.classes.Object implements Serializable, GenericDeclaration, Type, AnnotatedElement

    Instances of the class Class represent classes and interfaces in a running Java application. An enum is a kind of
        class and an annotation is a kind of interface. Every array also belongs to a class that is reflected as a Class
        object that is shared by all arrays with the same element type and number of dimensions. The primitive Java types
        (boolean, byte, char, short, int, long, float, and double), and the keyword void are also represented as Class objects.

    Class has no public constructor. Instead Class objects are constructed automatically by the Java Virtual Machine as
        classes are loaded and by calls to the defineClass method in the class loader.

    The following example uses a Class object to print the class name of an object:

            void printClassName(lang.classes.Object obj) {
                System.out.println("The class of " + obj +
                            " is " + obj.getClass().getName());
            }

    It is also possible to get the Class object for a named type (or for void) using a class literal. See Section 15.8.2
        of The Java™ Language Specification.

    For example:

        System.out.println("The name of class Foo is: "+Foo.class.getName());

    Since:
        JDK1.0

    See Also:
        ClassLoader.defineClass(byte[], int, int), Serialized Form

    RELATED



 */