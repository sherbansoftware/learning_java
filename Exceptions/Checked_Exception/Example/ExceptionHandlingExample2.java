package Exceptions.Checked_Exception.Example;

public class ExceptionHandlingExample2 {
    public static void main(String[]	args)  {
        try {
            AmountAdder.addAmounts(new Amount ("EUR",	5),	new Amount ("DOLLAR",	5));

        } catch (Exception e) {
           // e.printStackTrace ();
            System.out.println ("It can convert currency");
        }
    }

}
