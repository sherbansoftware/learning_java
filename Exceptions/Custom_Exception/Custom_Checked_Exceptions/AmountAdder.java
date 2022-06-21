package Exceptions.Custom_Exception.Custom_Checked_Exceptions;

public class AmountAdder {

    static Amount addAmounts(Amount amount1, Amount amount2) throws CurrenciesDoNotMatchException {
        if (!amount1.currency.equals(amount2.currency))	{
            throw new CurrenciesDoNotMatchException("Currencies don't match");
        }
        return new Amount (amount1.currency,	amount1.amount +	amount2.amount);
    }
}
