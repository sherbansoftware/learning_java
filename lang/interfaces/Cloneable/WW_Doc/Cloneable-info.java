package lang.interfaces.Cloneable.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html

/*                                          public interface Cloneable

    A class implements the Cloneable interface to indicate to the lang.classes.Object.clone() method that it is legal for that method
        to make a field-for-field copy of instances of that class.
    Invoking lang.classes.Object's clone method on an instance that does not implement the Cloneable interface results in the exception
        CloneNotSupportedException being thrown.
    By convention, classes that implement this interface should override lang.classes.Object.clone (which is protected) with a public
        method. See lang.classes.Object.clone() for details on overriding this method.

    Note that this interface does not contain the clone method. Therefore, it is not possible to clone an object merely
        by virtue of the fact that it implements this interface. Even if the clone method is invoked reflectively, there
        is no guarantee that it will succeed.

    Since:
        JDK1.0





 */