package Exceptions.Chain_Of_Responsibility.Exception_Example;

/*               What design pattern is used to implement Exception handling Features in most  languages?


    ○ When an exception is thrown from a method with no Exception Handling,

                   * it is thrown to the calling method.

             If there is no exception handling in that method too,

                   * it is further thrown up to its calling method and so on.

    ○ This happens until an appropriate Exception  Handler is found.

    ○ This is an example of

                   * Chain  of  Responsibility Pattern

           defined as “a way of passing a request between a chain of objects”.

    ○ A good real time example is

                   * the Loan or Leave Approval Process.

           When  a loan approval is needed,

                   * it first goes to the clerk.If he cannot handle it (large  amount), it goes to his manager and so on
                         until it is approved or rejected.



 */

public class Exception_Example {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        String str = null;
        str.toString();
    }

}
