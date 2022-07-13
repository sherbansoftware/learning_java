package Classes.Instance_Initializer;

// https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.6


/*                                                 Instance Initializers


    ○ An instance initializer declared in a class

                   * is executed when an instance of the class is created

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-12.html#jls-12.5

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.9

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.8.7.1


                                                Syntax

    ○ InstanceInitializer:

                   * Block


                                              Compile-time error


    ○ It is a compile-time error if

                   * an instance initializer cannot complete normally

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-14.html#jls-14.21

    ○ It is a compile-time error if

                  * a return statement

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-14.html#jls-14.17

                         appears anywhere within an instance initializer.

    ○ An instance initializer

                  * is permitted to refer to the current object using the keyword this

                                - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.8.3

                  * or the keyword super

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.11.2

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.12

                         and to use any type variables in scope.

    ○ Restrictions on how an instance initializer may refer to instance variables,

                  * even when the instance variables are in scope, are specified in

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.3

    ○ Exception checking for an instance initializer is specified in

                                  - https://docs.oracle.com/javase/specs/jls/se11/html/jls-11.html#jls-11.2.3



 */

public class Instance_Initializer_ {
}
