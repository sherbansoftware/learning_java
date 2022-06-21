package Functional_Programming.Streams.Side_Effects;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606098#questions


/*                                                  Side Effects


    ○  With streams  we were passing

                    * lambdas

                    * or method references

            as arguments to stream operations like : map, filter etc.


    ○ A very important property that these lambdas or method references, which are nothing but behavior parameters
          should have, and that is they need

                    * to be FREE from Side Effects.

    ○ When they are used in stream operations, they

                    * should not ACCESS or UPDATE any external state like an instance variable.

    ○ Output should be dependent only on its input,

                    * otherwise, in a parallel stream, we may see INCONSISTENT or INCORRECT results.


                                       Pure Functions, -- not pure functional programming


    ○ A pure function

                    * is one whose result depends only on its input:

                                  - id does not depend on any MUTABLE state, nor does it UPDATE any state.

                                                Joshua Block,Effective Java, Third edition

    ○ State in:

                    * enclosing class

                    * other object

                    * input object


    ○ A pure function always produces the same output for a given input on such a property is referred to
          as Referential Transparency.

     ○ And what happens if the function has side effects?

       That is, it is updating some external state.

       Then in a parallel set up, we can have issues like

                   * race conditions

                   * and memory visibility

           that is the classic threat to safety hazards.

       So to avoid them, we can SYNCHRONIZE access to that external state.
       So we lose the benefit of parallelism if we synchronize.

    ○ Languages like Haskell are built on such Pure Functions.

    ○ Programs that we write in such languages are built on your functions for pure functions are integral to
           pure functional programming.

      Languages on streams also is an API.

      It's also a paradigm that is based on functional programming.
 */


public class Side_Effects_ {
}
