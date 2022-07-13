package Classes.Static_Initializer;

// https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.7



/*                                     What	are	Initialization	Blocks?


    ○ Initialization Blocks

                   * Code which runs when

                             - an object is created

                             - or a class is loaded


                                     There are two types of Initialization Blocks

    ○ Static Initializer:

               * Code that runs when a class is loaded.

    ○ Instance Initializer:

               * Code that runs when a new object is created.

    ○ A static initializer declared in a class

                   * is executed when the class

                                  - is initialized

                                                 • https://docs.oracle.com/javase/specs/jls/se11/html/jls-12.html#jls-12.4.2

                   * Together with any field initializers for class variables (§8.3.2),

                                 - static initializers may be used to initialize the class variables of the class.


                                                   Syntax


    ○ StaticInitializer:
         static Block


                                       Compile - time error situation


    ○ It is a compile-time error

                   * if a static initializer cannot complete normally

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-14.html#jls-14.21

    ○ It is a compile-time error

                   * if a RETURN statement

                                 - https://docs.oracle.com/javase/specs/jls/se11/html/jls-14.html#jls-14.17

                         APPEARS anywhere within a static initializer.

    ○ It is a compile-time error

                   *  if the keyword this

                                  - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.8.3

                   * or the keyword super

                                   - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.11

                                   - https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.12

                   * or any type variable declared outside the static initializer,

            APPEARS anywhere within a static initializer.

    ○ Restrictions on how a static initializer

                  * may refer to class variables,

                  * even when the class variables are in scope,

          are specified in

                   * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.3

    ○ Exception checking for a static initializer is specified in

                   * https://docs.oracle.com/javase/specs/jls/se11/html/jls-11.html#jls-11.2.3



 */

public class Static_Initializer_ {
}
