package Immutable_Class;

// https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html

/*                                             Immutable class in Java

    When an object of immutable class is created, the state or value of it cannot be changed ,
        it means any modification on immutable object will result in a new immutable object. Immutable objects are
        particularly useful in concurrent applications. Since they cannot change state, they cannot be corrupted by thread
        interference or observed in an inconsistent state.

                                How to create an Immutable class ?

            1.Make the class as final so it can't be extended.
            2.Make variables as private so that direct access is not allowed.
            3.Make variable as final so that it's value can be assigned only once.
            4.No setter method for variables.
            5.Initialize all the fields via a constructor performing a deep copy.
            6.Perform cloning of objects in the getter methods to return a copy rather the returning the actual
             object reference (make Deep copy for lang.classes.Object)


                                 Advantages of making an immutable class

            * Immutable objects are thread safe and doesn't have synchronization issues.
            * Does not need a copy constructor
            * Less intermediate or local objects created.
            * Immutability makes it easier to parallelize your program as there are no conflicts among objects.
            * Act as keys for Map and values of Set
            * final class cannot have sub class
            * Another important benefit of Immutable objects is reusability, you can cache Immutable object and reuse
                  them, much like String literals and Integers. You can use static factory methods to provide methods
                  like valueOf(), which can return an existing Immutable object from cache, instead of creating a new one.
            * Good for critical operation
            * Saving Heap Space
            * Good for HashMap Key

                                           immutable classes in Java

            wrapper classes (like Integer, Boolean, Byte, Short)
            String class
            BigDecimal

                                                 NOTE

 */
public class Immutable_Class {
}
