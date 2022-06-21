package lang.classes.Object.WW_Doc;

//  https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html

class Object_RT {
    Object obj;
}

/*                                             An object

    Class lang.classes.Object is the root of the class hierarchy. Every class has lang.classes.Object as a superclass. 
       
        • All objects, including arrays, implement the methods of this class.
        • Is a class instance or an array.
        •The reference values (often just references) are pointers to these objects, and a special null reference, which 
            refers to no object.

    A class instance is explicitly created by a class instance creation expression (�15.9).
    An array is explicitly created by an array creation expression (�15.10.1).
    A new class instance is implicitly created when the string concatenation operator +
        is used in a non-constant expression (�15.28), resulting in a new object of type String.
    A new array object is implicitly created when an array initializer expression is evaluated; this can occur when a
        class or interface is initialized , when a new instance of a class is created , or when a local variable
        declaration statement is executed .

    New objects of the types:
        Boolean,
        Byte,
        Short,
        Character,
        Integer,
        Long,
        Float
        Double

    may be implicitly created by boxing conversion .

                                             What is state of an lang.classes.Object?

    Values assigned to instance variables of an object

 * */