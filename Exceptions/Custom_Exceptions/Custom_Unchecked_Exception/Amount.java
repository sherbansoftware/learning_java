package Exceptions.Custom_Exceptions.Custom_Unchecked_Exception;

import java.math.BigDecimal;

public class Amount {

    private String currency;//	Should	be	an	Enum
    private BigDecimal amount;//	Should	ideally	use	BigDecimal

    public Amount(String currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
