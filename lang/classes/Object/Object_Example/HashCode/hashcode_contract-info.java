package lang.classes.Object.Object_Example.HashCode;

/*                                General contract for the hashCode() method

    Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method
        must consistently return the same integer, provided no information used in equals comparisons on the object is
        modified. This integer need not remain consistent from one execution of an application to another execution of
        the same application.
    If two objects are equal according to the equals(lang.classes.Object) method, then calling the hashCode method on each of the two objects
        must produce the same integer result.
    It is not required that if two objects are unequal according to the equals(java.lang.lang.classes.Object) method, then calling the
        hashCode method on each of the two objects must produce distinct integer results.
        However, the programmer should be aware that producing distinct integer results for unequal objects may improve
        the performance of hash tables.

    It is generally necessary to override the hashCode() method whenever equals() method is overridden,
        so as to maintain the general contract for the hashCode() method

                                    equals() method

    is used to simply verify the equality of two objects. It�s default implementation simply check the object references
    of two objects to verify their equality.
    By default, two objects are equal if and only if they are stored in the same memory address.

    The equals() method must be:

        Reflexive:
           for any non-null reference value x, x.equals(x) should return true.
        Symmetric:
            for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
        Transitive:
            for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
        Consistent:
            for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or
            consistently return false, provided no information used in equals comparisons on the objects is modified.
        For any non-null reference value x,
            x.equals(null) should return false.

                                                 hashcode()

        Returns a unique integer value for the object in runtime.
        By default, integer value is mostly derived from memory address of the object in heap (but it�s not mandatory always).
        This hash code is used for determining the bucket location, when this object needs to be stored in some
        HashTable like data structure.




*/