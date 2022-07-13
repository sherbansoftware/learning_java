package Exceptions.Custom_Exceptions.Custom_Checked_Exceptions;

public class CurrenciesDoNotMatchException extends Exception {

    public CurrenciesDoNotMatchException(String message) {
        super (message);
    }
}
