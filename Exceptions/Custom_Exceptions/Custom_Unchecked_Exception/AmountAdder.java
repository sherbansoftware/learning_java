package Exceptions.Custom_Exceptions.Custom_Unchecked_Exception;


import java.math.BigDecimal;

public class AmountAdder {

    static Amount addAmounts(Amount amount1, Amount amount2) {
        if (!amount1.getCurrency().equals(amount2.getCurrency())) {
            throw new CurrenciesDoNotMatchException("Currency is different!");
        }

        return new Amount(amount1.getCurrency(), amount1.getAmount().add(amount2.getAmount()));
    }
}
