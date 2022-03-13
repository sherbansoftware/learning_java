package Variables.WW_DOC;


/*
                                                       final Variables

    A variable can be declared final.
        A final variable may only be assigned to once. It is a compile-time error if a final
        variable is assigned to unless it is definitely unassigned immediately prior to the assignment (§16 (Definite Assignment)).
        Once a final variable has been assigned, it always contains the same value. If a final variable holds a reference to
        an object, then the state of the object may be changed by operations on the object, but the variable will always
        refer to the same object. This applies also to arrays, because arrays are objects; if a final variable holds a
        reference to an array, then the components of the array may be changed by operations on the array, but the variable
        will always refer to the same array.

    A blank final is a final variable whose declaration lacks an initializer.

    A constant variable is a final variable of primitive type or type String that is initialized with a constant expression
        Whether a variable is a constant variable or not may have implications with respect to class initialization (§12.4.1),
        binary compatibility (§13.1, §13.4.9), and definite assignment (§16 (Definite Assignment)).

   Three kinds of variable are implicitly declared final: a field of an interface (§9.3), a local variable which is a resource of a try-with-resources statement (§14.20.3), and an exception parameter of a multi-catch clause (§14.20). An exception parameter of a uni-catch clause is never implicitly declared final, but may be effectively final.

       Example 4.12.4-1. Final Variables

    Declaring a variable final can serve as useful documentation that its value will not change and can help avoid programming
        errors. In this program:

        class Point {
            int x, y;
            int useCount;
            Point(int x, int y) { this.x = x; this.y = y; }
            static final Point origin = new Point(0, 0);
          }
    the class Point declares a final class variable origin. The origin variable holds a reference to an object that is an
    instance of class Point whose coordinates are (0, 0). The value of the variable Point.origin can never change, so it
    always refers to the same Point object, the one created by its initializer. However, an operation on this Point object
    might change its state - for example, modifying its useCount or even, misleadingly, its x or y coordinate.


    Certain variables that are not declared final are instead considered effectively final:

    A local variable whose declarator has an initializer (§14.4.2) is effectively final if all of the following are true:

        It is not declared final.

    It never occurs as the left hand side in an assignment expression (§15.26). (Note that the local variable declarator
        containing the initializer is not an assignment expression.)

    It never occurs as the operand of a prefix or postfix increment or decrement operator (§15.14, §15.15).

    A local variable whose declarator lacks an initializer is effectively final if all of the following are true:

        It is not declared final.

    Whenever it occurs as the left hand side in an assignment expression, it is definitely unassigned and not definitely
        assigned before the assignment; that is, it is definitely unassigned and not definitely assigned after the right hand
        side of the assignment expression (§16 (Definite Assignment)).

    It never occurs as the operand of a prefix or postfix increment or decrement operator.

    A method, constructor, lambda, or exception parameter (§8.4.1, §8.8.1, §9.4, §15.27.1, §14.20) is treated, for the
        purpose of determining whether it is effectively final, as a local variable whose declarator has an initializer.

    If a variable is effectively final, adding the final modifier to its declaration will not introduce any compile-time errors.
        Conversely, a local variable or parameter that is declared final in a valid program becomes effectively final if
        the final modifier is removed.

 */