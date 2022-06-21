package Exceptions.Checked_Exception;


/*                              throw a checked exceptions

    have two options:

       1.handle it - surround it with try catch block

       2. method should	declare in the definition (throws) that i'll throwing an checked exception and consequently
       all the method which call it must add throws or handle it.

                                               NOTE

            * checked exceptions you have to handle it


*/

public class Checked_Exception {
    public static void main(String[] args) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
