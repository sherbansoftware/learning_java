package Classes.Classes_Types.Local_Class;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.3
// https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
// https://www.geeksforgeeks.org/local-inner-class-java/

/*                                                    Local Classes

    Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces.
        You typically find local classes defined in the body of a method.

                                                   Local Class Declarations

    A local class is a nested class (§8 (Classes)) that is not a member of any class and that has a name (§6.2, §6.7).

    All local classes are inner classes (§8.1.3).

    Every local class declaration statement is immediately contained by a block (§14.2). Local class declaration statements
        may be intermixed freely with other kinds of statements in the block.

    It is a compile-time error if a local class declaration contains any of the access modifiers public, protected, or
        private (§6.6), or the modifier static (§8.1.1).

    The scope and shadowing of a local class declaration is specified in §6.3 and §6.4.

    Example 14.3-1. Local Class Declarations

Here is an example that illustrates several aspects of the rules given above:

class Global {
    class Cyclic {}

    void foo() {
        new Cyclic(); // create a Global.Cyclic
        class Cyclic extends Cyclic {} // circular definition

        {
            class Local {}
            {
                class Local {} // compile-time error
            }
            class Local {} // compile-time error
            class AnotherLocal {
                void bar() {
                    class Local {} // ok
                }
            }
        }
        class Local {} // ok, not in scope of prior Local
    }
}

    The first statement of method foo creates an instance of the member class Global.Cyclic rather than an instance of
        the local class Cyclic, because the statement appears prior to the scope of the local class declaration.

    The fact that the scope of a local class declaration encompasses its whole declaration (not only its body) means
        that the definition of the local class Cyclic is indeed cyclic because it extends itself rather than Global.Cyclic.
        Consequently, the declaration of the local class Cyclic is rejected at compile time.

    Since local class names cannot be redeclared within the same method (or constructor or initializer, as the case may be),
        the second and third declarations of Local result in compile-time errors. However, Local can be redeclared in
        the context of another, more deeply nested, class such as AnotherLocal.

    The final declaration of Local is legal, since it occurs outside the scope of any prior declaration of Local.

                                               Accessing Members:

    A local inner class has access to fields of the class enclosing it as well as the fields of the block that it is
        defined within. These classes, however, can access the variables or parameters of the block that encloses it
        only if they are declared as final or are effectively final. A variable whose value is not changed once
        initialized is called an effectively final variable. A local inner class defined inside a method body has
        access to its parameters.


                                                       NOTE

            * It is a compile-time error if a local class declaration contains any of the access modifiers

                   public,
                   protected,
                   or private (§6.6),
                   or the modifier static (§8.1.1).

             * Local Inner classes are not a member of any enclosing classes.
                   They belong to the block they are defined within, due to which local inner classes cannot have any
                   access modifiers associated with them.

             * A local class can access local variables and parameters of the enclosing block that are effectively final.

             * Rules of Local Inner Class:

                    -The scope of the local inner class is restricted to the block they are defined in.
                    - A local inner class cannot be instantiated from outside the block where it is created in.
                    - Till JDK 7, the Local inner class can access only the final local variable of the enclosing block.
                          However, From JDK 8, it is possible to access the non-final local variable of enclosing block
                          in the local inner class.
                    - A local class has access to the members of its enclosing class.
                    - Local inner classes can extend an abstract class or implement an interface.

 */


public class Local_Class {
}
