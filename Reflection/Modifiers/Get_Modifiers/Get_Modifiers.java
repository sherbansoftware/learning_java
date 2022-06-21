package Reflection.Modifiers.Get_Modifiers;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21541442#overview

// https://docs.oracle.com/en/java/javase/11/docs/api/java.compiler/javax/lang/model/element/Modifier.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Modifier.html




/*                                               Get Modifiers


    ○ Class.getModifiers

                  * Return Class modifiers

    ○ Constructor.getModifiers()

                  * Returns Constructor modifiers

    ○ Method.getModifiers()

                  * Returns Method modifiers

    ○ Field.getModifiers()

                  * Returns Field modifiers

    ○ Modifiers are PACKED within an integer variable so

                  * all those methods return an int.

    ○ Modifiers are ENCODED as a BITMAP so that each modifier is represented with

                  * one single bit

    ○ This organization of modifiers allows us to represent

                   * multiple modifiers

                   * to a single target

           can have in one integer.

     ○ Example:            -- Bitmap: mapping from bit to int

                   * PUBLIC = 1                             Binary representation:         000000001

                   * STATIC = 8                             Binary representation:         000001000

                   * PUBLIC | STATIC = 9                    Binary representation:         000001001

    ○ To help us work with those bitmaps, java reflection comes with the

                   * Modifier Helper Class

           which contains bitmasks for all those modifiers

     ○ Example:

           int modifiers = Product.class.getModifiers();


                                              Modifier Helper Class Bitmask Methods


    ○ Modifier class also provides us with

                  * static helper methods that perform those bitmask operations for us

           that makes analyzing modifiers even easier.

           Example:

                   *    int mod = Get_Modifiers.class.getClass().getModifiers();

                   * 	isAbstract(int mod)

                             -Return true if the integer argument includes the abstract modifier, false otherwise.

                         static boolean	isFinal(int mod)


 */

import java.lang.reflect.Modifier;

import static java.lang.reflect.Modifier.*;

public class Get_Modifiers {
    public static void main(String[] args) {
        int mod = Get_Modifiers.class.getClass().getModifiers();

        if ((mod & PUBLIC) != 0) {
           // System.out.println("This is a public class");
        }

        if (Modifier.isPublic(mod)) {
            System.out.println("This is a public class");
        }
    }


}
