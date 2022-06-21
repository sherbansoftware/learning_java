package Execution.Creation_of_New_Class_Instances;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.5

/*                                                    Creation of New Class Instances

    A new class instance is explicitly created when evaluation of a

           class instance creation expression     https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.9

        causes a class to be instantiated.

                              A new class instance may be implicitly created in the following situations:

            * Loading of a class or interface that contains a String literal (�3.10.5) may create a new String object to
                  represent that literal. (This might not occur if the same String has previously been interned (�3.10.5).)

            * Execution of an operation that causes boxing conversion (�5.1.7).Boxing conversion may create a new object
                  of a wrapper class associated with one of the primitive types.

            * Execution of a string concatenation operator + (�15.18.1) that is not part of a constant expression (�15.28)
                  always creates a new String object to represent the result. String concatenation operators may also
                  create temporary wrapper objects for a value of a primitive type.

    Evaluation of a method reference expression (�15.13.3) or a lambda expression (�15.27.4) may require that a new instance
        of a class that implements a functional interface type be created.

    Each of these situations identifies a particular constructor (�8.8) to be called with specified arguments (possibly none)
        as part of the class instance creation process.

    Whenever a new class instance is created, memory space is allocated for it with room for all the instance variables
        declared in the class type and all the instance variables declared in each superclass of the class type, including
        all the instance variables that may be hidden (�8.3).

    If there is not sufficient space available to allocate memory for the object, then creation of the class instance
        completes abruptly with an OutOfMemoryError. Otherwise, all the instance variables in the new object, including
        those declared in superclasses, are initialized to their default values (�4.12.5).

    Just before a reference to the newly created object is returned as the result, the indicated constructor is processed
        to initialize the new object using the following procedure:

            1. Assign the arguments for the constructor to newly created parameter variables for this constructor invocation.

            2. If this constructor begins with an explicit constructor invocation (�8.8.7.1) of another constructor in the
                   same class (using this), then evaluate the arguments and process that constructor invocation recursively
                   using these same five steps. If that constructor invocation completes abruptly, then this procedure completes
                   abruptly for the same reason; otherwise, continue with step 5.

            3. This constructor does not begin with an explicit constructor invocation of another constructor in the same
                   class (using this). If this constructor is for a class other than Object, then this constructor will
                   begin with an explicit or implicit invocation of a superclass constructor (using super). Evaluate the
                   arguments and process that superclass constructor invocation recursively using these same five steps.
                   If that constructor invocation completes abruptly, then this procedure completes abruptly for the same
                   reason. Otherwise, continue with step 4.

            4. Execute the instance initializers and instance variable initializers for this class, assigning the values
                   of instance variable initializers to the corresponding instance variables, in the left-to-right order
                   in which they appear textually in the source code for the class. If execution of any of these initializers
                   results in an exception, then no further initializers are processed and this procedure completes abruptly
                   with that same exception. Otherwise, continue with step 5.

            5. Execute the rest of the body of this constructor. If that execution completes abruptly, then this procedure
               completes abruptly for the same reason. Otherwise, this procedure completes normally.

    Unlike C++, the Java programming language does not specify altered rules for method dispatch during the creation of
        a new class instance. If methods are invoked that are overridden in subclasses in the object being initialized,
        then these overriding methods are used, even before the new object is completely initialized.

    Example 12.5-1. Evaluation of Instance Creation

class Point {
    int x, y;
    Point() { x = 1; y = 1; }
}

class ColoredPoint extends Point {
    int color = 0xFF00FF;
}
class Test {
    public static void main(String[] args) {
        ColoredPoint cp = new ColoredPoint();
        System.out.println(cp.color);
    }
}

    Here, a new instance of ColoredPoint is created. First, space is allocated for the new ColoredPoint, to hold the
        fields x, y, and color. All these fields are then initialized to their default values (in this case, 0 for each
        field). Next, the ColoredPoint constructor with no arguments is first invoked. Since ColoredPoint declares no
        constructors, a default constructor of the following form is implicitly declared:

ColoredPoint() { super(); }

    This constructor then invokes the Point constructor with no arguments. The Point constructor does not begin with an
        invocation of a constructor, so the Java compiler provides an implicit invocation of its superclass constructor
        of no arguments, as though it had been written:

    Point() { super(); x = 1; y = 1; }

    Therefore, the constructor for Object which takes no arguments is invoked.

    The class Object has no superclass, so the recursion terminates here. Next, any instance initializers and instance
        variable initializers of Object are invoked. Next, the body of the constructor of Object that takes no
        arguments is executed. No such constructor is declared in Object, so the Java compiler supplies a default one,
         which in this special case is:

                  Object() { }

        This constructor executes without effect and returns.

    Next, all initializers for the instance variables of class Point are executed. As it happens, the declarations of x
        and y do not provide any initialization expressions, so no action is required for this step of the example. Then
        the body of the Point constructor is executed, setting x to 1 and y to 1.

    Next, the initializers for the instance variables of class ColoredPoint are executed. This step assigns the value
        0xFF00FF to color. Finally, the rest of the body of the ColoredPoint constructor is executed (the part after
        the invocation of super); there happen to be no statements in the rest of the body, so no further action is
        required and initialization is complete.


Example 12.5-2. Dynamic Dispatch During Instance Creation

class Super {
    Super() { printThree(); }
    void printThree() { System.out.println("three"); }
}

class Test extends Super {
    int three = (int)Math.PI;  // That is, 3
    void printThree() { System.out.println(three); }

    public static void main(String[] args) {
        Test t = new Test();
        t.printThree();
    }
}

    This program produces the output:

0
3

    This shows that the invocation of printThree in the constructor for class Super does not invoke the definition of
        printThree in class Super, but rather invokes the overriding definition of printThree in class Test. This method
        therefore runs before the field initializers of Test have been executed, which is why the first value output is 0,
        the default value to which the field three of Test is initialized. The later invocation of printThree in method
        main invokes the same definition of printThree, but by that point the initializer for instance variable three has
        been executed, and so the value 3 is printed.


*/

public class Creation_Of_New_Class_Instances {
}
