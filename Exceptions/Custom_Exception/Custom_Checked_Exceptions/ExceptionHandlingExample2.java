package Exceptions.Custom_Exception.Custom_Checked_Exceptions;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        try {
            AmountAdder.addAmounts (new Amount ("EUR", 5), new Amount ("DOLLAR", 5));
        } catch (CurrenciesDoNotMatchException e) {
             e.printStackTrace ();
            System.out.println ("Exceptions handled in main " + e.getMessage ());
        }
    }
}
