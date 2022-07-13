package Exceptions.Custom_Exceptions.Custom_Unchecked_Exception;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Amount amount = new Amount("EUR", new BigDecimal(5));
        Amount newAmount = new Amount("EUR", new BigDecimal(25));

        Amount total = AmountAdder.addAmounts(amount, newAmount);
        System.out.println(total);
    }
}

