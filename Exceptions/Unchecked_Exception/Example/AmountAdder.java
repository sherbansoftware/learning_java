package Exceptions.Unchecked_Exception.Example;

public class AmountAdder {

    static Amount	addAmounts(Amount	amount1,	Amount	amount2)	{
        if (!amount1.currency.equals(amount2.currency))	{
            throw new RuntimeException("Currencies don't match");
        }
        return new Amount(amount1.currency,	amount1.amount +	amount2.amount);
    }
}
