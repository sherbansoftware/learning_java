package Exceptions.Custom_Exception.Custom_Checked_Exceptions;

public class CurrenciesDoNotMatchException extends Exception {

    public CurrenciesDoNotMatchException(String message) {
        super (message);
    }
}
