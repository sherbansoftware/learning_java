package Variables.Variable.Reference_Type;

/*                                             A variable is

         a storage location and has an associated type, sometimes called its compile-time type,
         that is either a

             • primitive type
             • reference type

         A variable's value is changed by an assignment or by a prefix or postfix ++ (increment) or -- (decrement) operator

         Compatibility of the value of a variable with its type is guaranteed by the design of the Java programming language,
         as long as a program does not give rise to compile-time unchecked warnings. Default values
         are compatible and all assignments to a variable are checked for assignment compatibility  usually at
         compile time, but, in a single case involving arrays, a run-time check is made.


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


*/

public class Reference_Type {
}
