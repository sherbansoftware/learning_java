package Classes.Constructor_Declarations;

/*                                 Constructor


    ○ Constructor is invoked whenever we create an instance(object) of a Class.

                   * We cannot create an object without a constructor.

    ○ Constructor has

                   * the same name as the class

                   * and no return type.

            It can accept any number of parameters.


                                                    NOTE

           * A Constructor cannot be called from a method

            * A constructor is not allowed to be:

                      static,
                      abstract,
                      final,
                      native,
                      synchronized
                      or strictfp

                  in Java.


 */

public class Constructor_ {

    String name;

    public Constructor_() {
    }

    // Cannot call a Constructor from a method
    public void method() {
        //    Constructor_();  Compiler error

    }


}