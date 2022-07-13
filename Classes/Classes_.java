package Classes;

//  https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html


/*                                                      Class

    ○ A class is just a template, and it defines

                   * the state of an object

                   * and a behavior.,

           We can create any number of instances of this template.

    ○ The most important thing is

                  * a class defined state and behavior that an object can exhibit.


                                                     Object state


    ○  The state of object is

                   * the VALUES that it has at that particular point in time.


                                                        Object behaviour


    ○ That's basically

                   * what all the objects of this class would get is the different method to present in here.



                                                        Class Members


    ○ Members inherited from

                  * its direct superclass (§8.1.4), except in class Object, which has no direct superclass

    ○ Members inherited from

                   * any direct superinterfaces (§8.1.5)

    ○ Members declared

                   * in the body of the class (§8.1.6)


                                                Members of the body of class


    ○ fields

    ○  methods

    ○ classes

    ○ interfaces


                                                  can also,may contain


     ○ instance initializers

     ○ static initializers

     ○ constructors


                                                    abstract Classes


    ○ It is a compile-time error if an attempt is made to create an instance of an abstract class


                                                  final Classes


    ○ A class can be declared final if its definition is complete and no subclasses are desired or required.
          A final class cannot have any subclasses.


                                                  strictfp Classes


    ○ The effect of the strictfp modifier is to

                   * make all float or double expressions within the class declaration
                        (including within variable initializers, instance initializers, static initializers, and
                        constructors)

            This implies that

                   * all methods declared in the class,

                   * and all nested types declared in the class,

            are implicitly strictfp.


                                     Generic Classes and Type Parameters


    ○ A class is generic if it declares one or more type variables (�4.4).


                                       Inner Classes and Enclosing Instances


    ○ An inner class is a

                   * nested class that is not explicitly or implicitly declared static.

           An inner class may be a non-static member class, a local class , or an anonymous class .


                                             Class Members

            Members inherited from its direct superclass , except in class lang.classes.Object, which has no direct superclass
            Members inherited from any direct superinterfaces
            Members declared in the body of the class


                                           Types of Nested classes


    ○ There are two types of nested classes:

                   * non-static (inner class)

                                 - Member inner class

                                 - Anonymous inner class

                                  -  Local inner class

                    * static nested classes.


                                                  NOTE

        */

public class Classes_ {
}
