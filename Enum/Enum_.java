package Enum;

// https://www.baeldung.com/a-guide-to-java-enums

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html


/*                                                   Enum


    ○ An enum is a special "class"

                   * that represents a group of constants (unchangeable variables, like final variables).


                                           Declaration of enum in Java:


    Enum declaration can be done outside a Class or inside a Class but not inside a Method.


                                                        NOTE

    ○ Every enum is internally implemented by using Class.

    ○ internally above enum Color is converted to class Color

                      {
                           public static final Color RED = new Color();
                           public static final Color BLUE = new Color();
                           public static final Color GREEN = new Color();
                     }

    ○ Every enum constant represents an object of type enum.

    ○ enum type can be passed as an argument to switch statements.

*/

public enum Enum_ {
    LOW,
    MEDIUM,
    HIGH
}
