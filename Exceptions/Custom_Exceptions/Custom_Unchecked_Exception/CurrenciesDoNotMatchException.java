package Exceptions.Custom_Exceptions.Custom_Unchecked_Exception;

class CurrenciesDoNotMatchException extends RuntimeException {
    public CurrenciesDoNotMatchException(String message) {
        super("Currency doesn't match!");
    }
}