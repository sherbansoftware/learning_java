package Generics.Wldcards.Wildcard_Use;

// https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html


/*                                         Guidelines for Wildcard Use


    ○ One of the more confusing aspects when learning to program with generics is determining when to:

                  * use an upper bounded wildcard

                  * and when to use a lower bounded wildcard.

          This page provides some guidelines to follow when designing your code.

    ○ For purposes of this discussion, it is helpful to think of variables as providing one of two functions:


                                           An "In" Variable


    ○ An "in" variable serves:

                  * UP DATA to the code.

          Imagine a copy method with two arguments: copy(src, dest).
          The src argument

                      * provides the data to be copied, so it is the "in" parameter.


                                                  An "Out" Variable


    ○ An "out" variable

                  * HOLDS DATA for use elsewhere.

          In the copy example, copy(src, dest), the dest argument accepts data, so it is the "out" parameter.

    ○ Of course, some variables

                  * are used both for "in" and "out" purposes

          This scenario is also addressed in the guidelines.

    ○ You can use the "in" and "out" principle when deciding

                 * WHETHER to use a wildcard and WHAT TYPE of wildcard is appropriate.

         The following list provides the guidelines to follow:


                                                     Wildcard Guidelines:


                 * An "in" variable is defined with an UPPER BOUNDED WILDCARD, using the EXTENDS keyword.

                 * An "out" variable is defined with a LOWER BOUNDED WILDCARD, using the SUPER keyword.

                 * In the case where the "in" variable can be accessed using methods defined in the Object class,

                           - use an unbounded wildcard.

            * In the case where the code needs to access the variable as BOTH an "in" and an "out" variable,

                           - do not use a wildcard.

 */

public class Wildcard_Use {
}
