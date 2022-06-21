package lang.interfaces.Iterable;

//    https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html


interface Iterable_RT {
    Iterable iterable = null;
}

/*                                         Interface_Class Iterable<T>

    Type Parameters:

            T - the type of elements returned by the iterator

    Implementing this interface allows an object to be the target of the "for-each loop" statement. See For-each Loop


    The Java Iterable interface represents a collection of objects which is iterable - meaning which can be iterated.
        This means, that a class that implements the Java Iterable interface can have its elements iterated. You can
        iterate the objects of a Java Iterable in three ways: Via the , by obtaining a Java Iterator_Interface from the Iterable,
        or by calling the Java Iterable forEach() method.

    Modifier and Type	                              Method and Description

      default void	                              forEach(Consumer<? super T> action)

                                                      Performs the given action for each element of the Iterable until
                                                      all elements have been processed or the action throws an exception.

       Iterator_Interface<T>	                              iterator()

                                                      Returns an iterator over elements of type T.

   default Spliterator<T>	                     spliterator()

                                                     Creates a Spliterator over the elements described by this Iterable.





    RELATED

    https://mkyong.com/java8/java-8-foreach-examples/

 */