package Modifiers;

// https://www.w3schools.com/java/java_modifiers.asp


/*                                               Modifiers


    ○ modifiers are keywords that are added to a

                   * class
                   * constructor
                   * method
                   * or a field

           and add functionality or change the meaning of its target modifiers.

    ○ They are typically divided into two groups

                   * access modifiers

                         - public
                         - private
                         - protected
                         - default(package-private)

                   * and the non-access

                         - abstract
                         - final
                         - static




    ○ Access modifiers can be APPLIED to :

                   * Classes
                   * Constructors
                   * Fields
                   * Methods

           those modifiers control the access to the target to which they are applied.

    ○ Non access modifiers can be APPLIED to:

                   * Classes

                             - abstract       -- Makes the class abstract
                             - final          -- Finalizes the implementation of a class
                             - static         -- Makes inner classes instantiable without outer class
                             - interface      -- Marks a class as an interface
                             - strictfp       -- Restrict floating-point calculations and ensuring
                                                     the same result on every platform

                    * Method

                             - abstract        -- Makes the method abstract
                             - final           -- Finalizes the implementation of the method
                             - static          -- Makes the method a class level method
                             - synchronized    -- Method can be accesses by one thread at a time
                             - native          -- Implemented in another programming language(Typically in C)
                             - strictfp        -- Used for non abstract methods
                                               -- Restrict floating-point calculations and ensuring
                                                     the same result on every platform

                    * Field

                             - final           -- Doesn't allow the value of the field to change after initialization
                             - static          -- Makes the field a class
                             - transient       -- marks the field  non-serializable when the object is serialized for
                                                      persistence or network transfer.

                             - volatile        -- makes reads and rights to fields of type long and double atomic as
                                                  well as prevent data races in our application
 */

public class Modifiers_ {
}
