package Variables.WW_DOC;

/*
    https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.12


                                                 A variable is

        a storage location and has an associated type, sometimes called its compile-time type,
        that is either a

           • primitive type
           • reference type

    A variable's value is changed by an assignment or by a prefix or postfix ++ (increment) or -- (decrement) operator

    Compatibility of the value of a variable with its type is guaranteed by the design of the Java programming language,
        as long as a program does not give rise to compile-time unchecked warnings. Default values
        are compatible and all assignments to a variable are checked for assignment compatibility  usually at
        compile time, but, in a single case involving arrays, a run-time check is made.

                                             Variables of Primitive Type

    A variable of a primitive type always holds a primitive value of that exact primitive type.

                                             Variables of Reference Type

    A variable of a class type T
        can hold a null reference or a reference to an instance of class T or of any class that is a subclass of T.

    A variable of an interface type can hold a null reference or a reference to any instance of any class that implements
        the interface.

    Note that a variable is not guaranteed to always refer to a subtype of its declared type, but only to subclasses or
        subinterfaces of the declared type. This is due to the possibility of heap pollution discussed below.

    If T is a primitive type, then a variable of type "array of T" can hold a null reference or a reference to any array
        of type "array of T".

    If T is a reference type, then a variable of type "array of T" can hold a null reference or a reference to any array
        of type "array of S" such that type S is a subclass or subinterface of type T.

    A variable of type Object[] can hold a reference to an array of any reference type.
        A variable of type Object can hold a null reference or a reference to any object, whether it is an instance of
        a class or an array.

    It is possible that a variable of a parameterized type will refer to an object that is not of that parameterized type.
    This situation is known as heap pollution.

    Heap pollution can only occur if the program performed some operation involving a raw type that would give rise to a
        compile-time unchecked warning (§4.8, §5.1.9, §5.5.2, §8.4.1, §8.4.8.3, §8.4.8.4, §9.4.1.2, §15.12.4.2), or if the
        program aliases an array variable of non-reifiable element type through an array variable of a supertype which is either raw or non-generic.


                                                     Kinds of Variables
    There are eight kinds of variables:

        1. A class variable
               is a field declared using the keyword static within a class declaration
               or with or without the keyword static within an interface declaration
               A class variable is created when its class or interface is prepared (§12.3.2) and is initialized to a
               default value (§4.12.5). The class variable effectively ceases to exist when its class or interface is
               unloaded

        2. An instance variable
               is a field declared within a class declaration without using the keyword static (§8.3.1.1).
               If a class T has a field a that is an instance variable, then a new instance variable a is created and
               initialized to a default value (§4.12.5) as part of each newly created object of class T or of any class
               that is a subclass of T (§8.1.4). The instance variable effectively ceases to exist when the object of
               which it is a field is no longer referenced, after any necessary finalization of the object (§12.6) has been completed.

        3.Array components
               are unnamed variables
               that are created and initialized to default values (§4.12.5) whenever
               a new object that is an array is created (§10 (Arrays), §15.10.2). The array components effectively cease
               to exist when the array is no longer referenced.

        4.Method parameters
              name argument values passed to a method.
              For every parameter declared in a method declaration, a new parameter variable is created each time that
              method is invoked (§15.12). The new variable is initialized with the corresponding argument value from the
              method invocation. The method parameter effectively ceases to exist when the execution of the body of the
               method is complete.

        5.Constructor parameters
             name argument values passed to a constructor.
             For every parameter declared in a constructor declaration, a new parameter variable is created each time a
             class instance creation expression (§15.9) or explicit constructor invocation (§8.8.7) invokes that constructor.
             The new variable is initialized with the corresponding argument value from the creation expression or constructor
             invocation. The constructor parameter effectively ceases to exist when the execution of the body of the
             constructor is complete.

        6.Lambda parameters
             name argument values passed to a lambda expression body
             For every parameter declared in a lambda expression, a new parameter variable is created each time a method
             implemented by the lambda body is invoked (§15.12). The new variable is initialized with the corresponding
             argument value from the method invocation. The lambda parameter effectively ceases to exist when the execution
             of the lambda expression body is complete.

        7.Exception parameter
             is created each time an exception is caught by a catch clause of a try statement (§14.20).
             The new variable is initialized with the actual object associated with the exception (§11.3, §14.18). The
             exception parameter effectively ceases to exist when execution of the block associated with the catch clause
             is complete.

        8.Local variables
            are declared by local variable declaration statements
            Whenever the flow of control enters a block (§14.2) or for statement (§14.14), a new variable is created for
            each local variable declared in a local variable declaration statement immediately contained within that
            block or for statement.
            A local variable declaration statement may contain an expression which initializes the variable. The local
            variable with an initializing expression is not initialized, however, until the local variable declaration
            statement that declares it is executed. (The rules of definite assignment (§16 (Definite Assignment)) prevent
            the value of a local variable from being used before it has been initialized or otherwise assigned a value.)
            The local variable effectively ceases to exist when the execution of the block or for statement is complete.


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

                                                 Initial Values of Variables

    Every variable in a program must have a value before its value is used:
    Each class variable, instance variable, or array component is initialized with a default value when it is created :

        For type byte,
            the default value is zero, that is, the value of (byte)0.

        For type short,
            the default value is zero, that is, the value of (short)0.

        For type int,
            the default value is zero, that is, 0.

        For type long,
            the default value is zero, that is, 0L.

        For type float, the
            default value is positive zero, that is, 0.0f.

       For type double,
           the default value is positive zero, that is, 0.0d.

       For type char,
            the default value is the null character, that is, '\u0000'.

       For type boolean,
            the default value is false.

       For all reference types (§4.3),
            the default value is null.

       Each method parameter
           (§8.4.1) is initialized to the corresponding argument value provided by the invoker of the method (§15.12).

       Each constructor parameter
           (§8.8.1) is initialized to the corresponding argument value provided by a class instance creation expression
           (§15.9) or explicit constructor invocation (§8.8.7).

       An exception parameter
           (§14.20) is initialized to the thrown object representing the exception (§11.3, §14.18).

       A local variable
           (§14.4, §14.14) must be explicitly given a value before it is used, by either initialization (§14.4) or
           assignment (§15.26), in a way that can be verified using the rules for definite assignment (§16 (Definite Assignment)).

 */