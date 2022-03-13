package Java.Assert;

/*                                 What are	Asserts	used for?

    Assertions are introduced in Java 1.4. They enable you to validate assumptions.
    If an assert fails (i.e. returns false),
       AssertionError is thrown (if assertions are enabled). Basic assert is shown in the example below:

         private int computerSimpleInterest(int principal,float interest,int years){
				assert(principal>0);
				return 100;
       }

                                       When	should	Asserts	be	used?

    Assertions should not be used to validate input data to a public method or command line argument.
    IllegalArgumentException would be a better option. In public method, only use assertions to check for
    cases which are never supposed to happen.


                                                    Enabling Assertions

 By default, assertions are disabled. We need to run the code as given. The syntax for enabling assertion statement in
   Java source code is:

       java –ea Test
            Or

           java –enableassertions Test


    Disabling Assertions


    The syntax for disabling assertions in java are:

                 java –da Test

                      Or

          java –disableassertions Test

*/